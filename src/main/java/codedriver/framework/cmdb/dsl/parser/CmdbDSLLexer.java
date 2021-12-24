/*
 * Copyright(c) 2021 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

// Generated from /Users/chenqiwei/idea_project/codedriver/codedriver-cmdb-base/src/main/resources/CmdbDSL.g4 by ANTLR 4.9.2

    package codedriver.framework.cmdb.dsl.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmdbDSLLexer extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0 = 1, NUMBER_ARRAY = 2, STRING_ARRAY = 3, NUMBER = 4, BRACKET_LEFT = 5, BRACKET_RIGHT = 6,
			AND = 7, OR = 8, EQ = 9, GT = 10, LT = 11, LE = 12, GE = 13, PLUS = 14, SUBTRACT = 15, MULTIPLY = 16,
			DIVIDE = 17, NOTEQ = 18, LIKE = 19, INCLUDE = 20, EXCLUDE = 21, ATTR = 22, STRING = 23,
			WHITESPACE = 24;
	public static String[] channelNames = {
			"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[]{
				"T__0", "NUMBER_ARRAY", "STRING_ARRAY", "NUMBER", "BRACKET_LEFT", "BRACKET_RIGHT",
				"AND", "OR", "EQ", "GT", "LT", "LE", "GE", "PLUS", "SUBTRACT", "MULTIPLY",
				"DIVIDE", "NOTEQ", "LIKE", "INCLUDE", "EXCLUDE", "ATTR", "STRING", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[]{
				null, "'.'", null, null, null, "'('", "')'", "'&&'", "'||'", "'=='",
				"'>'", "'<'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!='", "'like'",
				"'include'", "'exclude'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[]{
				null, null, "NUMBER_ARRAY", "STRING_ARRAY", "NUMBER", "BRACKET_LEFT",
				"BRACKET_RIGHT", "AND", "OR", "EQ", "GT", "LT", "LE", "GE", "PLUS", "SUBTRACT",
				"MULTIPLY", "DIVIDE", "NOTEQ", "LIKE", "INCLUDE", "EXCLUDE", "ATTR",
				"STRING", "WHITESPACE"
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


	public CmdbDSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "CmdbDSL.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getChannelNames() {
		return channelNames;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00bd\b\1\4\2" +
					"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
					"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
					"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
					"\t\31\3\2\3\2\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\3\3\4" +
					"\3\4\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\4\3\5\5\5O\n\5\3\5\3\5" +
					"\3\5\7\5T\n\5\f\5\16\5W\13\5\3\5\3\5\3\5\3\5\6\5]\n\5\r\5\16\5^\3\5\3" +
					"\5\7\5c\n\5\f\5\16\5f\13\5\3\5\3\5\6\5j\n\5\r\5\16\5k\5\5n\n\5\3\6\3\6" +
					"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r" +
					"\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23" +
					"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25" +
					"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u00a9\n\27\f\27" +
					"\16\27\u00ac\13\27\3\30\3\30\7\30\u00b0\n\30\f\30\16\30\u00b3\13\30\3" +
					"\30\3\30\3\31\6\31\u00b8\n\31\r\31\16\31\u00b9\3\31\3\31\3\u00b1\2\32" +
					"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20" +
					"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\t\3\2\62\62\3\2\63;" +
					"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2$$^^\5\2\13\f\17\17\"\"\2\u00c9" +
					"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2" +
					"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2" +
					"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2" +
					"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2" +
					"\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7A\3\2\2\2\tN\3\2\2\2\13o\3" +
					"\2\2\2\rq\3\2\2\2\17s\3\2\2\2\21v\3\2\2\2\23y\3\2\2\2\25|\3\2\2\2\27~" +
					"\3\2\2\2\31\u0080\3\2\2\2\33\u0083\3\2\2\2\35\u0086\3\2\2\2\37\u0088\3" +
					"\2\2\2!\u008a\3\2\2\2#\u008c\3\2\2\2%\u008e\3\2\2\2\'\u0091\3\2\2\2)\u0096" +
					"\3\2\2\2+\u009e\3\2\2\2-\u00a6\3\2\2\2/\u00ad\3\2\2\2\61\u00b7\3\2\2\2" +
					"\63\64\7\60\2\2\64\4\3\2\2\2\65;\7]\2\2\66\67\5\t\5\2\678\7.\2\28:\3\2" +
					"\2\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\5" +
					"\t\5\2?@\7_\2\2@\6\3\2\2\2AG\7]\2\2BC\5/\30\2CD\7.\2\2DF\3\2\2\2EB\3\2" +
					"\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5/\30\2KL\7_" +
					"\2\2L\b\3\2\2\2MO\7/\2\2NM\3\2\2\2NO\3\2\2\2Om\3\2\2\2Pn\t\2\2\2QU\t\3" +
					"\2\2RT\t\4\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2Vn\3\2\2\2WU\3\2" +
					"\2\2XY\7\62\2\2YZ\7\60\2\2Z\\\3\2\2\2[]\t\4\2\2\\[\3\2\2\2]^\3\2\2\2^" +
					"\\\3\2\2\2^_\3\2\2\2_n\3\2\2\2`d\t\3\2\2ac\t\4\2\2ba\3\2\2\2cf\3\2\2\2" +
					"db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gi\7\60\2\2hj\t\4\2\2ih\3\2\2" +
					"\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mP\3\2\2\2mQ\3\2\2\2mX\3\2\2" +
					"\2m`\3\2\2\2n\n\3\2\2\2op\7*\2\2p\f\3\2\2\2qr\7+\2\2r\16\3\2\2\2st\7(" +
					"\2\2tu\7(\2\2u\20\3\2\2\2vw\7~\2\2wx\7~\2\2x\22\3\2\2\2yz\7?\2\2z{\7?" +
					"\2\2{\24\3\2\2\2|}\7@\2\2}\26\3\2\2\2~\177\7>\2\2\177\30\3\2\2\2\u0080" +
					"\u0081\7>\2\2\u0081\u0082\7?\2\2\u0082\32\3\2\2\2\u0083\u0084\7@\2\2\u0084" +
					"\u0085\7?\2\2\u0085\34\3\2\2\2\u0086\u0087\7-\2\2\u0087\36\3\2\2\2\u0088" +
					"\u0089\7/\2\2\u0089 \3\2\2\2\u008a\u008b\7,\2\2\u008b\"\3\2\2\2\u008c" +
					"\u008d\7\61\2\2\u008d$\3\2\2\2\u008e\u008f\7#\2\2\u008f\u0090\7?\2\2\u0090" +
					"&\3\2\2\2\u0091\u0092\7n\2\2\u0092\u0093\7k\2\2\u0093\u0094\7m\2\2\u0094" +
					"\u0095\7g\2\2\u0095(\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098" +
					"\u0099\7e\2\2\u0099\u009a\7n\2\2\u009a\u009b\7w\2\2\u009b\u009c\7f\2\2" +
					"\u009c\u009d\7g\2\2\u009d*\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7z\2" +
					"\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4" +
					"\7f\2\2\u00a4\u00a5\7g\2\2\u00a5,\3\2\2\2\u00a6\u00aa\t\5\2\2\u00a7\u00a9" +
					"\t\6\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa" +
					"\u00ab\3\2\2\2\u00ab.\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b1\7$\2\2\u00ae" +
					"\u00b0\n\7\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b2\3\2" +
					"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4" +
					"\u00b5\7$\2\2\u00b5\60\3\2\2\2\u00b6\u00b8\t\b\2\2\u00b7\u00b6\3\2\2\2" +
					"\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb" +
					"\3\2\2\2\u00bb\u00bc\b\31\2\2\u00bc\62\3\2\2\2\16\2;GNU^dkm\u00aa\u00b1" +
					"\u00b9\3\2\3\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}