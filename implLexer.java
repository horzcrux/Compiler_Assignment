// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, IDENTIFIER=17, 
		CONST=18, HVIDRUM=19, KOMMENTAR=20, MULTILINECOMMENTS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "IDENTIFIER", 
			"CONST", "HVIDRUM", "KOMMENTAR", "MULTILINECOMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'while'", "'('", "')'", "'output'", "'{'", "'}'", 
			"'>'", "'<'", "'=='", "'!='", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "IDENTIFIER", "CONST", "HVIDRUM", "KOMMENTAR", 
			"MULTILINECOMMENTS"
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


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

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
		"\u0004\u0000\u0015\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010"+
		"Y\b\u0010\n\u0010\f\u0010\\\t\u0010\u0001\u0011\u0004\u0011_\b\u0011\u000b"+
		"\u0011\f\u0011`\u0001\u0011\u0001\u0011\u0004\u0011e\b\u0011\u000b\u0011"+
		"\f\u0011f\u0003\u0011i\b\u0011\u0001\u0012\u0004\u0012l\b\u0012\u000b"+
		"\u0012\f\u0012m\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013v\b\u0013\n\u0013\f\u0013y\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0083\b\u0014\n\u0014\f\u0014\u0086\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000"+
		"\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000"+
		"\u0007\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0002\u0000"+
		"\t\n  \u0001\u0000\n\n\u0001\u0000//\u0001\u0000**\u0093\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000"+
		"\u0000\u0000\u0003-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000"+
		"\u00075\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b9\u0001"+
		"\u0000\u0000\u0000\r@\u0001\u0000\u0000\u0000\u000fB\u0001\u0000\u0000"+
		"\u0000\u0011D\u0001\u0000\u0000\u0000\u0013F\u0001\u0000\u0000\u0000\u0015"+
		"H\u0001\u0000\u0000\u0000\u0017K\u0001\u0000\u0000\u0000\u0019N\u0001"+
		"\u0000\u0000\u0000\u001bP\u0001\u0000\u0000\u0000\u001dR\u0001\u0000\u0000"+
		"\u0000\u001fT\u0001\u0000\u0000\u0000!V\u0001\u0000\u0000\u0000#^\u0001"+
		"\u0000\u0000\u0000%k\u0001\u0000\u0000\u0000\'q\u0001\u0000\u0000\u0000"+
		")|\u0001\u0000\u0000\u0000+,\u0005=\u0000\u0000,\u0002\u0001\u0000\u0000"+
		"\u0000-.\u0005;\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005w\u0000"+
		"\u000001\u0005h\u0000\u000012\u0005i\u0000\u000023\u0005l\u0000\u0000"+
		"34\u0005e\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005(\u0000\u0000"+
		"6\b\u0001\u0000\u0000\u000078\u0005)\u0000\u00008\n\u0001\u0000\u0000"+
		"\u00009:\u0005o\u0000\u0000:;\u0005u\u0000\u0000;<\u0005t\u0000\u0000"+
		"<=\u0005p\u0000\u0000=>\u0005u\u0000\u0000>?\u0005t\u0000\u0000?\f\u0001"+
		"\u0000\u0000\u0000@A\u0005{\u0000\u0000A\u000e\u0001\u0000\u0000\u0000"+
		"BC\u0005}\u0000\u0000C\u0010\u0001\u0000\u0000\u0000DE\u0005>\u0000\u0000"+
		"E\u0012\u0001\u0000\u0000\u0000FG\u0005<\u0000\u0000G\u0014\u0001\u0000"+
		"\u0000\u0000HI\u0005=\u0000\u0000IJ\u0005=\u0000\u0000J\u0016\u0001\u0000"+
		"\u0000\u0000KL\u0005!\u0000\u0000LM\u0005=\u0000\u0000M\u0018\u0001\u0000"+
		"\u0000\u0000NO\u0005*\u0000\u0000O\u001a\u0001\u0000\u0000\u0000PQ\u0005"+
		"/\u0000\u0000Q\u001c\u0001\u0000\u0000\u0000RS\u0005+\u0000\u0000S\u001e"+
		"\u0001\u0000\u0000\u0000TU\u0005-\u0000\u0000U \u0001\u0000\u0000\u0000"+
		"VZ\u0007\u0000\u0000\u0000WY\u0007\u0001\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\"\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0007"+
		"\u0002\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ah\u0001\u0000\u0000"+
		"\u0000bd\u0005.\u0000\u0000ce\u0007\u0002\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gi\u0001\u0000\u0000\u0000hb\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000i$\u0001\u0000\u0000\u0000jl\u0007\u0003\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0006\u0012"+
		"\u0000\u0000p&\u0001\u0000\u0000\u0000qr\u0005/\u0000\u0000rs\u0005/\u0000"+
		"\u0000sw\u0001\u0000\u0000\u0000tv\b\u0004\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0006"+
		"\u0013\u0000\u0000{(\u0001\u0000\u0000\u0000|}\u0005/\u0000\u0000}~\u0005"+
		"*\u0000\u0000~\u0084\u0001\u0000\u0000\u0000\u007f\u0080\u0005*\u0000"+
		"\u0000\u0080\u0083\b\u0005\u0000\u0000\u0081\u0083\b\u0006\u0000\u0000"+
		"\u0082\u007f\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005*\u0000\u0000\u0088"+
		"\u0089\u0005/\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0006\u0014\u0000\u0000\u008b*\u0001\u0000\u0000\u0000\t\u0000Z`fhmw"+
		"\u0082\u0084\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}