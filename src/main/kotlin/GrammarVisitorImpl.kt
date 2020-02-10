import GrammarParser.*
import java.io.OutputStreamWriter
import java.util.*

class GrammarVisitorImpl : GrammarBaseVisitor<Void?>() {
    private val _lineSeparator = System.lineSeparator()

    var attributes = ""
    val rules = hashMapOf<String, ArrayList<ArrayList<Pair<String, String>>>>()
    val tokens = hashMapOf<String, String>()
    var nodes = setOf<String>()
    val skipString = StringBuilder()

    override fun visitGrammar_(ctx: Grammar_Context): Void? {
        getAttributes(ctx)

        return super.visitGrammar_(ctx)
    }

    private fun getAttributes(ctx: Grammar_Context) {
        if (ctx.Attributes() != null) {
            val text = ctx.Attributes().text
            attributes = text.substring(1, text.lastIndex).split(";").joinToString(";\n")
        }
    }

    override fun visitRule_(ctx: Rule_Context): Void? {
        if (ctx.SkipRule() != null) {
            skipString.append(Regex("[.*]").matchEntire(skipString.append(ctx.SkipRule().text))!!.value)

            return null
        }

        return super.visitRule_(ctx)
    }

    override fun visitParsingRule(ctx: ParsingRuleContext): Void? {
        val name = ctx.PARSER_IDENTIFIER().toString()
        println(name)

        nodes.plus(name)
        rules.putIfAbsent(name, arrayListOf())
        rules[name]!!.addAll(getParsingRuleOptions(ctx.parsingRuleOptions()))

        return null
    }

    private fun getParsingRuleOptions(ctx: ParsingRuleOptionsContext): ArrayList<ArrayList<Pair<String, String>>> {
        val result: ArrayList<ArrayList<Pair<String, String>>> = arrayListOf()

        ctx.parsingAtom().forEach{
            result.add(getParsingRule(it))
        }

        if (ctx.parsingRuleOptions() != null) {
            result.addAll(getParsingRuleOptions(ctx.parsingRuleOptions()))
        }

        return result
    }

    private fun getParsingRule(ctx: ParsingAtomContext): ArrayList<Pair<String, String>> {
        if (ctx.parsingAtom() != null) {
            return getParsingRule(ctx.parsingAtom())
        }

        var rule = ""
        if (ctx.SemanticRules() != null) {
            rule = ctx.SemanticRules().text
        }

        return arrayListOf(Pair(ctx.getChild(0).text, rule))
    }

    override fun visitLexingRule(ctx: LexingRuleContext): Void? {
        val name = ctx.LEXER_IDENTIFIER().text
        val value = getLexingRuleOptions(ctx.lexingRuleOptions())
        if (tokens[name] != null) {
            tokens[name] = tokens[name].plus("|$value")
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

            strBuilder.append("(${token.substring(1, token.length - 1)})".replace("\\", "\\\\"))
        } else if (ctx.LEXER_IDENTIFIER() != null) {
            strBuilder.append(ctx.LEXER_IDENTIFIER().text)
        }

        if (ctx.CountMark() != null) {
            strBuilder.append(ctx.CountMark().text)
        }

        return strBuilder.toString()
    }
}