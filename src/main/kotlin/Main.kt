import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

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
        "3" -> {
            dir = "kotlinFormat"
            name = "KotlinFormat.g4"
        }
    }

    val cs = CharStreams.fromFileName("src/test/$dir/$name")
    val lexer = GrammarLexer(cs)
    val parser = GrammarParser(CommonTokenStream(lexer))
    val visitor = GrammarVisitorImpl()
    val grammar = parser.grammar_()
    visitor.visit(grammar)
    val lexerGenerator = LexerGenerator(visitor)
    lexerGenerator.createLexer(dir)
}