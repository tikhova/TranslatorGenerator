package logic

import java.io.StringReader

fun main() {
    val expression = readLine().toString()
    val lexer = Lexer(StringReader(expression))
    val parser = Parser(lexer)
    val res = parser.expression{}

    println(res.value)
    res.printTree()
}