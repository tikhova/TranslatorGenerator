import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.util.*

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
    val ffBuilder = FirstBuilder(visitor.rules, visitor.tokens.keys)
    ffBuilder.buildFirst()
    ffBuilder.buildMapToRule()
    val lexerGenerator = LexerGenerator(visitor)
    val parserGenerator = ParserGenerator(visitor, ffBuilder)
    lexerGenerator.createLexer(dir)
    parserGenerator.createParser(dir)

    printRules(visitor.rules)
}

fun printFirst(first: HashMap<String, HashSet<String>>) {
    first.forEach{(name, map) ->
        print("$name: ")
        map.forEach{ print("$it ") }
        println()
    }

}

fun printRules(rules: HashMap<String, ArrayList<ArrayList<Triple<String, String, String>>>>) {
    rules.forEach {(name, list) ->
        print("$name: ")
        list.forEach {
            it.forEach {(name, _, _) -> print("$name ")
            }
            print("| ")
        }
        println()
    }

}