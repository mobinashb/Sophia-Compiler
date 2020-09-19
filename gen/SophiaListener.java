// Generated from C:/Users/amirp/Desktop/Compiler-TA/compiler-f99-ca/src\Sophia.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SophiaParser}.
 */
public interface SophiaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SophiaParser#sophia}.
	 * @param ctx the parse tree
	 */
	void enterSophia(SophiaParser.SophiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#sophia}.
	 * @param ctx the parse tree
	 */
	void exitSophia(SophiaParser.SophiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SophiaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SophiaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#actor}.
	 * @param ctx the parse tree
	 */
	void enterActor(SophiaParser.ActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#actor}.
	 * @param ctx the parse tree
	 */
	void exitActor(SophiaParser.ActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#actorBody}.
	 * @param ctx the parse tree
	 */
	void enterActorBody(SophiaParser.ActorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#actorBody}.
	 * @param ctx the parse tree
	 */
	void exitActorBody(SophiaParser.ActorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#knownActors}.
	 * @param ctx the parse tree
	 */
	void enterKnownActors(SophiaParser.KnownActorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#knownActors}.
	 * @param ctx the parse tree
	 */
	void exitKnownActors(SophiaParser.KnownActorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#knownActorsBody}.
	 * @param ctx the parse tree
	 */
	void enterKnownActorsBody(SophiaParser.KnownActorsBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#knownActorsBody}.
	 * @param ctx the parse tree
	 */
	void exitKnownActorsBody(SophiaParser.KnownActorsBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#knownActorsStmt}.
	 * @param ctx the parse tree
	 */
	void enterKnownActorsStmt(SophiaParser.KnownActorsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#knownActorsStmt}.
	 * @param ctx the parse tree
	 */
	void exitKnownActorsStmt(SophiaParser.KnownActorsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#actorVars}.
	 * @param ctx the parse tree
	 */
	void enterActorVars(SophiaParser.ActorVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#actorVars}.
	 * @param ctx the parse tree
	 */
	void exitActorVars(SophiaParser.ActorVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#defineVars}.
	 * @param ctx the parse tree
	 */
	void enterDefineVars(SophiaParser.DefineVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#defineVars}.
	 * @param ctx the parse tree
	 */
	void exitDefineVars(SophiaParser.DefineVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#defineVarsStmt}.
	 * @param ctx the parse tree
	 */
	void enterDefineVarsStmt(SophiaParser.DefineVarsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#defineVarsStmt}.
	 * @param ctx the parse tree
	 */
	void exitDefineVarsStmt(SophiaParser.DefineVarsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#msgHandler}.
	 * @param ctx the parse tree
	 */
	void enterMsgHandler(SophiaParser.MsgHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#msgHandler}.
	 * @param ctx the parse tree
	 */
	void exitMsgHandler(SophiaParser.MsgHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#initialMsgHandler}.
	 * @param ctx the parse tree
	 */
	void enterInitialMsgHandler(SophiaParser.InitialMsgHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#initialMsgHandler}.
	 * @param ctx the parse tree
	 */
	void exitInitialMsgHandler(SophiaParser.InitialMsgHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#argumentBody}.
	 * @param ctx the parse tree
	 */
	void enterArgumentBody(SophiaParser.ArgumentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#argumentBody}.
	 * @param ctx the parse tree
	 */
	void exitArgumentBody(SophiaParser.ArgumentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#oneArgument}.
	 * @param ctx the parse tree
	 */
	void enterOneArgument(SophiaParser.OneArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#oneArgument}.
	 * @param ctx the parse tree
	 */
	void exitOneArgument(SophiaParser.OneArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SophiaParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SophiaParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#mainBody}.
	 * @param ctx the parse tree
	 */
	void enterMainBody(SophiaParser.MainBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#mainBody}.
	 * @param ctx the parse tree
	 */
	void exitMainBody(SophiaParser.MainBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void enterMainStatement(SophiaParser.MainStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void exitMainStatement(SophiaParser.MainStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#defineIntArray}.
	 * @param ctx the parse tree
	 */
	void enterDefineIntArray(SophiaParser.DefineIntArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#defineIntArray}.
	 * @param ctx the parse tree
	 */
	void exitDefineIntArray(SophiaParser.DefineIntArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#primitiveDataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(SophiaParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#primitiveDataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(SophiaParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(SophiaParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(SophiaParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(SophiaParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(SophiaParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#msgHandlerBody}.
	 * @param ctx the parse tree
	 */
	void enterMsgHandlerBody(SophiaParser.MsgHandlerBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#msgHandlerBody}.
	 * @param ctx the parse tree
	 */
	void exitMsgHandlerBody(SophiaParser.MsgHandlerBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#restOfStatements}.
	 * @param ctx the parse tree
	 */
	void enterRestOfStatements(SophiaParser.RestOfStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#restOfStatements}.
	 * @param ctx the parse tree
	 */
	void exitRestOfStatements(SophiaParser.RestOfStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SophiaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SophiaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#scopeStatement}.
	 * @param ctx the parse tree
	 */
	void enterScopeStatement(SophiaParser.ScopeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#scopeStatement}.
	 * @param ctx the parse tree
	 */
	void exitScopeStatement(SophiaParser.ScopeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(SophiaParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(SophiaParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#printFunction}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunction(SophiaParser.PrintFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#printFunction}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunction(SophiaParser.PrintFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#callMsgHandler}.
	 * @param ctx the parse tree
	 */
	void enterCallMsgHandler(SophiaParser.CallMsgHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#callMsgHandler}.
	 * @param ctx the parse tree
	 */
	void exitCallMsgHandler(SophiaParser.CallMsgHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#arrayWithIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayWithIndex(SophiaParser.ArrayWithIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#arrayWithIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayWithIndex(SophiaParser.ArrayWithIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SophiaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SophiaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#continueBreak}.
	 * @param ctx the parse tree
	 */
	void enterContinueBreak(SophiaParser.ContinueBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#continueBreak}.
	 * @param ctx the parse tree
	 */
	void exitContinueBreak(SophiaParser.ContinueBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SophiaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SophiaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SophiaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SophiaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expression00}.
	 * @param ctx the parse tree
	 */
	void enterExpression00(SophiaParser.Expression00Context ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expression00}.
	 * @param ctx the parse tree
	 */
	void exitExpression00(SophiaParser.Expression00Context ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expression0}.
	 * @param ctx the parse tree
	 */
	void enterExpression0(SophiaParser.Expression0Context ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expression0}.
	 * @param ctx the parse tree
	 */
	void exitExpression0(SophiaParser.Expression0Context ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(SophiaParser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(SophiaParser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(SophiaParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(SophiaParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expression3}.
	 * @param ctx the parse tree
	 */
	void enterExpression3(SophiaParser.Expression3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expression3}.
	 * @param ctx the parse tree
	 */
	void exitExpression3(SophiaParser.Expression3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expression4}.
	 * @param ctx the parse tree
	 */
	void enterExpression4(SophiaParser.Expression4Context ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expression4}.
	 * @param ctx the parse tree
	 */
	void exitExpression4(SophiaParser.Expression4Context ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expression5}.
	 * @param ctx the parse tree
	 */
	void enterExpression5(SophiaParser.Expression5Context ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expression5}.
	 * @param ctx the parse tree
	 */
	void exitExpression5(SophiaParser.Expression5Context ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expression6}.
	 * @param ctx the parse tree
	 */
	void enterExpression6(SophiaParser.Expression6Context ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expression6}.
	 * @param ctx the parse tree
	 */
	void exitExpression6(SophiaParser.Expression6Context ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expression7}.
	 * @param ctx the parse tree
	 */
	void enterExpression7(SophiaParser.Expression7Context ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expression7}.
	 * @param ctx the parse tree
	 */
	void exitExpression7(SophiaParser.Expression7Context ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expression8}.
	 * @param ctx the parse tree
	 */
	void enterExpression8(SophiaParser.Expression8Context ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expression8}.
	 * @param ctx the parse tree
	 */
	void exitExpression8(SophiaParser.Expression8Context ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expression9}.
	 * @param ctx the parse tree
	 */
	void enterExpression9(SophiaParser.Expression9Context ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expression9}.
	 * @param ctx the parse tree
	 */
	void exitExpression9(SophiaParser.Expression9Context ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(SophiaParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(SophiaParser.TernaryExpressionContext ctx);
}