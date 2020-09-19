// Generated from C:/Users/amirp/Desktop/Compiler-TA/compiler-f99-ca/src\Sophia.g4 by ANTLR 4.8
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
		DEF=1, INHERITS=2, CLASS=3, PRINT=4, FUNC=5, NEW=6, CONTINUE=7, BREAK=8, 
		RETURN=9, FOREACH=10, IN=11, FOR=12, IF=13, ELSE=14, BOOLEAN=15, STRING=16, 
		INT=17, VOID=18, NULL=19, LIST=20, TRUE=21, FALSE=22, THIS=23, SUPER=24, 
		ARROW=25, GREATER_THAN=26, LESS_THAN=27, NOT_EQUAL=28, EQUAL=29, MULT=30, 
		DIVIDE=31, MOD=32, PLUS=33, MINUS=34, AND=35, OR=36, NOT=37, QUESTION_MARK=38, 
		ASSIGN=39, INCREASE=40, DECREASE=41, LPAR=42, RPAR=43, LBRACK=44, RBRACK=45, 
		LBRACE=46, RBRACE=47, SHARP=48, COMMA=49, DOT=50, COLON=51, SEMICOLLON=52, 
		INT_VALUE=53, IDENTIFIER=54, STRING_VALUE=55, COMMENT=56, WS=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEF", "INHERITS", "CLASS", "PRINT", "FUNC", "NEW", "CONTINUE", "BREAK", 
			"RETURN", "FOREACH", "IN", "FOR", "IF", "ELSE", "BOOLEAN", "STRING", 
			"INT", "VOID", "NULL", "LIST", "TRUE", "FALSE", "THIS", "SUPER", "ARROW", 
			"GREATER_THAN", "LESS_THAN", "NOT_EQUAL", "EQUAL", "MULT", "DIVIDE", 
			"MOD", "PLUS", "MINUS", "AND", "OR", "NOT", "QUESTION_MARK", "ASSIGN", 
			"INCREASE", "DECREASE", "LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", 
			"RBRACE", "SHARP", "COMMA", "DOT", "COLON", "SEMICOLLON", "INT_VALUE", 
			"IDENTIFIER", "STRING_VALUE", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'inherits'", "'class'", "'print'", "'func'", "'new'", 
			"'continue'", "'break'", "'return'", "'foreach'", "'in'", "'for'", "'if'", 
			"'else'", "'bool'", "'string'", "'int'", "'void'", "'null'", "'list'", 
			"'true'", "'false'", "'this'", "'super'", "'->'", "'>'", "'<'", "'=!'", 
			"'=='", "'*'", "'/'", "'%'", "'+'", "'-'", "'&&'", "'||'", "'!'", "'?'", 
			"'='", "'++'", "'--'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'#'", 
			"','", "'.'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "INHERITS", "CLASS", "PRINT", "FUNC", "NEW", "CONTINUE", 
			"BREAK", "RETURN", "FOREACH", "IN", "FOR", "IF", "ELSE", "BOOLEAN", "STRING", 
			"INT", "VOID", "NULL", "LIST", "TRUE", "FALSE", "THIS", "SUPER", "ARROW", 
			"GREATER_THAN", "LESS_THAN", "NOT_EQUAL", "EQUAL", "MULT", "DIVIDE", 
			"MOD", "PLUS", "MINUS", "AND", "OR", "NOT", "QUESTION_MARK", "ASSIGN", 
			"INCREASE", "DECREASE", "LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0161\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66"+
		"\7\66\u013c\n\66\f\66\16\66\u013f\13\66\5\66\u0141\n\66\3\67\3\67\7\67"+
		"\u0145\n\67\f\67\16\67\u0148\13\67\38\38\78\u014c\n8\f8\168\u014f\138"+
		"\38\38\39\39\39\39\79\u0157\n9\f9\169\u015a\139\39\39\3:\3:\3:\3:\2\2"+
		";\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;\3\2\t\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\4\2\f\f\17"+
		"\17\5\2\13\f\17\17\"\"\2\u0165\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3"+
		"\2\2\2\5y\3\2\2\2\7\u0082\3\2\2\2\t\u0088\3\2\2\2\13\u008e\3\2\2\2\r\u0093"+
		"\3\2\2\2\17\u0097\3\2\2\2\21\u00a0\3\2\2\2\23\u00a6\3\2\2\2\25\u00ad\3"+
		"\2\2\2\27\u00b5\3\2\2\2\31\u00b8\3\2\2\2\33\u00bc\3\2\2\2\35\u00bf\3\2"+
		"\2\2\37\u00c4\3\2\2\2!\u00c9\3\2\2\2#\u00d0\3\2\2\2%\u00d4\3\2\2\2\'\u00d9"+
		"\3\2\2\2)\u00de\3\2\2\2+\u00e3\3\2\2\2-\u00e8\3\2\2\2/\u00ee\3\2\2\2\61"+
		"\u00f3\3\2\2\2\63\u00f9\3\2\2\2\65\u00fc\3\2\2\2\67\u00fe\3\2\2\29\u0100"+
		"\3\2\2\2;\u0103\3\2\2\2=\u0106\3\2\2\2?\u0108\3\2\2\2A\u010a\3\2\2\2C"+
		"\u010c\3\2\2\2E\u010e\3\2\2\2G\u0110\3\2\2\2I\u0113\3\2\2\2K\u0116\3\2"+
		"\2\2M\u0118\3\2\2\2O\u011a\3\2\2\2Q\u011c\3\2\2\2S\u011f\3\2\2\2U\u0122"+
		"\3\2\2\2W\u0124\3\2\2\2Y\u0126\3\2\2\2[\u0128\3\2\2\2]\u012a\3\2\2\2_"+
		"\u012c\3\2\2\2a\u012e\3\2\2\2c\u0130\3\2\2\2e\u0132\3\2\2\2g\u0134\3\2"+
		"\2\2i\u0136\3\2\2\2k\u0140\3\2\2\2m\u0142\3\2\2\2o\u0149\3\2\2\2q\u0152"+
		"\3\2\2\2s\u015d\3\2\2\2uv\7f\2\2vw\7g\2\2wx\7h\2\2x\4\3\2\2\2yz\7k\2\2"+
		"z{\7p\2\2{|\7j\2\2|}\7g\2\2}~\7t\2\2~\177\7k\2\2\177\u0080\7v\2\2\u0080"+
		"\u0081\7u\2\2\u0081\6\3\2\2\2\u0082\u0083\7e\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7c\2\2\u0085\u0086\7u\2\2\u0086\u0087\7u\2\2\u0087\b\3\2\2\2\u0088"+
		"\u0089\7r\2\2\u0089\u008a\7t\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2"+
		"\u008c\u008d\7v\2\2\u008d\n\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090\7w"+
		"\2\2\u0090\u0091\7p\2\2\u0091\u0092\7e\2\2\u0092\f\3\2\2\2\u0093\u0094"+
		"\7p\2\2\u0094\u0095\7g\2\2\u0095\u0096\7y\2\2\u0096\16\3\2\2\2\u0097\u0098"+
		"\7e\2\2\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7w\2\2\u009e\u009f\7g\2\2"+
		"\u009f\20\3\2\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7"+
		"g\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7m\2\2\u00a5\22\3\2\2\2\u00a6\u00a7"+
		"\7t\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7w\2\2\u00aa"+
		"\u00ab\7t\2\2\u00ab\u00ac\7p\2\2\u00ac\24\3\2\2\2\u00ad\u00ae\7h\2\2\u00ae"+
		"\u00af\7q\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7c\2\2"+
		"\u00b2\u00b3\7e\2\2\u00b3\u00b4\7j\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7"+
		"k\2\2\u00b6\u00b7\7p\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba"+
		"\7q\2\2\u00ba\u00bb\7t\2\2\u00bb\32\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be"+
		"\7h\2\2\u00be\34\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2"+
		"\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6"+
		"\7q\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7n\2\2\u00c8 \3\2\2\2\u00c9\u00ca"+
		"\7u\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\u00cf\7i\2\2\u00cf\"\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1"+
		"\u00d2\7p\2\2\u00d2\u00d3\7v\2\2\u00d3$\3\2\2\2\u00d4\u00d5\7x\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7f\2\2\u00d8&\3\2\2\2\u00d9"+
		"\u00da\7p\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7n\2\2"+
		"\u00dd(\3\2\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7u\2"+
		"\2\u00e1\u00e2\7v\2\2\u00e2*\3\2\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7"+
		"t\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7g\2\2\u00e7,\3\2\2\2\u00e8\u00e9"+
		"\7h\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7u\2\2\u00ec"+
		"\u00ed\7g\2\2\u00ed.\3\2\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7j\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7u\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7u\2\2\u00f4"+
		"\u00f5\7w\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7t\2\2"+
		"\u00f8\62\3\2\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb\7@\2\2\u00fb\64\3\2\2"+
		"\2\u00fc\u00fd\7@\2\2\u00fd\66\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff8\3\2\2"+
		"\2\u0100\u0101\7?\2\2\u0101\u0102\7#\2\2\u0102:\3\2\2\2\u0103\u0104\7"+
		"?\2\2\u0104\u0105\7?\2\2\u0105<\3\2\2\2\u0106\u0107\7,\2\2\u0107>\3\2"+
		"\2\2\u0108\u0109\7\61\2\2\u0109@\3\2\2\2\u010a\u010b\7\'\2\2\u010bB\3"+
		"\2\2\2\u010c\u010d\7-\2\2\u010dD\3\2\2\2\u010e\u010f\7/\2\2\u010fF\3\2"+
		"\2\2\u0110\u0111\7(\2\2\u0111\u0112\7(\2\2\u0112H\3\2\2\2\u0113\u0114"+
		"\7~\2\2\u0114\u0115\7~\2\2\u0115J\3\2\2\2\u0116\u0117\7#\2\2\u0117L\3"+
		"\2\2\2\u0118\u0119\7A\2\2\u0119N\3\2\2\2\u011a\u011b\7?\2\2\u011bP\3\2"+
		"\2\2\u011c\u011d\7-\2\2\u011d\u011e\7-\2\2\u011eR\3\2\2\2\u011f\u0120"+
		"\7/\2\2\u0120\u0121\7/\2\2\u0121T\3\2\2\2\u0122\u0123\7*\2\2\u0123V\3"+
		"\2\2\2\u0124\u0125\7+\2\2\u0125X\3\2\2\2\u0126\u0127\7]\2\2\u0127Z\3\2"+
		"\2\2\u0128\u0129\7_\2\2\u0129\\\3\2\2\2\u012a\u012b\7}\2\2\u012b^\3\2"+
		"\2\2\u012c\u012d\7\177\2\2\u012d`\3\2\2\2\u012e\u012f\7%\2\2\u012fb\3"+
		"\2\2\2\u0130\u0131\7.\2\2\u0131d\3\2\2\2\u0132\u0133\7\60\2\2\u0133f\3"+
		"\2\2\2\u0134\u0135\7<\2\2\u0135h\3\2\2\2\u0136\u0137\7=\2\2\u0137j\3\2"+
		"\2\2\u0138\u0141\7\62\2\2\u0139\u013d\t\2\2\2\u013a\u013c\t\3\2\2\u013b"+
		"\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0138\3\2\2\2\u0140"+
		"\u0139\3\2\2\2\u0141l\3\2\2\2\u0142\u0146\t\4\2\2\u0143\u0145\t\5\2\2"+
		"\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147n\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014d\7$\2\2\u014a\u014c"+
		"\n\6\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7$"+
		"\2\2\u0151p\3\2\2\2\u0152\u0153\7\61\2\2\u0153\u0154\7\61\2\2\u0154\u0158"+
		"\3\2\2\2\u0155\u0157\n\7\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015b\u015c\b9\2\2\u015cr\3\2\2\2\u015d\u015e\t\b\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0160\b:\2\2\u0160t\3\2\2\2\b\2\u013d\u0140\u0146\u014d"+
		"\u0158\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}