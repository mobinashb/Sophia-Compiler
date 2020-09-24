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
		DEF=1, EXTENDS=2, CLASS=3, PRINT=4, FUNC=5, NEW=6, CONTINUE=7, BREAK=8, 
		RETURN=9, FOREACH=10, IN=11, FOR=12, IF=13, ELSE=14, BOOLEAN=15, STRING=16, 
		INT=17, VOID=18, NULL=19, LIST=20, TRUE=21, FALSE=22, THIS=23, SUPER=24, 
		ARROW=25, GREATER_THAN=26, LESS_THAN=27, NOT_EQUAL=28, EQUAL=29, MULT=30, 
		DIVIDE=31, MOD=32, PLUS=33, MINUS=34, AND=35, OR=36, NOT=37, QUESTION_MARK=38, 
		ASSIGN=39, INCREMENT=40, DECREMENT=41, LPAR=42, RPAR=43, LBRACK=44, RBRACK=45, 
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
			"DEF", "EXTENDS", "CLASS", "PRINT", "FUNC", "NEW", "CONTINUE", "BREAK", 
			"RETURN", "FOREACH", "IN", "FOR", "IF", "ELSE", "BOOLEAN", "STRING", 
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
			null, "'def'", "'extends'", "'class'", "'print'", "'func'", "'new'", 
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
			null, "DEF", "EXTENDS", "CLASS", "PRINT", "FUNC", "NEW", "CONTINUE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0160\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\7"+
		"\66\u013b\n\66\f\66\16\66\u013e\13\66\5\66\u0140\n\66\3\67\3\67\7\67\u0144"+
		"\n\67\f\67\16\67\u0147\13\67\38\38\78\u014b\n8\f8\168\u014e\138\38\38"+
		"\39\39\39\39\79\u0156\n9\f9\169\u0159\139\39\39\3:\3:\3:\3:\2\2;\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";\3\2\t\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\2\u0164\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2"+
		"\2\2\5y\3\2\2\2\7\u0081\3\2\2\2\t\u0087\3\2\2\2\13\u008d\3\2\2\2\r\u0092"+
		"\3\2\2\2\17\u0096\3\2\2\2\21\u009f\3\2\2\2\23\u00a5\3\2\2\2\25\u00ac\3"+
		"\2\2\2\27\u00b4\3\2\2\2\31\u00b7\3\2\2\2\33\u00bb\3\2\2\2\35\u00be\3\2"+
		"\2\2\37\u00c3\3\2\2\2!\u00c8\3\2\2\2#\u00cf\3\2\2\2%\u00d3\3\2\2\2\'\u00d8"+
		"\3\2\2\2)\u00dd\3\2\2\2+\u00e2\3\2\2\2-\u00e7\3\2\2\2/\u00ed\3\2\2\2\61"+
		"\u00f2\3\2\2\2\63\u00f8\3\2\2\2\65\u00fb\3\2\2\2\67\u00fd\3\2\2\29\u00ff"+
		"\3\2\2\2;\u0102\3\2\2\2=\u0105\3\2\2\2?\u0107\3\2\2\2A\u0109\3\2\2\2C"+
		"\u010b\3\2\2\2E\u010d\3\2\2\2G\u010f\3\2\2\2I\u0112\3\2\2\2K\u0115\3\2"+
		"\2\2M\u0117\3\2\2\2O\u0119\3\2\2\2Q\u011b\3\2\2\2S\u011e\3\2\2\2U\u0121"+
		"\3\2\2\2W\u0123\3\2\2\2Y\u0125\3\2\2\2[\u0127\3\2\2\2]\u0129\3\2\2\2_"+
		"\u012b\3\2\2\2a\u012d\3\2\2\2c\u012f\3\2\2\2e\u0131\3\2\2\2g\u0133\3\2"+
		"\2\2i\u0135\3\2\2\2k\u013f\3\2\2\2m\u0141\3\2\2\2o\u0148\3\2\2\2q\u0151"+
		"\3\2\2\2s\u015c\3\2\2\2uv\7f\2\2vw\7g\2\2wx\7h\2\2x\4\3\2\2\2yz\7g\2\2"+
		"z{\7z\2\2{|\7v\2\2|}\7g\2\2}~\7p\2\2~\177\7f\2\2\177\u0080\7u\2\2\u0080"+
		"\6\3\2\2\2\u0081\u0082\7e\2\2\u0082\u0083\7n\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7u\2\2\u0085\u0086\7u\2\2\u0086\b\3\2\2\2\u0087\u0088\7r\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2"+
		"\u008c\n\3\2\2\2\u008d\u008e\7h\2\2\u008e\u008f\7w\2\2\u008f\u0090\7p"+
		"\2\2\u0090\u0091\7e\2\2\u0091\f\3\2\2\2\u0092\u0093\7p\2\2\u0093\u0094"+
		"\7g\2\2\u0094\u0095\7y\2\2\u0095\16\3\2\2\2\u0096\u0097\7e\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7p\2\2\u009c\u009d\7w\2\2\u009d\u009e\7g\2\2\u009e\20\3\2\2\2\u009f"+
		"\u00a0\7d\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7c\2\2"+
		"\u00a3\u00a4\7m\2\2\u00a4\22\3\2\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7"+
		"g\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab"+
		"\7p\2\2\u00ab\24\3\2\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af"+
		"\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7e\2\2\u00b2"+
		"\u00b3\7j\2\2\u00b3\26\3\2\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6"+
		"\30\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7t\2\2\u00ba"+
		"\32\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7h\2\2\u00bd\34\3\2\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7g\2\2"+
		"\u00c2\36\3\2\2\2\u00c3\u00c4\7d\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7"+
		"q\2\2\u00c6\u00c7\7n\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca"+
		"\7v\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd"+
		"\u00ce\7i\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1"+
		"\u00d2\7v\2\2\u00d2$\3\2\2\2\u00d3\u00d4\7x\2\2\u00d4\u00d5\7q\2\2\u00d5"+
		"\u00d6\7k\2\2\u00d6\u00d7\7f\2\2\u00d7&\3\2\2\2\u00d8\u00d9\7p\2\2\u00d9"+
		"\u00da\7w\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7n\2\2\u00dc(\3\2\2\2\u00dd"+
		"\u00de\7n\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7v\2\2"+
		"\u00e1*\3\2\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7w\2"+
		"\2\u00e5\u00e6\7g\2\2\u00e6,\3\2\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7"+
		"c\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7g\2\2\u00ec."+
		"\3\2\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7j\2\2\u00ef\u00f0\7k\2\2\u00f0"+
		"\u00f1\7u\2\2\u00f1\60\3\2\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7w\2\2\u00f4"+
		"\u00f5\7r\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7t\2\2\u00f7\62\3\2\2\2\u00f8"+
		"\u00f9\7/\2\2\u00f9\u00fa\7@\2\2\u00fa\64\3\2\2\2\u00fb\u00fc\7@\2\2\u00fc"+
		"\66\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe8\3\2\2\2\u00ff\u0100\7?\2\2\u0100"+
		"\u0101\7#\2\2\u0101:\3\2\2\2\u0102\u0103\7?\2\2\u0103\u0104\7?\2\2\u0104"+
		"<\3\2\2\2\u0105\u0106\7,\2\2\u0106>\3\2\2\2\u0107\u0108\7\61\2\2\u0108"+
		"@\3\2\2\2\u0109\u010a\7\'\2\2\u010aB\3\2\2\2\u010b\u010c\7-\2\2\u010c"+
		"D\3\2\2\2\u010d\u010e\7/\2\2\u010eF\3\2\2\2\u010f\u0110\7(\2\2\u0110\u0111"+
		"\7(\2\2\u0111H\3\2\2\2\u0112\u0113\7~\2\2\u0113\u0114\7~\2\2\u0114J\3"+
		"\2\2\2\u0115\u0116\7#\2\2\u0116L\3\2\2\2\u0117\u0118\7A\2\2\u0118N\3\2"+
		"\2\2\u0119\u011a\7?\2\2\u011aP\3\2\2\2\u011b\u011c\7-\2\2\u011c\u011d"+
		"\7-\2\2\u011dR\3\2\2\2\u011e\u011f\7/\2\2\u011f\u0120\7/\2\2\u0120T\3"+
		"\2\2\2\u0121\u0122\7*\2\2\u0122V\3\2\2\2\u0123\u0124\7+\2\2\u0124X\3\2"+
		"\2\2\u0125\u0126\7]\2\2\u0126Z\3\2\2\2\u0127\u0128\7_\2\2\u0128\\\3\2"+
		"\2\2\u0129\u012a\7}\2\2\u012a^\3\2\2\2\u012b\u012c\7\177\2\2\u012c`\3"+
		"\2\2\2\u012d\u012e\7%\2\2\u012eb\3\2\2\2\u012f\u0130\7.\2\2\u0130d\3\2"+
		"\2\2\u0131\u0132\7\60\2\2\u0132f\3\2\2\2\u0133\u0134\7<\2\2\u0134h\3\2"+
		"\2\2\u0135\u0136\7=\2\2\u0136j\3\2\2\2\u0137\u0140\7\62\2\2\u0138\u013c"+
		"\t\2\2\2\u0139\u013b\t\3\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013f\u0137\3\2\2\2\u013f\u0138\3\2\2\2\u0140l\3\2\2\2\u0141\u0145"+
		"\t\4\2\2\u0142\u0144\t\5\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146n\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u0148\u014c\7$\2\2\u0149\u014b\n\6\2\2\u014a\u0149\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0150\7$\2\2\u0150p\3\2\2\2\u0151\u0152\7\61\2\2"+
		"\u0152\u0153\7\61\2\2\u0153\u0157\3\2\2\2\u0154\u0156\n\7\2\2\u0155\u0154"+
		"\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\b9\2\2\u015br\3\2\2\2\u015c"+
		"\u015d\t\b\2\2\u015d\u015e\3\2\2\2\u015e\u015f\b:\2\2\u015ft\3\2\2\2\b"+
		"\2\u013c\u013f\u0145\u014c\u0157\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}