// Generated from C:/Users/amirp/Desktop/Compiler-TA/Sophia/src/main/grammar\Sophia.g4 by ANTLR 4.8
package parsers;
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
	 * Visit a parse tree produced by {@link SophiaParser#sophiaClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSophiaClass(SophiaParser.SophiaClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(SophiaParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(SophiaParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(SophiaParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#methodArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArguments(SophiaParser.MethodArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#variableWithType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableWithType(SophiaParser.VariableWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SophiaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(SophiaParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(SophiaParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#listItemsTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListItemsTypes(SophiaParser.ListItemsTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#listItemType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListItemType(SophiaParser.ListItemTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#functioPointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioPointerType(SophiaParser.FunctioPointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#typesWithComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesWithComma(SophiaParser.TypesWithCommaContext ctx);
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
	 * Visit a parse tree produced by {@link SophiaParser#listValus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListValus(SophiaParser.ListValusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(SophiaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SophiaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SophiaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#superStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperStatement(SophiaParser.SuperStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(SophiaParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(SophiaParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SophiaParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SophiaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#methodCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallStatement(SophiaParser.MethodCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(SophiaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#methodCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallArguments(SophiaParser.MethodCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#continueBreakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueBreakStatement(SophiaParser.ContinueBreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SophiaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(SophiaParser.ForeachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SophiaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#singleOrMultiStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleOrMultiStatements(SophiaParser.SingleOrMultiStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SophiaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(SophiaParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(SophiaParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(SophiaParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(SophiaParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(SophiaParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(SophiaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#preUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreUnaryExpression(SophiaParser.PreUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#postUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostUnaryExpression(SophiaParser.PostUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#accessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessExpression(SophiaParser.AccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#otherExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherExpression(SophiaParser.OtherExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(SophiaParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SophiaParser.IdentifierContext ctx);
}