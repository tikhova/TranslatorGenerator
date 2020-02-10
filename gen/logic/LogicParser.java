// Generated from /shared/YandexDisk/ITMO/year2019/mt/TranslatorGenerator/src/test/logic/Logic.g4 by ANTLR 4.8
package logic;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATOM=1, LBRACE=2, RBRACE=3, OR=4, XOR=5, AND=6, NOT=7, EPS=8;
	public static final int
		RULE_expression = 0, RULE_x_or_continuation = 1, RULE_x_value = 2, RULE_and_value = 3, 
		RULE_and_continuation = 4, RULE_value = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "x_or_continuation", "x_value", "and_value", "and_continuation", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'||'", "'^'", "'&&'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ATOM", "LBRACE", "RBRACE", "OR", "XOR", "AND", "NOT", "EPS"
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
	public String getGrammarFileName() { return "Logic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public X_valueContext x_value() {
			return getRuleContext(X_valueContext.class,0);
		}
		public X_or_continuationContext x_or_continuation() {
			return getRuleContext(X_or_continuationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			x_value();
			setState(13);
			x_or_continuation();
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

	public static class X_or_continuationContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(LogicParser.OR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode XOR() { return getToken(LogicParser.XOR, 0); }
		public TerminalNode EPS() { return getToken(LogicParser.EPS, 0); }
		public X_or_continuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x_or_continuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterX_or_continuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitX_or_continuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitX_or_continuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final X_or_continuationContext x_or_continuation() throws RecognitionException {
		X_or_continuationContext _localctx = new X_or_continuationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_x_or_continuation);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(OR);
				setState(16);
				expression();
				}
				break;
			case XOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(XOR);
				setState(18);
				expression();
				}
				break;
			case EPS:
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				match(EPS);
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

	public static class X_valueContext extends ParserRuleContext {
		public And_valueContext and_value() {
			return getRuleContext(And_valueContext.class,0);
		}
		public And_continuationContext and_continuation() {
			return getRuleContext(And_continuationContext.class,0);
		}
		public X_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterX_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitX_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitX_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final X_valueContext x_value() throws RecognitionException {
		X_valueContext _localctx = new X_valueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_x_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			and_value();
			setState(23);
			and_continuation();
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

	public static class And_valueContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(LogicParser.NOT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public And_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterAnd_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitAnd_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitAnd_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_valueContext and_value() throws RecognitionException {
		And_valueContext _localctx = new And_valueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_and_value);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(NOT);
				setState(26);
				value();
				}
				break;
			case ATOM:
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				value();
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

	public static class And_continuationContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(LogicParser.AND, 0); }
		public X_valueContext x_value() {
			return getRuleContext(X_valueContext.class,0);
		}
		public TerminalNode EPS() { return getToken(LogicParser.EPS, 0); }
		public And_continuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_continuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterAnd_continuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitAnd_continuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitAnd_continuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_continuationContext and_continuation() throws RecognitionException {
		And_continuationContext _localctx = new And_continuationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_and_continuation);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(AND);
				setState(31);
				x_value();
				}
				break;
			case EPS:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(EPS);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LogicParser.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LogicParser.RBRACE, 0); }
		public TerminalNode ATOM() { return getToken(LogicParser.ATOM, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(LBRACE);
				setState(36);
				expression();
				setState(37);
				match(RBRACE);
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(ATOM);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n-\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\27\n\3\3\4\3\4\3\4\3\5\3\5\3\5\5\5\37\n\5\3\6\3\6\3\6\5\6$\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\5\7+\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2+\2\16\3\2\2\2\4\26"+
		"\3\2\2\2\6\30\3\2\2\2\b\36\3\2\2\2\n#\3\2\2\2\f*\3\2\2\2\16\17\5\6\4\2"+
		"\17\20\5\4\3\2\20\3\3\2\2\2\21\22\7\6\2\2\22\27\5\2\2\2\23\24\7\7\2\2"+
		"\24\27\5\2\2\2\25\27\7\n\2\2\26\21\3\2\2\2\26\23\3\2\2\2\26\25\3\2\2\2"+
		"\27\5\3\2\2\2\30\31\5\b\5\2\31\32\5\n\6\2\32\7\3\2\2\2\33\34\7\t\2\2\34"+
		"\37\5\f\7\2\35\37\5\f\7\2\36\33\3\2\2\2\36\35\3\2\2\2\37\t\3\2\2\2 !\7"+
		"\b\2\2!$\5\6\4\2\"$\7\n\2\2# \3\2\2\2#\"\3\2\2\2$\13\3\2\2\2%&\7\4\2\2"+
		"&\'\5\2\2\2\'(\7\5\2\2(+\3\2\2\2)+\7\3\2\2*%\3\2\2\2*)\3\2\2\2+\r\3\2"+
		"\2\2\6\26\36#*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}