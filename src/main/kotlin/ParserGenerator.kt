class ParserGenerator(visitor: GrammarVisitorImpl) {
    val parserTemplate =
            """
            
            """.trimIndent()

    val node =
            """
            data class Node(val name: String, val children: List<Node?> = arrayListOf()) {
                ${visitor.attributes}
            }
            """.trimIndent()
}