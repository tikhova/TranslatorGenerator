// Generated from /shared/YandexDisk/ITMO/year2019/mt/TranslatorGenerator/src/main/antlr/Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
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
	public static final int
		RULE_grammar_ = 0, RULE_rule_ = 1, RULE_parsingRule = 2, RULE_parsingAtom = 3, 
		RULE_parsingRuleOptions = 4, RULE_lexingRule = 5, RULE_lexingAtom = 6, 
		RULE_lexingRuleOptions = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"grammar_", "rule_", "parsingRule", "parsingAtom", "parsingRuleOptions", 
			"lexingRule", "lexingAtom", "lexingRuleOptions"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Grammar_Context extends ParserRuleContext {
		public TerminalNode GRAMMAR() { return getToken(GrammarParser.GRAMMAR, 0); }
		public TerminalNode LEXER_IDENTIFIER() { return getToken(GrammarParser.LEXER_IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode Attributes() { return getToken(GrammarParser.Attributes, 0); }
		public List<Rule_Context> rule_() {
			return getRuleContexts(Rule_Context.class);
		}
		public Rule_Context rule_(int i) {
			return getRuleContext(Rule_Context.class,i);
		}
		public Grammar_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammar_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGrammar_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grammar_Context grammar_() throws RecognitionException {
		Grammar_Context _localctx = new Grammar_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammar_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(GRAMMAR);
			setState(17);
			match(LEXER_IDENTIFIER);
			setState(18);
			match(SEMICOLON);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Attributes) {
				{
				setState(19);
				match(Attributes);
				}
			}

			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SkipRule) | (1L << PARSER_IDENTIFIER) | (1L << LEXER_IDENTIFIER))) != 0)) {
				{
				{
				setState(22);
				rule_();
				}
				}
				setState(27);
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

	public static class Rule_Context extends ParserRuleContext {
		public ParsingRuleContext parsingRule() {
			return getRuleContext(ParsingRuleContext.class,0);
		}
		public LexingRuleContext lexingRule() {
			return getRuleContext(LexingRuleContext.class,0);
		}
		public TerminalNode SkipRule() { return getToken(GrammarParser.SkipRule, 0); }
		public Rule_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRule_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_Context rule_() throws RecognitionException {
		Rule_Context _localctx = new Rule_Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule_);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARSER_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				parsingRule();
				}
				break;
			case LEXER_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				lexingRule();
				}
				break;
			case SkipRule:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(SkipRule);
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

	public static class ParsingRuleContext extends ParserRuleContext {
		public TerminalNode PARSER_IDENTIFIER() { return getToken(GrammarParser.PARSER_IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public ParsingRuleOptionsContext parsingRuleOptions() {
			return getRuleContext(ParsingRuleOptionsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public ParsingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parsingRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParsingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParsingRuleContext parsingRule() throws RecognitionException {
		ParsingRuleContext _localctx = new ParsingRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parsingRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(PARSER_IDENTIFIER);
			setState(34);
			match(COLON);
			setState(35);
			parsingRuleOptions();
			setState(36);
			match(SEMICOLON);
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

	public static class ParsingAtomContext extends ParserRuleContext {
		public TerminalNode PARSER_IDENTIFIER() { return getToken(GrammarParser.PARSER_IDENTIFIER, 0); }
		public TerminalNode SemanticRules() { return getToken(GrammarParser.SemanticRules, 0); }
		public TerminalNode LEXER_IDENTIFIER() { return getToken(GrammarParser.LEXER_IDENTIFIER, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(GrammarParser.LPARENTHESIS, 0); }
		public ParsingAtomContext parsingAtom() {
			return getRuleContext(ParsingAtomContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(GrammarParser.RPARENTHESIS, 0); }
		public ParsingAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parsingAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParsingAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParsingAtomContext parsingAtom() throws RecognitionException {
		ParsingAtomContext _localctx = new ParsingAtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parsingAtom);
		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARSER_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(PARSER_IDENTIFIER);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemanticRules) {
					{
					setState(39);
					match(SemanticRules);
					}
				}

				}
				break;
			case LEXER_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(LEXER_IDENTIFIER);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemanticRules) {
					{
					setState(43);
					match(SemanticRules);
					}
				}

				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(LPARENTHESIS);
				setState(47);
				parsingAtom();
				setState(48);
				match(RPARENTHESIS);
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

	public static class ParsingRuleOptionsContext extends ParserRuleContext {
		public List<ParsingAtomContext> parsingAtom() {
			return getRuleContexts(ParsingAtomContext.class);
		}
		public ParsingAtomContext parsingAtom(int i) {
			return getRuleContext(ParsingAtomContext.class,i);
		}
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public ParsingRuleOptionsContext parsingRuleOptions() {
			return getRuleContext(ParsingRuleOptionsContext.class,0);
		}
		public ParsingRuleOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parsingRuleOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParsingRuleOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParsingRuleOptionsContext parsingRuleOptions() throws RecognitionException {
		ParsingRuleOptionsContext _localctx = new ParsingRuleOptionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parsingRuleOptions);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(52);
					parsingAtom();
					}
					}
					setState(55); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPARENTHESIS) | (1L << PARSER_IDENTIFIER) | (1L << LEXER_IDENTIFIER))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					parsingAtom();
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPARENTHESIS) | (1L << PARSER_IDENTIFIER) | (1L << LEXER_IDENTIFIER))) != 0) );
				setState(62);
				match(OR);
				setState(63);
				parsingRuleOptions();
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

	public static class LexingRuleContext extends ParserRuleContext {
		public TerminalNode LEXER_IDENTIFIER() { return getToken(GrammarParser.LEXER_IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public LexingRuleOptionsContext lexingRuleOptions() {
			return getRuleContext(LexingRuleOptionsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public LexingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexingRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLexingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexingRuleContext lexingRule() throws RecognitionException {
		LexingRuleContext _localctx = new LexingRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lexingRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LEXER_IDENTIFIER);
			setState(68);
			match(COLON);
			setState(69);
			lexingRuleOptions();
			setState(70);
			match(SEMICOLON);
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

	public static class LexingAtomContext extends ParserRuleContext {
		public TerminalNode LexerLiteral() { return getToken(GrammarParser.LexerLiteral, 0); }
		public TerminalNode CountMark() { return getToken(GrammarParser.CountMark, 0); }
		public TerminalNode LEXER_IDENTIFIER() { return getToken(GrammarParser.LEXER_IDENTIFIER, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(GrammarParser.LPARENTHESIS, 0); }
		public LexingAtomContext lexingAtom() {
			return getRuleContext(LexingAtomContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(GrammarParser.RPARENTHESIS, 0); }
		public LexingAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexingAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLexingAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexingAtomContext lexingAtom() throws RecognitionException {
		LexingAtomContext _localctx = new LexingAtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lexingAtom);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPARENTHESIS:
			case CountMark:
			case SEMICOLON:
			case OR:
			case LexerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LexerLiteral) {
					{
					setState(72);
					match(LexerLiteral);
					}
				}

				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CountMark) {
					{
					setState(75);
					match(CountMark);
					}
				}

				}
				break;
			case LEXER_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(LEXER_IDENTIFIER);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CountMark) {
					{
					setState(79);
					match(CountMark);
					}
				}

				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(LPARENTHESIS);
				setState(83);
				lexingAtom();
				setState(84);
				match(RPARENTHESIS);
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

	public static class LexingRuleOptionsContext extends ParserRuleContext {
		public LexingAtomContext lexingAtom() {
			return getRuleContext(LexingAtomContext.class,0);
		}
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public LexingRuleOptionsContext lexingRuleOptions() {
			return getRuleContext(LexingRuleOptionsContext.class,0);
		}
		public LexingRuleOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexingRuleOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLexingRuleOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexingRuleOptionsContext lexingRuleOptions() throws RecognitionException {
		LexingRuleOptionsContext _localctx = new LexingRuleOptionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lexingRuleOptions);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				lexingAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				lexingAtom();
				setState(90);
				match(OR);
				setState(91);
				lexingRuleOptions();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34b\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\5\2"+
		"\27\n\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\5\5+\n\5\3\5\3\5\5\5/\n\5\3\5\3\5\3\5\3\5\5\5\65"+
		"\n\5\3\6\6\68\n\6\r\6\16\69\3\6\6\6=\n\6\r\6\16\6>\3\6\3\6\3\6\5\6D\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\5\bL\n\b\3\b\5\bO\n\b\3\b\3\b\5\bS\n\b\3\b"+
		"\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\t\2\2\n\2\4\6\b\n"+
		"\f\16\20\2\2\2j\2\22\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b\64\3\2\2\2\nC\3\2"+
		"\2\2\fE\3\2\2\2\16X\3\2\2\2\20_\3\2\2\2\22\23\7\5\2\2\23\24\7\17\2\2\24"+
		"\26\7\23\2\2\25\27\7\3\2\2\26\25\3\2\2\2\26\27\3\2\2\2\27\33\3\2\2\2\30"+
		"\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34"+
		"\3\3\2\2\2\35\33\3\2\2\2\36\"\5\6\4\2\37\"\5\f\7\2 \"\7\4\2\2!\36\3\2"+
		"\2\2!\37\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\7\16\2\2$%\7\24\2\2%&\5\n\6\2"+
		"&\'\7\23\2\2\'\7\3\2\2\2(*\7\16\2\2)+\7\33\2\2*)\3\2\2\2*+\3\2\2\2+\65"+
		"\3\2\2\2,.\7\17\2\2-/\7\33\2\2.-\3\2\2\2./\3\2\2\2/\65\3\2\2\2\60\61\7"+
		"\b\2\2\61\62\5\b\5\2\62\63\7\t\2\2\63\65\3\2\2\2\64(\3\2\2\2\64,\3\2\2"+
		"\2\64\60\3\2\2\2\65\t\3\2\2\2\668\5\b\5\2\67\66\3\2\2\289\3\2\2\29\67"+
		"\3\2\2\29:\3\2\2\2:D\3\2\2\2;=\5\b\5\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>"+
		"?\3\2\2\2?@\3\2\2\2@A\7\25\2\2AB\5\n\6\2BD\3\2\2\2C\67\3\2\2\2C<\3\2\2"+
		"\2D\13\3\2\2\2EF\7\17\2\2FG\7\24\2\2GH\5\20\t\2HI\7\23\2\2I\r\3\2\2\2"+
		"JL\7\34\2\2KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2MO\7\21\2\2NM\3\2\2\2NO\3\2\2"+
		"\2OY\3\2\2\2PR\7\17\2\2QS\7\21\2\2RQ\3\2\2\2RS\3\2\2\2SY\3\2\2\2TU\7\b"+
		"\2\2UV\5\16\b\2VW\7\t\2\2WY\3\2\2\2XK\3\2\2\2XP\3\2\2\2XT\3\2\2\2Y\17"+
		"\3\2\2\2Z`\5\16\b\2[\\\5\16\b\2\\]\7\25\2\2]^\5\20\t\2^`\3\2\2\2_Z\3\2"+
		"\2\2_[\3\2\2\2`\21\3\2\2\2\20\26\33!*.\649>CKNRX_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}