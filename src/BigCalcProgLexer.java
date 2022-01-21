// Generated from BigCalcProg.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BigCalcProgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Identifier=9, 
		Number=10, WS=11, COMMENT=12, LINE_COMMENT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Identifier", 
		"Number", "WS", "COMMENT", "LINE_COMMENT", "UPPERCASE", "LOWERCASE", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "Identifier", "Number", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
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


	public BigCalcProgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BigCalcProg.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n\66"+
		"\n\n\3\n\7\n9\n\n\f\n\16\n<\13\n\3\13\6\13?\n\13\r\13\16\13@\3\13\3\13"+
		"\6\13E\n\13\r\13\16\13F\5\13I\n\13\3\f\6\fL\n\f\r\f\16\fM\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\7\rV\n\r\f\r\16\rY\13\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\7\16d\n\16\f\16\16\16g\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3W\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\2\37\2!\2\3\2\7\5\2\13\f\16\17\"\"\4\2\f\f\17\17\3\2C\\\3\2"+
		"c|\3\2\62;\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2"+
		"\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3\2\2\2\21\61\3\2\2\2\23\65\3"+
		"\2\2\2\25>\3\2\2\2\27K\3\2\2\2\31Q\3\2\2\2\33_\3\2\2\2\35j\3\2\2\2\37"+
		"l\3\2\2\2!n\3\2\2\2#$\7=\2\2$\4\3\2\2\2%&\7,\2\2&\6\3\2\2\2\'(\7\61\2"+
		"\2(\b\3\2\2\2)*\7-\2\2*\n\3\2\2\2+,\7/\2\2,\f\3\2\2\2-.\7*\2\2.\16\3\2"+
		"\2\2/\60\7+\2\2\60\20\3\2\2\2\61\62\7?\2\2\62\22\3\2\2\2\63\66\5\35\17"+
		"\2\64\66\5\37\20\2\65\63\3\2\2\2\65\64\3\2\2\2\66:\3\2\2\2\679\5!\21\2"+
		"8\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\24\3\2\2\2<:\3\2\2\2=?\5!"+
		"\21\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AH\3\2\2\2BD\7\60\2\2CE\5"+
		"!\21\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HB\3\2\2\2HI\3"+
		"\2\2\2I\26\3\2\2\2JL\t\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N"+
		"O\3\2\2\2OP\b\f\2\2P\30\3\2\2\2QR\7\61\2\2RS\7,\2\2SW\3\2\2\2TV\13\2\2"+
		"\2UT\3\2\2\2VY\3\2\2\2WX\3\2\2\2WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7,\2"+
		"\2[\\\7\61\2\2\\]\3\2\2\2]^\b\r\2\2^\32\3\2\2\2_`\7\61\2\2`a\7\61\2\2"+
		"ae\3\2\2\2bd\n\3\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2"+
		"ge\3\2\2\2hi\b\16\2\2i\34\3\2\2\2jk\t\4\2\2k\36\3\2\2\2lm\t\5\2\2m \3"+
		"\2\2\2no\t\6\2\2o\"\3\2\2\2\13\2\65:@FHMWe\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}