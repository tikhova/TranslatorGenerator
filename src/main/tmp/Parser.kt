import java.text.ParseException
import java.util.ArrayDeque
import kotlin.math.*
class Parser(private val lexer: Lexer) {
    var text = ""

    private fun check(token: Token, rule: String) {
        if (lexer.token != token) {
            unexpectedLiteral(rule)
        }
    }


        for (firstToken in visitor.first[ruleName]!!) {
            var varIndex = 0
            val ruleNumber = visitor.ruleNumberFromFirst[ruleName]!![firstToken]!!
            if (firstToken == EPS) {
                for (ruleFollow in visitor.follow[ruleName]!!) {
                    append(addTabs(3))
                    append("Token.$ruleFollow -> {")
                    append(SEPARATOR)
                    for (rulePart in visitor.rules[ruleName]!![ruleNumber]) {
                        if (rulePart.startsWith('$')) {
                            append(addTabs(4) + rulePart.substring(1, rulePart.lastIndex)
                                    .split(";")
                                    .map { it.trim() }
                                    .joinToString("\n" + addTabs(4))
                                    .trim() + SEPARATOR)
                        }
                    }
                    append(addTabs(4))
                    append("children.add(Node(\"EPS\"))")
                    append(SEPARATOR)
                    append(addTabs(4))
                    append("return res")
                    append(SEPARATOR)
                    append(addTabs(3) + "}")
                    append(SEPARATOR)
                }
                continue
            }
            append(addTabs(3))
            append("Token.$firstToken -> {")
            append(SEPARATOR)
            for (rulePart in visitor.rules[ruleName]!![ruleNumber]) {
                if (rulePart.startsWith('$')) {
                    append(addTabs(4) + rulePart.substring(1, rulePart.lastIndex)
                            .split(";")
                            .map { it.trim() }
                            .joinToString("\n" + addTabs(4))
                            .trim() + SEPARATOR)
                    continue
                }
                if (rulePart in visitor.tokens.keys) {
                    append(addTabs(4))
                    append("check(Token.${rulePart}, \"$rulePart\")")
                    append(SEPARATOR)
                    append(addTabs(4))
                    append("text = lexer.tokenValue")
                    append(SEPARATOR)
                    append(addTabs(4))
                    if (rulePart == EOF) {
                        append("children.add(Node(\"EOF\"))")
                    } else {
                        append("children.add(Node(text))")
                    }
                    append(SEPARATOR + SEPARATOR)
                    append(addTabs(4))
                    append("lexer.nextToken()")
                    append(SEPARATOR + SEPARATOR)
                } else {
                    append(addTabs(4))
                    append("val var$varIndex = $rulePart()")
                    append(SEPARATOR)
                    append(addTabs(4))
                    append("children.add(var$varIndex)")
                    append(SEPARATOR + SEPARATOR)
                    ++varIndex
                }
            }
            append(addTabs(4))
            append("return res")
            append(SEPARATOR)
            append(addTabs(3))
            append("}")
            append(SEPARATOR)
        }
        append(addTabs(3))
        append("else -> {")
        append(SEPARATOR + addTabs(4))
        append("unexpectedLiteral(\"${ruleName}\")")
        append(SEPARATOR + addTabs(3) + "}" + SEPARATOR + addTabs(2) + "}" + SEPARATOR + addTabs(1) + "}" + SEPARATOR)
    }

    append(
            """
                fun parse(input: String): Node {
            lexer = Lexer(input)
            return start()
        }
        }
        """.trimIndent()
    )
}