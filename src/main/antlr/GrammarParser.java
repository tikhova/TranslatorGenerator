// Generated from /shared/YandexDisk/ITMO/year2019/parsers/TranslatorGenerator/src/main/antlr/Grammar.g4 by ANTLR 4.8
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
		Attribute=1, Identifier=2, CountMark=3, GRAMMAR=4, FRAGMENT=5, SKIP_=6, 
		LPARENTHESIS=7, RPARENTHESIS=8, LBRACKET=9, RBRACKET=10, LBRACE=11, RBRACE=12, 
		PARSER_IDENTIFIER=13, LEXER_IDENTIFIER=14, APOSTROPHE=15, SEMICOLON=16, 
		COLON=17, OR=18, QUESTION=19, STAR=20, PLUS=21, ARROW=22, WS=23, SemanticRules=24, 
		LexerLiteral=25;
	public static final int
		RULE_grammar_ = 0, RULE_attributes = 1, RULE_rule_ = 2, RULE_parsingRule = 3, 
		RULE_parsingAtom = 4, RULE_parsingRuleOptions = 5, RULE_lexingRule = 6, 
		RULE_lexingAtom = 7, RULE_lexingRuleOptions = 8, RULE_skipRule = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"grammar_", "attributes", "rule_", "parsingRule", "parsingAtom", "parsingRuleOptions", 
			"lexingRule", "lexingAtom", "lexingRuleOptions", "skipRule"
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
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
			setState(20);
			match(GRAMMAR);
			setState(21);
			match(LEXER_IDENTIFIER);
			setState(22);
			match(SEMICOLON);
			setState(23);
			attributes();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARSER_IDENTIFIER || _la==LEXER_IDENTIFIER) {
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

	public static class AttributesContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<TerminalNode> Attribute() { return getTokens(GrammarParser.Attribute); }
		public TerminalNode Attribute(int i) {
			return getToken(GrammarParser.Attribute, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammarParser.SEMICOLON, i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(LBRACE);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Attribute) {
				{
				{
				setState(31);
				match(Attribute);
				setState(32);
				match(SEMICOLON);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(RBRACE);
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
		public SkipRuleContext skipRule() {
			return getRuleContext(SkipRuleContext.class,0);
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
		enterRule(_localctx, 4, RULE_rule_);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				parsingRule();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				lexingRule();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				skipRule();
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

	public static class ParsingRuleContext extends ParserRuleContext {
		public TerminalNode PARSER_IDENTIFIER() { return getToken(GrammarParser.PARSER_IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public ParsingRuleOptionsContext parsingRuleOptions() {
			return getRuleContext(ParsingRuleOptionsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode SemanticRules() { return getToken(GrammarParser.SemanticRules, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PARSER_IDENTIFIER);
			setState(46);
			match(COLON);
			setState(47);
			parsingRuleOptions();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemanticRules) {
				{
				setState(48);
				match(SemanticRules);
				}
			}

			setState(51);
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
		public TerminalNode Identifier() { return getToken(GrammarParser.Identifier, 0); }
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
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(Identifier);
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(LPARENTHESIS);
				setState(55);
				parsingAtom();
				setState(56);
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
		public ParsingAtomContext parsingAtom() {
			return getRuleContext(ParsingAtomContext.class,0);
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
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				parsingAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				parsingAtom();
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
		enterRule(_localctx, 12, RULE_lexingRule);
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
		enterRule(_localctx, 14, RULE_lexingAtom);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LexerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(LexerLiteral);
				setState(73);
				match(CountMark);
				}
				break;
			case LEXER_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(LEXER_IDENTIFIER);
				setState(75);
				match(CountMark);
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(LPARENTHESIS);
				setState(77);
				lexingAtom();
				setState(78);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			lexingAtom();
			setState(83);
			match(OR);
			setState(84);
			lexingRuleOptions();
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
		public TerminalNode LEXER_IDENTIFIER() { return getToken(GrammarParser.LEXER_IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public LexingAtomContext lexingAtom() {
			return getRuleContext(LexingAtomContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(GrammarParser.ARROW, 0); }
		public TerminalNode SKIP_() { return getToken(GrammarParser.SKIP_, 0); }
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
		enterRule(_localctx, 18, RULE_skipRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(LEXER_IDENTIFIER);
			setState(87);
			match(COLON);
			setState(88);
			lexingAtom();
			setState(89);
			match(ARROW);
			setState(90);
			match(SKIP_);
			setState(91);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\7\3$\n\3\f"+
		"\3\16\3\'\13\3\3\3\3\3\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\5\5\64\n\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\3\7\3\7\5\7D\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tS\n\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\2\2^\2\26\3\2\2\2\4 \3\2\2\2\6-\3\2\2\2\b/\3\2\2\2\n<\3\2\2\2\f"+
		"C\3\2\2\2\16E\3\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24X\3\2\2\2\26\27\7\6\2"+
		"\2\27\30\7\20\2\2\30\31\7\22\2\2\31\35\5\4\3\2\32\34\5\6\4\2\33\32\3\2"+
		"\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37\35\3\2"+
		"\2\2 %\7\r\2\2!\"\7\3\2\2\"$\7\22\2\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%"+
		"&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\16\2\2)\5\3\2\2\2*.\5\b\5\2+.\5\16"+
		"\b\2,.\5\24\13\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\7\3\2\2\2/\60\7\17\2\2"+
		"\60\61\7\23\2\2\61\63\5\f\7\2\62\64\7\32\2\2\63\62\3\2\2\2\63\64\3\2\2"+
		"\2\64\65\3\2\2\2\65\66\7\22\2\2\66\t\3\2\2\2\67=\7\4\2\289\7\t\2\29:\5"+
		"\n\6\2:;\7\n\2\2;=\3\2\2\2<\67\3\2\2\2<8\3\2\2\2=\13\3\2\2\2>D\5\n\6\2"+
		"?@\5\n\6\2@A\7\24\2\2AB\5\f\7\2BD\3\2\2\2C>\3\2\2\2C?\3\2\2\2D\r\3\2\2"+
		"\2EF\7\20\2\2FG\7\23\2\2GH\5\22\n\2HI\7\22\2\2I\17\3\2\2\2JK\7\33\2\2"+
		"KS\7\5\2\2LM\7\20\2\2MS\7\5\2\2NO\7\t\2\2OP\5\20\t\2PQ\7\n\2\2QS\3\2\2"+
		"\2RJ\3\2\2\2RL\3\2\2\2RN\3\2\2\2S\21\3\2\2\2TU\5\20\t\2UV\7\24\2\2VW\5"+
		"\22\n\2W\23\3\2\2\2XY\7\20\2\2YZ\7\23\2\2Z[\5\20\t\2[\\\7\30\2\2\\]\7"+
		"\b\2\2]^\7\22\2\2^\25\3\2\2\2\t\35%-\63<CR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}