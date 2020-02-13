// Generated from /shared/YandexDisk/ITMO/year2019/mt/TranslatorGenerator/src/main/antlr/Grammar.g4 by ANTLR 4.8
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
		SkipRule=1, GRAMMAR=2, FRAGMENT=3, SKIP_=4, LPARENTHESIS=5, RPARENTHESIS=6, 
		LBRACKET=7, RBRACKET=8, LBRACE=9, RBRACE=10, APOSTROPHE=11, SEMICOLON=12, 
		COLON=13, OR=14, QUESTION=15, STAR=16, PLUS=17, ARROW=18, LSIGN=19, GSIGN=20, 
		WS=21, PARSER_IDENTIFIER=22, LEXER_IDENTIFIER=23, Identifier=24, CountMark=25, 
		InheritedRules=26, SemanticRules=27, LexerLiteral=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SkipRule", "GRAMMAR", "FRAGMENT", "SKIP_", "LPARENTHESIS", "RPARENTHESIS", 
			"LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "APOSTROPHE", "SEMICOLON", 
			"COLON", "OR", "QUESTION", "STAR", "PLUS", "ARROW", "LSIGN", "GSIGN", 
			"WS", "PARSER_IDENTIFIER", "LEXER_IDENTIFIER", "Identifier", "CountMark", 
			"UppercaseLetter", "LowercaseLetter", "Letter", "String", "InheritedRules", 
			"SemanticRules", "LexerLiteral", "LITERAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'grammar'", "'fragment'", "'skip'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'''", "';'", "':'", "'|'", "'?'", "'*'", "'+'", 
			"'->'", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SkipRule", "GRAMMAR", "FRAGMENT", "SKIP_", "LPARENTHESIS", "RPARENTHESIS", 
			"LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "APOSTROPHE", "SEMICOLON", 
			"COLON", "OR", "QUESTION", "STAR", "PLUS", "ARROW", "LSIGN", "GSIGN", 
			"WS", "PARSER_IDENTIFIER", "LEXER_IDENTIFIER", "Identifier", "CountMark", 
			"InheritedRules", "SemanticRules", "LexerLiteral"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00c9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\6\2K\n\2\r\2\16\2L\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\6\26\u008a\n\26\r\26\16\26\u008b\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\5\31\u0098\n\31\3\32\3\32"+
		"\3\32\5\32\u009d\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\5\35\u00a6\n"+
		"\35\3\36\7\36\u00a9\n\36\f\36\16\36\u00ac\13\36\3\37\3\37\7\37\u00b0\n"+
		"\37\f\37\16\37\u00b3\13\37\3\37\3\37\3 \3 \7 \u00b9\n \f \16 \u00bc\13"+
		" \3 \3 \3!\3!\6!\u00c2\n!\r!\16!\u00c3\3!\3!\3\"\3\"\5\u00b1\u00ba\u00c3"+
		"\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\2\67\29\2;\2"+
		"=\34?\35A\36C\2\3\2\5\5\2\13\f\16\17\"\"\3\2C\\\3\2c|\2\u00ce\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3E\3\2\2\2\5Q\3\2"+
		"\2\2\7Y\3\2\2\2\tb\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21m\3\2"+
		"\2\2\23o\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2\31u\3\2\2\2\33w\3\2\2\2\35y\3"+
		"\2\2\2\37{\3\2\2\2!}\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0084\3\2\2"+
		"\2)\u0086\3\2\2\2+\u0089\3\2\2\2-\u008f\3\2\2\2/\u0092\3\2\2\2\61\u0097"+
		"\3\2\2\2\63\u009c\3\2\2\2\65\u009e\3\2\2\2\67\u00a0\3\2\2\29\u00a5\3\2"+
		"\2\2;\u00aa\3\2\2\2=\u00ad\3\2\2\2?\u00b6\3\2\2\2A\u00bf\3\2\2\2C\u00c7"+
		"\3\2\2\2EF\5\t\5\2FG\5/\30\2GH\5\33\16\2HJ\5\17\b\2IK\5C\"\2JI\3\2\2\2"+
		"KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\5\21\t\2OP\5\31\r\2P\4\3\2"+
		"\2\2QR\7i\2\2RS\7t\2\2ST\7c\2\2TU\7o\2\2UV\7o\2\2VW\7c\2\2WX\7t\2\2X\6"+
		"\3\2\2\2YZ\7h\2\2Z[\7t\2\2[\\\7c\2\2\\]\7i\2\2]^\7o\2\2^_\7g\2\2_`\7p"+
		"\2\2`a\7v\2\2a\b\3\2\2\2bc\7u\2\2cd\7m\2\2de\7k\2\2ef\7r\2\2f\n\3\2\2"+
		"\2gh\7*\2\2h\f\3\2\2\2ij\7+\2\2j\16\3\2\2\2kl\7]\2\2l\20\3\2\2\2mn\7_"+
		"\2\2n\22\3\2\2\2op\7}\2\2p\24\3\2\2\2qr\7\177\2\2r\26\3\2\2\2st\7)\2\2"+
		"t\30\3\2\2\2uv\7=\2\2v\32\3\2\2\2wx\7<\2\2x\34\3\2\2\2yz\7~\2\2z\36\3"+
		"\2\2\2{|\7A\2\2| \3\2\2\2}~\7,\2\2~\"\3\2\2\2\177\u0080\7-\2\2\u0080$"+
		"\3\2\2\2\u0081\u0082\7/\2\2\u0082\u0083\7@\2\2\u0083&\3\2\2\2\u0084\u0085"+
		"\7>\2\2\u0085(\3\2\2\2\u0086\u0087\7@\2\2\u0087*\3\2\2\2\u0088\u008a\t"+
		"\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\26\2\2\u008e,\3\2\2\2"+
		"\u008f\u0090\5\67\34\2\u0090\u0091\5;\36\2\u0091.\3\2\2\2\u0092\u0093"+
		"\5\65\33\2\u0093\u0094\5;\36\2\u0094\60\3\2\2\2\u0095\u0098\5/\30\2\u0096"+
		"\u0098\5-\27\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\62\3\2\2"+
		"\2\u0099\u009d\5\37\20\2\u009a\u009d\5!\21\2\u009b\u009d\5#\22\2\u009c"+
		"\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\64\3\2\2"+
		"\2\u009e\u009f\t\3\2\2\u009f\66\3\2\2\2\u00a0\u00a1\t\4\2\2\u00a18\3\2"+
		"\2\2\u00a2\u00a6\5\67\34\2\u00a3\u00a6\5\65\33\2\u00a4\u00a6\7a\2\2\u00a5"+
		"\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6:\3\2\2\2"+
		"\u00a7\u00a9\59\35\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab<\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b1\5\'\24\2\u00ae\u00b0\13\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\5)\25\2\u00b5>\3\2\2\2\u00b6\u00ba\5\23\n\2"+
		"\u00b7\u00b9\13\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00be\5\25\13\2\u00be@\3\2\2\2\u00bf\u00c1\5\27\f\2\u00c0\u00c2\5C\""+
		"\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\5\27\f\2\u00c6B\3\2\2\2\u00c7"+
		"\u00c8\13\2\2\2\u00c8D\3\2\2\2\f\2L\u008b\u0097\u009c\u00a5\u00aa\u00b1"+
		"\u00ba\u00c3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}