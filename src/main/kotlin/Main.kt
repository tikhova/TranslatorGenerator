import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.FileOutputStream
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val fileName = readLine()
    val cs = CharStreams.fromFileName("src/test/$fileName.in")
    val lexer = GrammarLexer(cs)
    val parser = GrammarParser(CommonTokenStream(lexer))
}