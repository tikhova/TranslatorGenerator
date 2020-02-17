package calculator

import java.text.ParseException

class Parser(private val lexer: Lexer) {
    init {
        lexer.nextToken()
    }
    
    private fun unexpectedLiteral(): Nothing = throw ParseException(
        "Unexpected literal ${lexer.getString()}", lexer.curPos()
    )
    
    
    fun expressionPrime(func: (Node) -> Unit): Node {
        val children = arrayListOf<Node>()
        val res = Node("expressionPrime", children)
        func(res)
    
        when (lexer.curToken()) {
            Lexer.Token.PLUS -> {

                if (lexer.curToken() != Lexer.Token.PLUS) {
                    unexpectedLiteral()
                }
                val node0 = Node(lexer.getString())
                children.add(node0)
                
                lexer.nextToken()

                val node1 = complex{}
                children.add(node1)
                

                val node2 = expressionPrime{it.value = res.value!! + children[1].value!!}
                children.add(node2)
                res.value = children[2].value!!

                return res
            }

            Lexer.Token.MINUS -> {

                if (lexer.curToken() != Lexer.Token.MINUS) {
                    unexpectedLiteral()
                }
                val node0 = Node(lexer.getString())
                children.add(node0)
                
                lexer.nextToken()

                val node1 = complex{}
                children.add(node1)
                

                val node2 = expressionPrime{it.value = res.value!! - children[1].value!!}
                children.add(node2)
                res.value = children[2].value!!

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


    fun expression(func: (Node) -> Unit): Node {
        val children = arrayListOf<Node>()
        val res = Node("expression", children)
        func(res)
    
        when (lexer.curToken()) {
            Lexer.Token.NUMBER -> {

                val node0 = complex{}
                children.add(node0)
                

                val node1 = expressionPrime{it.value = res.children[0].value}
                children.add(node1)
                res.value = children[1].value!!

                return res
            }

            Lexer.Token.LBRACE -> {

                val node0 = complex{}
                children.add(node0)
                

                val node1 = expressionPrime{it.value = res.children[0].value}
                children.add(node1)
                res.value = children[1].value!!

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
            Lexer.Token.NUMBER -> {

                if (lexer.curToken() != Lexer.Token.NUMBER) {
                    unexpectedLiteral()
                }
                val node0 = Node(lexer.getString())
                children.add(node0)
                res.value = children[0].name.toInt()
                lexer.nextToken()

                return res
            }

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
                 res.value = children[1].value!! 
                lexer.nextToken()

                return res
            }

            else -> {
                unexpectedLiteral()
            }
        }
    }


    fun complex(func: (Node) -> Unit): Node {
        val children = arrayListOf<Node>()
        val res = Node("complex", children)
        func(res)
    
        when (lexer.curToken()) {
            Lexer.Token.NUMBER -> {

                val node0 = value{}
                children.add(node0)
                

                val node1 = complexPrime{it.value = res.children[0].value!!}
                children.add(node1)
                res.value = children[1].value!!

                return res
            }

            Lexer.Token.LBRACE -> {

                val node0 = value{}
                children.add(node0)
                

                val node1 = complexPrime{it.value = res.children[0].value!!}
                children.add(node1)
                res.value = children[1].value!!

                return res
            }

            else -> {
                unexpectedLiteral()
            }
        }
    }


    fun complexPrime(func: (Node) -> Unit): Node {
        val children = arrayListOf<Node>()
        val res = Node("complexPrime", children)
        func(res)
    
        when (lexer.curToken()) {
            Lexer.Token.MULTIPLICATION -> {

                if (lexer.curToken() != Lexer.Token.MULTIPLICATION) {
                    unexpectedLiteral()
                }
                val node0 = Node(lexer.getString())
                children.add(node0)
                
                lexer.nextToken()

                val node1 = value{}
                children.add(node1)
                

                val node2 = complexPrime{it.value = res.value!! * children[1].value!!}
                children.add(node2)
                res.value = children[2].value!!

                return res
            }

            Lexer.Token.DIVISION -> {

                if (lexer.curToken() != Lexer.Token.DIVISION) {
                    unexpectedLiteral()
                }
                val node0 = Node(lexer.getString())
                children.add(node0)
                
                lexer.nextToken()

                val node1 = value{}
                children.add(node1)
                

                val node2 = complexPrime{it.value = res.value!! / children[1].value!!}
                children.add(node2)
                res.value = children[2].value!!

                return res
            }

            Lexer.Token.RBRACE, Lexer.Token.EPS, Lexer.Token.PLUS, Lexer.Token.MINUS -> {
                return res
            }

            else -> {
                unexpectedLiteral()
            }
        }
    }


    
}