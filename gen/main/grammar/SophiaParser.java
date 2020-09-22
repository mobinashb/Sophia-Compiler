// Generated from C:/Users/amirp/Desktop/Compiler-TA/Sophia/src/main/grammar\Sophia.g4 by ANTLR 4.8
package main.grammar;

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
		DEF=1, EXTENDS=2, CLASS=3, PRINT=4, FUNC=5, INVOKE=6, NEW=7, CONTINUE=8, 
		BREAK=9, RETURN=10, FOREACH=11, IN=12, FOR=13, IF=14, ELSE=15, BOOLEAN=16, 
		STRING=17, INT=18, VOID=19, NULL=20, LIST=21, TRUE=22, FALSE=23, THIS=24, 
		SUPER=25, ARROW=26, GREATER_THAN=27, LESS_THAN=28, NOT_EQUAL=29, EQUAL=30, 
		MULT=31, DIVIDE=32, MOD=33, PLUS=34, MINUS=35, AND=36, OR=37, NOT=38, 
		QUESTION_MARK=39, ASSIGN=40, INCREMENT=41, DECREMENT=42, LPAR=43, RPAR=44, 
		LBRACK=45, RBRACK=46, LBRACE=47, RBRACE=48, SHARP=49, COMMA=50, DOT=51, 
		COLON=52, SEMICOLLON=53, INT_VALUE=54, IDENTIFIER=55, STRING_VALUE=56, 
		COMMENT=57, WS=58;
	public static final int
		RULE_sophia = 0, RULE_program = 1, RULE_sophiaClass = 2, RULE_varDeclaration = 3, 
		RULE_method = 4, RULE_constructor = 5, RULE_methodArguments = 6, RULE_variableWithType = 7, 
		RULE_type = 8, RULE_classType = 9, RULE_listType = 10, RULE_listItemsTypes = 11, 
		RULE_listItemType = 12, RULE_functioPointerType = 13, RULE_typesWithComma = 14, 
		RULE_primitiveDataType = 15, RULE_methodBody = 16, RULE_statement = 17, 
		RULE_block = 18, RULE_superStatement = 19, RULE_assignmentStatement = 20, 
		RULE_assignment = 21, RULE_printStatement = 22, RULE_returnStatement = 23, 
		RULE_methodCallStatement = 24, RULE_methodCall = 25, RULE_methodCallArguments = 26, 
		RULE_continueBreakStatement = 27, RULE_forStatement = 28, RULE_foreachStatement = 29, 
		RULE_ifStatement = 30, RULE_singleOrMultiStatements = 31, RULE_expression = 32, 
		RULE_orExpression = 33, RULE_andExpression = 34, RULE_equalityExpression = 35, 
		RULE_relationalExpression = 36, RULE_additiveExpression = 37, RULE_multiplicativeExpression = 38, 
		RULE_preUnaryExpression = 39, RULE_postUnaryExpression = 40, RULE_accessExpression = 41, 
		RULE_otherExpression = 42, RULE_newExpression = 43, RULE_values = 44, 
		RULE_boolValue = 45, RULE_listValue = 46, RULE_identifier = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "program", "sophiaClass", "varDeclaration", "method", "constructor", 
			"methodArguments", "variableWithType", "type", "classType", "listType", 
			"listItemsTypes", "listItemType", "functioPointerType", "typesWithComma", 
			"primitiveDataType", "methodBody", "statement", "block", "superStatement", 
			"assignmentStatement", "assignment", "printStatement", "returnStatement", 
			"methodCallStatement", "methodCall", "methodCallArguments", "continueBreakStatement", 
			"forStatement", "foreachStatement", "ifStatement", "singleOrMultiStatements", 
			"expression", "orExpression", "andExpression", "equalityExpression", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"preUnaryExpression", "postUnaryExpression", "accessExpression", "otherExpression", 
			"newExpression", "values", "boolValue", "listValue", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'extends'", "'class'", "'print'", "'func'", "'invoke'", 
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
			null, "DEF", "EXTENDS", "CLASS", "PRINT", "FUNC", "INVOKE", "NEW", "CONTINUE", 
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
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(SophiaParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
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
			setState(96);
			((SophiaContext)_localctx).p = program();
			 ((SophiaContext)_localctx).sophiaProgram =  ((SophiaContext)_localctx).p.programRet; 
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
		public Program programRet;
		public SophiaClassContext c;
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

			        ((ProgramContext)_localctx).programRet =  new Program();
			        _localctx.programRet.setLine(1);
			    
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(101);
				((ProgramContext)_localctx).c = sophiaClass();
				 _localctx.programRet.addClass(((ProgramContext)_localctx).c.sophiaClassRet); 
				}
				}
				setState(108);
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
		public ClassDeclaration sophiaClassRet;
		public Token cl;
		public IdentifierContext name;
		public IdentifierContext parentName;
		public VarDeclarationContext v1;
		public MethodContext m1;
		public ConstructorContext c;
		public VarDeclarationContext v2;
		public MethodContext m2;
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode CLASS() { return getToken(SophiaParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(SophiaParser.EXTENDS, 0); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((SophiaClassContext)_localctx).cl = match(CLASS);
			setState(110);
			((SophiaClassContext)_localctx).name = identifier();
			 
			        ((SophiaClassContext)_localctx).sophiaClassRet =  new ClassDeclaration(((SophiaClassContext)_localctx).name.idRet);
			        _localctx.sophiaClassRet.setLine(((SophiaClassContext)_localctx).cl.getLine());
			    
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(112);
				match(EXTENDS);
				setState(113);
				((SophiaClassContext)_localctx).parentName = identifier();
				 _localctx.sophiaClassRet.setParentClassName(((SophiaClassContext)_localctx).parentName.idRet); 
				}
			}

			setState(118);
			match(LBRACE);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(125);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FUNC:
					case BOOLEAN:
					case STRING:
					case INT:
					case LIST:
					case IDENTIFIER:
						{
						setState(119);
						((SophiaClassContext)_localctx).v1 = varDeclaration();

						        FieldDeclaration f1 = new FieldDeclaration(((SophiaClassContext)_localctx).v1.varDeclarationRet);
						        f1.setLine(((SophiaClassContext)_localctx).v1.line);
						        _localctx.sophiaClassRet.addField(f1);
						    
						}
						break;
					case DEF:
						{
						setState(122);
						((SophiaClassContext)_localctx).m1 = method();
						 _localctx.sophiaClassRet.addMethod(((SophiaClassContext)_localctx).m1.methodRet); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(130);
				((SophiaClassContext)_localctx).c = constructor();
				 _localctx.sophiaClassRet.setConstructor(((SophiaClassContext)_localctx).c.constructorRet); 
				}
				break;
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << FUNC) | (1L << BOOLEAN) | (1L << STRING) | (1L << INT) | (1L << LIST) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(141);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
				case BOOLEAN:
				case STRING:
				case INT:
				case LIST:
				case IDENTIFIER:
					{
					setState(135);
					((SophiaClassContext)_localctx).v2 = varDeclaration();

					        FieldDeclaration f2 = new FieldDeclaration(((SophiaClassContext)_localctx).v2.varDeclarationRet);
					        f2.setLine(((SophiaClassContext)_localctx).v2.line);
					        _localctx.sophiaClassRet.addField(f2);
					    
					}
					break;
				case DEF:
					{
					setState(138);
					((SophiaClassContext)_localctx).m2 = method();
					 _localctx.sophiaClassRet.addMethod(((SophiaClassContext)_localctx).m2.methodRet); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration varDeclarationRet;
		public int line;
		public TypeContext t;
		public IdentifierContext id;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((VarDeclarationContext)_localctx).t = type();
			setState(149);
			((VarDeclarationContext)_localctx).id = identifier();

			        ((VarDeclarationContext)_localctx).varDeclarationRet =  new VarDeclaration(((VarDeclarationContext)_localctx).id.idRet, ((VarDeclarationContext)_localctx).t.typeRet);
			        _localctx.varDeclarationRet.setLine(((VarDeclarationContext)_localctx).id.line);
			        ((VarDeclarationContext)_localctx).line =  ((VarDeclarationContext)_localctx).id.line;
			    
			setState(151);
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
		public MethodDeclaration methodRet;
		public Type returnType;
		public Token d;
		public TypeContext t;
		public IdentifierContext name;
		public MethodArgumentsContext args;
		public MethodBodyContext body;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SophiaParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((MethodContext)_localctx).d = match(DEF);
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				{
				setState(154);
				((MethodContext)_localctx).t = type();
				 ((MethodContext)_localctx).returnType =  ((MethodContext)_localctx).t.typeRet; 
				}
				}
				break;
			case VOID:
				{
				{
				setState(157);
				match(VOID);
				 ((MethodContext)_localctx).returnType =  new NullType(); 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(161);
			((MethodContext)_localctx).name = identifier();

			        ((MethodContext)_localctx).methodRet =  new MethodDeclaration(((MethodContext)_localctx).name.idRet, _localctx.returnType);
			        _localctx.methodRet.setLine(((MethodContext)_localctx).d.getLine());
			    
			setState(163);
			match(LPAR);
			setState(164);
			((MethodContext)_localctx).args = methodArguments();
			 _localctx.methodRet.setArgs(((MethodContext)_localctx).args.argsRet); 
			setState(166);
			match(RPAR);
			setState(167);
			match(LBRACE);
			setState(168);
			((MethodContext)_localctx).body = methodBody();

			        if(((MethodContext)_localctx).body.superStmt != null) {
			            _localctx.methodRet.setSuperStmt(((MethodContext)_localctx).body.superStmt);
			        }
			        _localctx.methodRet.setLocalVars(((MethodContext)_localctx).body.localVars);
			        _localctx.methodRet.setBody(((MethodContext)_localctx).body.statements);
			    
			setState(170);
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
		public ConstructorDeclaration constructorRet;
		public Token d;
		public IdentifierContext name;
		public MethodArgumentsContext args;
		public MethodBodyContext body;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((ConstructorContext)_localctx).d = match(DEF);
			setState(173);
			((ConstructorContext)_localctx).name = identifier();

			        ((ConstructorContext)_localctx).constructorRet =  new ConstructorDeclaration(((ConstructorContext)_localctx).name.idRet);
			        _localctx.constructorRet.setLine(((ConstructorContext)_localctx).d.getLine());
			    
			setState(175);
			match(LPAR);
			setState(176);
			((ConstructorContext)_localctx).args = methodArguments();
			 _localctx.constructorRet.setArgs(((ConstructorContext)_localctx).args.argsRet); 
			setState(178);
			match(RPAR);
			setState(179);
			match(LBRACE);
			setState(180);
			((ConstructorContext)_localctx).body = methodBody();

			        if(((ConstructorContext)_localctx).body.superStmt != null) {
			            _localctx.constructorRet.setSuperStmt(((ConstructorContext)_localctx).body.superStmt);
			        }
			        _localctx.constructorRet.setLocalVars(((ConstructorContext)_localctx).body.localVars);
			        _localctx.constructorRet.setBody(((ConstructorContext)_localctx).body.statements);
			    
			setState(182);
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
		public ArrayList<VarDeclaration> argsRet;
		public VariableWithTypeContext v1;
		public VariableWithTypeContext v2;
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
		enterRule(_localctx, 12, RULE_methodArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodArgumentsContext)_localctx).argsRet =  new ArrayList<>(); 
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(185);
				((MethodArgumentsContext)_localctx).v1 = variableWithType();
				 _localctx.argsRet.add(((MethodArgumentsContext)_localctx).v1.varWithTypeRet); 
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(187);
					match(COMMA);
					setState(188);
					((MethodArgumentsContext)_localctx).v2 = variableWithType();
					 _localctx.argsRet.add(((MethodArgumentsContext)_localctx).v2.varWithTypeRet); 
					}
					}
					setState(195);
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
		public VarDeclaration varWithTypeRet;
		public IdentifierContext id;
		public TypeContext t;
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_variableWithType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((VariableWithTypeContext)_localctx).id = identifier();
			setState(199);
			match(COLON);
			setState(200);
			((VariableWithTypeContext)_localctx).t = type();

			        ((VariableWithTypeContext)_localctx).varWithTypeRet =  new VarDeclaration(((VariableWithTypeContext)_localctx).id.idRet, ((VariableWithTypeContext)_localctx).t.typeRet);
			        _localctx.varWithTypeRet.setLine(((VariableWithTypeContext)_localctx).id.line);
			    
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
		public Type typeRet;
		public PrimitiveDataTypeContext p;
		public ListTypeContext l;
		public FunctioPointerTypeContext f;
		public ClassTypeContext c;
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
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				((TypeContext)_localctx).p = primitiveDataType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).p.primitiveTypeRet; 
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				((TypeContext)_localctx).l = listType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).l.listTypeRet; 
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				((TypeContext)_localctx).f = functioPointerType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).f.fptrTypeRet; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				((TypeContext)_localctx).c = classType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).c.classTypeRet; 
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
		public ClassType classTypeRet;
		public IdentifierContext id;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((ClassTypeContext)_localctx).id = identifier();
			 ((ClassTypeContext)_localctx).classTypeRet =  new ClassType(((ClassTypeContext)_localctx).id.idRet); 
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
		public ListType listTypeRet;
		public Token l;
		public Token num;
		public TypeContext t;
		public ListItemsTypesContext typesList;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LIST() { return getToken(SophiaParser.LIST, 0); }
		public TerminalNode SHARP() { return getToken(SophiaParser.SHARP, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
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
		enterRule(_localctx, 20, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((ListTypeContext)_localctx).l = match(LIST);
			setState(221);
			match(LPAR);
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				{
				{
				setState(222);
				((ListTypeContext)_localctx).num = match(INT_VALUE);
				setState(223);
				match(SHARP);
				setState(224);
				((ListTypeContext)_localctx).t = type();
				 ((ListTypeContext)_localctx).listTypeRet =  new ListType((((ListTypeContext)_localctx).num!=null?Integer.valueOf(((ListTypeContext)_localctx).num.getText()):0), new ListNameType(((ListTypeContext)_localctx).t.typeRet)); 
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
				setState(227);
				((ListTypeContext)_localctx).typesList = listItemsTypes();
				 ((ListTypeContext)_localctx).listTypeRet =  new ListType(((ListTypeContext)_localctx).typesList.listItemsTypesRet); 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(232);
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
		public ArrayList<ListNameType> listItemsTypesRet;
		public ListItemTypeContext l1;
		public ListItemTypeContext l2;
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
		enterRule(_localctx, 22, RULE_listItemsTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ListItemsTypesContext)_localctx).listItemsTypesRet =  new ArrayList<>(); 
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << BOOLEAN) | (1L << STRING) | (1L << INT) | (1L << LIST) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(235);
				((ListItemsTypesContext)_localctx).l1 = listItemType();
				 _localctx.listItemsTypesRet.add(((ListItemsTypesContext)_localctx).l1.listItemTypeRet); 
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(237);
					match(COMMA);
					setState(238);
					((ListItemsTypesContext)_localctx).l2 = listItemType();
					 _localctx.listItemsTypesRet.add(((ListItemsTypesContext)_localctx).l2.listItemTypeRet); 
					}
					}
					setState(245);
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
		public ListNameType listItemTypeRet;
		public VariableWithTypeContext v;
		public TypeContext t;
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
		enterRule(_localctx, 24, RULE_listItemType);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				((ListItemTypeContext)_localctx).v = variableWithType();
				 ((ListItemTypeContext)_localctx).listItemTypeRet =  new ListNameType(((ListItemTypeContext)_localctx).v.varWithTypeRet); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				((ListItemTypeContext)_localctx).t = type();
				 ((ListItemTypeContext)_localctx).listItemTypeRet =  new ListNameType(((ListItemTypeContext)_localctx).t.typeRet); 
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
		public FptrType fptrTypeRet;
		public TypesWithCommaContext types;
		public TypeContext t;
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
		enterRule(_localctx, 26, RULE_functioPointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(FUNC);
			 ((FunctioPointerTypeContext)_localctx).fptrTypeRet =  new FptrType(); 
			setState(258);
			match(LESS_THAN);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(259);
				match(VOID);
				 _localctx.fptrTypeRet.setArgumentsTypes(new ArrayList<Type>()); 
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(261);
				((FunctioPointerTypeContext)_localctx).types = typesWithComma();
				 _localctx.fptrTypeRet.setArgumentsTypes(((FunctioPointerTypeContext)_localctx).types.typesWithCommaRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(266);
			match(ARROW);
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(267);
				match(VOID);
				 _localctx.fptrTypeRet.setReturnType(new NullType()); 
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(269);
				((FunctioPointerTypeContext)_localctx).t = type();
				 _localctx.fptrTypeRet.setReturnType(((FunctioPointerTypeContext)_localctx).t.typeRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(274);
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
		public ArrayList<Type> typesWithCommaRet;
		public TypeContext t1;
		public TypeContext t2;
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
		enterRule(_localctx, 28, RULE_typesWithComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TypesWithCommaContext)_localctx).typesWithCommaRet =  new ArrayList<>(); 
			setState(277);
			((TypesWithCommaContext)_localctx).t1 = type();
			 _localctx.typesWithCommaRet.add(((TypesWithCommaContext)_localctx).t1.typeRet); 
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(279);
				match(COMMA);
				setState(280);
				((TypesWithCommaContext)_localctx).t2 = type();
				 _localctx.typesWithCommaRet.add(((TypesWithCommaContext)_localctx).t2.typeRet); 
				}
				}
				setState(287);
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
		public Type primitiveTypeRet;
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
		enterRule(_localctx, 30, RULE_primitiveDataType);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(INT);
				 ((PrimitiveDataTypeContext)_localctx).primitiveTypeRet =  new IntType(); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(STRING);
				 ((PrimitiveDataTypeContext)_localctx).primitiveTypeRet =  new StringType(); 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(BOOLEAN);
				 ((PrimitiveDataTypeContext)_localctx).primitiveTypeRet =  new BoolType(); 
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

	public static class MethodBodyContext extends ParserRuleContext {
		public SuperStmt superStmt;
		public ArrayList<VarDeclaration> localVars;
		public ArrayList<Statement> statements;
		public SuperStatementContext ss;
		public VarDeclarationContext v;
		public StatementContext s;
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
		enterRule(_localctx, 32, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUPER) {
				{
				setState(296);
				((MethodBodyContext)_localctx).ss = superStatement();
				 ((MethodBodyContext)_localctx).superStmt =  ((MethodBodyContext)_localctx).ss.superStatementRet; 
				}
			}


			        ((MethodBodyContext)_localctx).localVars =  new ArrayList<>();
			        ((MethodBodyContext)_localctx).statements =  new ArrayList<>();
			    
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					((MethodBodyContext)_localctx).v = varDeclaration();
					 _localctx.localVars.add(((MethodBodyContext)_localctx).v.varDeclarationRet); 
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(310);
				((MethodBodyContext)_localctx).s = statement();
				 _localctx.statements.add(((MethodBodyContext)_localctx).s.sRet); 
				}
				}
				setState(317);
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
		public Statement sRet;
		public ForStatementContext f1;
		public ForeachStatementContext f2;
		public IfStatementContext i;
		public AssignmentStatementContext a;
		public PrintStatementContext p;
		public ContinueBreakStatementContext c;
		public MethodCallStatementContext m;
		public ReturnStatementContext r;
		public BlockContext b;
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
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				((StatementContext)_localctx).f1 = forStatement();
				 ((StatementContext)_localctx).sRet =  ((StatementContext)_localctx).f1.forStmtRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				((StatementContext)_localctx).f2 = foreachStatement();
				 ((StatementContext)_localctx).sRet =  ((StatementContext)_localctx).f2.foreachStmtRet; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				((StatementContext)_localctx).i = ifStatement();
				 ((StatementContext)_localctx).sRet =  ((StatementContext)_localctx).i.ifStmtRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				((StatementContext)_localctx).a = assignmentStatement();
				 ((StatementContext)_localctx).sRet =  ((StatementContext)_localctx).a.assignStmtRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				((StatementContext)_localctx).p = printStatement();
				 ((StatementContext)_localctx).sRet =  ((StatementContext)_localctx).p.printStmtRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				((StatementContext)_localctx).c = continueBreakStatement();
				 ((StatementContext)_localctx).sRet =  ((StatementContext)_localctx).c.continueBreakRet; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(336);
				((StatementContext)_localctx).m = methodCallStatement();
				 ((StatementContext)_localctx).sRet =  ((StatementContext)_localctx).m.methodCallStmtRet; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(339);
				((StatementContext)_localctx).r = returnStatement();
				 ((StatementContext)_localctx).sRet =  ((StatementContext)_localctx).r.returnStmtRet; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(342);
				((StatementContext)_localctx).b = block();
				 ((StatementContext)_localctx).sRet =  ((StatementContext)_localctx).b.blockRet; 
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
		public BlockStmt blockRet;
		public Token l;
		public StatementContext s;
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
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
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			((BlockContext)_localctx).l = match(LBRACE);

			        ((BlockContext)_localctx).blockRet =  new BlockStmt();
			        _localctx.blockRet.setLine(((BlockContext)_localctx).l.getLine());
			    
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(349);
				((BlockContext)_localctx).s = statement();
				 _localctx.blockRet.addStatement(((BlockContext)_localctx).s.sRet); 
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
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
		public SuperStmt superStatementRet;
		public Token s;
		public MethodCallArgumentsContext m;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode SUPER() { return getToken(SophiaParser.SUPER, 0); }
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_superStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((SuperStatementContext)_localctx).s = match(SUPER);
			setState(360);
			match(LPAR);
			setState(361);
			((SuperStatementContext)_localctx).m = methodCallArguments();
			setState(362);
			match(RPAR);
			setState(363);
			match(SEMICOLLON);

			        ((SuperStatementContext)_localctx).superStatementRet =  new SuperStmt(((SuperStatementContext)_localctx).m.methodCallArgsRet);
			        _localctx.superStatementRet.setLine(((SuperStatementContext)_localctx).s.getLine());
			    
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
		public AssignmentStmt assignStmtRet;
		public AssignmentContext a;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((AssignmentStatementContext)_localctx).a = assignment();
			 ((AssignmentStatementContext)_localctx).assignStmtRet =  ((AssignmentStatementContext)_localctx).a.assignmentRet; 
			setState(368);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentStmt assignmentRet;
		public OrExpressionContext left;
		public Token a;
		public ExpressionContext right;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			((AssignmentContext)_localctx).left = orExpression();
			setState(371);
			((AssignmentContext)_localctx).a = match(ASSIGN);
			setState(372);
			((AssignmentContext)_localctx).right = expression();
			 
			        ((AssignmentContext)_localctx).assignmentRet =  new AssignmentStmt(((AssignmentContext)_localctx).left.orExprRet, ((AssignmentContext)_localctx).right.exprRet);
			        _localctx.assignmentRet.setLine(((AssignmentContext)_localctx).a.getLine());
			    
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
		public PrintStmt printStmtRet;
		public Token p;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode PRINT() { return getToken(SophiaParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			((PrintStatementContext)_localctx).p = match(PRINT);
			setState(376);
			match(LPAR);
			setState(377);
			((PrintStatementContext)_localctx).e = expression();

			        ((PrintStatementContext)_localctx).printStmtRet =  new PrintStmt(((PrintStatementContext)_localctx).e.exprRet);
			        _localctx.printStmtRet.setLine(((PrintStatementContext)_localctx).p.getLine());
			    
			setState(379);
			match(RPAR);
			setState(380);
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
		public ReturnStmt returnStmtRet;
		public Token r;
		public ExpressionContext e;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode RETURN() { return getToken(SophiaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((ReturnStatementContext)_localctx).r = match(RETURN);

			        ((ReturnStatementContext)_localctx).returnStmtRet =  new ReturnStmt();
			        _localctx.returnStmtRet.setLine(((ReturnStatementContext)_localctx).r.getLine());
			    
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(384);
				((ReturnStatementContext)_localctx).e = expression();
				 _localctx.returnStmtRet.setReturnedExpr(((ReturnStatementContext)_localctx).e.exprRet); 
				}
			}

			setState(389);
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
		public Statement methodCallStmtRet;
		public MethodCallContext m;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((MethodCallStatementContext)_localctx).m = methodCall();
			 ((MethodCallStatementContext)_localctx).methodCallStmtRet =  ((MethodCallStatementContext)_localctx).m.methodCallRet; 
			setState(393);
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
		public Statement methodCallRet;
		public Expression tempExpr;
		public OtherExpressionContext oe;
		public Token inv;
		public MethodCallArgumentsContext m1;
		public IdentifierContext mthd;
		public MethodCallArgumentsContext m2;
		public IdentifierContext i;
		public Token l;
		public ExpressionContext index;
		public Token inv2;
		public MethodCallArgumentsContext m3;
		public IdentifierContext mthd2;
		public MethodCallArgumentsContext m4;
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
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public List<TerminalNode> INVOKE() { return getTokens(SophiaParser.INVOKE); }
		public TerminalNode INVOKE(int i) {
			return getToken(SophiaParser.INVOKE, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		enterRule(_localctx, 50, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			((MethodCallContext)_localctx).oe = otherExpression();
			 ((MethodCallContext)_localctx).tempExpr =  ((MethodCallContext)_localctx).oe.otherExprRet; 
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						{
						setState(397);
						match(DOT);
						setState(398);
						((MethodCallContext)_localctx).inv = match(INVOKE);
						setState(399);
						match(LPAR);
						setState(400);
						((MethodCallContext)_localctx).m1 = methodCallArguments();

						        ((MethodCallContext)_localctx).tempExpr =  new FptrInvoke(_localctx.tempExpr, ((MethodCallContext)_localctx).m1.methodCallArgsRet);
						        _localctx.tempExpr.setLine(((MethodCallContext)_localctx).inv.getLine());
						    
						setState(402);
						match(RPAR);
						}
						}
						break;
					case 2:
						{
						{
						setState(404);
						match(DOT);
						setState(405);
						((MethodCallContext)_localctx).mthd = identifier();
						setState(406);
						match(LPAR);
						setState(407);
						((MethodCallContext)_localctx).m2 = methodCallArguments();

						        ((MethodCallContext)_localctx).tempExpr =  new MethodCall(_localctx.tempExpr, ((MethodCallContext)_localctx).mthd.idRet, ((MethodCallContext)_localctx).m2.methodCallArgsRet);
						        _localctx.tempExpr.setLine(((MethodCallContext)_localctx).mthd.line);
						    
						setState(409);
						match(RPAR);
						}
						}
						break;
					case 3:
						{
						{
						setState(411);
						match(DOT);
						setState(412);
						((MethodCallContext)_localctx).i = identifier();
						}

						        ((MethodCallContext)_localctx).tempExpr =  new FieldOrListAccess(_localctx.tempExpr, ((MethodCallContext)_localctx).i.idRet);
						        _localctx.tempExpr.setLine(((MethodCallContext)_localctx).i.line);
						    
						}
						break;
					case 4:
						{
						{
						setState(416);
						((MethodCallContext)_localctx).l = match(LBRACK);
						setState(417);
						((MethodCallContext)_localctx).index = expression();
						setState(418);
						match(RBRACK);
						}

						        ((MethodCallContext)_localctx).tempExpr =  new ListAccessByIndex(_localctx.tempExpr, ((MethodCallContext)_localctx).index.exprRet);
						        _localctx.tempExpr.setLine(((MethodCallContext)_localctx).l.getLine());
						    
						}
						break;
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				{
				setState(427);
				match(DOT);
				setState(428);
				((MethodCallContext)_localctx).inv2 = match(INVOKE);
				setState(429);
				match(LPAR);
				setState(430);
				((MethodCallContext)_localctx).m3 = methodCallArguments();

				        FptrInvoke fptrInvoke = new FptrInvoke(_localctx.tempExpr, ((MethodCallContext)_localctx).m3.methodCallArgsRet);
				        fptrInvoke.setLine(((MethodCallContext)_localctx).inv2.getLine());
				        ((MethodCallContext)_localctx).methodCallRet =  new FptrInvokeStmt(fptrInvoke);
				        _localctx.methodCallRet.setLine(((MethodCallContext)_localctx).inv2.getLine());
				    
				setState(432);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				{
				setState(434);
				match(DOT);
				setState(435);
				((MethodCallContext)_localctx).mthd2 = identifier();
				setState(436);
				match(LPAR);
				setState(437);
				((MethodCallContext)_localctx).m4 = methodCallArguments();

				        MethodCall methodCall = new MethodCall(_localctx.tempExpr, ((MethodCallContext)_localctx).mthd2.idRet, ((MethodCallContext)_localctx).m4.methodCallArgsRet);
				        methodCall.setLine(((MethodCallContext)_localctx).mthd2.line);
				        ((MethodCallContext)_localctx).methodCallRet =  new MethodCallStmt(methodCall);
				        _localctx.methodCallRet.setLine(((MethodCallContext)_localctx).mthd2.line);
				    
				setState(439);
				match(RPAR);
				}
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

	public static class MethodCallArgumentsContext extends ParserRuleContext {
		public ArrayList<Expression> methodCallArgsRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
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
		enterRule(_localctx, 52, RULE_methodCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodCallArgumentsContext)_localctx).methodCallArgsRet =  new ArrayList<>(); 
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(444);
				((MethodCallArgumentsContext)_localctx).e1 = expression();
				 _localctx.methodCallArgsRet.add(((MethodCallArgumentsContext)_localctx).e1.exprRet); 
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(446);
					match(COMMA);
					setState(447);
					((MethodCallArgumentsContext)_localctx).e2 = expression();
					 _localctx.methodCallArgsRet.add(((MethodCallArgumentsContext)_localctx).e2.exprRet); 
					}
					}
					setState(454);
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
		public Statement continueBreakRet;
		public Token b;
		public Token c;
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
		enterRule(_localctx, 54, RULE_continueBreakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(457);
				((ContinueBreakStatementContext)_localctx).b = match(BREAK);

				        ((ContinueBreakStatementContext)_localctx).continueBreakRet =  new BreakStmt();
				        _localctx.continueBreakRet.setLine(((ContinueBreakStatementContext)_localctx).b.getLine());
				    
				}
				break;
			case CONTINUE:
				{
				setState(459);
				((ContinueBreakStatementContext)_localctx).c = match(CONTINUE);

				        ((ContinueBreakStatementContext)_localctx).continueBreakRet =  new ContinueStmt();
				        _localctx.continueBreakRet.setLine(((ContinueBreakStatementContext)_localctx).c.getLine());
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(463);
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
		public ForStmt forStmtRet;
		public Token f;
		public AssignmentContext init;
		public ExpressionContext cond;
		public AssignmentContext update;
		public SingleOrMultiStatementsContext body;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public List<TerminalNode> SEMICOLLON() { return getTokens(SophiaParser.SEMICOLLON); }
		public TerminalNode SEMICOLLON(int i) {
			return getToken(SophiaParser.SEMICOLLON, i);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode FOR() { return getToken(SophiaParser.FOR, 0); }
		public SingleOrMultiStatementsContext singleOrMultiStatements() {
			return getRuleContext(SingleOrMultiStatementsContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
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
		enterRule(_localctx, 56, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			((ForStatementContext)_localctx).f = match(FOR);

			        ((ForStatementContext)_localctx).forStmtRet =  new ForStmt();
			        _localctx.forStmtRet.setLine(((ForStatementContext)_localctx).f.getLine());
			    
			setState(467);
			match(LPAR);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(468);
				((ForStatementContext)_localctx).init = assignment();
				 _localctx.forStmtRet.setInitialize(((ForStatementContext)_localctx).init.assignmentRet); 
				}
			}

			setState(473);
			match(SEMICOLLON);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(474);
				((ForStatementContext)_localctx).cond = expression();
				 _localctx.forStmtRet.setCondition(((ForStatementContext)_localctx).cond.exprRet); 
				}
			}

			setState(479);
			match(SEMICOLLON);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(480);
				((ForStatementContext)_localctx).update = assignment();
				 _localctx.forStmtRet.setUpdate(((ForStatementContext)_localctx).update.assignmentRet); 
				}
			}

			setState(485);
			match(RPAR);
			setState(486);
			((ForStatementContext)_localctx).body = singleOrMultiStatements();
			 _localctx.forStmtRet.setBody(((ForStatementContext)_localctx).body.singOrMultRet); 
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
		public ForeachStmt foreachStmtRet;
		public Token f;
		public IdentifierContext id;
		public ExpressionContext list;
		public SingleOrMultiStatementsContext body;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode IN() { return getToken(SophiaParser.IN, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode FOREACH() { return getToken(SophiaParser.FOREACH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			((ForeachStatementContext)_localctx).f = match(FOREACH);
			setState(490);
			match(LPAR);
			setState(491);
			((ForeachStatementContext)_localctx).id = identifier();
			setState(492);
			match(IN);
			setState(493);
			((ForeachStatementContext)_localctx).list = expression();

			        ((ForeachStatementContext)_localctx).foreachStmtRet =  new ForeachStmt(((ForeachStatementContext)_localctx).id.idRet, ((ForeachStatementContext)_localctx).list.exprRet);
			        _localctx.foreachStmtRet.setLine(((ForeachStatementContext)_localctx).f.getLine());
			    
			setState(495);
			match(RPAR);
			setState(496);
			((ForeachStatementContext)_localctx).body = singleOrMultiStatements();
			 _localctx.foreachStmtRet.setBody(((ForeachStatementContext)_localctx).body.singOrMultRet); 
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
		public ConditionalStmt ifStmtRet;
		public Token i;
		public ExpressionContext e;
		public SingleOrMultiStatementsContext thenBody;
		public SingleOrMultiStatementsContext elseBody;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode IF() { return getToken(SophiaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			((IfStatementContext)_localctx).i = match(IF);
			setState(500);
			match(LPAR);
			setState(501);
			((IfStatementContext)_localctx).e = expression();
			setState(502);
			match(RPAR);
			setState(503);
			((IfStatementContext)_localctx).thenBody = singleOrMultiStatements();

			        ((IfStatementContext)_localctx).ifStmtRet =  new ConditionalStmt(((IfStatementContext)_localctx).e.exprRet, ((IfStatementContext)_localctx).thenBody.singOrMultRet);
			        _localctx.ifStmtRet.setLine(((IfStatementContext)_localctx).i.getLine());
			    
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(505);
				match(ELSE);
				setState(506);
				((IfStatementContext)_localctx).elseBody = singleOrMultiStatements();
				 _localctx.ifStmtRet.setElseBody(((IfStatementContext)_localctx).elseBody.singOrMultRet); 
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
		public Statement singOrMultRet;
		public BlockContext b;
		public StatementContext s;
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
		enterRule(_localctx, 62, RULE_singleOrMultiStatements);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				((SingleOrMultiStatementsContext)_localctx).b = block();
				 ((SingleOrMultiStatementsContext)_localctx).singOrMultRet =  ((SingleOrMultiStatementsContext)_localctx).b.blockRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				((SingleOrMultiStatementsContext)_localctx).s = statement();
				 ((SingleOrMultiStatementsContext)_localctx).singOrMultRet =  ((SingleOrMultiStatementsContext)_localctx).s.sRet; 
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
		public Expression exprRet;
		public OrExpressionContext oe;
		public Token a;
		public ExpressionContext e;
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
		enterRule(_localctx, 64, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			((ExpressionContext)_localctx).oe = orExpression();
			 ((ExpressionContext)_localctx).exprRet =  ((ExpressionContext)_localctx).oe.orExprRet; 
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(521);
				((ExpressionContext)_localctx).a = match(ASSIGN);
				setState(522);
				((ExpressionContext)_localctx).e = expression();

				        BinaryOperator op = BinaryOperator.assign;
				        ((ExpressionContext)_localctx).exprRet =  new BinaryExpression(((ExpressionContext)_localctx).oe.orExprRet, ((ExpressionContext)_localctx).e.exprRet, op);
				        _localctx.exprRet.setLine(((ExpressionContext)_localctx).a.getLine());
				    
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
		public Expression orExprRet;
		public AndExpressionContext ael;
		public Token o;
		public AndExpressionContext aer;
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
		enterRule(_localctx, 66, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			((OrExpressionContext)_localctx).ael = andExpression();
			 ((OrExpressionContext)_localctx).orExprRet =  ((OrExpressionContext)_localctx).ael.andExprRet; 
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(529);
				((OrExpressionContext)_localctx).o = match(OR);
				setState(530);
				((OrExpressionContext)_localctx).aer = andExpression();

				        BinaryOperator op = BinaryOperator.or;
				        ((OrExpressionContext)_localctx).orExprRet =  new BinaryExpression(_localctx.orExprRet, ((OrExpressionContext)_localctx).aer.andExprRet, op);
				        _localctx.orExprRet.setLine(((OrExpressionContext)_localctx).o.getLine());
				    
				}
				}
				setState(537);
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
		public Expression andExprRet;
		public EqualityExpressionContext eel;
		public Token a;
		public EqualityExpressionContext ee2;
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
		enterRule(_localctx, 68, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			((AndExpressionContext)_localctx).eel = equalityExpression();
			 ((AndExpressionContext)_localctx).andExprRet =  ((AndExpressionContext)_localctx).eel.eqExprRet; 
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(540);
				((AndExpressionContext)_localctx).a = match(AND);
				setState(541);
				((AndExpressionContext)_localctx).ee2 = equalityExpression();

				        BinaryOperator op = BinaryOperator.and;
				        ((AndExpressionContext)_localctx).andExprRet =  new BinaryExpression(_localctx.andExprRet, ((AndExpressionContext)_localctx).ee2.eqExprRet, op);
				        _localctx.andExprRet.setLine(((AndExpressionContext)_localctx).a.getLine());
				    
				}
				}
				setState(548);
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
		public Expression eqExprRet;
		public BinaryOperator op;
		public int line;
		public RelationalExpressionContext rel;
		public Token eq;
		public Token neq;
		public RelationalExpressionContext rer;
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
		enterRule(_localctx, 70, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			((EqualityExpressionContext)_localctx).rel = relationalExpression();
			 ((EqualityExpressionContext)_localctx).eqExprRet =  ((EqualityExpressionContext)_localctx).rel.relExprRet; 
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT_EQUAL || _la==EQUAL) {
				{
				{
				setState(555);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(551);
					((EqualityExpressionContext)_localctx).eq = match(EQUAL);

					        ((EqualityExpressionContext)_localctx).op =  BinaryOperator.eq;
					        ((EqualityExpressionContext)_localctx).line =  ((EqualityExpressionContext)_localctx).eq.getLine();
					    
					}
					break;
				case NOT_EQUAL:
					{
					setState(553);
					((EqualityExpressionContext)_localctx).neq = match(NOT_EQUAL);

					        ((EqualityExpressionContext)_localctx).op =  BinaryOperator.neq;
					        ((EqualityExpressionContext)_localctx).line =  ((EqualityExpressionContext)_localctx).neq.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(557);
				((EqualityExpressionContext)_localctx).rer = relationalExpression();

				        ((EqualityExpressionContext)_localctx).eqExprRet =  new BinaryExpression(_localctx.eqExprRet, ((EqualityExpressionContext)_localctx).rer.relExprRet, _localctx.op);
				        _localctx.eqExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(564);
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
		public Expression relExprRet;
		public BinaryOperator op;
		public int line;
		public AdditiveExpressionContext ael;
		public Token gt;
		public Token lt;
		public AdditiveExpressionContext aer;
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
		enterRule(_localctx, 72, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			((RelationalExpressionContext)_localctx).ael = additiveExpression();
			 ((RelationalExpressionContext)_localctx).relExprRet =  ((RelationalExpressionContext)_localctx).ael.addExprRet; 
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(571);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(567);
					((RelationalExpressionContext)_localctx).gt = match(GREATER_THAN);

					        ((RelationalExpressionContext)_localctx).op =  BinaryOperator.gt;
					        ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).gt.getLine();
					    
					}
					break;
				case LESS_THAN:
					{
					setState(569);
					((RelationalExpressionContext)_localctx).lt = match(LESS_THAN);

					        ((RelationalExpressionContext)_localctx).op =  BinaryOperator.lt;
					        ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).lt.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(573);
				((RelationalExpressionContext)_localctx).aer = additiveExpression();

				        ((RelationalExpressionContext)_localctx).relExprRet =  new BinaryExpression(_localctx.relExprRet, ((RelationalExpressionContext)_localctx).aer.addExprRet, _localctx.op);
				        _localctx.relExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(580);
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
		public Expression addExprRet;
		public BinaryOperator op;
		public int line;
		public MultiplicativeExpressionContext mel;
		public Token add;
		public Token sub;
		public MultiplicativeExpressionContext mer;
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
		enterRule(_localctx, 74, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			((AdditiveExpressionContext)_localctx).mel = multiplicativeExpression();
			 ((AdditiveExpressionContext)_localctx).addExprRet =  ((AdditiveExpressionContext)_localctx).mel.multExprRet; 
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(587);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(583);
					((AdditiveExpressionContext)_localctx).add = match(PLUS);

					        ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.add;
					        ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).add.getLine();
					    
					}
					break;
				case MINUS:
					{
					setState(585);
					((AdditiveExpressionContext)_localctx).sub = match(MINUS);

					        ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.sub;
					        ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).sub.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(589);
				((AdditiveExpressionContext)_localctx).mer = multiplicativeExpression();

				        ((AdditiveExpressionContext)_localctx).addExprRet =  new BinaryExpression(_localctx.addExprRet, ((AdditiveExpressionContext)_localctx).mer.multExprRet, _localctx.op);
				        _localctx.addExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(596);
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
		public Expression multExprRet;
		public BinaryOperator op;
		public int line;
		public PreUnaryExpressionContext pel;
		public Token mult;
		public Token div;
		public Token mod;
		public PreUnaryExpressionContext per;
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
		enterRule(_localctx, 76, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			((MultiplicativeExpressionContext)_localctx).pel = preUnaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).multExprRet =  ((MultiplicativeExpressionContext)_localctx).pel.preUnaryExprRet; 
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(605);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(599);
					((MultiplicativeExpressionContext)_localctx).mult = match(MULT);

					        ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.mult;
					        ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).mult.getLine();
					    
					}
					break;
				case DIVIDE:
					{
					setState(601);
					((MultiplicativeExpressionContext)_localctx).div = match(DIVIDE);

					        ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.div;
					        ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).div.getLine();
					    
					}
					break;
				case MOD:
					{
					setState(603);
					((MultiplicativeExpressionContext)_localctx).mod = match(MOD);

					        ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.mod;
					        ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).mod.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(607);
				((MultiplicativeExpressionContext)_localctx).per = preUnaryExpression();

				        ((MultiplicativeExpressionContext)_localctx).multExprRet =  new BinaryExpression(_localctx.multExprRet, ((MultiplicativeExpressionContext)_localctx).per.preUnaryExprRet, _localctx.op);
				        _localctx.multExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(614);
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
		public Expression preUnaryExprRet;
		public UnaryOperator op;
		public int line;
		public Token not;
		public Token minus;
		public Token preinc;
		public Token predec;
		public PreUnaryExpressionContext pre;
		public PostUnaryExpressionContext post;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SophiaParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(SophiaParser.MINUS, 0); }
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PostUnaryExpressionContext postUnaryExpression() {
			return getRuleContext(PostUnaryExpressionContext.class,0);
		}
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
		enterRule(_localctx, 78, RULE_preUnaryExpression);
		try {
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(615);
					((PreUnaryExpressionContext)_localctx).not = match(NOT);

					        ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.not;
					        ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).not.getLine();
					    
					}
					break;
				case MINUS:
					{
					setState(617);
					((PreUnaryExpressionContext)_localctx).minus = match(MINUS);

					        ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.minus;
					        ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).minus.getLine();
					    
					}
					break;
				case INCREMENT:
					{
					setState(619);
					((PreUnaryExpressionContext)_localctx).preinc = match(INCREMENT);

					        ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.preinc;
					        ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).preinc.getLine();
					    
					}
					break;
				case DECREMENT:
					{
					setState(621);
					((PreUnaryExpressionContext)_localctx).predec = match(DECREMENT);

					        ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.predec;
					        ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).predec.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(625);
				((PreUnaryExpressionContext)_localctx).pre = preUnaryExpression();

				        ((PreUnaryExpressionContext)_localctx).preUnaryExprRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).pre.preUnaryExprRet, _localctx.op);
				        _localctx.preUnaryExprRet.setLine(_localctx.line);
				    
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
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				((PreUnaryExpressionContext)_localctx).post = postUnaryExpression();
				 ((PreUnaryExpressionContext)_localctx).preUnaryExprRet =  ((PreUnaryExpressionContext)_localctx).post.postUnaryExprRet; 
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
		public Expression postUnaryExprRet;
		public AccessExpressionContext ae;
		public Token postinc;
		public Token postdec;
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
		enterRule(_localctx, 80, RULE_postUnaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			((PostUnaryExpressionContext)_localctx).ae = accessExpression();
			 ((PostUnaryExpressionContext)_localctx).postUnaryExprRet =  ((PostUnaryExpressionContext)_localctx).ae.accessExprRet; 
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				{
				setState(635);
				((PostUnaryExpressionContext)_localctx).postinc = match(INCREMENT);

				        UnaryOperator op = UnaryOperator.postinc;
				        ((PostUnaryExpressionContext)_localctx).postUnaryExprRet =  new UnaryExpression(_localctx.postUnaryExprRet, op);
				        _localctx.postUnaryExprRet.setLine(((PostUnaryExpressionContext)_localctx).postinc.getLine());
				    
				}
				break;
			case DECREMENT:
				{
				setState(637);
				((PostUnaryExpressionContext)_localctx).postdec = match(DECREMENT);

				        UnaryOperator op = UnaryOperator.postdec;
				        ((PostUnaryExpressionContext)_localctx).postUnaryExprRet =  new UnaryExpression(_localctx.postUnaryExprRet, op);
				        _localctx.postUnaryExprRet.setLine(((PostUnaryExpressionContext)_localctx).postdec.getLine());
				    
				}
				break;
			case GREATER_THAN:
			case LESS_THAN:
			case NOT_EQUAL:
			case EQUAL:
			case MULT:
			case DIVIDE:
			case MOD:
			case PLUS:
			case MINUS:
			case AND:
			case OR:
			case ASSIGN:
			case RPAR:
			case RBRACK:
			case COMMA:
			case SEMICOLLON:
				break;
			default:
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accessExprRet;
		public OtherExpressionContext oe;
		public Token inv;
		public MethodCallArgumentsContext m1;
		public IdentifierContext mthd;
		public MethodCallArgumentsContext m2;
		public IdentifierContext i;
		public Token l;
		public ExpressionContext index;
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
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public List<TerminalNode> INVOKE() { return getTokens(SophiaParser.INVOKE); }
		public TerminalNode INVOKE(int i) {
			return getToken(SophiaParser.INVOKE, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		enterRule(_localctx, 82, RULE_accessExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			 ((AccessExpressionContext)_localctx).accessExprRet =  ((AccessExpressionContext)_localctx).oe.otherExprRet; 
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					{
					setState(643);
					match(DOT);
					setState(644);
					((AccessExpressionContext)_localctx).inv = match(INVOKE);
					setState(645);
					match(LPAR);
					setState(646);
					((AccessExpressionContext)_localctx).m1 = methodCallArguments();

					        ((AccessExpressionContext)_localctx).accessExprRet =  new FptrInvoke(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).m1.methodCallArgsRet);
					        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).inv.getLine());
					    
					setState(648);
					match(RPAR);
					}
					}
					break;
				case 2:
					{
					{
					setState(650);
					match(DOT);
					setState(651);
					((AccessExpressionContext)_localctx).mthd = identifier();
					setState(652);
					match(LPAR);
					setState(653);
					((AccessExpressionContext)_localctx).m2 = methodCallArguments();

					        ((AccessExpressionContext)_localctx).accessExprRet =  new MethodCall(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).mthd.idRet, ((AccessExpressionContext)_localctx).m2.methodCallArgsRet);
					        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).mthd.line);
					    
					setState(655);
					match(RPAR);
					}
					}
					break;
				case 3:
					{
					{
					setState(657);
					match(DOT);
					setState(658);
					((AccessExpressionContext)_localctx).i = identifier();
					}

					        ((AccessExpressionContext)_localctx).accessExprRet =  new FieldOrListAccess(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).i.idRet);
					        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).i.line);
					    
					}
					break;
				case 4:
					{
					{
					setState(662);
					((AccessExpressionContext)_localctx).l = match(LBRACK);
					setState(663);
					((AccessExpressionContext)_localctx).index = expression();
					setState(664);
					match(RBRACK);
					}

					        ((AccessExpressionContext)_localctx).accessExprRet =  new ListAccessByIndex(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).index.exprRet);
					        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).l.getLine());
					    
					}
					break;
				}
				}
				setState(672);
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
		public Expression otherExprRet;
		public Token t;
		public NewExpressionContext n;
		public ValuesContext v;
		public IdentifierContext id;
		public ExpressionContext e;
		public IdentifierContext inst;
		public ExpressionContext index;
		public TerminalNode THIS() { return getToken(SophiaParser.THIS, 0); }
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 84, RULE_otherExpression);
		try {
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				((OtherExpressionContext)_localctx).t = match(THIS);

				        ((OtherExpressionContext)_localctx).otherExprRet =  new ThisClass();
				        _localctx.otherExprRet.setLine(((OtherExpressionContext)_localctx).t.getLine());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				((OtherExpressionContext)_localctx).n = newExpression();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).n.newExprRet; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				((OtherExpressionContext)_localctx).v = values();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).v.valuesRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(681);
				((OtherExpressionContext)_localctx).id = identifier();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).id.idRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(684);
				match(LPAR);
				{
				setState(685);
				((OtherExpressionContext)_localctx).e = expression();
				}
				setState(686);
				match(RPAR);
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).e.exprRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(689);
				((OtherExpressionContext)_localctx).inst = identifier();
				setState(690);
				match(LBRACK);
				setState(691);
				((OtherExpressionContext)_localctx).index = expression();
				setState(692);
				match(RBRACK);

				        ((OtherExpressionContext)_localctx).otherExprRet =  new ListAccessByIndex(((OtherExpressionContext)_localctx).inst.idRet, ((OtherExpressionContext)_localctx).index.exprRet);
				        _localctx.otherExprRet.setLine(((OtherExpressionContext)_localctx).inst.line);
				    
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
		public NewClassInstance newExprRet;
		public Token n;
		public ClassTypeContext c;
		public MethodCallArgumentsContext m;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode NEW() { return getToken(SophiaParser.NEW, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
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
		enterRule(_localctx, 86, RULE_newExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			((NewExpressionContext)_localctx).n = match(NEW);
			setState(698);
			((NewExpressionContext)_localctx).c = classType();
			setState(699);
			match(LPAR);
			setState(700);
			((NewExpressionContext)_localctx).m = methodCallArguments();
			setState(701);
			match(RPAR);

			        ((NewExpressionContext)_localctx).newExprRet =  new NewClassInstance(((NewExpressionContext)_localctx).c.classTypeRet, ((NewExpressionContext)_localctx).m.methodCallArgsRet);
			        _localctx.newExprRet.setLine(((NewExpressionContext)_localctx).n.getLine());
			    
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
		public Value valuesRet;
		public BoolValueContext b;
		public Token s;
		public Token i;
		public Token n;
		public ListValueContext l;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode STRING_VALUE() { return getToken(SophiaParser.STRING_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TerminalNode NULL() { return getToken(SophiaParser.NULL, 0); }
		public ListValueContext listValue() {
			return getRuleContext(ListValueContext.class,0);
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
		enterRule(_localctx, 88, RULE_values);
		try {
			setState(716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				((ValuesContext)_localctx).b = boolValue();

				        ((ValuesContext)_localctx).valuesRet =  new BoolValue(((ValuesContext)_localctx).b.boolValueRet);
				        _localctx.valuesRet.setLine(((ValuesContext)_localctx).b.line);
				    
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				((ValuesContext)_localctx).s = match(STRING_VALUE);

				        ((ValuesContext)_localctx).valuesRet =  new StringValue((((ValuesContext)_localctx).s!=null?((ValuesContext)_localctx).s.getText():null));
				        _localctx.valuesRet.setLine(((ValuesContext)_localctx).s.getLine());
				    
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				((ValuesContext)_localctx).i = match(INT_VALUE);

				        ((ValuesContext)_localctx).valuesRet =  new IntValue((((ValuesContext)_localctx).i!=null?Integer.valueOf(((ValuesContext)_localctx).i.getText()):0));
				        _localctx.valuesRet.setLine(((ValuesContext)_localctx).i.getLine());
				    
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(711);
				((ValuesContext)_localctx).n = match(NULL);

				        ((ValuesContext)_localctx).valuesRet =  new NullValue();
				        _localctx.valuesRet.setLine(((ValuesContext)_localctx).n.getLine());
				    
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(713);
				((ValuesContext)_localctx).l = listValue();
				 ((ValuesContext)_localctx).valuesRet =  ((ValuesContext)_localctx).l.listValueRet; 
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
		public boolean boolValueRet;
		public int line;
		public Token t;
		public Token f;
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
		enterRule(_localctx, 90, RULE_boolValue);
		try {
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				((BoolValueContext)_localctx).t = match(TRUE);

				        ((BoolValueContext)_localctx).boolValueRet =  true;
				        ((BoolValueContext)_localctx).line =  ((BoolValueContext)_localctx).t.getLine();
				    
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				((BoolValueContext)_localctx).f = match(FALSE);

				        ((BoolValueContext)_localctx).boolValueRet =  false;
				        ((BoolValueContext)_localctx).line =  ((BoolValueContext)_localctx).f.getLine();
				    
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

	public static class ListValueContext extends ParserRuleContext {
		public ListValue listValueRet;
		public Token l;
		public MethodCallArgumentsContext m;
		public TerminalNode RBRACK() { return getToken(SophiaParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(SophiaParser.LBRACK, 0); }
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public ListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListValueContext listValue() throws RecognitionException {
		ListValueContext _localctx = new ListValueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_listValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			((ListValueContext)_localctx).l = match(LBRACK);
			setState(725);
			((ListValueContext)_localctx).m = methodCallArguments();

			        ((ListValueContext)_localctx).listValueRet =  new ListValue(((ListValueContext)_localctx).m.methodCallArgsRet);
			        _localctx.listValueRet.setLine(((ListValueContext)_localctx).l.getLine());
			    
			setState(727);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier idRet;
		public int line;
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			((IdentifierContext)_localctx).id = match(IDENTIFIER);
			 
			        ((IdentifierContext)_localctx).idRet =  new Identifier((((IdentifierContext)_localctx).id!=null?((IdentifierContext)_localctx).id.getText():null)); 
			        _localctx.idRet.setLine(((IdentifierContext)_localctx).id.getLine());
			        ((IdentifierContext)_localctx).line =  ((IdentifierContext)_localctx).id.getLine();
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u02df\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\7\3k\n\3\f\3\16\3n\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4w\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0080\n\4\f\4\16\4\u0083\13\4\3\4\3\4\3\4"+
		"\5\4\u0088\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0090\n\4\f\4\16\4\u0093\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a2\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c2\n\b\f\b\16"+
		"\b\u00c5\13\b\5\b\u00c7\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00da\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e9\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u00f4\n\r\f\r\16\r\u00f7\13\r\5\r\u00f9\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0101\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u010b\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0113\n\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u011e\n\20\f\20\16\20\u0121"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0129\n\21\3\22\3\22\3\22\5"+
		"\22\u012e\n\22\3\22\3\22\3\22\3\22\7\22\u0134\n\22\f\22\16\22\u0137\13"+
		"\22\3\22\3\22\3\22\7\22\u013c\n\22\f\22\16\22\u013f\13\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u015c\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0163\n\24\f\24\16\24\u0166\13\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0186\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01a9\n\33\f\33\16"+
		"\33\u01ac\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u01bc\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u01c5\n\34\f\34\16\34\u01c8\13\34\5\34\u01ca\n\34\3\35\3\35\3\35\3\35"+
		"\5\35\u01d0\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01da\n"+
		"\36\3\36\3\36\3\36\3\36\5\36\u01e0\n\36\3\36\3\36\3\36\3\36\5\36\u01e6"+
		"\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0200\n \3!\3!\3!\3!\3!\3!\5!\u0208"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0210\n\"\3#\3#\3#\3#\3#\3#\7#\u0218\n"+
		"#\f#\16#\u021b\13#\3$\3$\3$\3$\3$\3$\7$\u0223\n$\f$\16$\u0226\13$\3%\3"+
		"%\3%\3%\3%\3%\5%\u022e\n%\3%\3%\3%\7%\u0233\n%\f%\16%\u0236\13%\3&\3&"+
		"\3&\3&\3&\3&\5&\u023e\n&\3&\3&\3&\7&\u0243\n&\f&\16&\u0246\13&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u024e\n\'\3\'\3\'\3\'\7\'\u0253\n\'\f\'\16\'\u0256"+
		"\13\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0260\n(\3(\3(\3(\7(\u0265\n(\f(\16("+
		"\u0268\13(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0272\n)\3)\3)\3)\3)\3)\3)\5)\u027a"+
		"\n)\3*\3*\3*\3*\3*\3*\5*\u0282\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u029f\n+\f+\16+\u02a2"+
		"\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\5,\u02ba\n,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\5.\u02cf\n.\3/\3/\3/\3/\5/\u02d5\n/\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\2\2\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\2\2\u02fe\2b\3\2\2\2\4f\3\2\2\2\6o\3"+
		"\2\2\2\b\u0096\3\2\2\2\n\u009b\3\2\2\2\f\u00ae\3\2\2\2\16\u00ba\3\2\2"+
		"\2\20\u00c8\3\2\2\2\22\u00d9\3\2\2\2\24\u00db\3\2\2\2\26\u00de\3\2\2\2"+
		"\30\u00ec\3\2\2\2\32\u0100\3\2\2\2\34\u0102\3\2\2\2\36\u0116\3\2\2\2 "+
		"\u0128\3\2\2\2\"\u012d\3\2\2\2$\u015b\3\2\2\2&\u015d\3\2\2\2(\u0169\3"+
		"\2\2\2*\u0170\3\2\2\2,\u0174\3\2\2\2.\u0179\3\2\2\2\60\u0180\3\2\2\2\62"+
		"\u0189\3\2\2\2\64\u018d\3\2\2\2\66\u01bd\3\2\2\28\u01cf\3\2\2\2:\u01d3"+
		"\3\2\2\2<\u01eb\3\2\2\2>\u01f5\3\2\2\2@\u0207\3\2\2\2B\u0209\3\2\2\2D"+
		"\u0211\3\2\2\2F\u021c\3\2\2\2H\u0227\3\2\2\2J\u0237\3\2\2\2L\u0247\3\2"+
		"\2\2N\u0257\3\2\2\2P\u0279\3\2\2\2R\u027b\3\2\2\2T\u0283\3\2\2\2V\u02b9"+
		"\3\2\2\2X\u02bb\3\2\2\2Z\u02ce\3\2\2\2\\\u02d4\3\2\2\2^\u02d6\3\2\2\2"+
		"`\u02db\3\2\2\2bc\5\4\3\2cd\b\2\1\2de\7\2\2\3e\3\3\2\2\2fl\b\3\1\2gh\5"+
		"\6\4\2hi\b\3\1\2ik\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\5"+
		"\3\2\2\2nl\3\2\2\2op\7\5\2\2pq\5`\61\2qv\b\4\1\2rs\7\4\2\2st\5`\61\2t"+
		"u\b\4\1\2uw\3\2\2\2vr\3\2\2\2vw\3\2\2\2wx\3\2\2\2x\u0081\7\61\2\2yz\5"+
		"\b\5\2z{\b\4\1\2{\u0080\3\2\2\2|}\5\n\6\2}~\b\4\1\2~\u0080\3\2\2\2\177"+
		"y\3\2\2\2\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0087\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\5\f\7\2\u0085"+
		"\u0086\b\4\1\2\u0086\u0088\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0091\3\2\2\2\u0089\u008a\5\b\5\2\u008a\u008b\b\4\1\2\u008b"+
		"\u0090\3\2\2\2\u008c\u008d\5\n\6\2\u008d\u008e\b\4\1\2\u008e\u0090\3\2"+
		"\2\2\u008f\u0089\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0095\7\62\2\2\u0095\7\3\2\2\2\u0096\u0097\5\22\n\2\u0097\u0098"+
		"\5`\61\2\u0098\u0099\b\5\1\2\u0099\u009a\7\67\2\2\u009a\t\3\2\2\2\u009b"+
		"\u00a1\7\3\2\2\u009c\u009d\5\22\n\2\u009d\u009e\b\6\1\2\u009e\u00a2\3"+
		"\2\2\2\u009f\u00a0\7\25\2\2\u00a0\u00a2\b\6\1\2\u00a1\u009c\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\5`\61\2\u00a4\u00a5\b\6"+
		"\1\2\u00a5\u00a6\7-\2\2\u00a6\u00a7\5\16\b\2\u00a7\u00a8\b\6\1\2\u00a8"+
		"\u00a9\7.\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac\b"+
		"\6\1\2\u00ac\u00ad\7\62\2\2\u00ad\13\3\2\2\2\u00ae\u00af\7\3\2\2\u00af"+
		"\u00b0\5`\61\2\u00b0\u00b1\b\7\1\2\u00b1\u00b2\7-\2\2\u00b2\u00b3\5\16"+
		"\b\2\u00b3\u00b4\b\7\1\2\u00b4\u00b5\7.\2\2\u00b5\u00b6\7\61\2\2\u00b6"+
		"\u00b7\5\"\22\2\u00b7\u00b8\b\7\1\2\u00b8\u00b9\7\62\2\2\u00b9\r\3\2\2"+
		"\2\u00ba\u00c6\b\b\1\2\u00bb\u00bc\5\20\t\2\u00bc\u00c3\b\b\1\2\u00bd"+
		"\u00be\7\64\2\2\u00be\u00bf\5\20\t\2\u00bf\u00c0\b\b\1\2\u00c0\u00c2\3"+
		"\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00bb\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\17\3\2\2\2\u00c8\u00c9\5`\61\2\u00c9\u00ca"+
		"\7\66\2\2\u00ca\u00cb\5\22\n\2\u00cb\u00cc\b\t\1\2\u00cc\21\3\2\2\2\u00cd"+
		"\u00ce\5 \21\2\u00ce\u00cf\b\n\1\2\u00cf\u00da\3\2\2\2\u00d0\u00d1\5\26"+
		"\f\2\u00d1\u00d2\b\n\1\2\u00d2\u00da\3\2\2\2\u00d3\u00d4\5\34\17\2\u00d4"+
		"\u00d5\b\n\1\2\u00d5\u00da\3\2\2\2\u00d6\u00d7\5\24\13\2\u00d7\u00d8\b"+
		"\n\1\2\u00d8\u00da\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9"+
		"\u00d3\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\23\3\2\2\2\u00db\u00dc\5`\61"+
		"\2\u00dc\u00dd\b\13\1\2\u00dd\25\3\2\2\2\u00de\u00df\7\27\2\2\u00df\u00e8"+
		"\7-\2\2\u00e0\u00e1\78\2\2\u00e1\u00e2\7\63\2\2\u00e2\u00e3\5\22\n\2\u00e3"+
		"\u00e4\b\f\1\2\u00e4\u00e9\3\2\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7\b"+
		"\f\1\2\u00e7\u00e9\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\7.\2\2\u00eb\27\3\2\2\2\u00ec\u00f8\b\r\1\2"+
		"\u00ed\u00ee\5\32\16\2\u00ee\u00f5\b\r\1\2\u00ef\u00f0\7\64\2\2\u00f0"+
		"\u00f1\5\32\16\2\u00f1\u00f2\b\r\1\2\u00f2\u00f4\3\2\2\2\u00f3\u00ef\3"+
		"\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\31\3\2\2\2\u00fa\u00fb\5\20\t\2\u00fb\u00fc\b\16\1\2\u00fc"+
		"\u0101\3\2\2\2\u00fd\u00fe\5\22\n\2\u00fe\u00ff\b\16\1\2\u00ff\u0101\3"+
		"\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\33\3\2\2\2\u0102"+
		"\u0103\7\7\2\2\u0103\u0104\b\17\1\2\u0104\u010a\7\36\2\2\u0105\u0106\7"+
		"\25\2\2\u0106\u010b\b\17\1\2\u0107\u0108\5\36\20\2\u0108\u0109\b\17\1"+
		"\2\u0109\u010b\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0107\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u0112\7\34\2\2\u010d\u010e\7\25\2\2\u010e\u0113\b\17\1"+
		"\2\u010f\u0110\5\22\n\2\u0110\u0111\b\17\1\2\u0111\u0113\3\2\2\2\u0112"+
		"\u010d\3\2\2\2\u0112\u010f\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\35"+
		"\2\2\u0115\35\3\2\2\2\u0116\u0117\b\20\1\2\u0117\u0118\5\22\n\2\u0118"+
		"\u011f\b\20\1\2\u0119\u011a\7\64\2\2\u011a\u011b\5\22\n\2\u011b\u011c"+
		"\b\20\1\2\u011c\u011e\3\2\2\2\u011d\u0119\3\2\2\2\u011e\u0121\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\37\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0123\7\24\2\2\u0123\u0129\b\21\1\2\u0124\u0125\7\23\2"+
		"\2\u0125\u0129\b\21\1\2\u0126\u0127\7\22\2\2\u0127\u0129\b\21\1\2\u0128"+
		"\u0122\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0126\3\2\2\2\u0129!\3\2\2\2"+
		"\u012a\u012b\5(\25\2\u012b\u012c\b\22\1\2\u012c\u012e\3\2\2\2\u012d\u012a"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0135\b\22\1\2"+
		"\u0130\u0131\5\b\5\2\u0131\u0132\b\22\1\2\u0132\u0134\3\2\2\2\u0133\u0130"+
		"\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u013d\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\5$\23\2\u0139\u013a\b\22"+
		"\1\2\u013a\u013c\3\2\2\2\u013b\u0138\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e#\3\2\2\2\u013f\u013d\3\2\2\2"+
		"\u0140\u0141\5:\36\2\u0141\u0142\b\23\1\2\u0142\u015c\3\2\2\2\u0143\u0144"+
		"\5<\37\2\u0144\u0145\b\23\1\2\u0145\u015c\3\2\2\2\u0146\u0147\5> \2\u0147"+
		"\u0148\b\23\1\2\u0148\u015c\3\2\2\2\u0149\u014a\5*\26\2\u014a\u014b\b"+
		"\23\1\2\u014b\u015c\3\2\2\2\u014c\u014d\5.\30\2\u014d\u014e\b\23\1\2\u014e"+
		"\u015c\3\2\2\2\u014f\u0150\58\35\2\u0150\u0151\b\23\1\2\u0151\u015c\3"+
		"\2\2\2\u0152\u0153\5\62\32\2\u0153\u0154\b\23\1\2\u0154\u015c\3\2\2\2"+
		"\u0155\u0156\5\60\31\2\u0156\u0157\b\23\1\2\u0157\u015c\3\2\2\2\u0158"+
		"\u0159\5&\24\2\u0159\u015a\b\23\1\2\u015a\u015c\3\2\2\2\u015b\u0140\3"+
		"\2\2\2\u015b\u0143\3\2\2\2\u015b\u0146\3\2\2\2\u015b\u0149\3\2\2\2\u015b"+
		"\u014c\3\2\2\2\u015b\u014f\3\2\2\2\u015b\u0152\3\2\2\2\u015b\u0155\3\2"+
		"\2\2\u015b\u0158\3\2\2\2\u015c%\3\2\2\2\u015d\u015e\7\61\2\2\u015e\u0164"+
		"\b\24\1\2\u015f\u0160\5$\23\2\u0160\u0161\b\24\1\2\u0161\u0163\3\2\2\2"+
		"\u0162\u015f\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7\62\2\2"+
		"\u0168\'\3\2\2\2\u0169\u016a\7\33\2\2\u016a\u016b\7-\2\2\u016b\u016c\5"+
		"\66\34\2\u016c\u016d\7.\2\2\u016d\u016e\7\67\2\2\u016e\u016f\b\25\1\2"+
		"\u016f)\3\2\2\2\u0170\u0171\5,\27\2\u0171\u0172\b\26\1\2\u0172\u0173\7"+
		"\67\2\2\u0173+\3\2\2\2\u0174\u0175\5D#\2\u0175\u0176\7*\2\2\u0176\u0177"+
		"\5B\"\2\u0177\u0178\b\27\1\2\u0178-\3\2\2\2\u0179\u017a\7\6\2\2\u017a"+
		"\u017b\7-\2\2\u017b\u017c\5B\"\2\u017c\u017d\b\30\1\2\u017d\u017e\7.\2"+
		"\2\u017e\u017f\7\67\2\2\u017f/\3\2\2\2\u0180\u0181\7\f\2\2\u0181\u0185"+
		"\b\31\1\2\u0182\u0183\5B\"\2\u0183\u0184\b\31\1\2\u0184\u0186\3\2\2\2"+
		"\u0185\u0182\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188"+
		"\7\67\2\2\u0188\61\3\2\2\2\u0189\u018a\5\64\33\2\u018a\u018b\b\32\1\2"+
		"\u018b\u018c\7\67\2\2\u018c\63\3\2\2\2\u018d\u018e\5V,\2\u018e\u01aa\b"+
		"\33\1\2\u018f\u0190\7\65\2\2\u0190\u0191\7\b\2\2\u0191\u0192\7-\2\2\u0192"+
		"\u0193\5\66\34\2\u0193\u0194\b\33\1\2\u0194\u0195\7.\2\2\u0195\u01a9\3"+
		"\2\2\2\u0196\u0197\7\65\2\2\u0197\u0198\5`\61\2\u0198\u0199\7-\2\2\u0199"+
		"\u019a\5\66\34\2\u019a\u019b\b\33\1\2\u019b\u019c\7.\2\2\u019c\u01a9\3"+
		"\2\2\2\u019d\u019e\7\65\2\2\u019e\u019f\5`\61\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\b\33\1\2\u01a1\u01a9\3\2\2\2\u01a2\u01a3\7/\2\2\u01a3\u01a4\5B"+
		"\"\2\u01a4\u01a5\7\60\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\b\33\1\2\u01a7"+
		"\u01a9\3\2\2\2\u01a8\u018f\3\2\2\2\u01a8\u0196\3\2\2\2\u01a8\u019d\3\2"+
		"\2\2\u01a8\u01a2\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01bb\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7\65"+
		"\2\2\u01ae\u01af\7\b\2\2\u01af\u01b0\7-\2\2\u01b0\u01b1\5\66\34\2\u01b1"+
		"\u01b2\b\33\1\2\u01b2\u01b3\7.\2\2\u01b3\u01bc\3\2\2\2\u01b4\u01b5\7\65"+
		"\2\2\u01b5\u01b6\5`\61\2\u01b6\u01b7\7-\2\2\u01b7\u01b8\5\66\34\2\u01b8"+
		"\u01b9\b\33\1\2\u01b9\u01ba\7.\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01ad\3\2"+
		"\2\2\u01bb\u01b4\3\2\2\2\u01bc\65\3\2\2\2\u01bd\u01c9\b\34\1\2\u01be\u01bf"+
		"\5B\"\2\u01bf\u01c6\b\34\1\2\u01c0\u01c1\7\64\2\2\u01c1\u01c2\5B\"\2\u01c2"+
		"\u01c3\b\34\1\2\u01c3\u01c5\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c5\u01c8\3"+
		"\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01be\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\67\3\2\2"+
		"\2\u01cb\u01cc\7\13\2\2\u01cc\u01d0\b\35\1\2\u01cd\u01ce\7\n\2\2\u01ce"+
		"\u01d0\b\35\1\2\u01cf\u01cb\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\3"+
		"\2\2\2\u01d1\u01d2\7\67\2\2\u01d29\3\2\2\2\u01d3\u01d4\7\17\2\2\u01d4"+
		"\u01d5\b\36\1\2\u01d5\u01d9\7-\2\2\u01d6\u01d7\5,\27\2\u01d7\u01d8\b\36"+
		"\1\2\u01d8\u01da\3\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01df\7\67\2\2\u01dc\u01dd\5B\"\2\u01dd\u01de\b\36"+
		"\1\2\u01de\u01e0\3\2\2\2\u01df\u01dc\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e5\7\67\2\2\u01e2\u01e3\5,\27\2\u01e3\u01e4\b"+
		"\36\1\2\u01e4\u01e6\3\2\2\2\u01e5\u01e2\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e8\7.\2\2\u01e8\u01e9\5@!\2\u01e9\u01ea\b\36\1"+
		"\2\u01ea;\3\2\2\2\u01eb\u01ec\7\r\2\2\u01ec\u01ed\7-\2\2\u01ed\u01ee\5"+
		"`\61\2\u01ee\u01ef\7\16\2\2\u01ef\u01f0\5B\"\2\u01f0\u01f1\b\37\1\2\u01f1"+
		"\u01f2\7.\2\2\u01f2\u01f3\5@!\2\u01f3\u01f4\b\37\1\2\u01f4=\3\2\2\2\u01f5"+
		"\u01f6\7\20\2\2\u01f6\u01f7\7-\2\2\u01f7\u01f8\5B\"\2\u01f8\u01f9\7.\2"+
		"\2\u01f9\u01fa\5@!\2\u01fa\u01ff\b \1\2\u01fb\u01fc\7\21\2\2\u01fc\u01fd"+
		"\5@!\2\u01fd\u01fe\b \1\2\u01fe\u0200\3\2\2\2\u01ff\u01fb\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200?\3\2\2\2\u0201\u0202\5&\24\2\u0202\u0203\b!\1\2\u0203"+
		"\u0208\3\2\2\2\u0204\u0205\5$\23\2\u0205\u0206\b!\1\2\u0206\u0208\3\2"+
		"\2\2\u0207\u0201\3\2\2\2\u0207\u0204\3\2\2\2\u0208A\3\2\2\2\u0209\u020a"+
		"\5D#\2\u020a\u020f\b\"\1\2\u020b\u020c\7*\2\2\u020c\u020d\5B\"\2\u020d"+
		"\u020e\b\"\1\2\u020e\u0210\3\2\2\2\u020f\u020b\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210C\3\2\2\2\u0211\u0212\5F$\2\u0212\u0219\b#\1\2\u0213\u0214\7"+
		"\'\2\2\u0214\u0215\5F$\2\u0215\u0216\b#\1\2\u0216\u0218\3\2\2\2\u0217"+
		"\u0213\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021aE\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\5H%\2\u021d\u0224"+
		"\b$\1\2\u021e\u021f\7&\2\2\u021f\u0220\5H%\2\u0220\u0221\b$\1\2\u0221"+
		"\u0223\3\2\2\2\u0222\u021e\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2"+
		"\2\2\u0224\u0225\3\2\2\2\u0225G\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228"+
		"\5J&\2\u0228\u0234\b%\1\2\u0229\u022a\7 \2\2\u022a\u022e\b%\1\2\u022b"+
		"\u022c\7\37\2\2\u022c\u022e\b%\1\2\u022d\u0229\3\2\2\2\u022d\u022b\3\2"+
		"\2\2\u022e\u022f\3\2\2\2\u022f\u0230\5J&\2\u0230\u0231\b%\1\2\u0231\u0233"+
		"\3\2\2\2\u0232\u022d\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235I\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0238\5L\'\2\u0238"+
		"\u0244\b&\1\2\u0239\u023a\7\35\2\2\u023a\u023e\b&\1\2\u023b\u023c\7\36"+
		"\2\2\u023c\u023e\b&\1\2\u023d\u0239\3\2\2\2\u023d\u023b\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0240\5L\'\2\u0240\u0241\b&\1\2\u0241\u0243\3\2\2"+
		"\2\u0242\u023d\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245"+
		"\3\2\2\2\u0245K\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248\5N(\2\u0248\u0254"+
		"\b\'\1\2\u0249\u024a\7$\2\2\u024a\u024e\b\'\1\2\u024b\u024c\7%\2\2\u024c"+
		"\u024e\b\'\1\2\u024d\u0249\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u024f\3\2"+
		"\2\2\u024f\u0250\5N(\2\u0250\u0251\b\'\1\2\u0251\u0253\3\2\2\2\u0252\u024d"+
		"\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"M\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\5P)\2\u0258\u0266\b(\1\2\u0259"+
		"\u025a\7!\2\2\u025a\u0260\b(\1\2\u025b\u025c\7\"\2\2\u025c\u0260\b(\1"+
		"\2\u025d\u025e\7#\2\2\u025e\u0260\b(\1\2\u025f\u0259\3\2\2\2\u025f\u025b"+
		"\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\5P)\2\u0262"+
		"\u0263\b(\1\2\u0263\u0265\3\2\2\2\u0264\u025f\3\2\2\2\u0265\u0268\3\2"+
		"\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267O\3\2\2\2\u0268\u0266"+
		"\3\2\2\2\u0269\u026a\7(\2\2\u026a\u0272\b)\1\2\u026b\u026c\7%\2\2\u026c"+
		"\u0272\b)\1\2\u026d\u026e\7+\2\2\u026e\u0272\b)\1\2\u026f\u0270\7,\2\2"+
		"\u0270\u0272\b)\1\2\u0271\u0269\3\2\2\2\u0271\u026b\3\2\2\2\u0271\u026d"+
		"\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\5P)\2\u0274"+
		"\u0275\b)\1\2\u0275\u027a\3\2\2\2\u0276\u0277\5R*\2\u0277\u0278\b)\1\2"+
		"\u0278\u027a\3\2\2\2\u0279\u0271\3\2\2\2\u0279\u0276\3\2\2\2\u027aQ\3"+
		"\2\2\2\u027b\u027c\5T+\2\u027c\u0281\b*\1\2\u027d\u027e\7+\2\2\u027e\u0282"+
		"\b*\1\2\u027f\u0280\7,\2\2\u0280\u0282\b*\1\2\u0281\u027d\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282S\3\2\2\2\u0283\u0284\5V,\2\u0284"+
		"\u02a0\b+\1\2\u0285\u0286\7\65\2\2\u0286\u0287\7\b\2\2\u0287\u0288\7-"+
		"\2\2\u0288\u0289\5\66\34\2\u0289\u028a\b+\1\2\u028a\u028b\7.\2\2\u028b"+
		"\u029f\3\2\2\2\u028c\u028d\7\65\2\2\u028d\u028e\5`\61\2\u028e\u028f\7"+
		"-\2\2\u028f\u0290\5\66\34\2\u0290\u0291\b+\1\2\u0291\u0292\7.\2\2\u0292"+
		"\u029f\3\2\2\2\u0293\u0294\7\65\2\2\u0294\u0295\5`\61\2\u0295\u0296\3"+
		"\2\2\2\u0296\u0297\b+\1\2\u0297\u029f\3\2\2\2\u0298\u0299\7/\2\2\u0299"+
		"\u029a\5B\"\2\u029a\u029b\7\60\2\2\u029b\u029c\3\2\2\2\u029c\u029d\b+"+
		"\1\2\u029d\u029f\3\2\2\2\u029e\u0285\3\2\2\2\u029e\u028c\3\2\2\2\u029e"+
		"\u0293\3\2\2\2\u029e\u0298\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2"+
		"\2\2\u02a0\u02a1\3\2\2\2\u02a1U\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4"+
		"\7\32\2\2\u02a4\u02ba\b,\1\2\u02a5\u02a6\5X-\2\u02a6\u02a7\b,\1\2\u02a7"+
		"\u02ba\3\2\2\2\u02a8\u02a9\5Z.\2\u02a9\u02aa\b,\1\2\u02aa\u02ba\3\2\2"+
		"\2\u02ab\u02ac\5`\61\2\u02ac\u02ad\b,\1\2\u02ad\u02ba\3\2\2\2\u02ae\u02af"+
		"\7-\2\2\u02af\u02b0\5B\"\2\u02b0\u02b1\7.\2\2\u02b1\u02b2\b,\1\2\u02b2"+
		"\u02ba\3\2\2\2\u02b3\u02b4\5`\61\2\u02b4\u02b5\7/\2\2\u02b5\u02b6\5B\""+
		"\2\u02b6\u02b7\7\60\2\2\u02b7\u02b8\b,\1\2\u02b8\u02ba\3\2\2\2\u02b9\u02a3"+
		"\3\2\2\2\u02b9\u02a5\3\2\2\2\u02b9\u02a8\3\2\2\2\u02b9\u02ab\3\2\2\2\u02b9"+
		"\u02ae\3\2\2\2\u02b9\u02b3\3\2\2\2\u02baW\3\2\2\2\u02bb\u02bc\7\t\2\2"+
		"\u02bc\u02bd\5\24\13\2\u02bd\u02be\7-\2\2\u02be\u02bf\5\66\34\2\u02bf"+
		"\u02c0\7.\2\2\u02c0\u02c1\b-\1\2\u02c1Y\3\2\2\2\u02c2\u02c3\5\\/\2\u02c3"+
		"\u02c4\b.\1\2\u02c4\u02cf\3\2\2\2\u02c5\u02c6\7:\2\2\u02c6\u02cf\b.\1"+
		"\2\u02c7\u02c8\78\2\2\u02c8\u02cf\b.\1\2\u02c9\u02ca\7\26\2\2\u02ca\u02cf"+
		"\b.\1\2\u02cb\u02cc\5^\60\2\u02cc\u02cd\b.\1\2\u02cd\u02cf\3\2\2\2\u02ce"+
		"\u02c2\3\2\2\2\u02ce\u02c5\3\2\2\2\u02ce\u02c7\3\2\2\2\u02ce\u02c9\3\2"+
		"\2\2\u02ce\u02cb\3\2\2\2\u02cf[\3\2\2\2\u02d0\u02d1\7\30\2\2\u02d1\u02d5"+
		"\b/\1\2\u02d2\u02d3\7\31\2\2\u02d3\u02d5\b/\1\2\u02d4\u02d0\3\2\2\2\u02d4"+
		"\u02d2\3\2\2\2\u02d5]\3\2\2\2\u02d6\u02d7\7/\2\2\u02d7\u02d8\5\66\34\2"+
		"\u02d8\u02d9\b\60\1\2\u02d9\u02da\7\60\2\2\u02da_\3\2\2\2\u02db\u02dc"+
		"\79\2\2\u02dc\u02dd\b\61\1\2\u02dda\3\2\2\29lv\177\u0081\u0087\u008f\u0091"+
		"\u00a1\u00c3\u00c6\u00d9\u00e8\u00f5\u00f8\u0100\u010a\u0112\u011f\u0128"+
		"\u012d\u0135\u013d\u015b\u0164\u0185\u01a8\u01aa\u01bb\u01c6\u01c9\u01cf"+
		"\u01d9\u01df\u01e5\u01ff\u0207\u020f\u0219\u0224\u022d\u0234\u023d\u0244"+
		"\u024d\u0254\u025f\u0266\u0271\u0279\u0281\u029e\u02a0\u02b9\u02ce\u02d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}