import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.StringReader

fun main() {
    val option = readLine().toString()
    lateinit var dir: String
    lateinit var name: String

    when (option) {
        "1" -> {
            dir = "calculator"
            name = "Calculator.g4"
        }
        "2" -> {
            dir = "logic"
            name = "Logic.g4"
        }
    }

    val visitor = parseGrammar(dir, name)
    val ffBuilder = buildFF(visitor)
    createLexer(visitor, dir)
    createParser(visitor, ffBuilder, dir)
}

fun parseGrammar(dir: String, name: String): GrammarVisitorImpl {
    val cs = CharStreams.fromFileName("src/test/$dir/$name")
    val lexer = GrammarLexer(cs)
    val parser = GrammarParser(CommonTokenStream(lexer))
    val visitor = GrammarVisitorImpl()
    val grammar = parser.grammar_()
    visitor.visit(grammar)

    return visitor
}

fun buildFF(visitor: GrammarVisitorImpl): FirstFollowBuilder {
    val ffBuilder = FirstFollowBuilder(visitor.rules, visitor.tokens.keys)
    ffBuilder.buildFirst()
    ffBuilder.buildFollow()
    ffBuilder.buildMapToRule()

    return ffBuilder
}

fun createLexer(visitor: GrammarVisitorImpl, dir: String) {
    val lexerGenerator = LexerGenerator(visitor)
    lexerGenerator.createLexer(dir)
}

fun createParser(visitor: GrammarVisitorImpl, ffBuilder: FirstFollowBuilder, dir: String) {
    val parserGenerator = ParserGenerator(visitor, ffBuilder)
    parserGenerator.createParser(dir)
}