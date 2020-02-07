import java.io.FileOutputStream
import java.io.OutputStreamWriter
import java.util.*
import GrammarVisitor

class LexerGenerator<E> {
    fun generateToken(visitor: GrammarVisitor<E>) = buildString {
        append("enum class Token {\n")
        val tokens = arrayListOf<String>()
        for (token in visitor.tokens.keys) {
            tokens.add("\t$token")
        }
        append(tokens.joinToString(",\n"))
        append("\n}")
    }

    fun generateLexer(visitor: MyGrammarVisitor) = buildString {
        append(
                """
            import java.io.IOException
            import java.io.Reader
            import java.text.ParseException
            
            class Lexer(private val stream: Reader) {
                constructor(s: String) : this(s.reader())
                
                var curPos = -1
                var curChar = -1
                var token: Token = Token.EOF
                var tokenValue = ""
                val tokenText = StringBuilder()
            
                init {
                    nextChar()
                    nextToken()
                }
            
                private fun isBlank(c: Char): Boolean {
                    return c == ' ' || c == '\r' || c == '\t' || c == '\n'
                }
            
                private fun nextChar() {
                    try {
                        curChar = stream.read()
                    } catch (e: IOException) {
                        throw ParseException(e.message, curPos + 1)
                    } finally {
                        ++curPos
                    }
                }
                
                fun nextToken() {
                    while (isBlank(curChar.toChar())) {
                        nextChar()
                    }
                    var toString = ""
                    var last: Char
            
                    while (!isBlank(curChar.toChar())) {
                        if (curChar == -1) {
                            toString = tokenText.toString();
                            tokenText.clear()
                            token = Token.EOF
                            tokenValue = "EOF"
                            break;
                        }
                        last = curChar.toChar()
                        toString = tokenText.toString()
                        tokenText.append(curChar.toChar())
                        val isToken = ${visitor.tokens.values.joinToString(separator = " || ")
                { s -> "tokenText.matches(\"$s\".toRegex())" }}
            
                        if (isToken) {
                            nextChar()
                            if (isBlank(curChar.toChar()) || curChar == -1) {
                                toString = tokenText.toString()
                                tokenText.clear()
                                break
                            }
                        } else {
                            tokenText.clear()
                            tokenText.append(last)
                            nextChar()
                            break
                        }
                    }
                    
        """.trimIndent()
        )

        for (token in visitor.tokens.keys) {
            if (token == "EPS") {
                continue
            }

            append(
                    """
        if (toString.matches("${visitor.tokens[token]}".toRegex())) {
            token = Token.$token
            tokenValue = toString
            return
        }
"""
            )
        }
        append(
                """
                }
            }
            """.trimIndent()
        )
    }


}