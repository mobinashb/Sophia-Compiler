// Generated from C:/Users/amirp/Desktop/Compiler-TA/compiler-f99-ca/src\Sophia.g4 by ANTLR 4.8
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
		MSGHANDLER=1, INITIAL=2, EXTENDS=3, ACTORVARS=4, KNOWNACTORS=5, ACTOR=6, 
		PRINT=7, MAIN=8, CONTINUE=9, BREAK=10, FOR=11, IF=12, ELSE=13, BOOLEAN=14, 
		STRING=15, INT=16, TRUE=17, FALSE=18, SELF=19, SENDER=20, GREATER_THAN=21, 
		LESS_THAN=22, NOT_EQUAL=23, EQUAL=24, MULT=25, DIVIDE=26, MOD=27, PLUS=28, 
		MINUS=29, AND=30, OR=31, NOT=32, QUESTION_MARK=33, ASSIGN=34, INCREASE=35, 
		DECREASE=36, LPAR=37, RPAR=38, LBRACK=39, RBRACK=40, LBRACE=41, RBRACE=42, 
		COMMA=43, DOT=44, COLON=45, SEMICOLLON=46, INT_VALUE=47, IDENTIFIER=48, 
		STRING_VALUE=49, WS=50;
	public static final int
		RULE_sophia = 0, RULE_program = 1, RULE_actor = 2, RULE_actorBody = 3, 
		RULE_knownActors = 4, RULE_knownActorsBody = 5, RULE_knownActorsStmt = 6, 
		RULE_actorVars = 7, RULE_defineVars = 8, RULE_defineVarsStmt = 9, RULE_msgHandler = 10, 
		RULE_initialMsgHandler = 11, RULE_argumentBody = 12, RULE_oneArgument = 13, 
		RULE_main = 14, RULE_mainBody = 15, RULE_mainStatement = 16, RULE_defineIntArray = 17, 
		RULE_primitiveDataType = 18, RULE_values = 19, RULE_boolValue = 20, RULE_msgHandlerBody = 21, 
		RULE_restOfStatements = 22, RULE_statement = 23, RULE_scopeStatement = 24, 
		RULE_assignmentStatement = 25, RULE_printFunction = 26, RULE_callMsgHandler = 27, 
		RULE_arrayWithIndex = 28, RULE_forStatement = 29, RULE_continueBreak = 30, 
		RULE_ifStatement = 31, RULE_expression = 32, RULE_expression00 = 33, RULE_expression0 = 34, 
		RULE_expression1 = 35, RULE_expression2 = 36, RULE_expression3 = 37, RULE_expression4 = 38, 
		RULE_expression5 = 39, RULE_expression6 = 40, RULE_expression7 = 41, RULE_expression8 = 42, 
		RULE_expression9 = 43, RULE_ternaryExpression = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "program", "actor", "actorBody", "knownActors", "knownActorsBody", 
			"knownActorsStmt", "actorVars", "defineVars", "defineVarsStmt", "msgHandler", 
			"initialMsgHandler", "argumentBody", "oneArgument", "main", "mainBody", 
			"mainStatement", "defineIntArray", "primitiveDataType", "values", "boolValue", 
			"msgHandlerBody", "restOfStatements", "statement", "scopeStatement", 
			"assignmentStatement", "printFunction", "callMsgHandler", "arrayWithIndex", 
			"forStatement", "continueBreak", "ifStatement", "expression", "expression00", 
			"expression0", "expression1", "expression2", "expression3", "expression4", 
			"expression5", "expression6", "expression7", "expression8", "expression9", 
			"ternaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'msghandler'", "'initial'", "'extends'", "'actorvars'", "'knownactors'", 
			"'actor'", "'print'", "'main'", "'continue'", "'break'", "'for'", "'if'", 
			"'else'", "'boolean'", "'string'", "'int'", "'true'", "'false'", "'self'", 
			"'sender'", "'>'", "'<'", "'=!'", "'=='", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'&&'", "'||'", "'!'", "'?'", "'='", "'++'", "'--'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "','", "'.'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MSGHANDLER", "INITIAL", "EXTENDS", "ACTORVARS", "KNOWNACTORS", 
			"ACTOR", "PRINT", "MAIN", "CONTINUE", "BREAK", "FOR", "IF", "ELSE", "BOOLEAN", 
			"STRING", "INT", "TRUE", "FALSE", "SELF", "SENDER", "GREATER_THAN", "LESS_THAN", 
			"NOT_EQUAL", "EQUAL", "MULT", "DIVIDE", "MOD", "PLUS", "MINUS", "AND", 
			"OR", "NOT", "QUESTION_MARK", "ASSIGN", "INCREASE", "DECREASE", "LPAR", 
			"RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", "DOT", "COLON", 
			"SEMICOLLON", "INT_VALUE", "IDENTIFIER", "STRING_VALUE", "WS"
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
			setState(90);
			program();
			setState(91);
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
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
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTOR) {
				{
				{
				setState(93);
				actor();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			main();
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

	public static class ActorContext extends ParserRuleContext {
		public Token actorName;
		public Token actorParent;
		public TerminalNode ACTOR() { return getToken(SophiaParser.ACTOR, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public ActorBodyContext actorBody() {
			return getRuleContext(ActorBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SophiaParser.IDENTIFIER, i);
		}
		public TerminalNode EXTENDS() { return getToken(SophiaParser.EXTENDS, 0); }
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitActor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitActor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ACTOR);
			setState(102);
			((ActorContext)_localctx).actorName = match(IDENTIFIER);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(103);
				match(EXTENDS);
				setState(104);
				((ActorContext)_localctx).actorParent = match(IDENTIFIER);
				}
			}

			setState(107);
			match(LPAR);
			setState(108);
			match(INT_VALUE);
			setState(109);
			match(RPAR);

			            System.out.print("ActorDec:");
			            System.out.print((((ActorContext)_localctx).actorName!=null?((ActorContext)_localctx).actorName.getText():null));
			            if(((ActorContext)_localctx).actorParent != null) {
			                System.out.print(",");
			                System.out.print((((ActorContext)_localctx).actorParent!=null?((ActorContext)_localctx).actorParent.getText():null));
			            }
			            System.out.print("\n");
			       
			setState(111);
			match(LBRACE);
			setState(112);
			actorBody();
			setState(113);
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

	public static class ActorBodyContext extends ParserRuleContext {
		public KnownActorsContext knownActors() {
			return getRuleContext(KnownActorsContext.class,0);
		}
		public ActorVarsContext actorVars() {
			return getRuleContext(ActorVarsContext.class,0);
		}
		public InitialMsgHandlerContext initialMsgHandler() {
			return getRuleContext(InitialMsgHandlerContext.class,0);
		}
		public List<MsgHandlerContext> msgHandler() {
			return getRuleContexts(MsgHandlerContext.class);
		}
		public MsgHandlerContext msgHandler(int i) {
			return getRuleContext(MsgHandlerContext.class,i);
		}
		public ActorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterActorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitActorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitActorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorBodyContext actorBody() throws RecognitionException {
		ActorBodyContext _localctx = new ActorBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			knownActors();
			setState(116);
			actorVars();
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(117);
				initialMsgHandler();
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGHANDLER) {
				{
				{
				setState(120);
				msgHandler();
				}
				}
				setState(125);
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

	public static class KnownActorsContext extends ParserRuleContext {
		public TerminalNode KNOWNACTORS() { return getToken(SophiaParser.KNOWNACTORS, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public KnownActorsBodyContext knownActorsBody() {
			return getRuleContext(KnownActorsBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public KnownActorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownActors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterKnownActors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitKnownActors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitKnownActors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnownActorsContext knownActors() throws RecognitionException {
		KnownActorsContext _localctx = new KnownActorsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_knownActors);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(KNOWNACTORS);
			setState(127);
			match(LBRACE);
			setState(128);
			knownActorsBody();
			setState(129);
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

	public static class KnownActorsBodyContext extends ParserRuleContext {
		public List<KnownActorsStmtContext> knownActorsStmt() {
			return getRuleContexts(KnownActorsStmtContext.class);
		}
		public KnownActorsStmtContext knownActorsStmt(int i) {
			return getRuleContext(KnownActorsStmtContext.class,i);
		}
		public KnownActorsBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownActorsBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterKnownActorsBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitKnownActorsBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitKnownActorsBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnownActorsBodyContext knownActorsBody() throws RecognitionException {
		KnownActorsBodyContext _localctx = new KnownActorsBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_knownActorsBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(131);
				knownActorsStmt();
				}
				}
				setState(136);
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

	public static class KnownActorsStmtContext extends ParserRuleContext {
		public Token knownActorType;
		public Token knownActorName;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SophiaParser.IDENTIFIER, i);
		}
		public KnownActorsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownActorsStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterKnownActorsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitKnownActorsStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitKnownActorsStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnownActorsStmtContext knownActorsStmt() throws RecognitionException {
		KnownActorsStmtContext _localctx = new KnownActorsStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_knownActorsStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((KnownActorsStmtContext)_localctx).knownActorType = match(IDENTIFIER);
			setState(138);
			((KnownActorsStmtContext)_localctx).knownActorName = match(IDENTIFIER);
			setState(139);
			match(SEMICOLLON);

			                    System.out.print("KnownAcor:");
			                    System.out.print((((KnownActorsStmtContext)_localctx).knownActorType!=null?((KnownActorsStmtContext)_localctx).knownActorType.getText():null));
			                    System.out.print(",");
			                    System.out.print((((KnownActorsStmtContext)_localctx).knownActorName!=null?((KnownActorsStmtContext)_localctx).knownActorName.getText():null));
			                    System.out.print("\n");
			                
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

	public static class ActorVarsContext extends ParserRuleContext {
		public TerminalNode ACTORVARS() { return getToken(SophiaParser.ACTORVARS, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public DefineVarsContext defineVars() {
			return getRuleContext(DefineVarsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public ActorVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterActorVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitActorVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitActorVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorVarsContext actorVars() throws RecognitionException {
		ActorVarsContext _localctx = new ActorVarsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_actorVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ACTORVARS);
			setState(143);
			match(LBRACE);
			setState(144);
			defineVars();
			setState(145);
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

	public static class DefineVarsContext extends ParserRuleContext {
		public List<DefineVarsStmtContext> defineVarsStmt() {
			return getRuleContexts(DefineVarsStmtContext.class);
		}
		public DefineVarsStmtContext defineVarsStmt(int i) {
			return getRuleContext(DefineVarsStmtContext.class,i);
		}
		public DefineVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterDefineVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitDefineVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitDefineVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineVarsContext defineVars() throws RecognitionException {
		DefineVarsContext _localctx = new DefineVarsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defineVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				{
				setState(147);
				defineVarsStmt();
				}
				}
				setState(152);
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

	public static class DefineVarsStmtContext extends ParserRuleContext {
		public PrimitiveDataTypeContext actorVarType;
		public Token actorVarName;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public DefineIntArrayContext defineIntArray() {
			return getRuleContext(DefineIntArrayContext.class,0);
		}
		public PrimitiveDataTypeContext primitiveDataType() {
			return getRuleContext(PrimitiveDataTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public DefineVarsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineVarsStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterDefineVarsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitDefineVarsStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitDefineVarsStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineVarsStmtContext defineVarsStmt() throws RecognitionException {
		DefineVarsStmtContext _localctx = new DefineVarsStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defineVarsStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(153);
				defineIntArray();
				}
				}
				break;
			case 2:
				{
				{
				setState(154);
				((DefineVarsStmtContext)_localctx).actorVarType = primitiveDataType();
				setState(155);
				((DefineVarsStmtContext)_localctx).actorVarName = match(IDENTIFIER);
				}
				}
				break;
			}
			setState(159);
			match(SEMICOLLON);

			        if(((DefineVarsStmtContext)_localctx).actorVarName != null) {
			            System.out.print("VarDec:");
			            System.out.print((((DefineVarsStmtContext)_localctx).actorVarType!=null?_input.getText(((DefineVarsStmtContext)_localctx).actorVarType.start,((DefineVarsStmtContext)_localctx).actorVarType.stop):null));
			            System.out.print(",");
			            System.out.print((((DefineVarsStmtContext)_localctx).actorVarName!=null?((DefineVarsStmtContext)_localctx).actorVarName.getText():null));
			            System.out.print("\n");
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

	public static class MsgHandlerContext extends ParserRuleContext {
		public Token msgHandlername;
		public TerminalNode MSGHANDLER() { return getToken(SophiaParser.MSGHANDLER, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public ArgumentBodyContext argumentBody() {
			return getRuleContext(ArgumentBodyContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public MsgHandlerBodyContext msgHandlerBody() {
			return getRuleContext(MsgHandlerBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public MsgHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMsgHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMsgHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMsgHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgHandlerContext msgHandler() throws RecognitionException {
		MsgHandlerContext _localctx = new MsgHandlerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_msgHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(MSGHANDLER);
			setState(163);
			((MsgHandlerContext)_localctx).msgHandlername = match(IDENTIFIER);

			                            System.out.print("MsgHandlerDec:");
			                            System.out.print((((MsgHandlerContext)_localctx).msgHandlername!=null?((MsgHandlerContext)_localctx).msgHandlername.getText():null));
			                            System.out.print("\n");
			            
			setState(165);
			match(LPAR);
			setState(166);
			argumentBody();
			setState(167);
			match(RPAR);
			setState(168);
			match(LBRACE);
			setState(169);
			msgHandlerBody();
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

	public static class InitialMsgHandlerContext extends ParserRuleContext {
		public TerminalNode MSGHANDLER() { return getToken(SophiaParser.MSGHANDLER, 0); }
		public TerminalNode INITIAL() { return getToken(SophiaParser.INITIAL, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public ArgumentBodyContext argumentBody() {
			return getRuleContext(ArgumentBodyContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public MsgHandlerBodyContext msgHandlerBody() {
			return getRuleContext(MsgHandlerBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public InitialMsgHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialMsgHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterInitialMsgHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitInitialMsgHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitInitialMsgHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialMsgHandlerContext initialMsgHandler() throws RecognitionException {
		InitialMsgHandlerContext _localctx = new InitialMsgHandlerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_initialMsgHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(MSGHANDLER);
			setState(173);
			match(INITIAL);
			setState(174);
			match(LPAR);
			setState(175);
			argumentBody();
			setState(176);
			match(RPAR);

			                System.out.print("MsgHandlerDec:");
			                System.out.print("initial");
			                System.out.print("\n");
			            
			setState(178);
			match(LBRACE);
			setState(179);
			msgHandlerBody();
			setState(180);
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

	public static class ArgumentBodyContext extends ParserRuleContext {
		public List<OneArgumentContext> oneArgument() {
			return getRuleContexts(OneArgumentContext.class);
		}
		public OneArgumentContext oneArgument(int i) {
			return getRuleContext(OneArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public ArgumentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterArgumentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitArgumentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitArgumentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentBodyContext argumentBody() throws RecognitionException {
		ArgumentBodyContext _localctx = new ArgumentBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argumentBody);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(182);
				oneArgument();
				}
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					{
					}
					}
					break;
				case 2:
					{
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(184);
						match(COMMA);
						setState(185);
						oneArgument();
						}
						}
						setState(190);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case RPAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				}
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

	public static class OneArgumentContext extends ParserRuleContext {
		public PrimitiveDataTypeContext oneArgumentTypeName;
		public Token oneArgumentName;
		public DefineIntArrayContext defineIntArray() {
			return getRuleContext(DefineIntArrayContext.class,0);
		}
		public PrimitiveDataTypeContext primitiveDataType() {
			return getRuleContext(PrimitiveDataTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public OneArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOneArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOneArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOneArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneArgumentContext oneArgument() throws RecognitionException {
		OneArgumentContext _localctx = new OneArgumentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_oneArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				{
				setState(196);
				((OneArgumentContext)_localctx).oneArgumentTypeName = primitiveDataType();
				setState(197);
				((OneArgumentContext)_localctx).oneArgumentName = match(IDENTIFIER);
				}
				}
				break;
			case 2:
				{
				{
				setState(199);
				defineIntArray();
				}
				}
				break;
			}

			                System.out.print("VarDec:");
			                System.out.print((((OneArgumentContext)_localctx).oneArgumentTypeName!=null?_input.getText(((OneArgumentContext)_localctx).oneArgumentTypeName.start,((OneArgumentContext)_localctx).oneArgumentTypeName.stop):null));
			                System.out.print(",");
			                System.out.print((((OneArgumentContext)_localctx).oneArgumentName!=null?((OneArgumentContext)_localctx).oneArgumentName.getText():null));
			                System.out.print("\n");
			             
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(SophiaParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public MainBodyContext mainBody() {
			return getRuleContext(MainBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(MAIN);
			setState(205);
			match(LBRACE);
			setState(206);
			mainBody();
			setState(207);
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

	public static class MainBodyContext extends ParserRuleContext {
		public List<MainStatementContext> mainStatement() {
			return getRuleContexts(MainStatementContext.class);
		}
		public MainStatementContext mainStatement(int i) {
			return getRuleContext(MainStatementContext.class,i);
		}
		public MainBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMainBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMainBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMainBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBodyContext mainBody() throws RecognitionException {
		MainBodyContext _localctx = new MainBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mainBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(209);
				mainStatement();
				}
				}
				setState(214);
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

	public static class MainStatementContext extends ParserRuleContext {
		public Token actorInstantiationType;
		public Token actorInstantiationName;
		public Token mainKnownActorName1;
		public Token mainKnownActorName2;
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SophiaParser.IDENTIFIER, i);
		}
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
		public MainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMainStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMainStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMainStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStatementContext mainStatement() throws RecognitionException {
		MainStatementContext _localctx = new MainStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mainStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(215);
			((MainStatementContext)_localctx).actorInstantiationType = match(IDENTIFIER);
			setState(216);
			((MainStatementContext)_localctx).actorInstantiationName = match(IDENTIFIER);
			}

			                    System.out.print("ActorInstantiation:");
			                    System.out.print((((MainStatementContext)_localctx).actorInstantiationType!=null?((MainStatementContext)_localctx).actorInstantiationType.getText():null));
			                    System.out.print(",");
			                    System.out.print((((MainStatementContext)_localctx).actorInstantiationName!=null?((MainStatementContext)_localctx).actorInstantiationName.getText():null));
			                
			setState(219);
			match(LPAR);
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				{
				setState(220);
				((MainStatementContext)_localctx).mainKnownActorName1 = match(IDENTIFIER);
				}

				                    System.out.print(",");
				                    System.out.print((((MainStatementContext)_localctx).mainKnownActorName1!=null?((MainStatementContext)_localctx).mainKnownActorName1.getText():null));
				                
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					{
					}
					}
					break;
				case 2:
					{
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(223);
						match(COMMA);
						setState(224);
						((MainStatementContext)_localctx).mainKnownActorName2 = match(IDENTIFIER);

						                    System.out.print(",");
						                    System.out.print((((MainStatementContext)_localctx).mainKnownActorName2!=null?((MainStatementContext)_localctx).mainKnownActorName2.getText():null));
						                
						}
						}
						setState(230);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case RPAR:
				{
				{
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			System.out.print("\n");
			setState(237);
			match(RPAR);
			setState(238);
			match(COLON);
			setState(239);
			match(LPAR);
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case SELF:
			case SENDER:
			case MINUS:
			case NOT:
			case INCREASE:
			case DECREASE:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				{
				{
				setState(240);
				expression();
				}
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					{
					}
					}
					break;
				case 2:
					{
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(242);
						match(COMMA);
						setState(243);
						expression();
						}
						}
						setState(248);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case RPAR:
				{
				{
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(254);
			match(RPAR);
			setState(255);
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

	public static class DefineIntArrayContext extends ParserRuleContext {
		public Token defineIntArrayName;
		public TerminalNode INT() { return getToken(SophiaParser.INT, 0); }
		public TerminalNode LBRACK() { return getToken(SophiaParser.LBRACK, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TerminalNode RBRACK() { return getToken(SophiaParser.RBRACK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public DefineIntArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineIntArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterDefineIntArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitDefineIntArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitDefineIntArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineIntArrayContext defineIntArray() throws RecognitionException {
		DefineIntArrayContext _localctx = new DefineIntArrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_defineIntArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(INT);
			setState(258);
			((DefineIntArrayContext)_localctx).defineIntArrayName = match(IDENTIFIER);
			setState(259);
			match(LBRACK);
			setState(260);
			match(INT_VALUE);
			setState(261);
			match(RBRACK);

			                    System.out.print("VarDec:int[],");
			                    System.out.print((((DefineIntArrayContext)_localctx).defineIntArrayName!=null?((DefineIntArrayContext)_localctx).defineIntArrayName.getText():null));
			                    System.out.print("\n");
			                
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
		enterRule(_localctx, 36, RULE_primitiveDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		enterRule(_localctx, 38, RULE_values);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				boolValue();
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(STRING_VALUE);
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(INT_VALUE);
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
		enterRule(_localctx, 40, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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

	public static class MsgHandlerBodyContext extends ParserRuleContext {
		public DefineVarsContext defineVars() {
			return getRuleContext(DefineVarsContext.class,0);
		}
		public RestOfStatementsContext restOfStatements() {
			return getRuleContext(RestOfStatementsContext.class,0);
		}
		public MsgHandlerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgHandlerBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMsgHandlerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMsgHandlerBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMsgHandlerBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgHandlerBodyContext msgHandlerBody() throws RecognitionException {
		MsgHandlerBodyContext _localctx = new MsgHandlerBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_msgHandlerBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			defineVars();
			setState(274);
			restOfStatements();
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

	public static class RestOfStatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RestOfStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restOfStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterRestOfStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitRestOfStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitRestOfStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestOfStatementsContext restOfStatements() throws RecognitionException {
		RestOfStatementsContext _localctx = new RestOfStatementsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_restOfStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << CONTINUE) | (1L << BREAK) | (1L << FOR) | (1L << IF) | (1L << SELF) | (1L << SENDER) | (1L << LBRACE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(276);
				statement();
				}
				}
				setState(281);
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
		public ScopeStatementContext scopeStatement() {
			return getRuleContext(ScopeStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public CallMsgHandlerContext callMsgHandler() {
			return getRuleContext(CallMsgHandlerContext.class,0);
		}
		public PrintFunctionContext printFunction() {
			return getRuleContext(PrintFunctionContext.class,0);
		}
		public ContinueBreakContext continueBreak() {
			return getRuleContext(ContinueBreakContext.class,0);
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
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				scopeStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				forStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				ifStatement();
				}
				break;
			case PRINT:
			case CONTINUE:
			case BREAK:
			case SELF:
			case SENDER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(285);
					assignmentStatement();
					}
					break;
				case 2:
					{
					setState(286);
					callMsgHandler();
					}
					break;
				case 3:
					{
					setState(287);
					printFunction();
					}
					break;
				case 4:
					{
					setState(288);
					continueBreak();
					}
					break;
				}
				setState(291);
				match(SEMICOLLON);
				}
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

	public static class ScopeStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScopeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterScopeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitScopeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitScopeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeStatementContext scopeStatement() throws RecognitionException {
		ScopeStatementContext _localctx = new ScopeStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_scopeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LBRACE);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << CONTINUE) | (1L << BREAK) | (1L << FOR) | (1L << IF) | (1L << SELF) | (1L << SENDER) | (1L << LBRACE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(296);
				statement();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayWithIndexContext arrayWithIndex() {
			return getRuleContext(ArrayWithIndexContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public TerminalNode SELF() { return getToken(SophiaParser.SELF, 0); }
		public TerminalNode DOT() { return getToken(SophiaParser.DOT, 0); }
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
		enterRule(_localctx, 50, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				{
				setState(304);
				match(SELF);
				setState(305);
				match(DOT);
				setState(306);
				match(IDENTIFIER);
				}
				}
				break;
			case 2:
				{
				setState(307);
				arrayWithIndex();
				}
				break;
			case 3:
				{
				setState(308);
				match(IDENTIFIER);
				}
				break;
			}
			setState(311);
			match(ASSIGN);
			 System.out.print("Operator:=\n");
			setState(313);
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

	public static class PrintFunctionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SophiaParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ArrayWithIndexContext arrayWithIndex() {
			return getRuleContext(ArrayWithIndexContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrintFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrintFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrintFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintFunctionContext printFunction() throws RecognitionException {
		PrintFunctionContext _localctx = new PrintFunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_printFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(PRINT);
			 System.out.print("Built-in:Print\n");
			setState(317);
			match(LPAR);
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(318);
				values();
				}
				break;
			case 2:
				{
				setState(319);
				arrayWithIndex();
				}
				break;
			case 3:
				{
				setState(320);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(321);
				expression();
				}
				break;
			}
			setState(324);
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

	public static class CallMsgHandlerContext extends ParserRuleContext {
		public Token actorInstance;
		public Token calledMsgHandler;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SophiaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SophiaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<TerminalNode> SELF() { return getTokens(SophiaParser.SELF); }
		public TerminalNode SELF(int i) {
			return getToken(SophiaParser.SELF, i);
		}
		public TerminalNode SENDER() { return getToken(SophiaParser.SENDER, 0); }
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
		public CallMsgHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callMsgHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterCallMsgHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitCallMsgHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitCallMsgHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallMsgHandlerContext callMsgHandler() throws RecognitionException {
		CallMsgHandlerContext _localctx = new CallMsgHandlerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_callMsgHandler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(326);
			((CallMsgHandlerContext)_localctx).actorInstance = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << SENDER) | (1L << IDENTIFIER))) != 0)) ) {
				((CallMsgHandlerContext)_localctx).actorInstance = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(327);
			match(DOT);
			}
			setState(329);
			((CallMsgHandlerContext)_localctx).calledMsgHandler = match(IDENTIFIER);

			                    System.out.print("MsgHandlerCall:");
			                    System.out.print((((CallMsgHandlerContext)_localctx).actorInstance!=null?((CallMsgHandlerContext)_localctx).actorInstance.getText():null));
			                    System.out.print(",");
			                    System.out.print((((CallMsgHandlerContext)_localctx).calledMsgHandler!=null?((CallMsgHandlerContext)_localctx).calledMsgHandler.getText():null));
			                    System.out.print("\n");
			                
			setState(331);
			match(LPAR);
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case SELF:
			case SENDER:
			case MINUS:
			case NOT:
			case INCREASE:
			case DECREASE:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				{
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(332);
					match(SELF);
					setState(333);
					match(DOT);
					setState(334);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(335);
					expression();
					}
					break;
				}
				setState(351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					{
					}
					}
					break;
				case 2:
					{
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(339);
						match(COMMA);
						setState(344);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(340);
							match(SELF);
							setState(341);
							match(DOT);
							setState(342);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(343);
							expression();
							}
							break;
						}
						}
						}
						setState(350);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case RPAR:
				{
				{
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(356);
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

	public static class ArrayWithIndexContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public TerminalNode LBRACK() { return getToken(SophiaParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SophiaParser.RBRACK, 0); }
		public ArrayWithIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayWithIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterArrayWithIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitArrayWithIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitArrayWithIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayWithIndexContext arrayWithIndex() throws RecognitionException {
		ArrayWithIndexContext _localctx = new ArrayWithIndexContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayWithIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(IDENTIFIER);
			setState(359);
			match(LBRACK);
			setState(360);
			expression();
			setState(361);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SophiaParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public List<TerminalNode> SEMICOLLON() { return getTokens(SophiaParser.SEMICOLLON); }
		public TerminalNode SEMICOLLON(int i) {
			return getToken(SophiaParser.SEMICOLLON, i);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public List<AssignmentStatementContext> assignmentStatement() {
			return getRuleContexts(AssignmentStatementContext.class);
		}
		public AssignmentStatementContext assignmentStatement(int i) {
			return getRuleContext(AssignmentStatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 58, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(FOR);
			 System.out.print("Loop:for\n");
			setState(365);
			match(LPAR);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELF || _la==IDENTIFIER) {
				{
				setState(366);
				assignmentStatement();
				}
			}

			setState(369);
			match(SEMICOLLON);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << SELF) | (1L << SENDER) | (1L << MINUS) | (1L << NOT) | (1L << INCREASE) | (1L << DECREASE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(370);
				expression();
				}
			}

			setState(373);
			match(SEMICOLLON);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELF || _la==IDENTIFIER) {
				{
				setState(374);
				assignmentStatement();
				}
			}

			setState(377);
			match(RPAR);
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				{
				setState(378);
				match(LBRACE);
				{
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << CONTINUE) | (1L << BREAK) | (1L << FOR) | (1L << IF) | (1L << SELF) | (1L << SENDER) | (1L << LBRACE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(379);
					statement();
					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(385);
				match(RBRACE);
				}
				}
				break;
			case 2:
				{
				{
				setState(386);
				statement();
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

	public static class ContinueBreakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(SophiaParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SophiaParser.CONTINUE, 0); }
		public ContinueBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterContinueBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitContinueBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitContinueBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueBreakContext continueBreak() throws RecognitionException {
		ContinueBreakContext _localctx = new ContinueBreakContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_continueBreak);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !(_la==CONTINUE || _la==BREAK) ) {
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SophiaParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode ELSE() { return getToken(SophiaParser.ELSE, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(SophiaParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(SophiaParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(SophiaParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(SophiaParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		enterRule(_localctx, 62, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(IF);
			 System.out.print("Conditional:if\n");
			setState(393);
			match(LPAR);
			setState(394);
			expression();
			setState(395);
			match(RPAR);
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				{
				setState(396);
				match(LBRACE);
				{
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << CONTINUE) | (1L << BREAK) | (1L << FOR) | (1L << IF) | (1L << SELF) | (1L << SENDER) | (1L << LBRACE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(397);
					statement();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(403);
				match(RBRACE);
				}
				}
				break;
			case 2:
				{
				{
				setState(404);
				statement();
				}
				}
				break;
			}
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(407);
				match(ELSE);
				 System.out.print("Conditional:else\n");
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					{
					setState(409);
					match(LBRACE);
					{
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << CONTINUE) | (1L << BREAK) | (1L << FOR) | (1L << IF) | (1L << SELF) | (1L << SENDER) | (1L << LBRACE) | (1L << IDENTIFIER))) != 0)) {
						{
						{
						setState(410);
						statement();
						}
						}
						setState(415);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(416);
					match(RBRACE);
					}
					}
					break;
				case 2:
					{
					{
					setState(417);
					statement();
					}
					}
					break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression00Context expression00() {
			return getRuleContext(Expression00Context.class,0);
		}
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
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
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				expression00();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				ternaryExpression();
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

	public static class Expression00Context extends ParserRuleContext {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public Expression00Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression00; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression00(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression00(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression00(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression00Context expression00() throws RecognitionException {
		Expression00Context _localctx = new Expression00Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression00);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				expression0();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("Operator:=\n");
				setState(428);
				assignmentStatement();
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

	public static class Expression0Context extends ParserRuleContext {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public TerminalNode OR() { return getToken(SophiaParser.OR, 0); }
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public Expression0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression0Context expression0() throws RecognitionException {
		Expression0Context _localctx = new Expression0Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_expression0);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				expression1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("Operator:||\n");
				setState(433);
				expression1();
				setState(434);
				match(OR);
				setState(435);
				expression0();
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

	public static class Expression1Context extends ParserRuleContext {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public TerminalNode AND() { return getToken(SophiaParser.AND, 0); }
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		Expression1Context _localctx = new Expression1Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression1);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				expression2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("Operator:&&\n");
				setState(441);
				expression2();
				setState(442);
				match(AND);
				setState(443);
				expression1();
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

	public static class Expression2Context extends ParserRuleContext {
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SophiaParser.EQUAL, 0); }
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public TerminalNode NOT_EQUAL() { return getToken(SophiaParser.NOT_EQUAL, 0); }
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_expression2);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				expression3();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("Operator:==\n");
				setState(449);
				expression3();
				setState(450);
				match(EQUAL);
				setState(451);
				expression2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				System.out.print("Operator:!=\n");
				setState(454);
				expression3();
				setState(455);
				match(NOT_EQUAL);
				setState(456);
				expression2();
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

	public static class Expression3Context extends ParserRuleContext {
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(SophiaParser.GREATER_THAN, 0); }
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public TerminalNode LESS_THAN() { return getToken(SophiaParser.LESS_THAN, 0); }
		public Expression3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression3Context expression3() throws RecognitionException {
		Expression3Context _localctx = new Expression3Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression3);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				expression4();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("Operator:<\n");
				setState(462);
				expression4();
				setState(463);
				match(GREATER_THAN);
				setState(464);
				expression3();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				System.out.print("Operator:>\n");
				setState(467);
				expression4();
				setState(468);
				match(LESS_THAN);
				setState(469);
				expression3();
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

	public static class Expression4Context extends ParserRuleContext {
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(SophiaParser.PLUS, 0); }
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(SophiaParser.MINUS, 0); }
		public Expression4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression4Context expression4() throws RecognitionException {
		Expression4Context _localctx = new Expression4Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_expression4);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.print("Operator:+\n");
				setState(474);
				expression5();
				setState(475);
				match(PLUS);
				setState(476);
				expression4();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("Operator:-\n");
				setState(479);
				expression5();
				setState(480);
				match(MINUS);
				setState(481);
				expression4();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				expression5();
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

	public static class Expression5Context extends ParserRuleContext {
		public Expression6Context expression6() {
			return getRuleContext(Expression6Context.class,0);
		}
		public TerminalNode MULT() { return getToken(SophiaParser.MULT, 0); }
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(SophiaParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(SophiaParser.MOD, 0); }
		public Expression5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression5Context expression5() throws RecognitionException {
		Expression5Context _localctx = new Expression5Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_expression5);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				expression6();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("Operator:*\n");
				setState(488);
				expression6();
				setState(489);
				match(MULT);
				setState(490);
				expression5();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				System.out.print("Operator:/\n");
				setState(493);
				expression6();
				setState(494);
				match(DIVIDE);
				setState(495);
				expression5();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				System.out.print("Operator:%\n");
				setState(498);
				expression6();
				setState(499);
				match(MOD);
				setState(500);
				expression5();
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

	public static class Expression6Context extends ParserRuleContext {
		public Expression7Context expression7() {
			return getRuleContext(Expression7Context.class,0);
		}
		public TerminalNode INCREASE() { return getToken(SophiaParser.INCREASE, 0); }
		public TerminalNode DECREASE() { return getToken(SophiaParser.DECREASE, 0); }
		public TerminalNode NOT() { return getToken(SophiaParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(SophiaParser.MINUS, 0); }
		public Expression6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression6Context expression6() throws RecognitionException {
		Expression6Context _localctx = new Expression6Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_expression6);
		try {
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case SELF:
			case SENDER:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				expression7();
				}
				break;
			case INCREASE:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("Operator:--\n");
				setState(506);
				match(INCREASE);
				setState(507);
				expression7();
				}
				break;
			case DECREASE:
				enterOuterAlt(_localctx, 3);
				{
				System.out.print("Operator:++\n");
				setState(509);
				match(DECREASE);
				setState(510);
				expression7();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				System.out.print("Operator:!\n");
				setState(512);
				match(NOT);
				setState(513);
				expression7();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 5);
				{
				System.out.print("Operator:-\n");
				setState(515);
				match(MINUS);
				setState(516);
				expression7();
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

	public static class Expression7Context extends ParserRuleContext {
		public Expression8Context expression8() {
			return getRuleContext(Expression8Context.class,0);
		}
		public TerminalNode INCREASE() { return getToken(SophiaParser.INCREASE, 0); }
		public TerminalNode DECREASE() { return getToken(SophiaParser.DECREASE, 0); }
		public Expression7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression7Context expression7() throws RecognitionException {
		Expression7Context _localctx = new Expression7Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_expression7);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.print("Operator:++\n");
				setState(520);
				expression8();
				setState(521);
				match(INCREASE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("Operator:--\n");
				setState(524);
				expression8();
				setState(525);
				match(DECREASE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				expression8();
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

	public static class Expression8Context extends ParserRuleContext {
		public Expression9Context expression9() {
			return getRuleContext(Expression9Context.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public Expression00Context expression00() {
			return getRuleContext(Expression00Context.class,0);
		}
		public Expression8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression8Context expression8() throws RecognitionException {
		Expression8Context _localctx = new Expression8Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_expression8);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case SELF:
			case SENDER:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				expression9();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				match(LPAR);
				{
				setState(532);
				expression00();
				}
				setState(533);
				match(RPAR);
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

	public static class Expression9Context extends ParserRuleContext {
		public TerminalNode SENDER() { return getToken(SophiaParser.SENDER, 0); }
		public TerminalNode SELF() { return getToken(SophiaParser.SELF, 0); }
		public TerminalNode DOT() { return getToken(SophiaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public ArrayWithIndexContext arrayWithIndex() {
			return getRuleContext(ArrayWithIndexContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public Expression9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression9Context expression9() throws RecognitionException {
		Expression9Context _localctx = new Expression9Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_expression9);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(SENDER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(538);
				match(SELF);
				setState(539);
				match(DOT);
				setState(540);
				match(IDENTIFIER);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				arrayWithIndex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				values();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				match(IDENTIFIER);
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

	public static class TernaryExpressionContext extends ParserRuleContext {
		public TerminalNode QUESTION_MARK() { return getToken(SophiaParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public Expression00Context expression00() {
			return getRuleContext(Expression00Context.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ternaryExpression);
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					{
					setState(546);
					match(LPAR);
					setState(547);
					ternaryExpression();
					setState(548);
					match(RPAR);
					}
					}
					break;
				case 2:
					{
					setState(550);
					expression00();
					}
					break;
				}
				setState(553);
				match(QUESTION_MARK);
				System.out.print("Operator:?:\n");
				{
				setState(555);
				expression();
				}
				setState(556);
				match(COLON);
				{
				setState(557);
				expression();
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(559);
				match(LPAR);
				setState(560);
				ternaryExpression();
				setState(561);
				match(RPAR);
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0238\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\3\7\3a\n\3\f\3\16\3d\13\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\5\4l\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5y\n"+
		"\5\3\5\7\5|\n\5\f\5\16\5\177\13\5\3\6\3\6\3\6\3\6\3\6\3\7\7\7\u0087\n"+
		"\7\f\7\16\7\u008a\13\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\7\n"+
		"\u0097\n\n\f\n\16\n\u009a\13\n\3\13\3\13\3\13\3\13\5\13\u00a0\n\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00bd\n\16\f\16\16\16\u00c0"+
		"\13\16\5\16\u00c2\n\16\3\16\5\16\u00c5\n\16\3\17\3\17\3\17\3\17\5\17\u00cb"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\7\21\u00d5\n\21\f\21\16"+
		"\21\u00d8\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u00e5\n\22\f\22\16\22\u00e8\13\22\5\22\u00ea\n\22\3\22\5\22\u00ed"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f7\n\22\f\22\16"+
		"\22\u00fa\13\22\5\22\u00fc\n\22\3\22\5\22\u00ff\n\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25\u0110"+
		"\n\25\3\26\3\26\3\27\3\27\3\27\3\30\7\30\u0118\n\30\f\30\16\30\u011b\13"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0124\n\31\3\31\3\31\5\31"+
		"\u0128\n\31\3\32\3\32\7\32\u012c\n\32\f\32\16\32\u012f\13\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0138\n\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0145\n\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0153\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u015b\n\35\7\35\u015d\n\35\f\35\16\35\u0160\13\35\5\35\u0162"+
		"\n\35\3\35\5\35\u0165\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\5\37\u0172\n\37\3\37\3\37\5\37\u0176\n\37\3\37\3\37\5\37\u017a"+
		"\n\37\3\37\3\37\3\37\7\37\u017f\n\37\f\37\16\37\u0182\13\37\3\37\3\37"+
		"\5\37\u0186\n\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\7!\u0191\n!\f!\16!\u0194\13"+
		"!\3!\3!\5!\u0198\n!\3!\3!\3!\3!\7!\u019e\n!\f!\16!\u01a1\13!\3!\3!\5!"+
		"\u01a5\n!\5!\u01a7\n!\3\"\3\"\5\"\u01ab\n\"\3#\3#\3#\5#\u01b0\n#\3$\3"+
		"$\3$\3$\3$\3$\5$\u01b8\n$\3%\3%\3%\3%\3%\3%\5%\u01c0\n%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\5&\u01cd\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u01da\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01e7\n(\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01f9\n)\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0208\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0213"+
		"\n+\3,\3,\3,\3,\3,\5,\u021a\n,\3-\3-\3-\3-\3-\3-\3-\5-\u0223\n-\3.\3."+
		"\3.\3.\3.\5.\u022a\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0236\n.\3.\2\2"+
		"/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\2\6\3\2\20\22\3\2\23\24\4\2\25\26\62\62\3\2\13\f\2\u0254\2"+
		"\\\3\2\2\2\4b\3\2\2\2\6g\3\2\2\2\bu\3\2\2\2\n\u0080\3\2\2\2\f\u0088\3"+
		"\2\2\2\16\u008b\3\2\2\2\20\u0090\3\2\2\2\22\u0098\3\2\2\2\24\u009f\3\2"+
		"\2\2\26\u00a4\3\2\2\2\30\u00ae\3\2\2\2\32\u00c4\3\2\2\2\34\u00ca\3\2\2"+
		"\2\36\u00ce\3\2\2\2 \u00d6\3\2\2\2\"\u00d9\3\2\2\2$\u0103\3\2\2\2&\u010a"+
		"\3\2\2\2(\u010f\3\2\2\2*\u0111\3\2\2\2,\u0113\3\2\2\2.\u0119\3\2\2\2\60"+
		"\u0127\3\2\2\2\62\u0129\3\2\2\2\64\u0137\3\2\2\2\66\u013d\3\2\2\28\u0148"+
		"\3\2\2\2:\u0168\3\2\2\2<\u016d\3\2\2\2>\u0187\3\2\2\2@\u0189\3\2\2\2B"+
		"\u01aa\3\2\2\2D\u01af\3\2\2\2F\u01b7\3\2\2\2H\u01bf\3\2\2\2J\u01cc\3\2"+
		"\2\2L\u01d9\3\2\2\2N\u01e6\3\2\2\2P\u01f8\3\2\2\2R\u0207\3\2\2\2T\u0212"+
		"\3\2\2\2V\u0219\3\2\2\2X\u0222\3\2\2\2Z\u0235\3\2\2\2\\]\5\4\3\2]^\7\2"+
		"\2\3^\3\3\2\2\2_a\5\6\4\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3"+
		"\2\2\2db\3\2\2\2ef\5\36\20\2f\5\3\2\2\2gh\7\b\2\2hk\7\62\2\2ij\7\5\2\2"+
		"jl\7\62\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\'\2\2no\7\61\2\2op\7(\2"+
		"\2pq\b\4\1\2qr\7+\2\2rs\5\b\5\2st\7,\2\2t\7\3\2\2\2uv\5\n\6\2vx\5\20\t"+
		"\2wy\5\30\r\2xw\3\2\2\2xy\3\2\2\2y}\3\2\2\2z|\5\26\f\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\t\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\7\2"+
		"\2\u0081\u0082\7+\2\2\u0082\u0083\5\f\7\2\u0083\u0084\7,\2\2\u0084\13"+
		"\3\2\2\2\u0085\u0087\5\16\b\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\r\3\2\2\2\u008a\u0088\3"+
		"\2\2\2\u008b\u008c\7\62\2\2\u008c\u008d\7\62\2\2\u008d\u008e\7\60\2\2"+
		"\u008e\u008f\b\b\1\2\u008f\17\3\2\2\2\u0090\u0091\7\6\2\2\u0091\u0092"+
		"\7+\2\2\u0092\u0093\5\22\n\2\u0093\u0094\7,\2\2\u0094\21\3\2\2\2\u0095"+
		"\u0097\5\24\13\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\23\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u00a0\5$\23\2\u009c\u009d\5&\24\2\u009d\u009e\7\62\2\2\u009e\u00a0\3"+
		"\2\2\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\7\60\2\2\u00a2\u00a3\b\13\1\2\u00a3\25\3\2\2\2\u00a4\u00a5\7\3"+
		"\2\2\u00a5\u00a6\7\62\2\2\u00a6\u00a7\b\f\1\2\u00a7\u00a8\7\'\2\2\u00a8"+
		"\u00a9\5\32\16\2\u00a9\u00aa\7(\2\2\u00aa\u00ab\7+\2\2\u00ab\u00ac\5,"+
		"\27\2\u00ac\u00ad\7,\2\2\u00ad\27\3\2\2\2\u00ae\u00af\7\3\2\2\u00af\u00b0"+
		"\7\4\2\2\u00b0\u00b1\7\'\2\2\u00b1\u00b2\5\32\16\2\u00b2\u00b3\7(\2\2"+
		"\u00b3\u00b4\b\r\1\2\u00b4\u00b5\7+\2\2\u00b5\u00b6\5,\27\2\u00b6\u00b7"+
		"\7,\2\2\u00b7\31\3\2\2\2\u00b8\u00c1\5\34\17\2\u00b9\u00c2\3\2\2\2\u00ba"+
		"\u00bb\7-\2\2\u00bb\u00bd\5\34\17\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\33\3\2\2\2\u00c6\u00c7\5&\24\2\u00c7\u00c8\7\62\2\2\u00c8\u00cb\3\2\2"+
		"\2\u00c9\u00cb\5$\23\2\u00ca\u00c6\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00cd\b\17\1\2\u00cd\35\3\2\2\2\u00ce\u00cf\7\n\2\2\u00cf"+
		"\u00d0\7+\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\7,\2\2\u00d2\37\3\2\2\2"+
		"\u00d3\u00d5\5\"\22\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00da\7\62\2\2\u00da\u00db\7\62\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b"+
		"\22\1\2\u00dd\u00ec\7\'\2\2\u00de\u00df\7\62\2\2\u00df\u00e9\b\22\1\2"+
		"\u00e0\u00ea\3\2\2\2\u00e1\u00e2\7-\2\2\u00e2\u00e3\7\62\2\2\u00e3\u00e5"+
		"\b\22\1\2\u00e4\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00e0"+
		"\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00de\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\22"+
		"\1\2\u00ef\u00f0\7(\2\2\u00f0\u00f1\7/\2\2\u00f1\u00fe\7\'\2\2\u00f2\u00fb"+
		"\5B\"\2\u00f3\u00fc\3\2\2\2\u00f4\u00f5\7-\2\2\u00f5\u00f7\5B\"\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb"+
		"\u00f8\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f2\3\2"+
		"\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7(\2\2\u0101"+
		"\u0102\7\60\2\2\u0102#\3\2\2\2\u0103\u0104\7\22\2\2\u0104\u0105\7\62\2"+
		"\2\u0105\u0106\7)\2\2\u0106\u0107\7\61\2\2\u0107\u0108\7*\2\2\u0108\u0109"+
		"\b\23\1\2\u0109%\3\2\2\2\u010a\u010b\t\2\2\2\u010b\'\3\2\2\2\u010c\u0110"+
		"\5*\26\2\u010d\u0110\7\63\2\2\u010e\u0110\7\61\2\2\u010f\u010c\3\2\2\2"+
		"\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110)\3\2\2\2\u0111\u0112\t"+
		"\3\2\2\u0112+\3\2\2\2\u0113\u0114\5\22\n\2\u0114\u0115\5.\30\2\u0115-"+
		"\3\2\2\2\u0116\u0118\5\60\31\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2"+
		"\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a/\3\2\2\2\u011b\u0119\3"+
		"\2\2\2\u011c\u0128\5\62\32\2\u011d\u0128\5<\37\2\u011e\u0128\5@!\2\u011f"+
		"\u0124\5\64\33\2\u0120\u0124\58\35\2\u0121\u0124\5\66\34\2\u0122\u0124"+
		"\5> \2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\60\2\2\u0126\u0128\3"+
		"\2\2\2\u0127\u011c\3\2\2\2\u0127\u011d\3\2\2\2\u0127\u011e\3\2\2\2\u0127"+
		"\u0123\3\2\2\2\u0128\61\3\2\2\2\u0129\u012d\7+\2\2\u012a\u012c\5\60\31"+
		"\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7,\2\2\u0131"+
		"\63\3\2\2\2\u0132\u0133\7\25\2\2\u0133\u0134\7.\2\2\u0134\u0138\7\62\2"+
		"\2\u0135\u0138\5:\36\2\u0136\u0138\7\62\2\2\u0137\u0132\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7$"+
		"\2\2\u013a\u013b\b\33\1\2\u013b\u013c\5B\"\2\u013c\65\3\2\2\2\u013d\u013e"+
		"\7\t\2\2\u013e\u013f\b\34\1\2\u013f\u0144\7\'\2\2\u0140\u0145\5(\25\2"+
		"\u0141\u0145\5:\36\2\u0142\u0145\7\62\2\2\u0143\u0145\5B\"\2\u0144\u0140"+
		"\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\7(\2\2\u0147\67\3\2\2\2\u0148\u0149\t\4\2\2"+
		"\u0149\u014a\7.\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7\62\2\2\u014c\u014d"+
		"\b\35\1\2\u014d\u0164\7\'\2\2\u014e\u014f\7\25\2\2\u014f\u0150\7.\2\2"+
		"\u0150\u0153\7\62\2\2\u0151\u0153\5B\"\2\u0152\u014e\3\2\2\2\u0152\u0151"+
		"\3\2\2\2\u0153\u0161\3\2\2\2\u0154\u0162\3\2\2\2\u0155\u015a\7-\2\2\u0156"+
		"\u0157\7\25\2\2\u0157\u0158\7.\2\2\u0158\u015b\7\62\2\2\u0159\u015b\5"+
		"B\"\2\u015a\u0156\3\2\2\2\u015a\u0159\3\2\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u0155\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0154\3\2\2\2\u0161"+
		"\u015e\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0152\3\2"+
		"\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\7(\2\2\u0167"+
		"9\3\2\2\2\u0168\u0169\7\62\2\2\u0169\u016a\7)\2\2\u016a\u016b\5B\"\2\u016b"+
		"\u016c\7*\2\2\u016c;\3\2\2\2\u016d\u016e\7\r\2\2\u016e\u016f\b\37\1\2"+
		"\u016f\u0171\7\'\2\2\u0170\u0172\5\64\33\2\u0171\u0170\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\7\60\2\2\u0174\u0176\5B\"\2\u0175"+
		"\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\7\60"+
		"\2\2\u0178\u017a\5\64\33\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u0185\7(\2\2\u017c\u0180\7+\2\2\u017d\u017f\5\60"+
		"\31\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0186\7,"+
		"\2\2\u0184\u0186\5\60\31\2\u0185\u017c\3\2\2\2\u0185\u0184\3\2\2\2\u0186"+
		"=\3\2\2\2\u0187\u0188\t\5\2\2\u0188?\3\2\2\2\u0189\u018a\7\16\2\2\u018a"+
		"\u018b\b!\1\2\u018b\u018c\7\'\2\2\u018c\u018d\5B\"\2\u018d\u0197\7(\2"+
		"\2\u018e\u0192\7+\2\2\u018f\u0191\5\60\31\2\u0190\u018f\3\2\2\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0195\u0198\7,\2\2\u0196\u0198\5\60\31\2\u0197"+
		"\u018e\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u01a6\3\2\2\2\u0199\u019a\7\17"+
		"\2\2\u019a\u01a4\b!\1\2\u019b\u019f\7+\2\2\u019c\u019e\5\60\31\2\u019d"+
		"\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a5\7,\2\2\u01a3"+
		"\u01a5\5\60\31\2\u01a4\u019b\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a7\3"+
		"\2\2\2\u01a6\u0199\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7A\3\2\2\2\u01a8\u01ab"+
		"\5D#\2\u01a9\u01ab\5Z.\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"C\3\2\2\2\u01ac\u01b0\5F$\2\u01ad\u01ae\b#\1\2\u01ae\u01b0\5\64\33\2\u01af"+
		"\u01ac\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0E\3\2\2\2\u01b1\u01b8\5H%\2\u01b2"+
		"\u01b3\b$\1\2\u01b3\u01b4\5H%\2\u01b4\u01b5\7!\2\2\u01b5\u01b6\5F$\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b8G\3\2\2\2"+
		"\u01b9\u01c0\5J&\2\u01ba\u01bb\b%\1\2\u01bb\u01bc\5J&\2\u01bc\u01bd\7"+
		" \2\2\u01bd\u01be\5H%\2\u01be\u01c0\3\2\2\2\u01bf\u01b9\3\2\2\2\u01bf"+
		"\u01ba\3\2\2\2\u01c0I\3\2\2\2\u01c1\u01cd\5L\'\2\u01c2\u01c3\b&\1\2\u01c3"+
		"\u01c4\5L\'\2\u01c4\u01c5\7\32\2\2\u01c5\u01c6\5J&\2\u01c6\u01cd\3\2\2"+
		"\2\u01c7\u01c8\b&\1\2\u01c8\u01c9\5L\'\2\u01c9\u01ca\7\31\2\2\u01ca\u01cb"+
		"\5J&\2\u01cb\u01cd\3\2\2\2\u01cc\u01c1\3\2\2\2\u01cc\u01c2\3\2\2\2\u01cc"+
		"\u01c7\3\2\2\2\u01cdK\3\2\2\2\u01ce\u01da\5N(\2\u01cf\u01d0\b\'\1\2\u01d0"+
		"\u01d1\5N(\2\u01d1\u01d2\7\27\2\2\u01d2\u01d3\5L\'\2\u01d3\u01da\3\2\2"+
		"\2\u01d4\u01d5\b\'\1\2\u01d5\u01d6\5N(\2\u01d6\u01d7\7\30\2\2\u01d7\u01d8"+
		"\5L\'\2\u01d8\u01da\3\2\2\2\u01d9\u01ce\3\2\2\2\u01d9\u01cf\3\2\2\2\u01d9"+
		"\u01d4\3\2\2\2\u01daM\3\2\2\2\u01db\u01dc\b(\1\2\u01dc\u01dd\5P)\2\u01dd"+
		"\u01de\7\36\2\2\u01de\u01df\5N(\2\u01df\u01e7\3\2\2\2\u01e0\u01e1\b(\1"+
		"\2\u01e1\u01e2\5P)\2\u01e2\u01e3\7\37\2\2\u01e3\u01e4\5N(\2\u01e4\u01e7"+
		"\3\2\2\2\u01e5\u01e7\5P)\2\u01e6\u01db\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6"+
		"\u01e5\3\2\2\2\u01e7O\3\2\2\2\u01e8\u01f9\5R*\2\u01e9\u01ea\b)\1\2\u01ea"+
		"\u01eb\5R*\2\u01eb\u01ec\7\33\2\2\u01ec\u01ed\5P)\2\u01ed\u01f9\3\2\2"+
		"\2\u01ee\u01ef\b)\1\2\u01ef\u01f0\5R*\2\u01f0\u01f1\7\34\2\2\u01f1\u01f2"+
		"\5P)\2\u01f2\u01f9\3\2\2\2\u01f3\u01f4\b)\1\2\u01f4\u01f5\5R*\2\u01f5"+
		"\u01f6\7\35\2\2\u01f6\u01f7\5P)\2\u01f7\u01f9\3\2\2\2\u01f8\u01e8\3\2"+
		"\2\2\u01f8\u01e9\3\2\2\2\u01f8\u01ee\3\2\2\2\u01f8\u01f3\3\2\2\2\u01f9"+
		"Q\3\2\2\2\u01fa\u0208\5T+\2\u01fb\u01fc\b*\1\2\u01fc\u01fd\7%\2\2\u01fd"+
		"\u0208\5T+\2\u01fe\u01ff\b*\1\2\u01ff\u0200\7&\2\2\u0200\u0208\5T+\2\u0201"+
		"\u0202\b*\1\2\u0202\u0203\7\"\2\2\u0203\u0208\5T+\2\u0204\u0205\b*\1\2"+
		"\u0205\u0206\7\37\2\2\u0206\u0208\5T+\2\u0207\u01fa\3\2\2\2\u0207\u01fb"+
		"\3\2\2\2\u0207\u01fe\3\2\2\2\u0207\u0201\3\2\2\2\u0207\u0204\3\2\2\2\u0208"+
		"S\3\2\2\2\u0209\u020a\b+\1\2\u020a\u020b\5V,\2\u020b\u020c\7%\2\2\u020c"+
		"\u0213\3\2\2\2\u020d\u020e\b+\1\2\u020e\u020f\5V,\2\u020f\u0210\7&\2\2"+
		"\u0210\u0213\3\2\2\2\u0211\u0213\5V,\2\u0212\u0209\3\2\2\2\u0212\u020d"+
		"\3\2\2\2\u0212\u0211\3\2\2\2\u0213U\3\2\2\2\u0214\u021a\5X-\2\u0215\u0216"+
		"\7\'\2\2\u0216\u0217\5D#\2\u0217\u0218\7(\2\2\u0218\u021a\3\2\2\2\u0219"+
		"\u0214\3\2\2\2\u0219\u0215\3\2\2\2\u021aW\3\2\2\2\u021b\u0223\7\26\2\2"+
		"\u021c\u021d\7\25\2\2\u021d\u021e\7.\2\2\u021e\u0223\7\62\2\2\u021f\u0223"+
		"\5:\36\2\u0220\u0223\5(\25\2\u0221\u0223\7\62\2\2\u0222\u021b\3\2\2\2"+
		"\u0222\u021c\3\2\2\2\u0222\u021f\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0221"+
		"\3\2\2\2\u0223Y\3\2\2\2\u0224\u0225\7\'\2\2\u0225\u0226\5Z.\2\u0226\u0227"+
		"\7(\2\2\u0227\u022a\3\2\2\2\u0228\u022a\5D#\2\u0229\u0224\3\2\2\2\u0229"+
		"\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\7#\2\2\u022c\u022d\b.\1"+
		"\2\u022d\u022e\5B\"\2\u022e\u022f\7/\2\2\u022f\u0230\5B\"\2\u0230\u0236"+
		"\3\2\2\2\u0231\u0232\7\'\2\2\u0232\u0233\5Z.\2\u0233\u0234\7(\2\2\u0234"+
		"\u0236\3\2\2\2\u0235\u0229\3\2\2\2\u0235\u0231\3\2\2\2\u0236[\3\2\2\2"+
		"8bkx}\u0088\u0098\u009f\u00be\u00c1\u00c4\u00ca\u00d6\u00e6\u00e9\u00ec"+
		"\u00f8\u00fb\u00fe\u010f\u0119\u0123\u0127\u012d\u0137\u0144\u0152\u015a"+
		"\u015e\u0161\u0164\u0171\u0175\u0179\u0180\u0185\u0192\u0197\u019f\u01a4"+
		"\u01a6\u01aa\u01af\u01b7\u01bf\u01cc\u01d9\u01e6\u01f8\u0207\u0212\u0219"+
		"\u0222\u0229\u0235";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}