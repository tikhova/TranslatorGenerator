import java.io.File

class ParserGenerator(private val visitor: GrammarVisitorImpl,
                      private val ffBuilder: FirstFollowBuilder) {
    private val singleIndentation = "    "

    private fun generateNode(path: String): String {
        return """
package $path
            
data class Node(val name: String, val children: List<Node?> = arrayListOf()) {
    ${visitor.attributes}
}
""".trimIndent()
    }

    private fun generateParser(path: String): String {
        return """
package $path

import java.text.ParseException

class Parser(private val lexer: Lexer) {
    private fun unexpectedLiteral(rule: String): Nothing = throw ParseException(
        "Unexpected literal ${'$'}{lexer.curString()} in rule ${'$'}{lexer.curPos()}", lexer.curPos()
    )
    
    private fun ensureTokenIsCorrect(token: Lexer.Token, rule: String) {
        if (lexer.curToken() != token) {
            unexpectedLiteral(rule)
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
private fun ${name}(): Node {
    val children = arrayListOf<Node>()
    val res = Node("$name", children)

    lexer.nextToken()
    when (lexer.curToken()) {""")
            for (fst in ffBuilder.first[name]!!) {
                val ruleNumber = ffBuilder.mapToRule[name]!![fst]!!
                // TODO: add case for eps
                sb.append("${singleIndentation.repeat(3)}Lexer.Token.$fst -> {\n")
                var nodeCounter = 0
                for (rulePart in visitor.rules[name]!![ruleNumber]) {
                    if (rulePart.first in visitor.tokens.keys) {
                        sb.append("""
${singleIndentation.repeat(4)}if (lexer.curToken() != Lexer.Token.${rulePart.first}) {
${singleIndentation.repeat(5)}unexpectedLiteral(${rulePart.first})
${singleIndentation.repeat(4)}}
${singleIndentation.repeat(4)}children.add(Node(lexer.curString()))

${singleIndentation.repeat(4)}lexer.nextToken()
""")
                    } else {
                        sb.append("""
${singleIndentation.repeat(4)}val node$nodeCounter = ${rulePart.first}()
${singleIndentation.repeat(4)}children.add(node$nodeCounter)

${rulePart.second}
""")
                        nodeCounter++
                    }

                    sb.append("""
${singleIndentation.repeat(4)}return res
${singleIndentation.repeat(3)}                        }
""")
                }
            }

            sb.append("""
${singleIndentation.repeat(3)}else -> {
${singleIndentation.repeat(3)}}
${singleIndentation.repeat(2)}}
$singleIndentation}

""")
        }
        sb.append("}")

        return sb.toString()
    }

    fun createParser(path: String) {
        File("src/test/$path").mkdir()
        File("src/test/$path/Node.kt").writeText(generateNode(path))
        File("src/test/$path/Parser.kt").writeText(generateParser(path))
    }
}