import java.io.File

class LexerGenerator(private val visitor: GrammarVisitorImpl) {
    private val singleIndentation = "    "
    private fun generateToken(): String {
        val sb = StringBuilder()
        sb.append("enum class Token {\n")
        val tokens = arrayListOf<String>()
        for (token in visitor.tokens.keys) {
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
    private var curString = ""
    private var curToken: Token? = null
    private val skipSet = "${visitor.skipString.toString()}".toSet()
    ${generateTokenMap()}
    
    ${generateToken()}
    
    private fun nextChar() {
        try {
            curPosition++
            curCharacter = inputReader.read()

            if (isBlank(curCharacter)) {
                nextChar()
                return
            }

            if (!isEOF()) {
                curString = curString.plus(curCharacter!!.toChar())
            }
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
            if (curString.matches(regex)) {
                curToken = name
                true
            } else {
                false
            }
        }
    }

    fun nextToken() {
        curString = ""
        nextChar()

        var options = getTokenFromString()
        val lastPosition = curPosition

        while (!isEOF() && options.size != 1) {
            nextChar()
            options = getTokenFromString()
        }

        if (isEOF() && options.size != 1) {
            curToken = null

            if (curString.isNotEmpty()) {
                throw ParseException("Illegal character ${'$'}{curString}", lastPosition)
            }
        }
    }

    fun curToken(): Token? {
        return curToken
    }

    fun curPos(): Int {
        return curPosition
    }
    
    fun curString(): String {
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