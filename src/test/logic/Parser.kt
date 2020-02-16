package logic

import java.text.ParseException

class Parser(private val lexer: Lexer) {
    init {
        lexer.nextToken()
    }
    
    private fun unexpectedLiteral(): Nothing = throw ParseException(
        "Unexpected literal ${lexer.getString()}", lexer.curPos()
    )
    
    
    fun expression(func: (Node) -> Unit): Node {
        val children = arrayListOf<Node>()
        val res = Node("expression", children)
        func(res)
    
        when (lexer.curToken()) {
            Lexer.Token.NOT -> {

                val node0 = x_value{}
                children.add(node0)
                

                val node1 = x_or_continuation{it.value = res.children[0].value}
                children.add(node1)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.LBRACE -> {

                val node0 = x_value{}
                children.add(node0)
                

                val node1 = x_or_continuation{it.value = res.children[0].value}
                children.add(node1)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.ATOM -> {

                val node0 = x_value{}
                children.add(node0)
                

                val node1 = x_or_continuation{it.value = res.children[0].value}
                children.add(node1)
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
    
        when (lexer.curToken()) {
            Lexer.Token.LBRACE -> {

                if (lexer.curToken() != Lexer.Token.LBRACE) {
                    unexpectedLiteral()
                }
                val node0 = Node(lexer.getString())
                children.add(node0)
                
                lexer.nextToken()

                val node1 = expression{}
                children.add(node1)
                

                if (lexer.curToken() != Lexer.Token.RBRACE) {
                    unexpectedLiteral()
                }
                val node2 = Node(lexer.getString())
                children.add(node2)
                res.value = res.children[1].value
                lexer.nextToken()

                return res
            }

            Lexer.Token.ATOM -> {

                if (lexer.curToken() != Lexer.Token.ATOM) {
                    unexpectedLiteral()
                }
                val node0 = Node(lexer.getString())
                children.add(node0)
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
    
        when (lexer.curToken()) {
            Lexer.Token.OR -> {

                if (lexer.curToken() != Lexer.Token.OR) {
                    unexpectedLiteral()
                }
                val node0 = Node(lexer.getString())
                children.add(node0)
                
                lexer.nextToken()

                val node1 = expression{}
                children.add(node1)
                res.value = res.value || children[1].value

                return res
            }

            Lexer.Token.XOR -> {

                if (lexer.curToken() != Lexer.Token.XOR) {
                    unexpectedLiteral()
                }
                val node0 = Node(lexer.getString())
                children.add(node0)
                
                lexer.nextToken()

                val node1 = expression{}
                children.add(node1)
                res.value = res.value xor children[1].value

                return res
            }

            Lexer.Token.RBRACE, Lexer.Token.EPS -> {
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
    
        when (lexer.curToken()) {
            Lexer.Token.NOT -> {

                val node0 = and_value{}
                children.add(node0)
                

                val node1 = and_continuation{it.value = res.children[0].value}
                children.add(node1)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.LBRACE -> {

                val node0 = and_value{}
                children.add(node0)
                

                val node1 = and_continuation{it.value = res.children[0].value}
                children.add(node1)
                res.value = res.children[1].value

                return res
            }

            Lexer.Token.ATOM -> {

                val node0 = and_value{}
                children.add(node0)
                

                val node1 = and_continuation{it.value = res.children[0].value}
                children.add(node1)
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
    
        when (lexer.curToken()) {
            Lexer.Token.NOT -> {

                if (lexer.curToken() != Lexer.Token.NOT) {
                    unexpectedLiteral()
                }
                val node0 = Node(lexer.getString())
                children.add(node0)
                
                lexer.nextToken()

                val node1 = value{}
                children.add(node1)
                res.value = !res.children[1].value

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
    
        when (lexer.curToken()) {
            Lexer.Token.AND -> {

                if (lexer.curToken() != Lexer.Token.AND) {
                    unexpectedLiteral()
                }
                val node0 = Node(lexer.getString())
                children.add(node0)
                
                lexer.nextToken()

                val node1 = x_value{}
                children.add(node1)
                res.value = res.value && children[1].value

                return res
            }

            Lexer.Token.OR, Lexer.Token.RBRACE, Lexer.Token.EPS, Lexer.Token.XOR -> {
                return res
            }

            else -> {
                unexpectedLiteral()
            }
        }
    }


    
}