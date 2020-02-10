// Generated from /shared/YandexDisk/ITMO/year2019/mt/TranslatorGenerator/src/test/logic/Logic.g4 by ANTLR 4.8
package logic;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LogicParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#x_or_continuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_or_continuation(LogicParser.X_or_continuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#x_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_value(LogicParser.X_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#and_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_value(LogicParser.And_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#and_continuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_continuation(LogicParser.And_continuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LogicParser.ValueContext ctx);
}