// Generated from /Users/yangtuo/projects/open-source/gin-endpoints/src/main/kotlin/cn/yangtuooc/swag/SwagParser.g4 by ANTLR 4.13.1
package cn.yangtuooc.swag;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SwagParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SwagParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SwagParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SwagParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(SwagParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(SwagParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(SwagParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#termsOfService}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermsOfService(SwagParser.TermsOfServiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#contactName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContactName(SwagParser.ContactNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#contactUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContactUrl(SwagParser.ContactUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#contactEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContactEmail(SwagParser.ContactEmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#licenseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLicenseName(SwagParser.LicenseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#licenseUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLicenseUrl(SwagParser.LicenseUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(SwagParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#basePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasePath(SwagParser.BasePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#securityDefinitionsBasic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurityDefinitionsBasic(SwagParser.SecurityDefinitionsBasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#externalDocsDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDocsDescription(SwagParser.ExternalDocsDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#externalDocsUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDocsUrl(SwagParser.ExternalDocsUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#summary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummary(SwagParser.SummaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTags(SwagParser.TagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(SwagParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#accept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccept(SwagParser.AcceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#produce}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduce(SwagParser.ProduceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SwagParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SwagParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#isMandatory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsMandatory(SwagParser.IsMandatoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#success}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuccess(SwagParser.SuccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#failure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailure(SwagParser.FailureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#response}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponse(SwagParser.ResponseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(SwagParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#router}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouter(SwagParser.RouterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#extensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensions(SwagParser.ExtensionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#returnCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnCode(SwagParser.ReturnCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(SwagParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(SwagParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(SwagParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(SwagParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(SwagParser.ArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwagParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SwagParser.ValueContext ctx);
}