// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(implParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(implParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(implParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(implParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhile(implParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhile(implParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Output}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterOutput(implParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Output}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitOutput(implParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiCommand}
	 * labeled alternative in {@link implParser#block}.
	 * @param ctx the parse tree
	 */
	void enterMultiCommand(implParser.MultiCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiCommand}
	 * labeled alternative in {@link implParser#block}.
	 * @param ctx the parse tree
	 */
	void exitMultiCommand(implParser.MultiCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleCommand}
	 * labeled alternative in {@link implParser#block}.
	 * @param ctx the parse tree
	 */
	void enterSingleCommand(implParser.SingleCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleCommand}
	 * labeled alternative in {@link implParser#block}.
	 * @param ctx the parse tree
	 */
	void exitSingleCommand(implParser.SingleCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(implParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(implParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(implParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(implParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(implParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(implParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(implParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(implParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(implParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(implParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(implParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(implParser.ParenthesesContext ctx);
}