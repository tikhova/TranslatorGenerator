package logic

import java.text.ParseException

class Parser(private val lexer: Lexer) {
    private fun unexpectedLiteral(): Nothing = throw ParseException(
        "Unexpected literal ${lexer.curString()}", lexer.curPos()
    )
    
    private fun ensureTokenIsCorrect(token: Lexer.Token, rule: String) {
        if (lexer.curToken() != token) {
            unexpectedLiteral()
        }
    }
    
    
    fun expression(func: (Node) -> Unit): Node {
        val children = arrayListOf<Node>()
        val res = Node("expression", children)
        func(res)
    
        lexer.nextToken()
        when (lexer.curToken()) {
            Lexer.Token.NOT -> {

                val node0 = x_or_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.OR -> {

                val node0 = x_or_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.RBRACE -> {

                val node0 = x_or_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.AND -> {

                val node0 = x_or_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.EPS -> {

                val node0 = x_or_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.XOR -> {

                val node0 = x_or_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.LBRACE -> {

                val node0 = x_or_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.ATOM -> {

                val node0 = x_or_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            else -> {
                    unexpectedLiteral()
            }
        }
    }


    fun value(func: (Node) -> Unit): Node {
        val children = arrayListOf<Node>()
        val res = Node("value", children)
        func(res)
    
        lexer.nextToken()
        when (lexer.curToken()) {
            Lexer.Token.NOT -> {

                val node0 = expression{}
                children.add(node0)
                

                return res
            }

            Lexer.Token.OR -> {

                val node0 = expression{}
                children.add(node0)
                

                return res
            }

            Lexer.Token.RBRACE -> {

                if (lexer.curToken() != Lexer.Token.RBRACE) {
                    unexpectedLiteral()
                }
                val node = Node(lexer.curString())
                children.add(node)
                 res.value = res.children[1].value 
                lexer.nextToken()

                return res
            }

            Lexer.Token.AND -> {

                val node0 = expression{}
                children.add(node0)
                

                return res
            }

            Lexer.Token.EPS -> {

                val node0 = expression{}
                children.add(node0)
                

                return res
            }

            Lexer.Token.XOR -> {

                val node0 = expression{}
                children.add(node0)
                

                return res
            }

            Lexer.Token.LBRACE -> {

                val node0 = expression{}
                children.add(node0)
                

                return res
            }

            Lexer.Token.ATOM -> {

                if (lexer.curToken() != Lexer.Token.ATOM) {
                    unexpectedLiteral()
                }
                val node = Node(lexer.curString())
                children.add(node)
                 res.value = res.children[0].name.toBoolean() 
                lexer.nextToken()

                return res
            }

            else -> {
                    unexpectedLiteral()
            }
        }
    }


    fun x_or_continuation(func: (Node) -> Unit): Node {
        val children = arrayListOf<Node>()
        val res = Node("x_or_continuation", children)
        func(res)
    
        lexer.nextToken()
        when (lexer.curToken()) {
            Lexer.Token.NOT -> {

                val node0 = expression{}
                children.add(node0)
                res.value = res.value xor children[1].value

                return res
            }

            Lexer.Token.OR -> {

                val node0 = expression{}
                children.add(node0)
                res.value = res.value xor children[1].value

                return res
            }

            Lexer.Token.RBRACE -> {

                val node0 = expression{}
                children.add(node0)
                res.value = res.value xor children[1].value

                return res
            }

            Lexer.Token.AND -> {

                val node0 = expression{}
                children.add(node0)
                res.value = res.value xor children[1].value

                return res
            }

            Lexer.Token.EPS -> {

                if (lexer.curToken() != Lexer.Token.EPS) {
                    unexpectedLiteral()
                }
                val node = Node(lexer.curString())
                children.add(node)
                
                lexer.nextToken()

                return res
            }

            Lexer.Token.XOR -> {

                val node0 = expression{}
                children.add(node0)
                res.value = res.value xor children[1].value

                return res
            }

            Lexer.Token.LBRACE -> {

                val node0 = expression{}
                children.add(node0)
                res.value = res.value xor children[1].value

                return res
            }

            Lexer.Token.ATOM -> {

                val node0 = expression{}
                children.add(node0)
                res.value = res.value xor children[1].value

                return res
            }

            else -> {
                    unexpectedLiteral()
            }
        }
    }


    fun x_value(func: (Node) -> Unit): Node {
        val children = arrayListOf<Node>()
        val res = Node("x_value", children)
        func(res)
    
        lexer.nextToken()
        when (lexer.curToken()) {
            Lexer.Token.NOT -> {

                val node0 = and_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.OR -> {

                val node0 = and_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.RBRACE -> {

                val node0 = and_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.AND -> {

                val node0 = and_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.EPS -> {

                val node0 = and_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.XOR -> {

                val node0 = and_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.LBRACE -> {

                val node0 = and_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.ATOM -> {

                val node0 = and_continuation{it.value = res.children[0].value}
                children.add(node0)
                res.value = res.children[1].value

                return res
            }

            else -> {
                    unexpectedLiteral()
            }
        }
    }


    fun and_value(func: (Node) -> Unit): Node {
        val children = arrayListOf<Node>()
        val res = Node("and_value", children)
        func(res)
    
        lexer.nextToken()
        when (lexer.curToken()) {
            Lexer.Token.NOT -> {

                val node0 = value{}
                children.add(node0)
                res.value = res.children[0].value

                return res
            }

            Lexer.Token.OR -> {

                val node0 = value{}
                children.add(node0)
                res.value = res.children[0].value

                return res
            }

            Lexer.Token.RBRACE -> {

                val node0 = value{}
                children.add(node0)
                res.value = res.children[0].value

                return res
            }

            Lexer.Token.AND -> {

                val node0 = value{}
                children.add(node0)
                res.value = res.children[0].value

                return res
            }

            Lexer.Token.EPS -> {

                val node0 = value{}
                children.add(node0)
                res.value = res.children[0].value

                return res
            }

            Lexer.Token.XOR -> {

                val node0 = value{}
                children.add(node0)
                res.value = res.children[0].value

                return res
            }

            Lexer.Token.LBRACE -> {

                val node0 = value{}
                children.add(node0)
                res.value = res.children[0].value

                return res
            }

            Lexer.Token.ATOM -> {

                val node0 = value{}
                children.add(node0)
                res.value = res.children[0].value

                return res
            }

            else -> {
                    unexpectedLiteral()
            }
        }
    }


    fun and_continuation(func: (Node) -> Unit): Node {
        val children = arrayListOf<Node>()
        val res = Node("and_continuation", children)
        func(res)
    
        lexer.nextToken()
        when (lexer.curToken()) {
            Lexer.Token.NOT -> {

                val node0 = x_value{}
                children.add(node0)
                res.value = res.value && children[1].value

                return res
            }

            Lexer.Token.OR -> {

                val node0 = x_value{}
                children.add(node0)
                res.value = res.value && children[1].value

                return res
            }

            Lexer.Token.RBRACE -> {

                val node0 = x_value{}
                children.add(node0)
                res.value = res.value && children[1].value

                return res
            }

            Lexer.Token.AND -> {

                val node0 = x_value{}
                children.add(node0)
                res.value = res.value && children[1].value

                return res
            }

            Lexer.Token.EPS -> {

                if (lexer.curToken() != Lexer.Token.EPS) {
                    unexpectedLiteral()
                }
                val node = Node(lexer.curString())
                children.add(node)
                
                lexer.nextToken()

                return res
            }

            Lexer.Token.XOR -> {

                val node0 = x_value{}
                children.add(node0)
                res.value = res.value && children[1].value

                return res
            }

            Lexer.Token.LBRACE -> {

                val node0 = x_value{}
                children.add(node0)
                res.value = res.value && children[1].value

                return res
            }

            Lexer.Token.ATOM -> {

                val node0 = x_value{}
                children.add(node0)
                res.value = res.value && children[1].value

                return res
            }

            else -> {
                    unexpectedLiteral()
            }
        }
    }


    
}