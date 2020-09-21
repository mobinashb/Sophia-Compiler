// Generated from C:/Users/amirp/Desktop/Compiler-TA/Sophia/src/main/grammar\Sophia.g4 by ANTLR 4.8
package parsers;

    import main.ast.types.*;
    import main.ast.types.functionPointer.*;
    import main.ast.types.list.*;
    import main.ast.types.single.*;
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.declaration.classDec.*;
    import main.ast.nodes.declaration.classDec.classMembersDec.*;
    import main.ast.nodes.declaration.variableDec.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.values.*;
    import main.ast.nodes.expression.values.primitive.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.statement.loop.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SophiaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, INHERITS=2, CLASS=3, PRINT=4, FUNC=5, INVOKE=6, NEW=7, CONTINUE=8, 
		BREAK=9, RETURN=10, FOREACH=11, IN=12, FOR=13, IF=14, ELSE=15, BOOLEAN=16, 
		STRING=17, INT=18, VOID=19, NULL=20, LIST=21, TRUE=22, FALSE=23, THIS=24, 
		SUPER=25, ARROW=26, GREATER_THAN=27, LESS_THAN=28, NOT_EQUAL=29, EQUAL=30, 
		MULT=31, DIVIDE=32, MOD=33, PLUS=34, MINUS=35, AND=36, OR=37, NOT=38, 
		QUESTION_MARK=39, ASSIGN=40, INCREMENT=41, DECREMENT=42, LPAR=43, RPAR=44, 
		LBRACK=45, RBRACK=46, LBRACE=47, RBRACE=48, SHARP=49, COMMA=50, DOT=51, 
		COLON=52, SEMICOLLON=53, INT_VALUE=54, IDENTIFIER=55, STRING_VALUE=56, 
		COMMENT=57, WS=58;
	public static final int
		RULE_sophia = 0, RULE_program = 1, RULE_sophiaClass = 2, RULE_classBody = 3, 
		RULE_varDeclaration = 4, RULE_method = 5, RULE_constructor = 6, RULE_methodArguments = 7, 
		RULE_variableWithType = 8, RULE_type = 9, RULE_classType = 10, RULE_listType = 11, 
		RULE_listItemsTypes = 12, RULE_listItemType = 13, RULE_functioPointerType = 14, 
		RULE_typesWithComma = 15, RULE_primitiveDataType = 16, RULE_values = 17, 
		RULE_boolValue = 18, RULE_listValus = 19, RULE_methodBody = 20, RULE_statement = 21, 
		RULE_block = 22, RULE_superStatement = 23, RULE_assignmentStatement = 24, 
		RULE_assignmentStmt = 25, RULE_printStatement = 26, RULE_returnStatement = 27, 
		RULE_methodCallStatement = 28, RULE_methodCall = 29, RULE_methodCallArguments = 30, 
		RULE_continueBreakStatement = 31, RULE_forStatement = 32, RULE_foreachStatement = 33, 
		RULE_ifStatement = 34, RULE_singleOrMultiStatements = 35, RULE_expression = 36, 
		RULE_orExpression = 37, RULE_andExpression = 38, RULE_equalityExpression = 39, 
		RULE_relationalExpression = 40, RULE_additiveExpression = 41, RULE_multiplicativeExpression = 42, 
		RULE_preUnaryExpression = 43, RULE_postUnaryExpression = 44, RULE_accessExpression = 45, 
		RULE_otherExpression = 46, RULE_newExpression = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "program", "sophiaClass", "classBody", "varDeclaration", "method", 
			"constructor", "methodArguments", "variableWithType", "type", "classType", 
			"listType", "listItemsTypes", "listItemType", "functioPointerType", "typesWithComma", 
			"primitiveDataType", "values", "boolValue", "listValus", "methodBody", 
			"statement", "block", "superStatement", "assignmentStatement", "assignmentStmt", 
			"printStatement", "returnStatement", "methodCallStatement", "methodCall", 
			"methodCallArguments", "continueBreakStatement", "forStatement", "foreachStatement", 
			"ifStatement", "singleOrMultiStatements", "expression", "orExpression", 
			"andExpression", "equalityExpression", "relationalExpression", "additiveExpression", 
			"multiplicativeExpression", "preUnaryExpression", "postUnaryExpression", 
			"accessExpression", "otherExpression", "newExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'inherits'", "'class'", "'print'", "'func'", "'invoke'", 
			"'new'", "'continue'", "'break'", "'return'", "'foreach'", "'in'", "'for'", 
			"'if'", "'else'", "'bool'", "'string'", "'int'", "'void'", "'null'", 
			"'list'", "'true'", "'false'", "'this'", "'super'", "'->'", "'>'", "'<'", 
			"'=!'", "'=='", "'*'", "'/'", "'%'", "'+'", "'-'", "'&&'", "'||'", "'!'", 
			"'?'", "'='", "'++'", "'--'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'#'", "','", "'.'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "INHERITS", "CLASS", "PRINT", "FUNC", "INVOKE", "NEW", "CONTINUE", 
			"BREAK", "RETURN", "FOREACH", "IN", "FOR", "IF", "ELSE", "BOOLEAN", "STRING", 
			"INT", "VOID", "NULL", "LIST", "TRUE", "FALSE", "THIS", "SUPER", "ARROW", 
			"GREATER_THAN", "LESS_THAN", "NOT_EQUAL", "EQUAL", "MULT", "DIVIDE", 
			"MOD", "PLUS", "MINUS", "AND", "OR", "NOT", "QUESTION_MARK", "ASSIGN", 
			"INCREMENT", "DECREMENT", "LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", 
			"RBRACE", "SHARP", "COMMA", "DOT", "COLON", "SEMICOLLON", "INT_VALUE", 
			"IDENTIFIER", "STRING_VALUE", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sophia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SophiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SophiaContext extends ParserRuleContext {
		public Program sophiaProgram;
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SophiaParser.EOF, 0); }
		public SophiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaContext sophia() throws RecognitionException {
		SophiaContext _localctx = new SophiaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sophia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SophiaContext)_localctx).sophiaProgram =  new Program();
			setState(97);
			program();
			setState(98);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<SophiaClassContext> sophiaClass() {
			return getRuleContexts(SophiaClassContext.class);
		}
		public SophiaClassContext sophiaClass(int i) {
			return getRuleContext(SophiaClassContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(100);
				sophiaClass();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SophiaClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SophiaParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SophiaParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode INHERITS() { return getToken(SophiaParser.INHERITS, 0); }
		public SophiaClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophiaClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophiaClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophiaClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophiaClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaClassContext sophiaClass() throws RecognitionException {
		SophiaClassContext _localctx = new SophiaClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sophiaClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(CLASS);
			setState(107);
			match(IDENTIFIER);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(108);
				match(INHERITS);
				setState(109);
				match(IDENTIFIER);
				}
			}

			setState(112);
			match(LBRACE);
			setState(113);
			classBody();
			setState(114);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(118);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FUNC:
					case BOOLEAN:
					case STRING:
					case INT:
					case LIST:
					case IDENTIFIER:
						{
						setState(116);
						varDeclaration();
						}
						break;
					case DEF:
						{
						setState(117);
						method();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(123);
				constructor();
				}
				break;
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << FUNC) | (1L << BOOLEAN) | (1L << STRING) | (1L << INT) | (1L << LIST) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
				case BOOLEAN:
				case STRING:
				case INT:
				case LIST:
				case IDENTIFIER:
					{
					setState(126);
					varDeclaration();
					}
					break;
				case DEF:
					{
					setState(127);
					method();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			type();
			setState(134);
			match(IDENTIFIER);
			setState(135);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SophiaParser.VOID, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(DEF);
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(138);
				type();
				}
				break;
			case VOID:
				{
				setState(139);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
			match(IDENTIFIER);
			setState(143);
			match(LPAR);
			setState(144);
			methodArguments();
			setState(145);
			match(RPAR);
			setState(146);
			match(LBRACE);
			setState(147);
			methodBody();
			setState(148);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(DEF);
			setState(151);
			match(IDENTIFIER);
			setState(152);
			match(LPAR);
			setState(153);
			methodArguments();
			setState(154);
			match(RPAR);
			setState(155);
			match(LBRACE);
			setState(156);
			methodBody();
			setState(157);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodArgumentsContext extends ParserRuleContext {
		public List<VariableWithTypeContext> variableWithType() {
			return getRuleContexts(VariableWithTypeContext.class);
		}
		public VariableWithTypeContext variableWithType(int i) {
			return getRuleContext(VariableWithTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public MethodArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentsContext methodArguments() throws RecognitionException {
		MethodArgumentsContext _localctx = new MethodArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(159);
				variableWithType();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(160);
					match(COMMA);
					setState(161);
					variableWithType();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableWithTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableWithTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableWithType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVariableWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVariableWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVariableWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableWithTypeContext variableWithType() throws RecognitionException {
		VariableWithTypeContext _localctx = new VariableWithTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableWithType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(IDENTIFIER);
			setState(170);
			match(COLON);
			setState(171);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveDataTypeContext primitiveDataType() {
			return getRuleContext(PrimitiveDataTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public FunctioPointerTypeContext functioPointerType() {
			return getRuleContext(FunctioPointerTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				primitiveDataType();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				listType();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				functioPointerType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				classType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListTypeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(SophiaParser.LIST, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TerminalNode SHARP() { return getToken(SophiaParser.SHARP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemsTypesContext listItemsTypes() {
			return getRuleContext(ListItemsTypesContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LIST);
			setState(182);
			match(LPAR);
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				{
				{
				setState(183);
				match(INT_VALUE);
				setState(184);
				match(SHARP);
				setState(185);
				type();
				}
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case RPAR:
			case IDENTIFIER:
				{
				{
				setState(186);
				listItemsTypes();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(189);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListItemsTypesContext extends ParserRuleContext {
		public List<ListItemTypeContext> listItemType() {
			return getRuleContexts(ListItemTypeContext.class);
		}
		public ListItemTypeContext listItemType(int i) {
			return getRuleContext(ListItemTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public ListItemsTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemsTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListItemsTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListItemsTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListItemsTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemsTypesContext listItemsTypes() throws RecognitionException {
		ListItemsTypesContext _localctx = new ListItemsTypesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listItemsTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << BOOLEAN) | (1L << STRING) | (1L << INT) | (1L << LIST) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(191);
				listItemType();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(192);
					match(COMMA);
					setState(193);
					listItemType();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListItemTypeContext extends ParserRuleContext {
		public VariableWithTypeContext variableWithType() {
			return getRuleContext(VariableWithTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListItemType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListItemType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListItemType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemTypeContext listItemType() throws RecognitionException {
		ListItemTypeContext _localctx = new ListItemTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listItemType);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				variableWithType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioPointerTypeContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(SophiaParser.FUNC, 0); }
		public TerminalNode LESS_THAN() { return getToken(SophiaParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(SophiaParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SophiaParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(SophiaParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SophiaParser.VOID, i);
		}
		public TypesWithCommaContext typesWithComma() {
			return getRuleContext(TypesWithCommaContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctioPointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioPointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFunctioPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFunctioPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFunctioPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioPointerTypeContext functioPointerType() throws RecognitionException {
		FunctioPointerTypeContext _localctx = new FunctioPointerTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functioPointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(FUNC);
			setState(206);
			match(LESS_THAN);
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(207);
				match(VOID);
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(208);
				typesWithComma();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(211);
			match(ARROW);
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(212);
				match(VOID);
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(213);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(216);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesWithCommaContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public TypesWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesWithComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterTypesWithComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitTypesWithComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitTypesWithComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesWithCommaContext typesWithComma() throws RecognitionException {
		TypesWithCommaContext _localctx = new TypesWithCommaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typesWithComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			type();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(219);
				match(COMMA);
				setState(220);
				type();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveDataTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SophiaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SophiaParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SophiaParser.BOOLEAN, 0); }
		public PrimitiveDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveDataTypeContext primitiveDataType() throws RecognitionException {
		PrimitiveDataTypeContext _localctx = new PrimitiveDataTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primitiveDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode STRING_VALUE() { return getToken(SophiaParser.STRING_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TerminalNode NULL() { return getToken(SophiaParser.NULL, 0); }
		public ListValusContext listValus() {
			return getRuleContext(ListValusContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_values);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				boolValue();
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(STRING_VALUE);
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(INT_VALUE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(NULL);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				listValus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SophiaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SophiaParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListValusContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SophiaParser.LBRACK, 0); }
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SophiaParser.RBRACK, 0); }
		public ListValusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListValus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListValus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListValus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListValusContext listValus() throws RecognitionException {
		ListValusContext _localctx = new ListValusContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listValus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LBRACK);
			setState(238);
			methodCallArguments();
			setState(239);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public SuperStatementContext superStatement() {
			return getRuleContext(SuperStatementContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUPER) {
				{
				setState(241);
				superStatement();
				}
			}

			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					varDeclaration();
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(250);
				statement();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ContinueBreakStatementContext continueBreakStatement() {
			return getRuleContext(ContinueBreakStatementContext.class,0);
		}
		public MethodCallStatementContext methodCallStatement() {
			return getRuleContext(MethodCallStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				forStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				foreachStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				assignmentStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				printStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				continueBreakStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				methodCallStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(264);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LBRACE);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(268);
				statement();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperStatementContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(SophiaParser.SUPER, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public SuperStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSuperStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSuperStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSuperStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperStatementContext superStatement() throws RecognitionException {
		SuperStatementContext _localctx = new SuperStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_superStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(SUPER);
			setState(277);
			match(LPAR);
			setState(278);
			methodCallArguments();
			setState(279);
			match(RPAR);
			setState(280);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			assignmentStmt();
			setState(283);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStmtContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			orExpression();
			setState(286);
			match(ASSIGN);
			setState(287);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SophiaParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(PRINT);
			setState(290);
			match(LPAR);
			setState(291);
			expression();
			setState(292);
			match(RPAR);
			setState(293);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SophiaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(RETURN);
			setState(296);
			expression();
			setState(297);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallStatementContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			methodCall();
			setState(300);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> INVOKE() { return getTokens(SophiaParser.INVOKE); }
		public TerminalNode INVOKE(int i) {
			return getToken(SophiaParser.INVOKE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SophiaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			otherExpression();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(315);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						{
						setState(303);
						match(DOT);
						setState(304);
						_la = _input.LA(1);
						if ( !(_la==INVOKE || _la==IDENTIFIER) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(305);
						match(LPAR);
						setState(306);
						methodCallArguments();
						setState(307);
						match(RPAR);
						}
						}
						break;
					case 2:
						{
						{
						setState(309);
						match(DOT);
						setState(310);
						match(IDENTIFIER);
						}
						}
						break;
					case 3:
						{
						{
						setState(311);
						match(LBRACK);
						setState(312);
						expression();
						setState(313);
						match(RBRACK);
						}
						}
						break;
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			{
			setState(320);
			match(DOT);
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==INVOKE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(322);
			match(LPAR);
			setState(323);
			methodCallArguments();
			setState(324);
			match(RPAR);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public MethodCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallArgumentsContext methodCallArguments() throws RecognitionException {
		MethodCallArgumentsContext _localctx = new MethodCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(326);
				expression();
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(327);
					match(COMMA);
					setState(328);
					expression();
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueBreakStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode BREAK() { return getToken(SophiaParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SophiaParser.CONTINUE, 0); }
		public ContinueBreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueBreakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterContinueBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitContinueBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitContinueBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueBreakStatementContext continueBreakStatement() throws RecognitionException {
		ContinueBreakStatementContext _localctx = new ContinueBreakStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_continueBreakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ( !(_la==CONTINUE || _la==BREAK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(337);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SophiaParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public List<TerminalNode> SEMICOLLON() { return getTokens(SophiaParser.SEMICOLLON); }
		public TerminalNode SEMICOLLON(int i) {
			return getToken(SophiaParser.SEMICOLLON, i);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public SingleOrMultiStatementsContext singleOrMultiStatements() {
			return getRuleContext(SingleOrMultiStatementsContext.class,0);
		}
		public List<AssignmentStmtContext> assignmentStmt() {
			return getRuleContexts(AssignmentStmtContext.class);
		}
		public AssignmentStmtContext assignmentStmt(int i) {
			return getRuleContext(AssignmentStmtContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(FOR);
			setState(340);
			match(LPAR);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(341);
				assignmentStmt();
				}
			}

			setState(344);
			match(SEMICOLLON);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(345);
				expression();
				}
			}

			setState(348);
			match(SEMICOLLON);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(349);
				assignmentStmt();
				}
			}

			setState(352);
			match(RPAR);
			setState(353);
			singleOrMultiStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(SophiaParser.FOREACH, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(SophiaParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public SingleOrMultiStatementsContext singleOrMultiStatements() {
			return getRuleContext(SingleOrMultiStatementsContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(FOREACH);
			setState(356);
			match(LPAR);
			setState(357);
			match(IDENTIFIER);
			setState(358);
			match(IN);
			setState(359);
			expression();
			setState(360);
			match(RPAR);
			setState(361);
			singleOrMultiStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SophiaParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public List<SingleOrMultiStatementsContext> singleOrMultiStatements() {
			return getRuleContexts(SingleOrMultiStatementsContext.class);
		}
		public SingleOrMultiStatementsContext singleOrMultiStatements(int i) {
			return getRuleContext(SingleOrMultiStatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SophiaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(IF);
			setState(364);
			match(LPAR);
			setState(365);
			expression();
			setState(366);
			match(RPAR);
			setState(367);
			singleOrMultiStatements();
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(368);
				match(ELSE);
				setState(369);
				singleOrMultiStatements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleOrMultiStatementsContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleOrMultiStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleOrMultiStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSingleOrMultiStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSingleOrMultiStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSingleOrMultiStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleOrMultiStatementsContext singleOrMultiStatements() throws RecognitionException {
		SingleOrMultiStatementsContext _localctx = new SingleOrMultiStatementsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_singleOrMultiStatements);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			orExpression();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(377);
				match(ASSIGN);
				setState(378);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SophiaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SophiaParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			andExpression();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(382);
				match(OR);
				setState(383);
				andExpression();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SophiaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SophiaParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			equalityExpression();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(390);
				match(AND);
				setState(391);
				equalityExpression();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SophiaParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SophiaParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(SophiaParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(SophiaParser.NOT_EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			relationalExpression();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT_EQUAL || _la==EQUAL) {
				{
				{
				setState(398);
				_la = _input.LA(1);
				if ( !(_la==NOT_EQUAL || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(399);
				relationalExpression();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(SophiaParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(SophiaParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(SophiaParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(SophiaParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			additiveExpression();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(406);
				_la = _input.LA(1);
				if ( !(_la==GREATER_THAN || _la==LESS_THAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(407);
				additiveExpression();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SophiaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SophiaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SophiaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SophiaParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			multiplicativeExpression();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(415);
				multiplicativeExpression();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SophiaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SophiaParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SophiaParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SophiaParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SophiaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SophiaParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			preUnaryExpression();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(422);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(423);
				preUnaryExpression();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SophiaParser.NOT, 0); }
		public PostUnaryExpressionContext postUnaryExpression() {
			return getRuleContext(PostUnaryExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SophiaParser.MINUS, 0); }
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_preUnaryExpression);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(NOT);
				setState(430);
				postUnaryExpression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(MINUS);
				setState(432);
				postUnaryExpression();
				}
				break;
			case INCREMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				match(INCREMENT);
				setState(434);
				postUnaryExpression();
				}
				break;
			case DECREMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(DECREMENT);
				setState(436);
				postUnaryExpression();
				}
				break;
			case NEW:
			case NULL:
			case TRUE:
			case FALSE:
			case THIS:
			case LPAR:
			case LBRACK:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
				postUnaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostUnaryExpressionContext extends ParserRuleContext {
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PostUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPostUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPostUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPostUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryExpressionContext postUnaryExpression() throws RecognitionException {
		PostUnaryExpressionContext _localctx = new PostUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_postUnaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			accessExpression();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCREMENT || _la==DECREMENT) {
				{
				setState(441);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessExpressionContext extends ParserRuleContext {
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SophiaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public List<TerminalNode> INVOKE() { return getTokens(SophiaParser.INVOKE); }
		public TerminalNode INVOKE(int i) {
			return getToken(SophiaParser.INVOKE, i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_accessExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			otherExpression();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					{
					setState(445);
					match(DOT);
					setState(446);
					_la = _input.LA(1);
					if ( !(_la==INVOKE || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(447);
					match(LPAR);
					setState(448);
					methodCallArguments();
					setState(449);
					match(RPAR);
					}
					}
					break;
				case 2:
					{
					{
					setState(451);
					match(DOT);
					setState(452);
					match(IDENTIFIER);
					}
					}
					break;
				case 3:
					{
					{
					setState(453);
					match(LBRACK);
					setState(454);
					expression();
					setState(455);
					match(RBRACK);
					}
					}
					break;
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherExpressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(SophiaParser.THIS, 0); }
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SophiaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SophiaParser.RBRACK, 0); }
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_otherExpression);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(THIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				newExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				values();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(466);
				match(LPAR);
				{
				setState(467);
				expression();
				}
				setState(468);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(470);
				match(IDENTIFIER);
				setState(471);
				match(LBRACK);
				setState(472);
				expression();
				setState(473);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(SophiaParser.NEW, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_newExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(NEW);
			setState(478);
			classType();
			setState(479);
			match(LPAR);
			setState(480);
			methodCallArguments();
			setState(481);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\3\7\3h\n"+
		"\3\f\3\16\3k\13\3\3\4\3\4\3\4\3\4\5\4q\n\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5"+
		"y\n\5\f\5\16\5|\13\5\3\5\5\5\177\n\5\3\5\3\5\7\5\u0083\n\5\f\5\16\5\u0086"+
		"\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u008f\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00a5\n"+
		"\t\f\t\16\t\u00a8\13\t\5\t\u00aa\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\5\13\u00b4\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00be\n\r\3\r"+
		"\3\r\3\16\3\16\3\16\7\16\u00c5\n\16\f\16\16\16\u00c8\13\16\5\16\u00ca"+
		"\n\16\3\17\3\17\5\17\u00ce\n\17\3\20\3\20\3\20\3\20\5\20\u00d4\n\20\3"+
		"\20\3\20\3\20\5\20\u00d9\n\20\3\20\3\20\3\21\3\21\3\21\7\21\u00e0\n\21"+
		"\f\21\16\21\u00e3\13\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00ec"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\5\26\u00f5\n\26\3\26\7\26\u00f8"+
		"\n\26\f\26\16\26\u00fb\13\26\3\26\7\26\u00fe\n\26\f\26\16\26\u0101\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010c\n\27\3\30"+
		"\3\30\7\30\u0110\n\30\f\30\16\30\u0113\13\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u013e\n\37\f\37\16\37\u0141"+
		"\13\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u014c\n \f \16 \u014f"+
		"\13 \5 \u0151\n \3!\3!\3!\3\"\3\"\3\"\5\"\u0159\n\"\3\"\3\"\5\"\u015d"+
		"\n\"\3\"\3\"\5\"\u0161\n\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\5$\u0175\n$\3%\3%\5%\u0179\n%\3&\3&\3&\5&\u017e\n&\3\'\3"+
		"\'\3\'\7\'\u0183\n\'\f\'\16\'\u0186\13\'\3(\3(\3(\7(\u018b\n(\f(\16(\u018e"+
		"\13(\3)\3)\3)\7)\u0193\n)\f)\16)\u0196\13)\3*\3*\3*\7*\u019b\n*\f*\16"+
		"*\u019e\13*\3+\3+\3+\7+\u01a3\n+\f+\16+\u01a6\13+\3,\3,\3,\7,\u01ab\n"+
		",\f,\16,\u01ae\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01b9\n-\3.\3.\5.\u01bd"+
		"\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u01cc\n/\f/\16/\u01cf\13"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u01de\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\2\2\62\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\13"+
		"\3\2\22\24\3\2\30\31\4\2\b\b99\3\2\n\13\3\2\37 \3\2\35\36\3\2$%\3\2!#"+
		"\3\2+,\2\u01f7\2b\3\2\2\2\4i\3\2\2\2\6l\3\2\2\2\bz\3\2\2\2\n\u0087\3\2"+
		"\2\2\f\u008b\3\2\2\2\16\u0098\3\2\2\2\20\u00a9\3\2\2\2\22\u00ab\3\2\2"+
		"\2\24\u00b3\3\2\2\2\26\u00b5\3\2\2\2\30\u00b7\3\2\2\2\32\u00c9\3\2\2\2"+
		"\34\u00cd\3\2\2\2\36\u00cf\3\2\2\2 \u00dc\3\2\2\2\"\u00e4\3\2\2\2$\u00eb"+
		"\3\2\2\2&\u00ed\3\2\2\2(\u00ef\3\2\2\2*\u00f4\3\2\2\2,\u010b\3\2\2\2."+
		"\u010d\3\2\2\2\60\u0116\3\2\2\2\62\u011c\3\2\2\2\64\u011f\3\2\2\2\66\u0123"+
		"\3\2\2\28\u0129\3\2\2\2:\u012d\3\2\2\2<\u0130\3\2\2\2>\u0150\3\2\2\2@"+
		"\u0152\3\2\2\2B\u0155\3\2\2\2D\u0165\3\2\2\2F\u016d\3\2\2\2H\u0178\3\2"+
		"\2\2J\u017a\3\2\2\2L\u017f\3\2\2\2N\u0187\3\2\2\2P\u018f\3\2\2\2R\u0197"+
		"\3\2\2\2T\u019f\3\2\2\2V\u01a7\3\2\2\2X\u01b8\3\2\2\2Z\u01ba\3\2\2\2\\"+
		"\u01be\3\2\2\2^\u01dd\3\2\2\2`\u01df\3\2\2\2bc\b\2\1\2cd\5\4\3\2de\7\2"+
		"\2\3e\3\3\2\2\2fh\5\6\4\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\5\3"+
		"\2\2\2ki\3\2\2\2lm\7\5\2\2mp\79\2\2no\7\4\2\2oq\79\2\2pn\3\2\2\2pq\3\2"+
		"\2\2qr\3\2\2\2rs\7\61\2\2st\5\b\5\2tu\7\62\2\2u\7\3\2\2\2vy\5\n\6\2wy"+
		"\5\f\7\2xv\3\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|"+
		"z\3\2\2\2}\177\5\16\b\2~}\3\2\2\2~\177\3\2\2\2\177\u0084\3\2\2\2\u0080"+
		"\u0083\5\n\6\2\u0081\u0083\5\f\7\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2"+
		"\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\t\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\5\24\13\2\u0088\u0089\79\2"+
		"\2\u0089\u008a\7\67\2\2\u008a\13\3\2\2\2\u008b\u008e\7\3\2\2\u008c\u008f"+
		"\5\24\13\2\u008d\u008f\7\25\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u0091\79\2\2\u0091\u0092\7-\2\2\u0092\u0093"+
		"\5\20\t\2\u0093\u0094\7.\2\2\u0094\u0095\7\61\2\2\u0095\u0096\5*\26\2"+
		"\u0096\u0097\7\62\2\2\u0097\r\3\2\2\2\u0098\u0099\7\3\2\2\u0099\u009a"+
		"\79\2\2\u009a\u009b\7-\2\2\u009b\u009c\5\20\t\2\u009c\u009d\7.\2\2\u009d"+
		"\u009e\7\61\2\2\u009e\u009f\5*\26\2\u009f\u00a0\7\62\2\2\u00a0\17\3\2"+
		"\2\2\u00a1\u00a6\5\22\n\2\u00a2\u00a3\7\64\2\2\u00a3\u00a5\5\22\n\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\21\3\2\2\2\u00ab\u00ac\79\2\2\u00ac\u00ad\7\66\2"+
		"\2\u00ad\u00ae\5\24\13\2\u00ae\23\3\2\2\2\u00af\u00b4\5\"\22\2\u00b0\u00b4"+
		"\5\30\r\2\u00b1\u00b4\5\36\20\2\u00b2\u00b4\5\26\f\2\u00b3\u00af\3\2\2"+
		"\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\25"+
		"\3\2\2\2\u00b5\u00b6\79\2\2\u00b6\27\3\2\2\2\u00b7\u00b8\7\27\2\2\u00b8"+
		"\u00bd\7-\2\2\u00b9\u00ba\78\2\2\u00ba\u00bb\7\63\2\2\u00bb\u00be\5\24"+
		"\13\2\u00bc\u00be\5\32\16\2\u00bd\u00b9\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\7.\2\2\u00c0\31\3\2\2\2\u00c1\u00c6\5\34\17"+
		"\2\u00c2\u00c3\7\64\2\2\u00c3\u00c5\5\34\17\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\33\3\2\2\2\u00cb\u00ce\5\22\n\2\u00cc\u00ce\5\24\13\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00cc\3\2\2\2\u00ce\35\3\2\2\2\u00cf\u00d0\7\7\2\2\u00d0\u00d3"+
		"\7\36\2\2\u00d1\u00d4\7\25\2\2\u00d2\u00d4\5 \21\2\u00d3\u00d1\3\2\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\7\34\2\2\u00d6\u00d9"+
		"\7\25\2\2\u00d7\u00d9\5\24\13\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2"+
		"\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\35\2\2\u00db\37\3\2\2\2\u00dc\u00e1"+
		"\5\24\13\2\u00dd\u00de\7\64\2\2\u00de\u00e0\5\24\13\2\u00df\u00dd\3\2"+
		"\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"!\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\t\2\2\2\u00e5#\3\2\2\2\u00e6"+
		"\u00ec\5&\24\2\u00e7\u00ec\7:\2\2\u00e8\u00ec\78\2\2\u00e9\u00ec\7\26"+
		"\2\2\u00ea\u00ec\5(\25\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb"+
		"\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec%\3\2\2\2"+
		"\u00ed\u00ee\t\3\2\2\u00ee\'\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0\u00f1\5"+
		"> \2\u00f1\u00f2\7\60\2\2\u00f2)\3\2\2\2\u00f3\u00f5\5\60\31\2\u00f4\u00f3"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f8\5\n\6\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00ff\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\5,\27\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100+\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u010c\5B\"\2\u0103\u010c"+
		"\5D#\2\u0104\u010c\5F$\2\u0105\u010c\5\62\32\2\u0106\u010c\5\66\34\2\u0107"+
		"\u010c\5@!\2\u0108\u010c\5:\36\2\u0109\u010c\58\35\2\u010a\u010c\5.\30"+
		"\2\u010b\u0102\3\2\2\2\u010b\u0103\3\2\2\2\u010b\u0104\3\2\2\2\u010b\u0105"+
		"\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c-\3\2\2\2\u010d\u0111\7\61\2\2"+
		"\u010e\u0110\5,\27\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0115\7\62\2\2\u0115/\3\2\2\2\u0116\u0117\7\33\2\2\u0117\u0118\7-\2\2"+
		"\u0118\u0119\5> \2\u0119\u011a\7.\2\2\u011a\u011b\7\67\2\2\u011b\61\3"+
		"\2\2\2\u011c\u011d\5\64\33\2\u011d\u011e\7\67\2\2\u011e\63\3\2\2\2\u011f"+
		"\u0120\5L\'\2\u0120\u0121\7*\2\2\u0121\u0122\5J&\2\u0122\65\3\2\2\2\u0123"+
		"\u0124\7\6\2\2\u0124\u0125\7-\2\2\u0125\u0126\5J&\2\u0126\u0127\7.\2\2"+
		"\u0127\u0128\7\67\2\2\u0128\67\3\2\2\2\u0129\u012a\7\f\2\2\u012a\u012b"+
		"\5J&\2\u012b\u012c\7\67\2\2\u012c9\3\2\2\2\u012d\u012e\5<\37\2\u012e\u012f"+
		"\7\67\2\2\u012f;\3\2\2\2\u0130\u013f\5^\60\2\u0131\u0132\7\65\2\2\u0132"+
		"\u0133\t\4\2\2\u0133\u0134\7-\2\2\u0134\u0135\5> \2\u0135\u0136\7.\2\2"+
		"\u0136\u013e\3\2\2\2\u0137\u0138\7\65\2\2\u0138\u013e\79\2\2\u0139\u013a"+
		"\7/\2\2\u013a\u013b\5J&\2\u013b\u013c\7\60\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u0131\3\2\2\2\u013d\u0137\3\2\2\2\u013d\u0139\3\2\2\2\u013e\u0141\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0143\7\65\2\2\u0143\u0144\t\4\2\2\u0144\u0145\7"+
		"-\2\2\u0145\u0146\5> \2\u0146\u0147\7.\2\2\u0147=\3\2\2\2\u0148\u014d"+
		"\5J&\2\u0149\u014a\7\64\2\2\u014a\u014c\5J&\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u0150\u0148\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"?\3\2\2\2\u0152\u0153\t\5\2\2\u0153\u0154\7\67\2\2\u0154A\3\2\2\2\u0155"+
		"\u0156\7\17\2\2\u0156\u0158\7-\2\2\u0157\u0159\5\64\33\2\u0158\u0157\3"+
		"\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\7\67\2\2\u015b"+
		"\u015d\5J&\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2"+
		"\2\u015e\u0160\7\67\2\2\u015f\u0161\5\64\33\2\u0160\u015f\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7.\2\2\u0163\u0164\5H%"+
		"\2\u0164C\3\2\2\2\u0165\u0166\7\r\2\2\u0166\u0167\7-\2\2\u0167\u0168\7"+
		"9\2\2\u0168\u0169\7\16\2\2\u0169\u016a\5J&\2\u016a\u016b\7.\2\2\u016b"+
		"\u016c\5H%\2\u016cE\3\2\2\2\u016d\u016e\7\20\2\2\u016e\u016f\7-\2\2\u016f"+
		"\u0170\5J&\2\u0170\u0171\7.\2\2\u0171\u0174\5H%\2\u0172\u0173\7\21\2\2"+
		"\u0173\u0175\5H%\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175G\3\2"+
		"\2\2\u0176\u0179\5.\30\2\u0177\u0179\5,\27\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0177\3\2\2\2\u0179I\3\2\2\2\u017a\u017d\5L\'\2\u017b\u017c\7*\2\2\u017c"+
		"\u017e\5J&\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017eK\3\2\2\2\u017f"+
		"\u0184\5N(\2\u0180\u0181\7\'\2\2\u0181\u0183\5N(\2\u0182\u0180\3\2\2\2"+
		"\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185M\3"+
		"\2\2\2\u0186\u0184\3\2\2\2\u0187\u018c\5P)\2\u0188\u0189\7&\2\2\u0189"+
		"\u018b\5P)\2\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2"+
		"\2\u018c\u018d\3\2\2\2\u018dO\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0194"+
		"\5R*\2\u0190\u0191\t\6\2\2\u0191\u0193\5R*\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195Q\3\2\2\2"+
		"\u0196\u0194\3\2\2\2\u0197\u019c\5T+\2\u0198\u0199\t\7\2\2\u0199\u019b"+
		"\5T+\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019dS\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a4\5V,\2\u01a0"+
		"\u01a1\t\b\2\2\u01a1\u01a3\5V,\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\3\2\2"+
		"\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5U\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a7\u01ac\5X-\2\u01a8\u01a9\t\t\2\2\u01a9\u01ab\5X-\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01adW\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\7(\2\2\u01b0\u01b9"+
		"\5Z.\2\u01b1\u01b2\7%\2\2\u01b2\u01b9\5Z.\2\u01b3\u01b4\7+\2\2\u01b4\u01b9"+
		"\5Z.\2\u01b5\u01b6\7,\2\2\u01b6\u01b9\5Z.\2\u01b7\u01b9\5Z.\2\u01b8\u01af"+
		"\3\2\2\2\u01b8\u01b1\3\2\2\2\u01b8\u01b3\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8"+
		"\u01b7\3\2\2\2\u01b9Y\3\2\2\2\u01ba\u01bc\5\\/\2\u01bb\u01bd\t\n\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd[\3\2\2\2\u01be\u01cd\5^\60\2"+
		"\u01bf\u01c0\7\65\2\2\u01c0\u01c1\t\4\2\2\u01c1\u01c2\7-\2\2\u01c2\u01c3"+
		"\5> \2\u01c3\u01c4\7.\2\2\u01c4\u01cc\3\2\2\2\u01c5\u01c6\7\65\2\2\u01c6"+
		"\u01cc\79\2\2\u01c7\u01c8\7/\2\2\u01c8\u01c9\5J&\2\u01c9\u01ca\7\60\2"+
		"\2\u01ca\u01cc\3\2\2\2\u01cb\u01bf\3\2\2\2\u01cb\u01c5\3\2\2\2\u01cb\u01c7"+
		"\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"]\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01de\7\32\2\2\u01d1\u01de\5`\61\2"+
		"\u01d2\u01de\5$\23\2\u01d3\u01de\79\2\2\u01d4\u01d5\7-\2\2\u01d5\u01d6"+
		"\5J&\2\u01d6\u01d7\7.\2\2\u01d7\u01de\3\2\2\2\u01d8\u01d9\79\2\2\u01d9"+
		"\u01da\7/\2\2\u01da\u01db\5J&\2\u01db\u01dc\7\60\2\2\u01dc\u01de\3\2\2"+
		"\2\u01dd\u01d0\3\2\2\2\u01dd\u01d1\3\2\2\2\u01dd\u01d2\3\2\2\2\u01dd\u01d3"+
		"\3\2\2\2\u01dd\u01d4\3\2\2\2\u01dd\u01d8\3\2\2\2\u01de_\3\2\2\2\u01df"+
		"\u01e0\7\t\2\2\u01e0\u01e1\5\26\f\2\u01e1\u01e2\7-\2\2\u01e2\u01e3\5>"+
		" \2\u01e3\u01e4\7.\2\2\u01e4a\3\2\2\2/ipxz~\u0082\u0084\u008e\u00a6\u00a9"+
		"\u00b3\u00bd\u00c6\u00c9\u00cd\u00d3\u00d8\u00e1\u00eb\u00f4\u00f9\u00ff"+
		"\u010b\u0111\u013d\u013f\u014d\u0150\u0158\u015c\u0160\u0174\u0178\u017d"+
		"\u0184\u018c\u0194\u019c\u01a4\u01ac\u01b8\u01bc\u01cb\u01cd\u01dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}