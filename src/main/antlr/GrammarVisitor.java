// Generated from /shared/YandexDisk/ITMO/year2019/parsers/TranslatorGenerator/src/main/antlr/Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammar_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammar_(GrammarParser.Grammar_Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(GrammarParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rule_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_(GrammarParser.Rule_Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parsingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParsingRule(GrammarParser.ParsingRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parsingAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParsingAtom(GrammarParser.ParsingAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parsingRuleOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParsingRuleOptions(GrammarParser.ParsingRuleOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lexingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexingRule(GrammarParser.LexingRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lexingAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexingAtom(GrammarParser.LexingAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lexingRuleOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexingRuleOptions(GrammarParser.LexingRuleOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#skipRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipRule(GrammarParser.SkipRuleContext ctx);
}