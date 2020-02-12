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
		LBRACKET=7, RBRACKET=8, LBRACE=9, RBRACE=10, PARSER_IDENTIFIER=11, LEXER_IDENTIFIER=12, 
		Identifier=13, CountMark=14, APOSTROPHE=15, SEMICOLON=16, COLON=17, OR=18, 
		QUESTION=19, STAR=20, PLUS=21, ARROW=22, WS=23, InheritedRules=24, SemanticRules=25, 
		LexerLiteral=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SkipRule", "GRAMMAR", "FRAGMENT", "SKIP_", "LPARENTHESIS", "RPARENTHESIS", 
			"LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "PARSER_IDENTIFIER", "LEXER_IDENTIFIER", 
			"Identifier", "CountMark", "UppercaseLetter", "LowercaseLetter", "Letter", 
			"String", "APOSTROPHE", "SEMICOLON", "COLON", "OR", "QUESTION", "STAR", 
			"PLUS", "ARROW", "WS", "InheritedRules", "SemanticRules", "LexerLiteral", 
			"LITERAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'grammar'", "'fragment'", "'skip'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", null, null, null, null, "'''", "';'", "':'", "'|'", 
			"'?'", "'*'", "'+'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SkipRule", "GRAMMAR", "FRAGMENT", "SKIP_", "LPARENTHESIS", "RPARENTHESIS", 
			"LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "PARSER_IDENTIFIER", "LEXER_IDENTIFIER", 
			"Identifier", "CountMark", "APOSTROPHE", "SEMICOLON", "COLON", "OR", 
			"QUESTION", "STAR", "PLUS", "ARROW", "WS", "InheritedRules", "SemanticRules", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00c1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\2\3\2\3\2\6\2G\n\2\r\2\16\2H\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\5\16x\n\16\3\17\3\17\3\17\5\17}\n\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\5\22\u0086\n\22\3\23\7\23\u0089\n\23\f\23\16\23\u008c"+
		"\13\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\6\34\u00a0\n\34\r\34\16\34\u00a1\3\34\3\34\3"+
		"\35\3\35\7\35\u00a8\n\35\f\35\16\35\u00ab\13\35\3\35\3\35\3\36\3\36\7"+
		"\36\u00b1\n\36\f\36\16\36\u00b4\13\36\3\36\3\36\3\37\3\37\6\37\u00ba\n"+
		"\37\r\37\16\37\u00bb\3\37\3\37\3 \3 \5\u00a9\u00b2\u00bb\2!\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\2"+
		"%\2\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\2\3\2\5"+
		"\3\2C\\\3\2c|\5\2\13\f\16\17\"\"\2\u00c6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\3A\3\2\2\2\5M\3\2\2\2\7U\3\2\2\2\t^\3\2\2\2\13c\3\2\2\2\r"+
		"e\3\2\2\2\17g\3\2\2\2\21i\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2"+
		"\31r\3\2\2\2\33w\3\2\2\2\35|\3\2\2\2\37~\3\2\2\2!\u0080\3\2\2\2#\u0085"+
		"\3\2\2\2%\u008a\3\2\2\2\'\u008d\3\2\2\2)\u008f\3\2\2\2+\u0091\3\2\2\2"+
		"-\u0093\3\2\2\2/\u0095\3\2\2\2\61\u0097\3\2\2\2\63\u0099\3\2\2\2\65\u009b"+
		"\3\2\2\2\67\u009f\3\2\2\29\u00a5\3\2\2\2;\u00ae\3\2\2\2=\u00b7\3\2\2\2"+
		"?\u00bf\3\2\2\2AB\5\t\5\2BC\5\31\r\2CD\5+\26\2DF\5\17\b\2EG\5? \2FE\3"+
		"\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\5\21\t\2KL\5)\25\2L\4"+
		"\3\2\2\2MN\7i\2\2NO\7t\2\2OP\7c\2\2PQ\7o\2\2QR\7o\2\2RS\7c\2\2ST\7t\2"+
		"\2T\6\3\2\2\2UV\7h\2\2VW\7t\2\2WX\7c\2\2XY\7i\2\2YZ\7o\2\2Z[\7g\2\2[\\"+
		"\7p\2\2\\]\7v\2\2]\b\3\2\2\2^_\7u\2\2_`\7m\2\2`a\7k\2\2ab\7r\2\2b\n\3"+
		"\2\2\2cd\7*\2\2d\f\3\2\2\2ef\7+\2\2f\16\3\2\2\2gh\7]\2\2h\20\3\2\2\2i"+
		"j\7_\2\2j\22\3\2\2\2kl\7}\2\2l\24\3\2\2\2mn\7\177\2\2n\26\3\2\2\2op\5"+
		"!\21\2pq\5%\23\2q\30\3\2\2\2rs\5\37\20\2st\5%\23\2t\32\3\2\2\2ux\5\31"+
		"\r\2vx\5\27\f\2wu\3\2\2\2wv\3\2\2\2x\34\3\2\2\2y}\5/\30\2z}\5\61\31\2"+
		"{}\5\63\32\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\36\3\2\2\2~\177\t\2\2\2\177"+
		" \3\2\2\2\u0080\u0081\t\3\2\2\u0081\"\3\2\2\2\u0082\u0086\5!\21\2\u0083"+
		"\u0086\5\37\20\2\u0084\u0086\7a\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0084\3\2\2\2\u0086$\3\2\2\2\u0087\u0089\5#\22\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"&\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7)\2\2\u008e(\3\2\2\2\u008f"+
		"\u0090\7=\2\2\u0090*\3\2\2\2\u0091\u0092\7<\2\2\u0092,\3\2\2\2\u0093\u0094"+
		"\7~\2\2\u0094.\3\2\2\2\u0095\u0096\7A\2\2\u0096\60\3\2\2\2\u0097\u0098"+
		"\7,\2\2\u0098\62\3\2\2\2\u0099\u009a\7-\2\2\u009a\64\3\2\2\2\u009b\u009c"+
		"\7/\2\2\u009c\u009d\7@\2\2\u009d\66\3\2\2\2\u009e\u00a0\t\4\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\34\2\2\u00a48\3\2\2\2\u00a5\u00a9"+
		"\5\17\b\2\u00a6\u00a8\13\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00ad\5\17\b\2\u00ad:\3\2\2\2\u00ae\u00b2\5\23\n\2\u00af"+
		"\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b6\5\25\13\2\u00b6<\3\2\2\2\u00b7\u00b9\5\'\24\2\u00b8\u00ba\5? \2"+
		"\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\5\'\24\2\u00be>\3\2\2\2\u00bf"+
		"\u00c0\13\2\2\2\u00c0@\3\2\2\2\f\2Hw|\u0085\u008a\u00a1\u00a9\u00b2\u00bb"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}