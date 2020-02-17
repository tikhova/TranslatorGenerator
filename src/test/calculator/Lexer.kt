package calculator

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
    private val skipSet = " \t\r\n".toSet()
    var realString = ""
    private val tokenMap: Map<Token, Regex> = mapOf(
        Token.NUMBER to Regex("(0)|([1-9][0-9]*)"),
        Token.MULTIPLICATION to Regex("(\\*)"),
        Token.RBRACE to Regex("(\\))"),
        Token.EPS to Regex("()"),
        Token.DIVISION to Regex("(/)"),
        Token.MINUS to Regex("(-)"),
        Token.PLUS to Regex("(\\+)"),
        Token.LBRACE to Regex("(\\()")
    )
    
    enum class Token {
        NUMBER,
        MULTIPLICATION,
        RBRACE,
        EPS,
        DIVISION,
        MINUS,
        PLUS,
        LBRACE
    }
    
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
        if (isEOF()) {
            curString = ""
        } else {
            curString = curString.takeLast(1)
        }
        var options = getTokenFromString()
        val lastPosition = curPosition

        while (!isEOF() && options.filter{ it.key != Token.EPS }.isEmpty()) {
            nextChar()
            options = getTokenFromString()
        }

        while (!isEOF() && options.filter{ it.key != Token.EPS }.isNotEmpty()) {
            nextChar()
            options = getTokenFromString()
        }

        if (isEOF() && options.size != 1) {
            curToken = null

            if (curString.isNotEmpty()) {
                throw ParseException("Illegal character ${curString}", lastPosition)
            }
        }
        
        realString = if (isEOF()) {
                    curString
                } else {
                    curString.dropLast(1)
                }
    }

    fun curToken(): Token? {
        return curToken
    }

    fun curPos(): Int {
        return curPosition
    }
    
    fun getString(): String {
        return realString
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