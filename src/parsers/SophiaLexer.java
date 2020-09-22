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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SophiaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEF", "EXTENDS", "CLASS", "PRINT", "FUNC", "INVOKE", "NEW", "CONTINUE", 
			"BREAK", "RETURN", "FOREACH", "IN", "FOR", "IF", "ELSE", "BOOLEAN", "STRING", 
			"INT", "VOID", "NULL", "LIST", "TRUE", "FALSE", "THIS", "SUPER", "ARROW", 
			"GREATER_THAN", "LESS_THAN", "NOT_EQUAL", "EQUAL", "MULT", "DIVIDE", 
			"MOD", "PLUS", "MINUS", "AND", "OR", "NOT", "QUESTION_MARK", "ASSIGN", 
			"INCREMENT", "DECREMENT", "LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", 
			"RBRACE", "SHARP", "COMMA", "DOT", "COLON", "SEMICOLLON", "INT_VALUE", 
			"IDENTIFIER", "STRING_VALUE", "COMMENT", "WS"
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


	public SophiaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sophia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0169\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\3\67\7\67\u0144\n\67\f\67\16\67\u0147\13"+
		"\67\5\67\u0149\n\67\38\38\78\u014d\n8\f8\168\u0150\138\39\39\79\u0154"+
		"\n9\f9\169\u0157\139\39\39\3:\3:\3:\3:\7:\u015f\n:\f:\16:\u0162\13:\3"+
		":\3:\3;\3;\3;\3;\2\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<\3\2\t\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\"+
		"aac|\3\2$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u016d\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5{\3\2\2\2\7\u0083\3\2\2\2\t\u0089"+
		"\3\2\2\2\13\u008f\3\2\2\2\r\u0094\3\2\2\2\17\u009b\3\2\2\2\21\u009f\3"+
		"\2\2\2\23\u00a8\3\2\2\2\25\u00ae\3\2\2\2\27\u00b5\3\2\2\2\31\u00bd\3\2"+
		"\2\2\33\u00c0\3\2\2\2\35\u00c4\3\2\2\2\37\u00c7\3\2\2\2!\u00cc\3\2\2\2"+
		"#\u00d1\3\2\2\2%\u00d8\3\2\2\2\'\u00dc\3\2\2\2)\u00e1\3\2\2\2+\u00e6\3"+
		"\2\2\2-\u00eb\3\2\2\2/\u00f0\3\2\2\2\61\u00f6\3\2\2\2\63\u00fb\3\2\2\2"+
		"\65\u0101\3\2\2\2\67\u0104\3\2\2\29\u0106\3\2\2\2;\u0108\3\2\2\2=\u010b"+
		"\3\2\2\2?\u010e\3\2\2\2A\u0110\3\2\2\2C\u0112\3\2\2\2E\u0114\3\2\2\2G"+
		"\u0116\3\2\2\2I\u0118\3\2\2\2K\u011b\3\2\2\2M\u011e\3\2\2\2O\u0120\3\2"+
		"\2\2Q\u0122\3\2\2\2S\u0124\3\2\2\2U\u0127\3\2\2\2W\u012a\3\2\2\2Y\u012c"+
		"\3\2\2\2[\u012e\3\2\2\2]\u0130\3\2\2\2_\u0132\3\2\2\2a\u0134\3\2\2\2c"+
		"\u0136\3\2\2\2e\u0138\3\2\2\2g\u013a\3\2\2\2i\u013c\3\2\2\2k\u013e\3\2"+
		"\2\2m\u0148\3\2\2\2o\u014a\3\2\2\2q\u0151\3\2\2\2s\u015a\3\2\2\2u\u0165"+
		"\3\2\2\2wx\7f\2\2xy\7g\2\2yz\7h\2\2z\4\3\2\2\2{|\7g\2\2|}\7z\2\2}~\7v"+
		"\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080\u0081\7f\2\2\u0081\u0082\7u\2"+
		"\2\u0082\6\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085\7n\2\2\u0085\u0086\7"+
		"c\2\2\u0086\u0087\7u\2\2\u0087\u0088\7u\2\2\u0088\b\3\2\2\2\u0089\u008a"+
		"\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7v\2\2\u008e\n\3\2\2\2\u008f\u0090\7h\2\2\u0090\u0091\7w\2\2\u0091"+
		"\u0092\7p\2\2\u0092\u0093\7e\2\2\u0093\f\3\2\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7p\2\2\u0096\u0097\7x\2\2\u0097\u0098\7q\2\2\u0098\u0099\7m\2\2"+
		"\u0099\u009a\7g\2\2\u009a\16\3\2\2\2\u009b\u009c\7p\2\2\u009c\u009d\7"+
		"g\2\2\u009d\u009e\7y\2\2\u009e\20\3\2\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1"+
		"\7q\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7k\2\2\u00a4"+
		"\u00a5\7p\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7g\2\2\u00a7\22\3\2\2\2\u00a8"+
		"\u00a9\7d\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7c\2\2"+
		"\u00ac\u00ad\7m\2\2\u00ad\24\3\2\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7"+
		"g\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4"+
		"\7p\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8"+
		"\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7e\2\2\u00bb"+
		"\u00bc\7j\2\2\u00bc\30\3\2\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf"+
		"\32\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7t\2\2\u00c3"+
		"\34\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7h\2\2\u00c6\36\3\2\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7g\2\2"+
		"\u00cb \3\2\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7q\2"+
		"\2\u00cf\u00d0\7n\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7"+
		"v\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7"+
		"\7i\2\2\u00d7$\3\2\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db"+
		"\7v\2\2\u00db&\3\2\2\2\u00dc\u00dd\7x\2\2\u00dd\u00de\7q\2\2\u00de\u00df"+
		"\7k\2\2\u00df\u00e0\7f\2\2\u00e0(\3\2\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3"+
		"\7w\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7n\2\2\u00e5*\3\2\2\2\u00e6\u00e7"+
		"\7n\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		",\3\2\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7w\2\2\u00ee"+
		"\u00ef\7g\2\2\u00ef.\3\2\2\2\u00f0\u00f1\7h\2\2\u00f1\u00f2\7c\2\2\u00f2"+
		"\u00f3\7n\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7g\2\2\u00f5\60\3\2\2\2\u00f6"+
		"\u00f7\7v\2\2\u00f7\u00f8\7j\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7u\2\2"+
		"\u00fa\62\3\2\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7"+
		"r\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7t\2\2\u0100\64\3\2\2\2\u0101\u0102"+
		"\7/\2\2\u0102\u0103\7@\2\2\u0103\66\3\2\2\2\u0104\u0105\7@\2\2\u01058"+
		"\3\2\2\2\u0106\u0107\7>\2\2\u0107:\3\2\2\2\u0108\u0109\7?\2\2\u0109\u010a"+
		"\7#\2\2\u010a<\3\2\2\2\u010b\u010c\7?\2\2\u010c\u010d\7?\2\2\u010d>\3"+
		"\2\2\2\u010e\u010f\7,\2\2\u010f@\3\2\2\2\u0110\u0111\7\61\2\2\u0111B\3"+
		"\2\2\2\u0112\u0113\7\'\2\2\u0113D\3\2\2\2\u0114\u0115\7-\2\2\u0115F\3"+
		"\2\2\2\u0116\u0117\7/\2\2\u0117H\3\2\2\2\u0118\u0119\7(\2\2\u0119\u011a"+
		"\7(\2\2\u011aJ\3\2\2\2\u011b\u011c\7~\2\2\u011c\u011d\7~\2\2\u011dL\3"+
		"\2\2\2\u011e\u011f\7#\2\2\u011fN\3\2\2\2\u0120\u0121\7A\2\2\u0121P\3\2"+
		"\2\2\u0122\u0123\7?\2\2\u0123R\3\2\2\2\u0124\u0125\7-\2\2\u0125\u0126"+
		"\7-\2\2\u0126T\3\2\2\2\u0127\u0128\7/\2\2\u0128\u0129\7/\2\2\u0129V\3"+
		"\2\2\2\u012a\u012b\7*\2\2\u012bX\3\2\2\2\u012c\u012d\7+\2\2\u012dZ\3\2"+
		"\2\2\u012e\u012f\7]\2\2\u012f\\\3\2\2\2\u0130\u0131\7_\2\2\u0131^\3\2"+
		"\2\2\u0132\u0133\7}\2\2\u0133`\3\2\2\2\u0134\u0135\7\177\2\2\u0135b\3"+
		"\2\2\2\u0136\u0137\7%\2\2\u0137d\3\2\2\2\u0138\u0139\7.\2\2\u0139f\3\2"+
		"\2\2\u013a\u013b\7\60\2\2\u013bh\3\2\2\2\u013c\u013d\7<\2\2\u013dj\3\2"+
		"\2\2\u013e\u013f\7=\2\2\u013fl\3\2\2\2\u0140\u0149\7\62\2\2\u0141\u0145"+
		"\t\2\2\2\u0142\u0144\t\3\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0148\u0140\3\2\2\2\u0148\u0141\3\2\2\2\u0149n\3\2\2\2\u014a\u014e"+
		"\t\4\2\2\u014b\u014d\t\5\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014fp\3\2\2\2\u0150\u014e\3\2\2\2"+
		"\u0151\u0155\7$\2\2\u0152\u0154\n\6\2\2\u0153\u0152\3\2\2\2\u0154\u0157"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u0159\7$\2\2\u0159r\3\2\2\2\u015a\u015b\7\61\2\2"+
		"\u015b\u015c\7\61\2\2\u015c\u0160\3\2\2\2\u015d\u015f\n\7\2\2\u015e\u015d"+
		"\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\b:\2\2\u0164t\3\2\2\2\u0165"+
		"\u0166\t\b\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b;\2\2\u0168v\3\2\2\2\b"+
		"\2\u0145\u0148\u014e\u0155\u0160\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}