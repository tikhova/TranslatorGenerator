package calculator

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
    private val skipSet = " \t\r\n".toSet()
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
                throw ParseException("Can't parse token ${getString()}", curPosition)
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
            throw ParseException("Can't parse token ${getString()}", curPosition)
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