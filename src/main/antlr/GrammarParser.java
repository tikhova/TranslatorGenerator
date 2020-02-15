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
		GRAMMAR=1, FRAGMENT=2, SKIP_=3, LPARENTHESIS=4, RPARENTHESIS=5, LBRACKET=6, 
		RBRACKET=7, LBRACE=8, RBRACE=9, APOSTROPHE=10, SEMICOLON=11, COLON=12, 
		OR=13, QUESTION=14, STAR=15, PLUS=16, ARROW=17, LSIGN=18, GSIGN=19, WS=20, 
		PARSER_IDENTIFIER=21, LEXER_IDENTIFIER=22, Identifier=23, CountMark=24, 
		InheritedRules=25, SemanticRules=26, LexerLiteral=27, LITERAL=28;
	public static final int
		RULE_grammar_ = 0, RULE_rule_ = 1, RULE_skipRule = 2, RULE_parsingRule = 3, 
		RULE_parsingAtom = 4, RULE_parsingRuleOptions = 5, RULE_lexingRule = 6, 
		RULE_lexingAtom = 7, RULE_lexingRuleOptions = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"grammar_", "rule_", "skipRule", "parsingRule", "parsingAtom", "parsingRuleOptions", 
			"lexingRule", "lexingAtom", "lexingRuleOptions"
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
		public TerminalNode SemanticRules() { return getToken(GrammarParser.SemanticRules, 0); }
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
			setState(18);
			match(GRAMMAR);
			setState(19);
			match(LEXER_IDENTIFIER);
			setState(20);
			match(SEMICOLON);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemanticRules) {
				{
				setState(21);
				match(SemanticRules);
				}
			}

			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIP_) | (1L << PARSER_IDENTIFIER) | (1L << LEXER_IDENTIFIER))) != 0)) {
				{
				{
				setState(24);
				rule_();
				}
				}
				setState(29);
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
		public SkipRuleContext skipRule() {
			return getRuleContext(SkipRuleContext.class,0);
		}
		public ParsingRuleContext parsingRule() {
			return getRuleContext(ParsingRuleContext.class,0);
		}
		public LexingRuleContext lexingRule() {
			return getRuleContext(LexingRuleContext.class,0);
		}
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
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SKIP_:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				skipRule();
				}
				break;
			case PARSER_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				parsingRule();
				}
				break;
			case LEXER_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				lexingRule();
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

	public static class SkipRuleContext extends ParserRuleContext {
		public TerminalNode SKIP_() { return getToken(GrammarParser.SKIP_, 0); }
		public TerminalNode ARROW() { return getToken(GrammarParser.ARROW, 0); }
		public TerminalNode LITERAL() { return getToken(GrammarParser.LITERAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public SkipRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSkipRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipRuleContext skipRule() throws RecognitionException {
		SkipRuleContext _localctx = new SkipRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_skipRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(SKIP_);
			setState(36);
			match(ARROW);
			setState(37);
			match(LITERAL);
			setState(38);
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
		enterRule(_localctx, 6, RULE_parsingRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(PARSER_IDENTIFIER);
			setState(41);
			match(COLON);
			setState(42);
			parsingRuleOptions();
			setState(43);
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
		public TerminalNode InheritedRules() { return getToken(GrammarParser.InheritedRules, 0); }
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
		enterRule(_localctx, 8, RULE_parsingAtom);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARSER_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(PARSER_IDENTIFIER);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==InheritedRules) {
					{
					setState(46);
					match(InheritedRules);
					}
				}

				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemanticRules) {
					{
					setState(49);
					match(SemanticRules);
					}
				}

				}
				break;
			case LEXER_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(LEXER_IDENTIFIER);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==InheritedRules) {
					{
					setState(53);
					match(InheritedRules);
					}
				}

				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemanticRules) {
					{
					setState(56);
					match(SemanticRules);
					}
				}

				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(LPARENTHESIS);
				setState(60);
				parsingAtom();
				setState(61);
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
		enterRule(_localctx, 10, RULE_parsingRuleOptions);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(65);
					parsingAtom();
					}
					}
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPARENTHESIS) | (1L << PARSER_IDENTIFIER) | (1L << LEXER_IDENTIFIER))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					parsingAtom();
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPARENTHESIS) | (1L << PARSER_IDENTIFIER) | (1L << LEXER_IDENTIFIER))) != 0) );
				setState(75);
				match(OR);
				setState(76);
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
		enterRule(_localctx, 12, RULE_lexingRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(LEXER_IDENTIFIER);
			setState(81);
			match(COLON);
			setState(82);
			lexingRuleOptions();
			setState(83);
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
		enterRule(_localctx, 14, RULE_lexingAtom);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPARENTHESIS:
			case SEMICOLON:
			case OR:
			case CountMark:
			case LexerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LexerLiteral) {
					{
					setState(85);
					match(LexerLiteral);
					}
				}

				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CountMark) {
					{
					setState(88);
					match(CountMark);
					}
				}

				}
				break;
			case LEXER_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(LEXER_IDENTIFIER);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CountMark) {
					{
					setState(92);
					match(CountMark);
					}
				}

				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(LPARENTHESIS);
				setState(96);
				lexingAtom();
				setState(97);
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
		enterRule(_localctx, 16, RULE_lexingRuleOptions);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				lexingAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				lexingAtom();
				setState(103);
				match(OR);
				setState(104);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\5\2\31\n\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\5\3$\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6\62\n\6\3\6\5\6\65\n"+
		"\6\3\6\3\6\5\69\n\6\3\6\5\6<\n\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\6\7E\n\7"+
		"\r\7\16\7F\3\7\6\7J\n\7\r\7\16\7K\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\5\tY\n\t\3\t\5\t\\\n\t\3\t\3\t\5\t`\n\t\3\t\3\t\3\t\3\t\5\tf"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\5\nm\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2"+
		"\2x\2\24\3\2\2\2\4#\3\2\2\2\6%\3\2\2\2\b*\3\2\2\2\nA\3\2\2\2\fP\3\2\2"+
		"\2\16R\3\2\2\2\20e\3\2\2\2\22l\3\2\2\2\24\25\7\3\2\2\25\26\7\30\2\2\26"+
		"\30\7\r\2\2\27\31\7\34\2\2\30\27\3\2\2\2\30\31\3\2\2\2\31\35\3\2\2\2\32"+
		"\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		"\3\3\2\2\2\37\35\3\2\2\2 $\5\6\4\2!$\5\b\5\2\"$\5\16\b\2# \3\2\2\2#!\3"+
		"\2\2\2#\"\3\2\2\2$\5\3\2\2\2%&\7\5\2\2&\'\7\23\2\2\'(\7\36\2\2()\7\r\2"+
		"\2)\7\3\2\2\2*+\7\27\2\2+,\7\16\2\2,-\5\f\7\2-.\7\r\2\2.\t\3\2\2\2/\61"+
		"\7\27\2\2\60\62\7\33\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63"+
		"\65\7\34\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65B\3\2\2\2\668\7\30\2\2\679"+
		"\7\33\2\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\7\34\2\2;:\3\2\2\2;<\3\2\2"+
		"\2<B\3\2\2\2=>\7\6\2\2>?\5\n\6\2?@\7\7\2\2@B\3\2\2\2A/\3\2\2\2A\66\3\2"+
		"\2\2A=\3\2\2\2B\13\3\2\2\2CE\5\n\6\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3"+
		"\2\2\2GQ\3\2\2\2HJ\5\n\6\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3"+
		"\2\2\2MN\7\17\2\2NO\5\f\7\2OQ\3\2\2\2PD\3\2\2\2PI\3\2\2\2Q\r\3\2\2\2R"+
		"S\7\30\2\2ST\7\16\2\2TU\5\22\n\2UV\7\r\2\2V\17\3\2\2\2WY\7\35\2\2XW\3"+
		"\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\7\32\2\2[Z\3\2\2\2[\\\3\2\2\2\\f\3\2\2\2"+
		"]_\7\30\2\2^`\7\32\2\2_^\3\2\2\2_`\3\2\2\2`f\3\2\2\2ab\7\6\2\2bc\5\20"+
		"\t\2cd\7\7\2\2df\3\2\2\2eX\3\2\2\2e]\3\2\2\2ea\3\2\2\2f\21\3\2\2\2gm\5"+
		"\20\t\2hi\5\20\t\2ij\7\17\2\2jk\5\22\n\2km\3\2\2\2lg\3\2\2\2lh\3\2\2\2"+
		"m\23\3\2\2\2\22\30\35#\61\648;AFKPX[_el";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}