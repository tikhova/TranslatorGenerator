package logic

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
    private val skipSet = "".toSet()
    private val tokenMap: Map<Token, Regex> = mapOf(
        Token.NOT to Regex("(not)"),
        Token.OR to Regex("(or)"),
        Token.RBRACE to Regex("(\\))"),
        Token.VARIABLE to Regex("(a-zA-Z)"),
        Token.AND to Regex("(and)"),
        Token.EPS to Regex(""),
        Token.XOR to Regex("(xor)"),
        Token.ATOM to Regex("(true)|(false)|VARIABLE"),
        Token.LBRACE to Regex("(\\()")
    )
    
    enum class Token {
        NOT,
        OR,
        RBRACE,
        VARIABLE,
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

    fun nextToken() {
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
                throw ParseException("Illegal character ${curCharacter!!.toChar()}", lastPosition)
            }
        }

        curString = ""
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