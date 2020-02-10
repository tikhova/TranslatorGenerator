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

    fun generateLexer() = buildString {
        append(
"""
package logic

import GrammarVisitorImpl
import java.io.IOException
import java.io.Reader
import java.text.ParseException
import java.util.*

class Lexer(private val inputReader: Reader, private val visitor: GrammarVisitorImpl) {
    private var curPosition = 0
    private var curCharacter: Int? = null
    private var curString = ""
    private var curToken: Token? = null
    private val skipSet = visitor.skipString.toSet()
    ${generateTokenMap()}
    
    ${generateToken()}
    
    private fun nextChar() {
        try {
            curPosition++
            curCharacter = inputReader.read()

            if (isBlank(curCharacter)) {
                nextChar()
            }

            if (!isEOF()) {
                curString = curString.plus(curCharacter)
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
            curToken = name
            curString.matches(regex)
        }
    }

    private fun nextToken() {
        nextChar()

        val options = getTokenFromString()

        if (isEOF()) {
            if (options.size != 1) {
                curToken = null

                if (curString.isNotEmpty()) {
                    throw ParseException("Illegal character ${'$'}{curCharacter!!.toChar()}", curPosition)
                }
            }
            return
        }

        when (options.size) {
            0 -> throw ParseException("Illegal character ${'$'}{curCharacter!!.toChar()}", curPosition)
            1 -> return
            else -> nextToken()
        }
    }

    fun curToken(): Token? {
        return curToken
    }

    fun curPos(): Int {
        return curPosition
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
        File("src/test/$path/Lexer.kt").writeText(generateLexer())
    }
}