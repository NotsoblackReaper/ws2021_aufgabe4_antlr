// Generated from BigCalcProg.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BigCalcProgParser}.
 */
public interface BigCalcProgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BigCalcProgParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(BigCalcProgParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigCalcProgParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(BigCalcProgParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expres}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpres(BigCalcProgParser.ExpresContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expres}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpres(BigCalcProgParser.ExpresContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(BigCalcProgParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(BigCalcProgParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ident}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdent(BigCalcProgParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ident}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdent(BigCalcProgParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(BigCalcProgParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(BigCalcProgParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(BigCalcProgParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(BigCalcProgParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(BigCalcProgParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(BigCalcProgParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(BigCalcProgParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(BigCalcProgParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigCalcProgParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BigCalcProgParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigCalcProgParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BigCalcProgParser.AssignmentContext ctx);
}