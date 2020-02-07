// Generated from /shared/YandexDisk/ITMO/year2019/parsers/TranslatorGenerator/src/main/antlr/Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Attribute=1, Identifier=2, CountMark=3, GRAMMAR=4, FRAGMENT=5, SKIP_=6, 
		LPARENTHESIS=7, RPARENTHESIS=8, LBRACKET=9, RBRACKET=10, LBRACE=11, RBRACE=12, 
		PARSER_IDENTIFIER=13, LEXER_IDENTIFIER=14, APOSTROPHE=15, SEMICOLON=16, 
		COLON=17, OR=18, QUESTION=19, STAR=20, PLUS=21, ARROW=22, WS=23, SemanticRules=24, 
		LexerLiteral=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Attribute", "Identifier", "CountMark", "GRAMMAR", "FRAGMENT", "SKIP_", 
			"LPARENTHESIS", "RPARENTHESIS", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", 
			"PARSER_IDENTIFIER", "LEXER_IDENTIFIER", "UppercaseLetter", "LowercaseLetter", 
			"Letter", "String", "APOSTROPHE", "SEMICOLON", "COLON", "OR", "QUESTION", 
			"STAR", "PLUS", "ARROW", "WS", "SemanticRules", "LexerLiteral", "LITERAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'grammar'", "'fragment'", "'skip'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", null, null, "'''", "';'", "':'", "'|'", "'?'", 
			"'*'", "'+'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Attribute", "Identifier", "CountMark", "GRAMMAR", "FRAGMENT", 
			"SKIP_", "LPARENTHESIS", "RPARENTHESIS", "LBRACKET", "RBRACKET", "LBRACE", 
			"RBRACE", "PARSER_IDENTIFIER", "LEXER_IDENTIFIER", "APOSTROPHE", "SEMICOLON", 
			"COLON", "OR", "QUESTION", "STAR", "PLUS", "ARROW", "WS", "SemanticRules", 
			"LexerLiteral"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\6\2A\n\2\r\2\16\2B\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\5\22|\n\22\3\23\7\23\177"+
		"\n\23\f\23\16\23\u0082\13\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\6\34\u0096\n\34\r\34"+
		"\16\34\u0097\3\34\3\34\3\35\3\35\6\35\u009e\n\35\r\35\16\35\u009f\3\35"+
		"\3\35\3\36\3\36\6\36\u00a6\n\36\r\36\16\36\u00a7\3\36\3\36\3\36\3\36\6"+
		"\36\u00ae\n\36\r\36\16\36\u00af\3\36\3\36\5\36\u00b4\n\36\3\37\3\37\6"+
		"B\u009f\u00a7\u00af\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\2!\2#\2%\2\'\21)\22+\23-\24/\25\61\26\63\27\65"+
		"\30\67\319\32;\33=\2\3\2\5\3\2C\\\3\2c|\5\2\13\f\16\17\"\"\2\u00bd\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2"+
		"-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\3@\3\2\2\2\5F\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13"+
		"U\3\2\2\2\r^\3\2\2\2\17c\3\2\2\2\21e\3\2\2\2\23g\3\2\2\2\25i\3\2\2\2\27"+
		"k\3\2\2\2\31m\3\2\2\2\33o\3\2\2\2\35r\3\2\2\2\37u\3\2\2\2!w\3\2\2\2#{"+
		"\3\2\2\2%\u0080\3\2\2\2\'\u0083\3\2\2\2)\u0085\3\2\2\2+\u0087\3\2\2\2"+
		"-\u0089\3\2\2\2/\u008b\3\2\2\2\61\u008d\3\2\2\2\63\u008f\3\2\2\2\65\u0091"+
		"\3\2\2\2\67\u0095\3\2\2\29\u009b\3\2\2\2;\u00b3\3\2\2\2=\u00b5\3\2\2\2"+
		"?A\5=\37\2@?\3\2\2\2AB\3\2\2\2BC\3\2\2\2B@\3\2\2\2C\4\3\2\2\2DG\5\35\17"+
		"\2EG\5\33\16\2FD\3\2\2\2FE\3\2\2\2G\6\3\2\2\2HL\5/\30\2IL\5\61\31\2JL"+
		"\5\63\32\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2KL\3\2\2\2L\b\3\2\2\2MN\7i\2\2"+
		"NO\7t\2\2OP\7c\2\2PQ\7o\2\2QR\7o\2\2RS\7c\2\2ST\7t\2\2T\n\3\2\2\2UV\7"+
		"h\2\2VW\7t\2\2WX\7c\2\2XY\7i\2\2YZ\7o\2\2Z[\7g\2\2[\\\7p\2\2\\]\7v\2\2"+
		"]\f\3\2\2\2^_\7u\2\2_`\7m\2\2`a\7k\2\2ab\7r\2\2b\16\3\2\2\2cd\7*\2\2d"+
		"\20\3\2\2\2ef\7+\2\2f\22\3\2\2\2gh\7]\2\2h\24\3\2\2\2ij\7_\2\2j\26\3\2"+
		"\2\2kl\7}\2\2l\30\3\2\2\2mn\7\177\2\2n\32\3\2\2\2op\5!\21\2pq\5%\23\2"+
		"q\34\3\2\2\2rs\5\37\20\2st\5%\23\2t\36\3\2\2\2uv\t\2\2\2v \3\2\2\2wx\t"+
		"\3\2\2x\"\3\2\2\2y|\5!\21\2z|\5\37\20\2{y\3\2\2\2{z\3\2\2\2|$\3\2\2\2"+
		"}\177\5#\22\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081&\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7)\2\2\u0084(\3"+
		"\2\2\2\u0085\u0086\7=\2\2\u0086*\3\2\2\2\u0087\u0088\7<\2\2\u0088,\3\2"+
		"\2\2\u0089\u008a\7~\2\2\u008a.\3\2\2\2\u008b\u008c\7A\2\2\u008c\60\3\2"+
		"\2\2\u008d\u008e\7,\2\2\u008e\62\3\2\2\2\u008f\u0090\7-\2\2\u0090\64\3"+
		"\2\2\2\u0091\u0092\7/\2\2\u0092\u0093\7@\2\2\u0093\66\3\2\2\2\u0094\u0096"+
		"\t\4\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\34\2\2\u009a8\3\2\2\2"+
		"\u009b\u009d\5\27\f\2\u009c\u009e\5=\37\2\u009d\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\5\31\r\2\u00a2:\3\2\2\2\u00a3\u00a5\5\'\24\2\u00a4\u00a6\5=\37"+
		"\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5\'\24\2\u00aa\u00b4\3\2\2\2"+
		"\u00ab\u00ad\5\23\n\2\u00ac\u00ae\5=\37\2\u00ad\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\5\25\13\2\u00b2\u00b4\3\2\2\2\u00b3\u00a3\3\2\2\2\u00b3\u00ab\3"+
		"\2\2\2\u00b4<\3\2\2\2\u00b5\u00b6\13\2\2\2\u00b6>\3\2\2\2\r\2BFK{\u0080"+
		"\u0097\u009f\u00a7\u00af\u00b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}