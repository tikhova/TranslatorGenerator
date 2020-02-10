// Generated from /shared/YandexDisk/ITMO/year2019/mt/TranslatorGenerator/src/test/logic/Logic.g4 by ANTLR 4.8
package logic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicParser}.
 */
public interface LogicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LogicParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LogicParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#x_or_continuation}.
	 * @param ctx the parse tree
	 */
	void enterX_or_continuation(LogicParser.X_or_continuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#x_or_continuation}.
	 * @param ctx the parse tree
	 */
	void exitX_or_continuation(LogicParser.X_or_continuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#x_value}.
	 * @param ctx the parse tree
	 */
	void enterX_value(LogicParser.X_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#x_value}.
	 * @param ctx the parse tree
	 */
	void exitX_value(LogicParser.X_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#and_value}.
	 * @param ctx the parse tree
	 */
	void enterAnd_value(LogicParser.And_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#and_value}.
	 * @param ctx the parse tree
	 */
	void exitAnd_value(LogicParser.And_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#and_continuation}.
	 * @param ctx the parse tree
	 */
	void enterAnd_continuation(LogicParser.And_continuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#and_continuation}.
	 * @param ctx the parse tree
	 */
	void exitAnd_continuation(LogicParser.And_continuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LogicParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LogicParser.ValueContext ctx);
}