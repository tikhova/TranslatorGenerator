package logic

import java.text.ParseException

class Parser(private val lexer: Lexer) {
    private fun unexpectedLiteral(rule: String): Nothing = throw ParseException(
        "Unexpected literal ${lexer.curString()} in rule ${lexer.curPos()}", lexer.curPos()
    )
    
    private fun ensureTokenIsCorrect(token: Lexer.Token, rule: String) {
        if (lexer.curToken() != token) {
            unexpectedLiteral(rule)
        }
    }
    
    
private fun expression(): Node {
    val children = arrayListOf<Node>()
    val res = Node("expression", children)

    lexer.nextToken()
    when (lexer.curToken()) {            Lexer.Token.NOT -> {

                val node0 = x_or_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.OR -> {

                val node0 = x_or_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.RBRACE -> {

                val node0 = x_or_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.AND -> {

                val node0 = x_or_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.EPS -> {

                val node0 = x_or_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.XOR -> {

                val node0 = x_or_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.LBRACE -> {

                val node0 = x_or_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.ATOM -> {

                val node0 = x_or_continuation()
                children.add(node0)



                return res
                                    }

            else -> {
            }
        }
    }\n\n

private fun value(): Node {
    val children = arrayListOf<Node>()
    val res = Node("value", children)

    lexer.nextToken()
    when (lexer.curToken()) {            Lexer.Token.NOT -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }
            Lexer.Token.OR -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }
            Lexer.Token.RBRACE -> {

                if (lexer.curToken() != rulePart) {
                    unexpectedLiteral(RBRACE)
                }
                children.add(Node(lexer.curString()))

                lexer.nextToken()

                return res
                                    }
            Lexer.Token.AND -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }
            Lexer.Token.EPS -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }
            Lexer.Token.XOR -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }
            Lexer.Token.LBRACE -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }
            Lexer.Token.ATOM -> {

                if (lexer.curToken() != rulePart) {
                    unexpectedLiteral(ATOM)
                }
                children.add(Node(lexer.curString()))

                lexer.nextToken()

                return res
                                    }

            else -> {
            }
        }
    }\n\n

private fun x_or_continuation(): Node {
    val children = arrayListOf<Node>()
    val res = Node("x_or_continuation", children)

    lexer.nextToken()
    when (lexer.curToken()) {            Lexer.Token.NOT -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }
            Lexer.Token.OR -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }
            Lexer.Token.RBRACE -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }
            Lexer.Token.AND -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }
            Lexer.Token.EPS -> {

                if (lexer.curToken() != rulePart) {
                    unexpectedLiteral(EPS)
                }
                children.add(Node(lexer.curString()))

                lexer.nextToken()

                return res
                                    }
            Lexer.Token.XOR -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }
            Lexer.Token.LBRACE -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }
            Lexer.Token.ATOM -> {

                val node0 = expression()
                children.add(node0)



                return res
                                    }

            else -> {
            }
        }
    }\n\n

private fun x_value(): Node {
    val children = arrayListOf<Node>()
    val res = Node("x_value", children)

    lexer.nextToken()
    when (lexer.curToken()) {            Lexer.Token.NOT -> {

                val node0 = and_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.OR -> {

                val node0 = and_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.RBRACE -> {

                val node0 = and_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.AND -> {

                val node0 = and_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.EPS -> {

                val node0 = and_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.XOR -> {

                val node0 = and_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.LBRACE -> {

                val node0 = and_continuation()
                children.add(node0)



                return res
                                    }
            Lexer.Token.ATOM -> {

                val node0 = and_continuation()
                children.add(node0)



                return res
                                    }

            else -> {
            }
        }
    }\n\n

private fun and_value(): Node {
    val children = arrayListOf<Node>()
    val res = Node("and_value", children)

    lexer.nextToken()
    when (lexer.curToken()) {            Lexer.Token.NOT -> {

                val node0 = value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.OR -> {

                val node0 = value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.RBRACE -> {

                val node0 = value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.AND -> {

                val node0 = value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.EPS -> {

                val node0 = value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.XOR -> {

                val node0 = value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.LBRACE -> {

                val node0 = value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.ATOM -> {

                val node0 = value()
                children.add(node0)



                return res
                                    }

            else -> {
            }
        }
    }\n\n

private fun and_continuation(): Node {
    val children = arrayListOf<Node>()
    val res = Node("and_continuation", children)

    lexer.nextToken()
    when (lexer.curToken()) {            Lexer.Token.NOT -> {

                val node0 = x_value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.OR -> {

                val node0 = x_value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.RBRACE -> {

                val node0 = x_value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.AND -> {

                val node0 = x_value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.EPS -> {

                if (lexer.curToken() != rulePart) {
                    unexpectedLiteral(EPS)
                }
                children.add(Node(lexer.curString()))

                lexer.nextToken()

                return res
                                    }
            Lexer.Token.XOR -> {

                val node0 = x_value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.LBRACE -> {

                val node0 = x_value()
                children.add(node0)



                return res
                                    }
            Lexer.Token.ATOM -> {

                val node0 = x_value()
                children.add(node0)



                return res
                                    }

            else -> {
            }
        }
    }\n\n
}
    
}