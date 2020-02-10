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
		Attributes=1, SkipRule=2, GRAMMAR=3, FRAGMENT=4, SKIP_=5, LPARENTHESIS=6, 
		RPARENTHESIS=7, LBRACKET=8, RBRACKET=9, LBRACE=10, RBRACE=11, PARSER_IDENTIFIER=12, 
		LEXER_IDENTIFIER=13, Identifier=14, CountMark=15, APOSTROPHE=16, SEMICOLON=17, 
		COLON=18, OR=19, QUESTION=20, STAR=21, PLUS=22, ARROW=23, WS=24, SemanticRules=25, 
		LexerLiteral=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Attributes", "SkipRule", "GRAMMAR", "FRAGMENT", "SKIP_", "LPARENTHESIS", 
			"RPARENTHESIS", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "PARSER_IDENTIFIER", 
			"LEXER_IDENTIFIER", "Identifier", "CountMark", "UppercaseLetter", "LowercaseLetter", 
			"Letter", "String", "APOSTROPHE", "SEMICOLON", "COLON", "OR", "QUESTION", 
			"STAR", "PLUS", "ARROW", "WS", "SemanticRules", "LexerLiteral", "LITERAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'grammar'", "'fragment'", "'skip'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", null, null, null, null, "'''", "';'", "':'", 
			"'|'", "'?'", "'*'", "'+'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Attributes", "SkipRule", "GRAMMAR", "FRAGMENT", "SKIP_", "LPARENTHESIS", 
			"RPARENTHESIS", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "PARSER_IDENTIFIER", 
			"LEXER_IDENTIFIER", "Identifier", "CountMark", "APOSTROPHE", "SEMICOLON", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\6\2D\n\2\r\2\16\2E\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\6\3V\n\3\r\3\16\3W\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\5\17\u0087\n\17\3\20\3\20\3\20\5\20\u008c\n\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\5\23\u0095\n\23\3\24\7\24\u0098\n\24\f\24"+
		"\16\24\u009b\13\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\6\35\u00af\n\35\r\35\16\35\u00b0"+
		"\3\35\3\35\3\36\3\36\6\36\u00b7\n\36\r\36\16\36\u00b8\3\36\3\36\3\37\3"+
		"\37\6\37\u00bf\n\37\r\37\16\37\u00c0\3\37\3\37\3 \3 \4\u00b8\u00c0\2!"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\2#\2%\2\'\2)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34"+
		"?\2\3\2\5\3\2C\\\3\2c|\5\2\13\f\16\17\"\"\2\u00cc\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\3A\3\2\2\2\5P\3\2\2\2\7\\\3\2\2\2\td\3\2\2\2\13m"+
		"\3\2\2\2\rr\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27"+
		"|\3\2\2\2\31~\3\2\2\2\33\u0081\3\2\2\2\35\u0086\3\2\2\2\37\u008b\3\2\2"+
		"\2!\u008d\3\2\2\2#\u008f\3\2\2\2%\u0094\3\2\2\2\'\u0099\3\2\2\2)\u009c"+
		"\3\2\2\2+\u009e\3\2\2\2-\u00a0\3\2\2\2/\u00a2\3\2\2\2\61\u00a4\3\2\2\2"+
		"\63\u00a6\3\2\2\2\65\u00a8\3\2\2\2\67\u00aa\3\2\2\29\u00ae\3\2\2\2;\u00b4"+
		"\3\2\2\2=\u00bc\3\2\2\2?\u00c4\3\2\2\2AK\5\25\13\2BD\5? \2CB\3\2\2\2D"+
		"E\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\5+\26\2HJ\3\2\2\2IC\3\2\2\2"+
		"JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\5\27\f\2O\4\3\2\2"+
		"\2PQ\5\13\6\2QR\5\33\16\2RS\5-\27\2SU\5\21\t\2TV\5? \2UT\3\2\2\2VW\3\2"+
		"\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\5\23\n\2Z[\5+\26\2[\6\3\2\2\2\\]"+
		"\7i\2\2]^\7t\2\2^_\7c\2\2_`\7o\2\2`a\7o\2\2ab\7c\2\2bc\7t\2\2c\b\3\2\2"+
		"\2de\7h\2\2ef\7t\2\2fg\7c\2\2gh\7i\2\2hi\7o\2\2ij\7g\2\2jk\7p\2\2kl\7"+
		"v\2\2l\n\3\2\2\2mn\7u\2\2no\7m\2\2op\7k\2\2pq\7r\2\2q\f\3\2\2\2rs\7*\2"+
		"\2s\16\3\2\2\2tu\7+\2\2u\20\3\2\2\2vw\7]\2\2w\22\3\2\2\2xy\7_\2\2y\24"+
		"\3\2\2\2z{\7}\2\2{\26\3\2\2\2|}\7\177\2\2}\30\3\2\2\2~\177\5#\22\2\177"+
		"\u0080\5\'\24\2\u0080\32\3\2\2\2\u0081\u0082\5!\21\2\u0082\u0083\5\'\24"+
		"\2\u0083\34\3\2\2\2\u0084\u0087\5\33\16\2\u0085\u0087\5\31\r\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0085\3\2\2\2\u0087\36\3\2\2\2\u0088\u008c\5\61\31\2\u0089"+
		"\u008c\5\63\32\2\u008a\u008c\5\65\33\2\u008b\u0088\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008a\3\2\2\2\u008c \3\2\2\2\u008d\u008e\t\2\2\2\u008e"+
		"\"\3\2\2\2\u008f\u0090\t\3\2\2\u0090$\3\2\2\2\u0091\u0095\5#\22\2\u0092"+
		"\u0095\5!\21\2\u0093\u0095\7a\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0093\3\2\2\2\u0095&\3\2\2\2\u0096\u0098\5%\23\2\u0097\u0096"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"(\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7)\2\2\u009d*\3\2\2\2\u009e"+
		"\u009f\7=\2\2\u009f,\3\2\2\2\u00a0\u00a1\7<\2\2\u00a1.\3\2\2\2\u00a2\u00a3"+
		"\7~\2\2\u00a3\60\3\2\2\2\u00a4\u00a5\7A\2\2\u00a5\62\3\2\2\2\u00a6\u00a7"+
		"\7,\2\2\u00a7\64\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9\66\3\2\2\2\u00aa\u00ab"+
		"\7/\2\2\u00ab\u00ac\7@\2\2\u00ac8\3\2\2\2\u00ad\u00af\t\4\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\b\35\2\2\u00b3:\3\2\2\2\u00b4\u00b6\5\25\13"+
		"\2\u00b5\u00b7\5? \2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\5\27\f\2"+
		"\u00bb<\3\2\2\2\u00bc\u00be\5)\25\2\u00bd\u00bf\5? \2\u00be\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\5)\25\2\u00c3>\3\2\2\2\u00c4\u00c5\13\2\2\2"+
		"\u00c5@\3\2\2\2\r\2EKW\u0086\u008b\u0094\u0099\u00b0\u00b8\u00c0\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}