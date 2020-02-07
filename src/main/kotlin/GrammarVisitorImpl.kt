import GrammarParser.*
import org.antlr.v4.runtime.tree.TerminalNode
import java.io.OutputStreamWriter
import java.util.*

class GrammarVisitorImpl(private val outputStreamWriter: OutputStreamWriter) : GrammarBaseVisitor<Void?>() {
    private val _lineSeparator = System.lineSeparator()
    private val _singleIndentation = "    "
    var attributes = ""
    val rules = hashMapOf<String, ArrayList<ArrayList<String>>>()
    val tokens = hashMapOf<String, String>()
    var nodes = setOf<String>()

    val first = hashMapOf<String, HashSet<String>>()
    val follow = hashMapOf<String, HashSet<String>>()

    override fun visitGrammar_(ctx: Grammar_Context): Void? {
        for (child in ctx.children) {
            visit(child)
        }

        // TODO: do first follow build

        return null
    }

    override fun visitAttributes(ctx: AttributesContext): Void? {
        val strBuilder = StringBuilder()
        ctx.Attribute().forEach { strBuilder.append("${it.text}$_lineSeparator") }
        attributes = strBuilder.toString()

        return null
    }

    override fun visitParsingRule(ctx: ParsingRuleContext): Void? {
        val name = ctx.PARSER_IDENTIFIER().toString()

        nodes.plus(name)
        rules.putIfAbsent(name, arrayListOf())
        rules[name]!!.addAll(getParsingRuleOptions(ctx.parsingRuleOptions()))

        return null
    }

    private fun getParsingRuleOptions(ctx: ParsingRuleOptionsContext): ArrayList<ArrayList<String>> {
        val result = arrayListOf(getParsingRule(ctx.parsingAtom()))

        result.addAll(getParsingRuleOptions(ctx.parsingRuleOptions()))

        return result
    }

    private fun getParsingRule(ctx: ParsingAtomContext): ArrayList<String> {
        if (ctx.Identifier() != null) {
            return arrayListOf(ctx.Identifier().getChild(0).text)
        }

        if (ctx.parsingAtom() != null) {
            return getParsingRule(ctx.parsingAtom())
        }

        return arrayListOf()
    }

    override fun visitLexingRule(ctx: LexingRuleContext): Void? {
        val name = ctx.LEXER_IDENTIFIER().text
        val value = getLexingRuleOptions(ctx.lexingRuleOptions())

        if (tokens[name] != null) {
            tokens[name] = "${tokens[name]}|$value"
        } else {
            tokens[name] = value
        }

        return null
    }

    private fun getLexingRuleOptions(ctx: LexingRuleOptionsContext): String {
        val str = getLexingRule(ctx.lexingAtom())

        return if (ctx.lexingRuleOptions() != null) {
            "$str|${getLexingRuleOptions(ctx.lexingRuleOptions())}"
        } else {
            str
        }
    }

    private fun getLexingRule(ctx: LexingAtomContext): String {
        if (ctx.lexingAtom() != null) {
            return "(${getLexingRule(ctx.lexingAtom())})"
        }

        val strBuilder = StringBuilder()
        if (ctx.LexerLiteral() != null) {
            val token = ctx.LexerLiteral().text

            strBuilder.append("(${token.substring(1, token.length - 1)})")
        } else if (ctx.LEXER_IDENTIFIER() != null) {
            strBuilder.append(ctx.LEXER_IDENTIFIER().text)
        }

        strBuilder.append(ctx.CountMark().text)

        return strBuilder.toString()
    }
}