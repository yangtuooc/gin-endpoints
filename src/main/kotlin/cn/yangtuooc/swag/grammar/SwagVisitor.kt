// Generated from /Users/yangtuo/projects/open-source/gin-endpoints/src/main/kotlin/cn/yangtuooc/swag/Swag.g4 by ANTLR 4.13.1
package cn.yangtuooc.swag.grammar

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced by [SwagParser].
 *
 * @param T The return type of the visit operation.
 *   Use [Unit] for operations with no return type
 */
public interface SwagVisitor<T> : ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by [SwagParser.swag].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitSwag(ctx: SwagParser.SwagContext): T
    /**
     * Visit a parse tree produced by [SwagParser.title].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTitle(ctx: SwagParser.TitleContext): T
    /**
     * Visit a parse tree produced by [SwagParser.version].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitVersion(ctx: SwagParser.VersionContext): T
    /**
     * Visit a parse tree produced by [SwagParser.description].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitDescription(ctx: SwagParser.DescriptionContext): T
    /**
     * Visit a parse tree produced by [SwagParser.termsOfService].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTermsOfService(ctx: SwagParser.TermsOfServiceContext): T
    /**
     * Visit a parse tree produced by [SwagParser.contactName].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitContactName(ctx: SwagParser.ContactNameContext): T
    /**
     * Visit a parse tree produced by [SwagParser.contactUrl].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitContactUrl(ctx: SwagParser.ContactUrlContext): T
    /**
     * Visit a parse tree produced by [SwagParser.contactEmail].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitContactEmail(ctx: SwagParser.ContactEmailContext): T
    /**
     * Visit a parse tree produced by [SwagParser.licenseName].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitLicenseName(ctx: SwagParser.LicenseNameContext): T
    /**
     * Visit a parse tree produced by [SwagParser.licenseUrl].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitLicenseUrl(ctx: SwagParser.LicenseUrlContext): T
    /**
     * Visit a parse tree produced by [SwagParser.host].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitHost(ctx: SwagParser.HostContext): T
    /**
     * Visit a parse tree produced by [SwagParser.basePath].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitBasePath(ctx: SwagParser.BasePathContext): T
    /**
     * Visit a parse tree produced by [SwagParser.summary].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitSummary(ctx: SwagParser.SummaryContext): T
    /**
     * Visit a parse tree produced by [SwagParser.tags].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTags(ctx: SwagParser.TagsContext): T
    /**
     * Visit a parse tree produced by [SwagParser.tag].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTag(ctx: SwagParser.TagContext): T
    /**
     * Visit a parse tree produced by [SwagParser.accept].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitAccept(ctx: SwagParser.AcceptContext): T
    /**
     * Visit a parse tree produced by [SwagParser.produce].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitProduce(ctx: SwagParser.ProduceContext): T
    /**
     * Visit a parse tree produced by [SwagParser.param].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitParam(ctx: SwagParser.ParamContext): T
    /**
     * Visit a parse tree produced by [SwagParser.isMandatory].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitIsMandatory(ctx: SwagParser.IsMandatoryContext): T
    /**
     * Visit a parse tree produced by [SwagParser.comment].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitComment(ctx: SwagParser.CommentContext): T
    /**
     * Visit a parse tree produced by [SwagParser.attributes].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitAttributes(ctx: SwagParser.AttributesContext): T
    /**
     * Visit a parse tree produced by [SwagParser.success].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitSuccess(ctx: SwagParser.SuccessContext): T
    /**
     * Visit a parse tree produced by [SwagParser.failure].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitFailure(ctx: SwagParser.FailureContext): T
    /**
     * Visit a parse tree produced by [SwagParser.response].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitResponse(ctx: SwagParser.ResponseContext): T
    /**
     * Visit a parse tree produced by [SwagParser.header].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitHeader(ctx: SwagParser.HeaderContext): T
    /**
     * Visit a parse tree produced by [SwagParser.returnCode].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitReturnCode(ctx: SwagParser.ReturnCodeContext): T
    /**
     * Visit a parse tree produced by [SwagParser.router].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitRouter(ctx: SwagParser.RouterContext): T
    /**
     * Visit a parse tree produced by [SwagParser.path].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitPath(ctx: SwagParser.PathContext): T
    /**
     * Visit a parse tree produced by [SwagParser.httpMethod].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitHttpMethod(ctx: SwagParser.HttpMethodContext): T
    /**
     * Visit a parse tree produced by [SwagParser.extensions].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitExtensions(ctx: SwagParser.ExtensionsContext): T
    /**
     * Visit a parse tree produced by [SwagParser.json].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitJson(ctx: SwagParser.JsonContext): T
    /**
     * Visit a parse tree produced by [SwagParser.obj].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitObj(ctx: SwagParser.ObjContext): T
    /**
     * Visit a parse tree produced by [SwagParser.pair].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitPair(ctx: SwagParser.PairContext): T
    /**
     * Visit a parse tree produced by [SwagParser.arr].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitArr(ctx: SwagParser.ArrContext): T
    /**
     * Visit a parse tree produced by [SwagParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitValue(ctx: SwagParser.ValueContext): T
}