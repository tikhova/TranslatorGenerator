import GrammarParser.*
import java.io.OutputStreamWriter
import java.util.*

class GrammarVisitorImpl : GrammarBaseVisitor<Void?>() {
    private val _lineSeparator = System.lineSeparator()

    var attributes = ""
    val rules = hashMapOf<String, ArrayList<ArrayList<Triple<String, String, String>>>>()
    val tokens = hashMapOf<String, String>()
    var nodes = setOf<String>()
    val skipString = StringBuilder()

    override fun visitGrammar_(ctx: Grammar_Context): Void? {
        getAttributes(ctx)

        return super.visitGrammar_(ctx)
    }

    private fun getAttributes(ctx: Grammar_Context) {
        if (ctx.SemanticRules() != null) {
            val text = ctx.SemanticRules().text
            attributes = text.substring(1, text.lastIndex).split(";").joinToString("\n")
        }
    }

    override fun visitSkipRule(ctx: SkipRuleContext): Void? {
        val symbols = ctx.LITERAL().text
        skipString.append(symbols.substring(1, symbols.lastIndex))

        return null
    }

    override fun visitParsingRule(ctx: ParsingRuleContext): Void? {
        val name = ctx.PARSER_IDENTIFIER().toString()
        println(name)

        nodes.plus(name)
        rules.putIfAbsent(name, arrayListOf())
        rules[name]!!.addAll(getParsingRuleOptions(ctx.parsingRuleOptions()))

        return null
    }

    private fun getParsingRuleOptions(ctx: ParsingRuleOptionsContext): ArrayList<ArrayList<Triple<String, String, String>>> {
        val result: ArrayList<ArrayList<Triple<String, String, String>>> =
                arrayListOf(ctx.parsingAtom().map{ getParsingRule(it) } as ArrayList<Triple<String, String, String>>)


        if (ctx.parsingRuleOptions() != null) {
            result.addAll(getParsingRuleOptions(ctx.parsingRuleOptions()))
        }

        return result
    }

    private fun getParsingRule(ctx: ParsingAtomContext): Triple<String, String, String> {
        if (ctx.parsingAtom() != null) {
            return getParsingRule(ctx.parsingAtom())
        }

        var inherited = ""
        if (ctx.InheritedRules() != null) {
            inherited = ctx.InheritedRules().text
            inherited = inherited.substring(1, inherited.lastIndex).split(";").joinToString("\n")
        }

        var rule = ""
        if (ctx.SemanticRules() != null) {
            rule = ctx.SemanticRules().text
            rule = rule.substring(1, rule.lastIndex).split(";").joinToString("\n")
        }

        return Triple(ctx.getChild(0).text, rule, inherited)
    }

    override fun visitLexingRule(ctx: LexingRuleContext): Void? {
        println("lexing rule")
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