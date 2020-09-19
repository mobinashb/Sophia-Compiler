// Generated from C:/Users/amirp/Desktop/Compiler-TA/compiler-f99-ca/src\Sophia.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SophiaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SophiaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SophiaParser#sophia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSophia(SophiaParser.SophiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SophiaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#actor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActor(SophiaParser.ActorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#actorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorBody(SophiaParser.ActorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#knownActors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownActors(SophiaParser.KnownActorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#knownActorsBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownActorsBody(SophiaParser.KnownActorsBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#knownActorsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownActorsStmt(SophiaParser.KnownActorsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#actorVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorVars(SophiaParser.ActorVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#defineVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineVars(SophiaParser.DefineVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#defineVarsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineVarsStmt(SophiaParser.DefineVarsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#msgHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsgHandler(SophiaParser.MsgHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#initialMsgHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialMsgHandler(SophiaParser.InitialMsgHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#argumentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentBody(SophiaParser.ArgumentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#oneArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneArgument(SophiaParser.OneArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SophiaParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#mainBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainBody(SophiaParser.MainBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#mainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatement(SophiaParser.MainStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#defineIntArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineIntArray(SophiaParser.DefineIntArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#primitiveDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(SophiaParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(SophiaParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(SophiaParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#msgHandlerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsgHandlerBody(SophiaParser.MsgHandlerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#restOfStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestOfStatements(SophiaParser.RestOfStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SophiaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#scopeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeStatement(SophiaParser.ScopeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(SophiaParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#printFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunction(SophiaParser.PrintFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#callMsgHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMsgHandler(SophiaParser.CallMsgHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#arrayWithIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayWithIndex(SophiaParser.ArrayWithIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SophiaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#continueBreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueBreak(SophiaParser.ContinueBreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SophiaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SophiaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression00}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression00(SophiaParser.Expression00Context ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression0(SophiaParser.Expression0Context ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(SophiaParser.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(SophiaParser.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression3(SophiaParser.Expression3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression4(SophiaParser.Expression4Context ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression5(SophiaParser.Expression5Context ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression6(SophiaParser.Expression6Context ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression7(SophiaParser.Expression7Context ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression8(SophiaParser.Expression8Context ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression9(SophiaParser.Expression9Context ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#ternaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(SophiaParser.TernaryExpressionContext ctx);
}