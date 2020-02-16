import java.io.File

class ParserGenerator(private val visitor: GrammarVisitorImpl,
                      private val firstFollowBuilder: FirstFollowBuilder) {
    private val singleIndentation = "    "

    private fun generateNode(path: String): String {
        return """
package $path
            
data class Node(val name: String, val children: List<Node> = arrayListOf()) {
    ${visitor.attributes}

    private fun getChildren(name: String): List<Node> {
        return children.filter{ it.name == name }
    }
}
""".trimIndent()
    }

    private fun generateParser(path: String): String {
        return """
package $path

import java.text.ParseException

class Parser(private val lexer: Lexer) {
    init {
        lexer.nextToken()
    }
    
    private fun unexpectedLiteral(): Nothing = throw ParseException(
        "Unexpected literal ${'$'}{lexer.getString()}", lexer.curPos()
    )
    
    private fun ensureTokenIsCorrect(token: Lexer.Token, rule: String) {
        if (lexer.curToken() != token) {
            unexpectedLiteral()
        }
    }
    
    ${getNodeFunctions()}
    
}
""".trimIndent()
    }

    private fun getNodeFunctions(): String {
        val sb = StringBuilder()
        for (name in visitor.rules.keys) {
            sb.append("""
    fun ${name}(func: (Node) -> Unit): Node {
        val children = arrayListOf<Node>()
        val res = Node("$name", children)
        func(res)
    
        when (lexer.curToken()) {""")
            for (fst in firstFollowBuilder.first[name]!!.filter { it != "EPS" }) {
                sb.append("\n${singleIndentation.repeat(3)}Lexer.Token.$fst -> {\n")
                val ruleNumber = firstFollowBuilder.mapToRule[name]!![fst]!!
                var nodeCounter = 0

                for (rulePart in visitor.rules[name]!![ruleNumber]) {
                    if (rulePart.first in visitor.tokens.keys) {
                        sb.append("""
${singleIndentation.repeat(4)}if (lexer.curToken() != Lexer.Token.${rulePart.first}) {
${singleIndentation.repeat(5)}unexpectedLiteral()
${singleIndentation.repeat(4)}}
${singleIndentation.repeat(4)}val node$nodeCounter = Node(lexer.getString())""")
                        if (rulePart.third.isNotEmpty()) {
                            sb.append("${singleIndentation.repeat(5)}node$nodeCounter.apply(${rulePart.third})\n")
                        }
                        sb.append("""
${singleIndentation.repeat(4)}children.add(node$nodeCounter)
${singleIndentation.repeat(4)}${rulePart.second}
${singleIndentation.repeat(4)}lexer.nextToken()
""")
                        nodeCounter++
                    } else {
                        sb.append("""
${singleIndentation.repeat(4)}val node$nodeCounter = ${rulePart.first}{${rulePart.third}}
${singleIndentation.repeat(4)}children.add(node$nodeCounter)
${singleIndentation.repeat(4)}${rulePart.second}
""")
                        nodeCounter++
                    }
                }
                sb.append("""
${singleIndentation.repeat(4)}return res
${singleIndentation.repeat(3)}}
""")
            }
            println("FIRST: $name -> ${firstFollowBuilder.first[name]!!.toString()}")
            println("FOLLOW: $name -> ${firstFollowBuilder.follow[name]!!.toString()}")
            if (firstFollowBuilder.first[name]!!.contains("EPS") && firstFollowBuilder.follow[name]!!.isNotEmpty()) {
                val follow = firstFollowBuilder.follow[name]!!
                follow.add("EPS")
                val followList = follow.joinToString(", ") { "Lexer.Token.$it" }
                    sb.append("""
${singleIndentation.repeat(3)}$followList -> {
${singleIndentation.repeat(4)}return res
${singleIndentation.repeat(3)}}
""")
            }
            sb.append("""
${singleIndentation.repeat(3)}else -> {
${singleIndentation.repeat(4)}unexpectedLiteral()
${singleIndentation.repeat(3)}}
${singleIndentation.repeat(2)}}
$singleIndentation}

""")
        }
        return sb.toString()
    }

    fun createParser(path: String) {
        File("src/test/$path").mkdir()
        File("src/test/$path/Node.kt").writeText(generateNode(path))
        File("src/test/$path/Parser.kt").writeText(generateParser(path))
    }
}