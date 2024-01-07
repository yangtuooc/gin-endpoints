// Generated from /Users/yangtuo/projects/open-source/gin-endpoints/src/main/kotlin/cn/yangtuooc/swag/SwagParser.g4 by ANTLR 4.13.1
package cn.yangtuooc.swag;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SwagParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TITLE=1, VERSION=2, DESCRIPTION=3, TAG_NAME=4, TAG_DESCRIPTION=5, TAG_DOCS_URL=6, 
		TERMS_OF_SERVICE=7, CONTACT_NAME=8, CONTACT_URL=9, CONTACT_EMAIL=10, LICENSE_NAME=11, 
		LICENSE_URL=12, HOST=13, BASE_PATH=14, SECURITY_DEFINITIONS_BASIC=15, 
		EXTERNAL_DOCS_DESCRIPTION=16, EXTERNAL_DOCS_URL=17, QUERY_COLLECTION_FORMAT=18, 
		SCHEMA=19, DESCRIPTION_MARKDOWN=20, ID=21, TAGS=22, SUMMARY=23, ACCEPT=24, 
		PRODUCE=25, PARAM=26, SECURITY=27, SUCCESS=28, FAILURE=29, RESPONSE=30, 
		HEADER=31, ROUTER=32, MIME=33, IDENTIFIER=34, PARAM_TYPE=35, DATA_TYPE=36, 
		COLLECTION_FORMAT=37, ATTRIBUTES=38, HTTP_METHODS=39, EXTENSION_MARK=40, 
		SLASH=41, FLOAT=42, INTEGER=43, LEFT_PAREN=44, RIGHT_PAREN=45, LEFT_BRACE=46, 
		RIGHT_BRACE=47, STAR=48, COLON=49, LEFT_BRACKET=50, RIGHT_BRACKET=51, 
		NULL=52, TRUE=53, FALSE=54, COMMA=55, SPACE=56, TEXT=57, HTTP_URL=58, 
		HTTPS_URL=59, EMAIL=60, WS=61, STRING=62, NUMBER=63;
	public static final int
		RULE_title = 0, RULE_version = 1, RULE_description = 2, RULE_termsOfService = 3, 
		RULE_contactName = 4, RULE_contactUrl = 5, RULE_contactEmail = 6, RULE_licenseName = 7, 
		RULE_licenseUrl = 8, RULE_host = 9, RULE_basePath = 10, RULE_securityDefinitionsBasic = 11, 
		RULE_externalDocsDescription = 12, RULE_externalDocsUrl = 13, RULE_summary = 14, 
		RULE_tags = 15, RULE_tag = 16, RULE_accept = 17, RULE_produce = 18, RULE_param = 19, 
		RULE_comment = 20, RULE_isMandatory = 21, RULE_success = 22, RULE_failure = 23, 
		RULE_response = 24, RULE_header = 25, RULE_router = 26, RULE_extensions = 27, 
		RULE_returnCode = 28, RULE_path = 29, RULE_json = 30, RULE_obj = 31, RULE_pair = 32, 
		RULE_arr = 33, RULE_value = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"title", "version", "description", "termsOfService", "contactName", "contactUrl", 
			"contactEmail", "licenseName", "licenseUrl", "host", "basePath", "securityDefinitionsBasic", 
			"externalDocsDescription", "externalDocsUrl", "summary", "tags", "tag", 
			"accept", "produce", "param", "comment", "isMandatory", "success", "failure", 
			"response", "header", "router", "extensions", "returnCode", "path", "json", 
			"obj", "pair", "arr", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@title'", "'@version'", "'@description'", "'@tag.name'", "'@tag.description'", 
			"'@tag.docs.url'", "'@termsOfService'", "'@contact.name'", "'@contact.url'", 
			"'@contact.email'", "'@license.name'", "'@license.url'", "'@host'", "'@BasePath'", 
			"'@securityDefinitions.basic'", "'@externalDocs.description'", "'@externalDocs.url'", 
			"'@query.collection.format'", "'@schema'", "'@description.markdown'", 
			"'@Id'", "'@Tags'", "'@Summary'", "'@Accept'", "'@Produce'", "'@Param'", 
			"'@Security'", "'@Success'", "'@Failure'", "'@Response'", "'@Header'", 
			"'@Router'", null, null, null, null, null, null, null, "'x-'", "'/'", 
			null, null, "'('", "')'", "'{'", "'}'", "'*'", "':'", "'['", "']'", "'null'", 
			"'true'", "'false'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TITLE", "VERSION", "DESCRIPTION", "TAG_NAME", "TAG_DESCRIPTION", 
			"TAG_DOCS_URL", "TERMS_OF_SERVICE", "CONTACT_NAME", "CONTACT_URL", "CONTACT_EMAIL", 
			"LICENSE_NAME", "LICENSE_URL", "HOST", "BASE_PATH", "SECURITY_DEFINITIONS_BASIC", 
			"EXTERNAL_DOCS_DESCRIPTION", "EXTERNAL_DOCS_URL", "QUERY_COLLECTION_FORMAT", 
			"SCHEMA", "DESCRIPTION_MARKDOWN", "ID", "TAGS", "SUMMARY", "ACCEPT", 
			"PRODUCE", "PARAM", "SECURITY", "SUCCESS", "FAILURE", "RESPONSE", "HEADER", 
			"ROUTER", "MIME", "IDENTIFIER", "PARAM_TYPE", "DATA_TYPE", "COLLECTION_FORMAT", 
			"ATTRIBUTES", "HTTP_METHODS", "EXTENSION_MARK", "SLASH", "FLOAT", "INTEGER", 
			"LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "STAR", "COLON", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "NULL", "TRUE", "FALSE", "COMMA", "SPACE", 
			"TEXT", "HTTP_URL", "HTTPS_URL", "EMAIL", "WS", "STRING", "NUMBER"
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
	public String getGrammarFileName() { return "SwagParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwagParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(SwagParser.TITLE, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(TITLE);
			setState(71);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VersionContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(SwagParser.VERSION, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(VERSION);
			setState(74);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode DESCRIPTION() { return getToken(SwagParser.DESCRIPTION, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(DESCRIPTION);
			setState(77);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermsOfServiceContext extends ParserRuleContext {
		public TerminalNode TERMS_OF_SERVICE() { return getToken(SwagParser.TERMS_OF_SERVICE, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public TermsOfServiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termsOfService; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterTermsOfService(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitTermsOfService(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitTermsOfService(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsOfServiceContext termsOfService() throws RecognitionException {
		TermsOfServiceContext _localctx = new TermsOfServiceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_termsOfService);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(TERMS_OF_SERVICE);
			setState(80);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContactNameContext extends ParserRuleContext {
		public TerminalNode CONTACT_NAME() { return getToken(SwagParser.CONTACT_NAME, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public ContactNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contactName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterContactName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitContactName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitContactName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContactNameContext contactName() throws RecognitionException {
		ContactNameContext _localctx = new ContactNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_contactName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CONTACT_NAME);
			setState(83);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContactUrlContext extends ParserRuleContext {
		public TerminalNode CONTACT_URL() { return getToken(SwagParser.CONTACT_URL, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public ContactUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contactUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterContactUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitContactUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitContactUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContactUrlContext contactUrl() throws RecognitionException {
		ContactUrlContext _localctx = new ContactUrlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_contactUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(CONTACT_URL);
			setState(86);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContactEmailContext extends ParserRuleContext {
		public TerminalNode CONTACT_EMAIL() { return getToken(SwagParser.CONTACT_EMAIL, 0); }
		public TerminalNode EMAIL() { return getToken(SwagParser.EMAIL, 0); }
		public ContactEmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contactEmail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterContactEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitContactEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitContactEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContactEmailContext contactEmail() throws RecognitionException {
		ContactEmailContext _localctx = new ContactEmailContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contactEmail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(CONTACT_EMAIL);
			setState(89);
			match(EMAIL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LicenseNameContext extends ParserRuleContext {
		public TerminalNode LICENSE_NAME() { return getToken(SwagParser.LICENSE_NAME, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public LicenseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_licenseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterLicenseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitLicenseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitLicenseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LicenseNameContext licenseName() throws RecognitionException {
		LicenseNameContext _localctx = new LicenseNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_licenseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(LICENSE_NAME);
			setState(92);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LicenseUrlContext extends ParserRuleContext {
		public TerminalNode HTTP_URL() { return getToken(SwagParser.HTTP_URL, 0); }
		public TerminalNode HTTPS_URL() { return getToken(SwagParser.HTTPS_URL, 0); }
		public LicenseUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_licenseUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterLicenseUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitLicenseUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitLicenseUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LicenseUrlContext licenseUrl() throws RecognitionException {
		LicenseUrlContext _localctx = new LicenseUrlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_licenseUrl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==HTTP_URL || _la==HTTPS_URL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HostContext extends ParserRuleContext {
		public TerminalNode HOST() { return getToken(SwagParser.HOST, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitHost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitHost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_host);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(HOST);
			setState(97);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BasePathContext extends ParserRuleContext {
		public TerminalNode BASE_PATH() { return getToken(SwagParser.BASE_PATH, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public BasePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterBasePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitBasePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitBasePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasePathContext basePath() throws RecognitionException {
		BasePathContext _localctx = new BasePathContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basePath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(BASE_PATH);
			setState(100);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SecurityDefinitionsBasicContext extends ParserRuleContext {
		public TerminalNode SECURITY_DEFINITIONS_BASIC() { return getToken(SwagParser.SECURITY_DEFINITIONS_BASIC, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public SecurityDefinitionsBasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_securityDefinitionsBasic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterSecurityDefinitionsBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitSecurityDefinitionsBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitSecurityDefinitionsBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecurityDefinitionsBasicContext securityDefinitionsBasic() throws RecognitionException {
		SecurityDefinitionsBasicContext _localctx = new SecurityDefinitionsBasicContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_securityDefinitionsBasic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(SECURITY_DEFINITIONS_BASIC);
			setState(103);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalDocsDescriptionContext extends ParserRuleContext {
		public TerminalNode EXTERNAL_DOCS_DESCRIPTION() { return getToken(SwagParser.EXTERNAL_DOCS_DESCRIPTION, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public ExternalDocsDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDocsDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterExternalDocsDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitExternalDocsDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitExternalDocsDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDocsDescriptionContext externalDocsDescription() throws RecognitionException {
		ExternalDocsDescriptionContext _localctx = new ExternalDocsDescriptionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_externalDocsDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(EXTERNAL_DOCS_DESCRIPTION);
			setState(106);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalDocsUrlContext extends ParserRuleContext {
		public TerminalNode EXTERNAL_DOCS_URL() { return getToken(SwagParser.EXTERNAL_DOCS_URL, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public ExternalDocsUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDocsUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterExternalDocsUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitExternalDocsUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitExternalDocsUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDocsUrlContext externalDocsUrl() throws RecognitionException {
		ExternalDocsUrlContext _localctx = new ExternalDocsUrlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_externalDocsUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(EXTERNAL_DOCS_URL);
			setState(109);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SummaryContext extends ParserRuleContext {
		public TerminalNode SUMMARY() { return getToken(SwagParser.SUMMARY, 0); }
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public SummaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterSummary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitSummary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitSummary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummaryContext summary() throws RecognitionException {
		SummaryContext _localctx = new SummaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_summary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(SUMMARY);
			setState(112);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagsContext extends ParserRuleContext {
		public TerminalNode TAGS() { return getToken(SwagParser.TAGS, 0); }
		public List<TagContext> tag() {
			return getRuleContexts(TagContext.class);
		}
		public TagContext tag(int i) {
			return getRuleContext(TagContext.class,i);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitTags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(TAGS);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				tag();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(SwagParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(SwagParser.TEXT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SwagParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SwagParser.COMMA, i);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(TEXT);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
				setState(122);
				match(TEXT);
				}
				}
				setState(127);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AcceptContext extends ParserRuleContext {
		public TerminalNode ACCEPT() { return getToken(SwagParser.ACCEPT, 0); }
		public TerminalNode MIME() { return getToken(SwagParser.MIME, 0); }
		public AcceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accept; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterAccept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitAccept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitAccept(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcceptContext accept() throws RecognitionException {
		AcceptContext _localctx = new AcceptContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_accept);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ACCEPT);
			setState(129);
			match(MIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProduceContext extends ParserRuleContext {
		public TerminalNode PRODUCE() { return getToken(SwagParser.PRODUCE, 0); }
		public TerminalNode MIME() { return getToken(SwagParser.MIME, 0); }
		public ProduceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_produce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterProduce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitProduce(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitProduce(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProduceContext produce() throws RecognitionException {
		ProduceContext _localctx = new ProduceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_produce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(PRODUCE);
			setState(132);
			match(MIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode PARAM() { return getToken(SwagParser.PARAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SwagParser.IDENTIFIER, 0); }
		public TerminalNode PARAM_TYPE() { return getToken(SwagParser.PARAM_TYPE, 0); }
		public TerminalNode DATA_TYPE() { return getToken(SwagParser.DATA_TYPE, 0); }
		public IsMandatoryContext isMandatory() {
			return getRuleContext(IsMandatoryContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public List<TerminalNode> ATTRIBUTES() { return getTokens(SwagParser.ATTRIBUTES); }
		public TerminalNode ATTRIBUTES(int i) {
			return getToken(SwagParser.ATTRIBUTES, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(PARAM);
			setState(135);
			match(IDENTIFIER);
			setState(136);
			match(PARAM_TYPE);
			setState(137);
			match(DATA_TYPE);
			setState(138);
			isMandatory();
			setState(139);
			comment();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTES) {
				{
				{
				setState(140);
				match(ATTRIBUTES);
				}
				}
				setState(145);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SwagParser.TEXT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IsMandatoryContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SwagParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SwagParser.FALSE, 0); }
		public IsMandatoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isMandatory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterIsMandatory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitIsMandatory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitIsMandatory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsMandatoryContext isMandatory() throws RecognitionException {
		IsMandatoryContext _localctx = new IsMandatoryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_isMandatory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SuccessContext extends ParserRuleContext {
		public ReturnCodeContext returnCode() {
			return getRuleContext(ReturnCodeContext.class,0);
		}
		public TerminalNode PARAM_TYPE() { return getToken(SwagParser.PARAM_TYPE, 0); }
		public TerminalNode DATA_TYPE() { return getToken(SwagParser.DATA_TYPE, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public SuccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_success; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterSuccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitSuccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitSuccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuccessContext success() throws RecognitionException {
		SuccessContext _localctx = new SuccessContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_success);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			returnCode();
			setState(151);
			match(PARAM_TYPE);
			setState(152);
			match(DATA_TYPE);
			setState(153);
			comment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FailureContext extends ParserRuleContext {
		public ReturnCodeContext returnCode() {
			return getRuleContext(ReturnCodeContext.class,0);
		}
		public TerminalNode PARAM_TYPE() { return getToken(SwagParser.PARAM_TYPE, 0); }
		public TerminalNode DATA_TYPE() { return getToken(SwagParser.DATA_TYPE, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public FailureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterFailure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitFailure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitFailure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FailureContext failure() throws RecognitionException {
		FailureContext _localctx = new FailureContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_failure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			returnCode();
			setState(156);
			match(PARAM_TYPE);
			setState(157);
			match(DATA_TYPE);
			setState(158);
			comment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResponseContext extends ParserRuleContext {
		public ReturnCodeContext returnCode() {
			return getRuleContext(ReturnCodeContext.class,0);
		}
		public TerminalNode PARAM_TYPE() { return getToken(SwagParser.PARAM_TYPE, 0); }
		public TerminalNode DATA_TYPE() { return getToken(SwagParser.DATA_TYPE, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitResponse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitResponse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResponseContext response() throws RecognitionException {
		ResponseContext _localctx = new ResponseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_response);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			returnCode();
			setState(161);
			match(PARAM_TYPE);
			setState(162);
			match(DATA_TYPE);
			setState(163);
			comment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderContext extends ParserRuleContext {
		public ReturnCodeContext returnCode() {
			return getRuleContext(ReturnCodeContext.class,0);
		}
		public TerminalNode PARAM_TYPE() { return getToken(SwagParser.PARAM_TYPE, 0); }
		public TerminalNode DATA_TYPE() { return getToken(SwagParser.DATA_TYPE, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			returnCode();
			setState(166);
			match(PARAM_TYPE);
			setState(167);
			match(DATA_TYPE);
			setState(168);
			comment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RouterContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode HTTP_METHODS() { return getToken(SwagParser.HTTP_METHODS, 0); }
		public RouterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_router; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterRouter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitRouter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitRouter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterContext router() throws RecognitionException {
		RouterContext _localctx = new RouterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_router);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			path();
			setState(171);
			match(HTTP_METHODS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExtensionsContext extends ParserRuleContext {
		public TerminalNode EXTENSION_MARK() { return getToken(SwagParser.EXTENSION_MARK, 0); }
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public ExtensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterExtensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitExtensions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitExtensions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionsContext extensions() throws RecognitionException {
		ExtensionsContext _localctx = new ExtensionsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_extensions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(EXTENSION_MARK);
			setState(174);
			json();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnCodeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SwagParser.INTEGER, 0); }
		public ReturnCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterReturnCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitReturnCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitReturnCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnCodeContext returnCode() throws RecognitionException {
		ReturnCodeContext _localctx = new ReturnCodeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(INTEGER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PathContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SwagParser.IDENTIFIER, 0); }
		public TerminalNode SLASH() { return getToken(SwagParser.SLASH, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(SwagParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(SwagParser.RIGHT_BRACE, 0); }
		public TerminalNode STAR() { return getToken(SwagParser.STAR, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 494797412368384L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SwagParser.EOF, 0); }
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			value();
			setState(181);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(SwagParser.LEFT_BRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(SwagParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SwagParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SwagParser.COMMA, i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_obj);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(LEFT_BRACE);
				setState(184);
				pair();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(185);
					match(COMMA);
					setState(186);
					pair();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(LEFT_BRACE);
				setState(195);
				match(RIGHT_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SwagParser.STRING, 0); }
		public TerminalNode COLON() { return getToken(SwagParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(STRING);
			setState(199);
			match(COLON);
			setState(200);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(SwagParser.LEFT_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(SwagParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SwagParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SwagParser.COMMA, i);
		}
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arr);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(LEFT_BRACKET);
				setState(203);
				value();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(204);
					match(COMMA);
					setState(205);
					value();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(RIGHT_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(LEFT_BRACKET);
				setState(214);
				match(RIGHT_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SwagParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(SwagParser.NUMBER, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(SwagParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SwagParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(SwagParser.NULL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwagParserListener ) ((SwagParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwagParserVisitor ) return ((SwagParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_value);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(NUMBER);
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				obj();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				arr();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				match(NULL);
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
		"\u0004\u0001?\u00e3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0004\u000f"+
		"u\b\u000f\u000b\u000f\f\u000fv\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010|\b\u0010\n\u0010\f\u0010\u007f\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u008e\b\u0013\n\u0013\f\u0013\u0091\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u00bc\b\u001f\n\u001f\f\u001f"+
		"\u00bf\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u00c5\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0005!\u00cf\b!\n!\f!\u00d2\t!\u0001!\u0001!\u0001!\u0001!\u0003!\u00d8"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u00e1"+
		"\b\"\u0001\"\u0000\u0000#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0003\u0001"+
		"\u0000:;\u0001\u000056\u0003\u0000\"\")).0\u00cc\u0000F\u0001\u0000\u0000"+
		"\u0000\u0002I\u0001\u0000\u0000\u0000\u0004L\u0001\u0000\u0000\u0000\u0006"+
		"O\u0001\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000\nU\u0001\u0000\u0000"+
		"\u0000\fX\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000\u0000\u0010"+
		"^\u0001\u0000\u0000\u0000\u0012`\u0001\u0000\u0000\u0000\u0014c\u0001"+
		"\u0000\u0000\u0000\u0016f\u0001\u0000\u0000\u0000\u0018i\u0001\u0000\u0000"+
		"\u0000\u001al\u0001\u0000\u0000\u0000\u001co\u0001\u0000\u0000\u0000\u001e"+
		"r\u0001\u0000\u0000\u0000 x\u0001\u0000\u0000\u0000\"\u0080\u0001\u0000"+
		"\u0000\u0000$\u0083\u0001\u0000\u0000\u0000&\u0086\u0001\u0000\u0000\u0000"+
		"(\u0092\u0001\u0000\u0000\u0000*\u0094\u0001\u0000\u0000\u0000,\u0096"+
		"\u0001\u0000\u0000\u0000.\u009b\u0001\u0000\u0000\u00000\u00a0\u0001\u0000"+
		"\u0000\u00002\u00a5\u0001\u0000\u0000\u00004\u00aa\u0001\u0000\u0000\u0000"+
		"6\u00ad\u0001\u0000\u0000\u00008\u00b0\u0001\u0000\u0000\u0000:\u00b2"+
		"\u0001\u0000\u0000\u0000<\u00b4\u0001\u0000\u0000\u0000>\u00c4\u0001\u0000"+
		"\u0000\u0000@\u00c6\u0001\u0000\u0000\u0000B\u00d7\u0001\u0000\u0000\u0000"+
		"D\u00e0\u0001\u0000\u0000\u0000FG\u0005\u0001\u0000\u0000GH\u00059\u0000"+
		"\u0000H\u0001\u0001\u0000\u0000\u0000IJ\u0005\u0002\u0000\u0000JK\u0005"+
		"9\u0000\u0000K\u0003\u0001\u0000\u0000\u0000LM\u0005\u0003\u0000\u0000"+
		"MN\u00059\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OP\u0005\u0007\u0000"+
		"\u0000PQ\u00059\u0000\u0000Q\u0007\u0001\u0000\u0000\u0000RS\u0005\b\u0000"+
		"\u0000ST\u00059\u0000\u0000T\t\u0001\u0000\u0000\u0000UV\u0005\t\u0000"+
		"\u0000VW\u00059\u0000\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0005\n\u0000"+
		"\u0000YZ\u0005<\u0000\u0000Z\r\u0001\u0000\u0000\u0000[\\\u0005\u000b"+
		"\u0000\u0000\\]\u00059\u0000\u0000]\u000f\u0001\u0000\u0000\u0000^_\u0007"+
		"\u0000\u0000\u0000_\u0011\u0001\u0000\u0000\u0000`a\u0005\r\u0000\u0000"+
		"ab\u00059\u0000\u0000b\u0013\u0001\u0000\u0000\u0000cd\u0005\u000e\u0000"+
		"\u0000de\u00059\u0000\u0000e\u0015\u0001\u0000\u0000\u0000fg\u0005\u000f"+
		"\u0000\u0000gh\u00059\u0000\u0000h\u0017\u0001\u0000\u0000\u0000ij\u0005"+
		"\u0010\u0000\u0000jk\u00059\u0000\u0000k\u0019\u0001\u0000\u0000\u0000"+
		"lm\u0005\u0011\u0000\u0000mn\u00059\u0000\u0000n\u001b\u0001\u0000\u0000"+
		"\u0000op\u0005\u0017\u0000\u0000pq\u00059\u0000\u0000q\u001d\u0001\u0000"+
		"\u0000\u0000rt\u0005\u0016\u0000\u0000su\u0003 \u0010\u0000ts\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000w\u001f\u0001\u0000\u0000\u0000x}\u00059\u0000\u0000"+
		"yz\u00057\u0000\u0000z|\u00059\u0000\u0000{y\u0001\u0000\u0000\u0000|"+
		"\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~!\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u0018\u0000\u0000\u0081\u0082\u0005!\u0000\u0000\u0082"+
		"#\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0019\u0000\u0000\u0084\u0085"+
		"\u0005!\u0000\u0000\u0085%\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u001a"+
		"\u0000\u0000\u0087\u0088\u0005\"\u0000\u0000\u0088\u0089\u0005#\u0000"+
		"\u0000\u0089\u008a\u0005$\u0000\u0000\u008a\u008b\u0003*\u0015\u0000\u008b"+
		"\u008f\u0003(\u0014\u0000\u008c\u008e\u0005&\u0000\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\'\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u00059\u0000"+
		"\u0000\u0093)\u0001\u0000\u0000\u0000\u0094\u0095\u0007\u0001\u0000\u0000"+
		"\u0095+\u0001\u0000\u0000\u0000\u0096\u0097\u00038\u001c\u0000\u0097\u0098"+
		"\u0005#\u0000\u0000\u0098\u0099\u0005$\u0000\u0000\u0099\u009a\u0003("+
		"\u0014\u0000\u009a-\u0001\u0000\u0000\u0000\u009b\u009c\u00038\u001c\u0000"+
		"\u009c\u009d\u0005#\u0000\u0000\u009d\u009e\u0005$\u0000\u0000\u009e\u009f"+
		"\u0003(\u0014\u0000\u009f/\u0001\u0000\u0000\u0000\u00a0\u00a1\u00038"+
		"\u001c\u0000\u00a1\u00a2\u0005#\u0000\u0000\u00a2\u00a3\u0005$\u0000\u0000"+
		"\u00a3\u00a4\u0003(\u0014\u0000\u00a41\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u00038\u001c\u0000\u00a6\u00a7\u0005#\u0000\u0000\u00a7\u00a8\u0005$"+
		"\u0000\u0000\u00a8\u00a9\u0003(\u0014\u0000\u00a93\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0003:\u001d\u0000\u00ab\u00ac\u0005\'\u0000\u0000\u00ac"+
		"5\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005(\u0000\u0000\u00ae\u00af\u0003"+
		"<\u001e\u0000\u00af7\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005+\u0000"+
		"\u0000\u00b19\u0001\u0000\u0000\u0000\u00b2\u00b3\u0007\u0002\u0000\u0000"+
		"\u00b3;\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003D\"\u0000\u00b5\u00b6"+
		"\u0005\u0000\u0000\u0001\u00b6=\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		".\u0000\u0000\u00b8\u00bd\u0003@ \u0000\u00b9\u00ba\u00057\u0000\u0000"+
		"\u00ba\u00bc\u0003@ \u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005/\u0000\u0000\u00c1\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0005.\u0000\u0000\u00c3\u00c5\u0005/\u0000"+
		"\u0000\u00c4\u00b7\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c5?\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005>\u0000\u0000\u00c7"+
		"\u00c8\u00051\u0000\u0000\u00c8\u00c9\u0003D\"\u0000\u00c9A\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u00052\u0000\u0000\u00cb\u00d0\u0003D\"\u0000"+
		"\u00cc\u00cd\u00057\u0000\u0000\u00cd\u00cf\u0003D\"\u0000\u00ce\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u00053\u0000\u0000\u00d4\u00d8\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"2\u0000\u0000\u00d6\u00d8\u00053\u0000\u0000\u00d7\u00ca\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8C\u0001\u0000\u0000\u0000"+
		"\u00d9\u00e1\u0005>\u0000\u0000\u00da\u00e1\u0005?\u0000\u0000\u00db\u00e1"+
		"\u0003>\u001f\u0000\u00dc\u00e1\u0003B!\u0000\u00dd\u00e1\u00055\u0000"+
		"\u0000\u00de\u00e1\u00056\u0000\u0000\u00df\u00e1\u00054\u0000\u0000\u00e0"+
		"\u00d9\u0001\u0000\u0000\u0000\u00e0\u00da\u0001\u0000\u0000\u0000\u00e0"+
		"\u00db\u0001\u0000\u0000\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e0"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1E\u0001\u0000\u0000\u0000\bv}\u008f"+
		"\u00bd\u00c4\u00d0\u00d7\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}