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
		GRAMMAR=1, FRAGMENT=2, SKIP_=3, LPARENTHESIS=4, RPARENTHESIS=5, LBRACKET=6, 
		RBRACKET=7, LBRACE=8, RBRACE=9, APOSTROPHE=10, SEMICOLON=11, COLON=12, 
		OR=13, QUESTION=14, STAR=15, PLUS=16, ARROW=17, LSIGN=18, GSIGN=19, WS=20, 
		PARSER_IDENTIFIER=21, LEXER_IDENTIFIER=22, Identifier=23, CountMark=24, 
		InheritedRules=25, SemanticRules=26, LexerLiteral=27, LITERAL=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GRAMMAR", "FRAGMENT", "SKIP_", "LPARENTHESIS", "RPARENTHESIS", "LBRACKET", 
			"RBRACKET", "LBRACE", "RBRACE", "APOSTROPHE", "SEMICOLON", "COLON", "OR", 
			"QUESTION", "STAR", "PLUS", "ARROW", "LSIGN", "GSIGN", "WS", "PARSER_IDENTIFIER", 
			"LEXER_IDENTIFIER", "Identifier", "CountMark", "UppercaseLetter", "LowercaseLetter", 
			"Letter", "String", "InheritedRules", "SemanticRules", "LexerLiteral", 
			"LITERAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "'fragment'", "'skip'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'''", "';'", "':'", "'|'", "'?'", "'*'", "'+'", "'->'", 
			"'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GRAMMAR", "FRAGMENT", "SKIP_", "LPARENTHESIS", "RPARENTHESIS", 
			"LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "APOSTROPHE", "SEMICOLON", 
			"COLON", "OR", "QUESTION", "STAR", "PLUS", "ARROW", "LSIGN", "GSIGN", 
			"WS", "PARSER_IDENTIFIER", "LEXER_IDENTIFIER", "Identifier", "CountMark", 
			"InheritedRules", "SemanticRules", "LexerLiteral", "LITERAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00c3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25|\n\25\r\25\16\25}\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\5\30\u008a\n\30\3\31\3\31"+
		"\3\31\5\31\u008f\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\5\34\u0098\n"+
		"\34\3\35\7\35\u009b\n\35\f\35\16\35\u009e\13\35\3\36\3\36\7\36\u00a2\n"+
		"\36\f\36\16\36\u00a5\13\36\3\36\3\36\3\37\3\37\7\37\u00ab\n\37\f\37\16"+
		"\37\u00ae\13\37\3\37\3\37\3 \3 \7 \u00b4\n \f \16 \u00b7\13 \3 \3 \3!"+
		"\3!\7!\u00bd\n!\f!\16!\u00c0\13!\3!\3!\6\u00a3\u00ac\u00b5\u00be\2\"\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\29\2;\33=\34?"+
		"\35A\36\3\2\5\5\2\13\f\16\17\"\"\3\2C\\\3\2c|\2\u00c9\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5K\3\2\2\2\7T\3"+
		"\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3"+
		"\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37"+
		"o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%v\3\2\2\2\'x\3\2\2\2){\3\2\2\2+\u0081\3"+
		"\2\2\2-\u0084\3\2\2\2/\u0089\3\2\2\2\61\u008e\3\2\2\2\63\u0090\3\2\2\2"+
		"\65\u0092\3\2\2\2\67\u0097\3\2\2\29\u009c\3\2\2\2;\u009f\3\2\2\2=\u00a8"+
		"\3\2\2\2?\u00b1\3\2\2\2A\u00ba\3\2\2\2CD\7i\2\2DE\7t\2\2EF\7c\2\2FG\7"+
		"o\2\2GH\7o\2\2HI\7c\2\2IJ\7t\2\2J\4\3\2\2\2KL\7h\2\2LM\7t\2\2MN\7c\2\2"+
		"NO\7i\2\2OP\7o\2\2PQ\7g\2\2QR\7p\2\2RS\7v\2\2S\6\3\2\2\2TU\7u\2\2UV\7"+
		"m\2\2VW\7k\2\2WX\7r\2\2X\b\3\2\2\2YZ\7*\2\2Z\n\3\2\2\2[\\\7+\2\2\\\f\3"+
		"\2\2\2]^\7]\2\2^\16\3\2\2\2_`\7_\2\2`\20\3\2\2\2ab\7}\2\2b\22\3\2\2\2"+
		"cd\7\177\2\2d\24\3\2\2\2ef\7)\2\2f\26\3\2\2\2gh\7=\2\2h\30\3\2\2\2ij\7"+
		"<\2\2j\32\3\2\2\2kl\7~\2\2l\34\3\2\2\2mn\7A\2\2n\36\3\2\2\2op\7,\2\2p"+
		" \3\2\2\2qr\7-\2\2r\"\3\2\2\2st\7/\2\2tu\7@\2\2u$\3\2\2\2vw\7>\2\2w&\3"+
		"\2\2\2xy\7@\2\2y(\3\2\2\2z|\t\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\177\3\2\2\2\177\u0080\b\25\2\2\u0080*\3\2\2\2\u0081\u0082\5\65"+
		"\33\2\u0082\u0083\59\35\2\u0083,\3\2\2\2\u0084\u0085\5\63\32\2\u0085\u0086"+
		"\59\35\2\u0086.\3\2\2\2\u0087\u008a\5-\27\2\u0088\u008a\5+\26\2\u0089"+
		"\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\60\3\2\2\2\u008b\u008f\5\35\17"+
		"\2\u008c\u008f\5\37\20\2\u008d\u008f\5!\21\2\u008e\u008b\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\62\3\2\2\2\u0090\u0091\t\3\2"+
		"\2\u0091\64\3\2\2\2\u0092\u0093\t\4\2\2\u0093\66\3\2\2\2\u0094\u0098\5"+
		"\65\33\2\u0095\u0098\5\63\32\2\u0096\u0098\7a\2\2\u0097\u0094\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u00988\3\2\2\2\u0099\u009b\5"+
		"\67\34\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d:\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a3\5%\23\2"+
		"\u00a0\u00a2\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\5\'\24\2\u00a7<\3\2\2\2\u00a8\u00ac\5\21\t\2\u00a9\u00ab\13\2\2"+
		"\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\5\23\n\2"+
		"\u00b0>\3\2\2\2\u00b1\u00b5\5\25\13\2\u00b2\u00b4\13\2\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\5\25\13\2\u00b9@\3\2\2"+
		"\2\u00ba\u00be\5\r\7\2\u00bb\u00bd\13\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\5\17\b\2\u00c2B\3\2\2\2\f\2}\u0089"+
		"\u008e\u0097\u009c\u00a3\u00ac\u00b5\u00be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}