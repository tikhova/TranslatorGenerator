package logic

import java.text.ParseException

class Parser(private val lexer: Lexer) {
    init {
        lexer.nextToken()
    }
    
    private fun unexpectedToken(): Nothing = throw ParseException(
        "Unexpected token ${lexer.getString()}", lexer.curPos()
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
                unexpectedToken()
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
                    unexpectedToken()
                }
                val node0 = Node("LBRACE")
                node0.text = lexer.getString()
                children.add(node0)
                
                lexer.nextToken()

                val node1 = expression{}
                children.add(node1)
                

                if (lexer.curToken() != Lexer.Token.RBRACE) {
                    unexpectedToken()
                }
                val node2 = Node("LBRACE")
                node2.text = lexer.getString()
                children.add(node2)
                res.value = res.children[1].value
                lexer.nextToken()

                return res
            }

            Lexer.Token.ATOM -> {

                if (lexer.curToken() != Lexer.Token.ATOM) {
                    unexpectedToken()
                }
                val node0 = Node("ATOM")
                node0.text = lexer.getString()
                children.add(node0)
                res.value = res.children[0].text.toBoolean()
                lexer.nextToken()

                return res
            }

            else -> {
                unexpectedToken()
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
                    unexpectedToken()
                }
                val node0 = Node("OR")
                node0.text = lexer.getString()
                children.add(node0)
                
                lexer.nextToken()

                val node1 = x_value{}
                children.add(node1)
                res.value = res.value || children[1].value

                val node2 = x_or_continuation{it.value = res.value}
                children.add(node2)
                res.value = res.children[2].value

                return res
            }

            Lexer.Token.XOR -> {

                if (lexer.curToken() != Lexer.Token.XOR) {
                    unexpectedToken()
                }
                val node0 = Node("XOR")
                node0.text = lexer.getString()
                children.add(node0)
                
                lexer.nextToken()

                val node1 = x_value{}
                children.add(node1)
                res.value = res.value xor children[1].value

                val node2 = x_or_continuation{it.value = res.value}
                children.add(node2)
                res.value = res.children[2].value

                return res
            }

            Lexer.Token.RBRACE, Lexer.Token.EPS -> {
                return res
            }

            else -> {
                unexpectedToken()
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
                unexpectedToken()
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
                    unexpectedToken()
                }
                val node0 = Node("NOT")
                node0.text = lexer.getString()
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
                unexpectedToken()
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
                    unexpectedToken()
                }
                val node0 = Node("AND")
                node0.text = lexer.getString()
                children.add(node0)
                
                lexer.nextToken()

                val node1 = and_value{}
                children.add(node1)
                res.value = res.value && children[1].value

                val node2 = and_continuation{it.value = res.value}
                children.add(node2)
                res.value = res.children[2].value

                return res
            }

            Lexer.Token.OR, Lexer.Token.RBRACE, Lexer.Token.EPS, Lexer.Token.XOR -> {
                return res
            }

            else -> {
                unexpectedToken()
            }
        }
    }


    
}