// Generated from /Users/yangtuo/projects/open-source/gin-endpoints/src/main/kotlin/cn/yangtuooc/swag/SwagParser.g4 by ANTLR 4.13.1
package cn.yangtuooc.swag;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SwagParser}.
 */
public interface SwagParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SwagParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SwagParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SwagParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(SwagParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(SwagParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(SwagParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(SwagParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(SwagParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(SwagParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#termsOfService}.
	 * @param ctx the parse tree
	 */
	void enterTermsOfService(SwagParser.TermsOfServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#termsOfService}.
	 * @param ctx the parse tree
	 */
	void exitTermsOfService(SwagParser.TermsOfServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#contactName}.
	 * @param ctx the parse tree
	 */
	void enterContactName(SwagParser.ContactNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#contactName}.
	 * @param ctx the parse tree
	 */
	void exitContactName(SwagParser.ContactNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#contactUrl}.
	 * @param ctx the parse tree
	 */
	void enterContactUrl(SwagParser.ContactUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#contactUrl}.
	 * @param ctx the parse tree
	 */
	void exitContactUrl(SwagParser.ContactUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#contactEmail}.
	 * @param ctx the parse tree
	 */
	void enterContactEmail(SwagParser.ContactEmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#contactEmail}.
	 * @param ctx the parse tree
	 */
	void exitContactEmail(SwagParser.ContactEmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#licenseName}.
	 * @param ctx the parse tree
	 */
	void enterLicenseName(SwagParser.LicenseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#licenseName}.
	 * @param ctx the parse tree
	 */
	void exitLicenseName(SwagParser.LicenseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#licenseUrl}.
	 * @param ctx the parse tree
	 */
	void enterLicenseUrl(SwagParser.LicenseUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#licenseUrl}.
	 * @param ctx the parse tree
	 */
	void exitLicenseUrl(SwagParser.LicenseUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(SwagParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(SwagParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#basePath}.
	 * @param ctx the parse tree
	 */
	void enterBasePath(SwagParser.BasePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#basePath}.
	 * @param ctx the parse tree
	 */
	void exitBasePath(SwagParser.BasePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#securityDefinitionsBasic}.
	 * @param ctx the parse tree
	 */
	void enterSecurityDefinitionsBasic(SwagParser.SecurityDefinitionsBasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#securityDefinitionsBasic}.
	 * @param ctx the parse tree
	 */
	void exitSecurityDefinitionsBasic(SwagParser.SecurityDefinitionsBasicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#externalDocsDescription}.
	 * @param ctx the parse tree
	 */
	void enterExternalDocsDescription(SwagParser.ExternalDocsDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#externalDocsDescription}.
	 * @param ctx the parse tree
	 */
	void exitExternalDocsDescription(SwagParser.ExternalDocsDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#externalDocsUrl}.
	 * @param ctx the parse tree
	 */
	void enterExternalDocsUrl(SwagParser.ExternalDocsUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#externalDocsUrl}.
	 * @param ctx the parse tree
	 */
	void exitExternalDocsUrl(SwagParser.ExternalDocsUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#summary}.
	 * @param ctx the parse tree
	 */
	void enterSummary(SwagParser.SummaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#summary}.
	 * @param ctx the parse tree
	 */
	void exitSummary(SwagParser.SummaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(SwagParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(SwagParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(SwagParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(SwagParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#accept}.
	 * @param ctx the parse tree
	 */
	void enterAccept(SwagParser.AcceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#accept}.
	 * @param ctx the parse tree
	 */
	void exitAccept(SwagParser.AcceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#produce}.
	 * @param ctx the parse tree
	 */
	void enterProduce(SwagParser.ProduceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#produce}.
	 * @param ctx the parse tree
	 */
	void exitProduce(SwagParser.ProduceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(SwagParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(SwagParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(SwagParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(SwagParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#isMandatory}.
	 * @param ctx the parse tree
	 */
	void enterIsMandatory(SwagParser.IsMandatoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#isMandatory}.
	 * @param ctx the parse tree
	 */
	void exitIsMandatory(SwagParser.IsMandatoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#success}.
	 * @param ctx the parse tree
	 */
	void enterSuccess(SwagParser.SuccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#success}.
	 * @param ctx the parse tree
	 */
	void exitSuccess(SwagParser.SuccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#failure}.
	 * @param ctx the parse tree
	 */
	void enterFailure(SwagParser.FailureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#failure}.
	 * @param ctx the parse tree
	 */
	void exitFailure(SwagParser.FailureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#response}.
	 * @param ctx the parse tree
	 */
	void enterResponse(SwagParser.ResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#response}.
	 * @param ctx the parse tree
	 */
	void exitResponse(SwagParser.ResponseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(SwagParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(SwagParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#router}.
	 * @param ctx the parse tree
	 */
	void enterRouter(SwagParser.RouterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#router}.
	 * @param ctx the parse tree
	 */
	void exitRouter(SwagParser.RouterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#extensions}.
	 * @param ctx the parse tree
	 */
	void enterExtensions(SwagParser.ExtensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#extensions}.
	 * @param ctx the parse tree
	 */
	void exitExtensions(SwagParser.ExtensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#returnCode}.
	 * @param ctx the parse tree
	 */
	void enterReturnCode(SwagParser.ReturnCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#returnCode}.
	 * @param ctx the parse tree
	 */
	void exitReturnCode(SwagParser.ReturnCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(SwagParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(SwagParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(SwagParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(SwagParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(SwagParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(SwagParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(SwagParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(SwagParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(SwagParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(SwagParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwagParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SwagParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwagParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SwagParser.ValueContext ctx);
}