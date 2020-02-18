import java.io.File

class LexerGenerator(private val visitor: GrammarVisitorImpl) {
    private val singleIndentation = "    "
    private fun generateToken(): String {
        val sb = StringBuilder()
        sb.append("enum class Token {\n")
        val tokens = arrayListOf<String>()
        val keys = visitor.tokens.keys
        keys.plus("EPS")
        for (token in keys) {
            tokens.add("${singleIndentation.repeat(2)}$token")
        }
        sb.append(tokens.joinToString(",\n"))
        sb.append("\n$singleIndentation}")

        return sb.toString()
    }

    private fun generateTokenMap(): String {
        val sb = StringBuilder()
        sb.append("private val tokenMap: Map<Token, Regex> = mapOf(\n")
        val elements = arrayListOf<String>()
        for ((token, pattern) in visitor.tokens) {
            elements.add("${singleIndentation.repeat(2)}Token.$token to Regex(\"$pattern\")")
        }
        sb.append(elements.joinToString(",\n"))
        sb.append("\n$singleIndentation)")

        return sb.toString()
    }

    fun generateLexer(path: String) = buildString {
        append("""
package $path

import GrammarVisitorImpl
import java.io.IOException
import java.io.Reader
import java.text.ParseException
import java.util.*

class Lexer(private val inputReader: Reader) {
    private var curPosition = 0
    private var curCharacter: Int? = null
    private var curBuilder = StringBuilder()
    private var curString = ""
    private var curToken: Token? = null
    private val skipSet = "${visitor.skipString.toString()}".toSet()
    ${generateTokenMap()}
    
    ${generateToken()}
    
    
    init {
        nextChar()
    }
    
    private fun nextChar() {
        try {
            curPosition++
            curCharacter = inputReader.read()
        } catch (err: IOException) {
            throw ParseException(err.message, curPosition)
        }
    }

    private fun isBlank(character: Int?): Boolean {
        return skipSet.contains(character?.toChar())
    }

    private fun isEOF(): Boolean {
        return curCharacter == -1
    }

    private fun getTokenFromString(): Map<Token, Regex> {
        return tokenMap.filter { (name, regex) ->
            if (curBuilder.matches(regex)) {
                curToken = name
                curString = curBuilder.toString()
                true
            } else {
                false
            }
        }
    }

    fun findToken(): Boolean {
        val length = curBuilder.length
        val newCurBuilder = StringBuilder()

        while (getTokenFromString().size != 1 && curBuilder.isNotEmpty()) {
            newCurBuilder.append(curBuilder.lastOrNull())
            curBuilder.deleteCharAt(curBuilder.lastIndex)
        }

        curBuilder = newCurBuilder.reverse()

        return newCurBuilder.length != length
    }

    fun nextToken() {
        if (curBuilder.isNotEmpty()) {
            if (!findToken()) {
                throw ParseException("Can't parse token ${'$'}{getString()}", curPosition)
            }
            return
        }

        while (isBlank(curCharacter)) {
            nextChar()
        }

        if (isEOF()) {
            curToken = Token.EPS
            return
        }

        while (!isBlank(curCharacter) && !isEOF()) {
            curBuilder.append(curCharacter!!.toChar())
            nextChar()
        }

        if (!findToken()) {
            throw ParseException("Can't parse token ${'$'}{getString()}", curPosition)
        }
    }

    fun curToken(): Token? {
        return curToken
    }

    fun curPos(): Int {
        return curPosition
    }
    
    fun getString(): String {
        return curString
    }

    fun parse(): ArrayList<Token> {
        val result = arrayListOf<Token>()
        while (true) {
            nextToken()
            if (curToken == null) {
                return result
            } else {
                result.add(curToken!!)
            }
        }
    }
}
""".trimIndent()
        )
    }

    fun createLexer(path: String) {
        File("src/test/$path").mkdir()
        File("src/test/$path/Lexer.kt").writeText(generateLexer(path))
    }
}