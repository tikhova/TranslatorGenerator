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
    private val tokenMap: Map<Token, Regex> = mapOf(
        Token.NOT to Regex("(\\!)"),
        Token.OR to Regex("(||)"),
        Token.RBRACE to Regex("(\\))"),
        Token.AND to Regex("(&&)"),
        Token.EPS to Regex(""),
        Token.XOR to Regex("(\\^)"),
        Token.ATOM to Regex("(true)|(false)"),
        Token.LBRACE to Regex("(\\()")
    )
    
    enum class Token {
        NOT,
        OR,
        RBRACE,
        AND,
        EPS,
        XOR,
        ATOM,
        LBRACE
    }
    
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
                    throw ParseException("Illegal character ${curCharacter!!.toChar()}", curPosition)
                }
            }
            return
        }

        when (options.size) {
            0 -> throw ParseException("Illegal character ${curCharacter!!.toChar()}", curPosition)
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