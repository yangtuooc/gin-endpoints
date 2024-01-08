// Generated from /Users/yangtuo/projects/open-source/gin-endpoints/src/main/kotlin/cn/yangtuooc/swag/SwagParser.g4 by ANTLR 4.13.1
package cn.yangtuooc.swag

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by [SwagParser].
 */
public interface SwagParserListener : ParseTreeListener {
    /**
     * Enter a parse tree produced by [SwagParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun enterStatement(ctx: SwagParser.StatementContext)

    /**
     * Exit a parse tree produced by [SwagParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun exitStatement(ctx: SwagParser.StatementContext)
    /**
     * Enter a parse tree produced by [SwagParser.title].
     *
     * @param ctx The parse tree
     */
    public fun enterTitle(ctx: SwagParser.TitleContext)

    /**
     * Exit a parse tree produced by [SwagParser.title].
     *
     * @param ctx The parse tree
     */
    public fun exitTitle(ctx: SwagParser.TitleContext)
    /**
     * Enter a parse tree produced by [SwagParser.version].
     *
     * @param ctx The parse tree
     */
    public fun enterVersion(ctx: SwagParser.VersionContext)

    /**
     * Exit a parse tree produced by [SwagParser.version].
     *
     * @param ctx The parse tree
     */
    public fun exitVersion(ctx: SwagParser.VersionContext)
    /**
     * Enter a parse tree produced by [SwagParser.description].
     *
     * @param ctx The parse tree
     */
    public fun enterDescription(ctx: SwagParser.DescriptionContext)

    /**
     * Exit a parse tree produced by [SwagParser.description].
     *
     * @param ctx The parse tree
     */
    public fun exitDescription(ctx: SwagParser.DescriptionContext)
    /**
     * Enter a parse tree produced by [SwagParser.termsOfService].
     *
     * @param ctx The parse tree
     */
    public fun enterTermsOfService(ctx: SwagParser.TermsOfServiceContext)

    /**
     * Exit a parse tree produced by [SwagParser.termsOfService].
     *
     * @param ctx The parse tree
     */
    public fun exitTermsOfService(ctx: SwagParser.TermsOfServiceContext)
    /**
     * Enter a parse tree produced by [SwagParser.contactName].
     *
     * @param ctx The parse tree
     */
    public fun enterContactName(ctx: SwagParser.ContactNameContext)

    /**
     * Exit a parse tree produced by [SwagParser.contactName].
     *
     * @param ctx The parse tree
     */
    public fun exitContactName(ctx: SwagParser.ContactNameContext)
    /**
     * Enter a parse tree produced by [SwagParser.contactUrl].
     *
     * @param ctx The parse tree
     */
    public fun enterContactUrl(ctx: SwagParser.ContactUrlContext)

    /**
     * Exit a parse tree produced by [SwagParser.contactUrl].
     *
     * @param ctx The parse tree
     */
    public fun exitContactUrl(ctx: SwagParser.ContactUrlContext)
    /**
     * Enter a parse tree produced by [SwagParser.contactEmail].
     *
     * @param ctx The parse tree
     */
    public fun enterContactEmail(ctx: SwagParser.ContactEmailContext)

    /**
     * Exit a parse tree produced by [SwagParser.contactEmail].
     *
     * @param ctx The parse tree
     */
    public fun exitContactEmail(ctx: SwagParser.ContactEmailContext)
    /**
     * Enter a parse tree produced by [SwagParser.licenseName].
     *
     * @param ctx The parse tree
     */
    public fun enterLicenseName(ctx: SwagParser.LicenseNameContext)

    /**
     * Exit a parse tree produced by [SwagParser.licenseName].
     *
     * @param ctx The parse tree
     */
    public fun exitLicenseName(ctx: SwagParser.LicenseNameContext)
    /**
     * Enter a parse tree produced by [SwagParser.licenseUrl].
     *
     * @param ctx The parse tree
     */
    public fun enterLicenseUrl(ctx: SwagParser.LicenseUrlContext)

    /**
     * Exit a parse tree produced by [SwagParser.licenseUrl].
     *
     * @param ctx The parse tree
     */
    public fun exitLicenseUrl(ctx: SwagParser.LicenseUrlContext)
    /**
     * Enter a parse tree produced by [SwagParser.host].
     *
     * @param ctx The parse tree
     */
    public fun enterHost(ctx: SwagParser.HostContext)

    /**
     * Exit a parse tree produced by [SwagParser.host].
     *
     * @param ctx The parse tree
     */
    public fun exitHost(ctx: SwagParser.HostContext)
    /**
     * Enter a parse tree produced by [SwagParser.basePath].
     *
     * @param ctx The parse tree
     */
    public fun enterBasePath(ctx: SwagParser.BasePathContext)

    /**
     * Exit a parse tree produced by [SwagParser.basePath].
     *
     * @param ctx The parse tree
     */
    public fun exitBasePath(ctx: SwagParser.BasePathContext)
    /**
     * Enter a parse tree produced by [SwagParser.securityDefinitionsBasic].
     *
     * @param ctx The parse tree
     */
    public fun enterSecurityDefinitionsBasic(ctx: SwagParser.SecurityDefinitionsBasicContext)

    /**
     * Exit a parse tree produced by [SwagParser.securityDefinitionsBasic].
     *
     * @param ctx The parse tree
     */
    public fun exitSecurityDefinitionsBasic(ctx: SwagParser.SecurityDefinitionsBasicContext)
    /**
     * Enter a parse tree produced by [SwagParser.externalDocsDescription].
     *
     * @param ctx The parse tree
     */
    public fun enterExternalDocsDescription(ctx: SwagParser.ExternalDocsDescriptionContext)

    /**
     * Exit a parse tree produced by [SwagParser.externalDocsDescription].
     *
     * @param ctx The parse tree
     */
    public fun exitExternalDocsDescription(ctx: SwagParser.ExternalDocsDescriptionContext)
    /**
     * Enter a parse tree produced by [SwagParser.externalDocsUrl].
     *
     * @param ctx The parse tree
     */
    public fun enterExternalDocsUrl(ctx: SwagParser.ExternalDocsUrlContext)

    /**
     * Exit a parse tree produced by [SwagParser.externalDocsUrl].
     *
     * @param ctx The parse tree
     */
    public fun exitExternalDocsUrl(ctx: SwagParser.ExternalDocsUrlContext)
    /**
     * Enter a parse tree produced by [SwagParser.summary].
     *
     * @param ctx The parse tree
     */
    public fun enterSummary(ctx: SwagParser.SummaryContext)

    /**
     * Exit a parse tree produced by [SwagParser.summary].
     *
     * @param ctx The parse tree
     */
    public fun exitSummary(ctx: SwagParser.SummaryContext)
    /**
     * Enter a parse tree produced by [SwagParser.tags].
     *
     * @param ctx The parse tree
     */
    public fun enterTags(ctx: SwagParser.TagsContext)

    /**
     * Exit a parse tree produced by [SwagParser.tags].
     *
     * @param ctx The parse tree
     */
    public fun exitTags(ctx: SwagParser.TagsContext)
    /**
     * Enter a parse tree produced by [SwagParser.tag].
     *
     * @param ctx The parse tree
     */
    public fun enterTag(ctx: SwagParser.TagContext)

    /**
     * Exit a parse tree produced by [SwagParser.tag].
     *
     * @param ctx The parse tree
     */
    public fun exitTag(ctx: SwagParser.TagContext)
    /**
     * Enter a parse tree produced by [SwagParser.accept].
     *
     * @param ctx The parse tree
     */
    public fun enterAccept(ctx: SwagParser.AcceptContext)

    /**
     * Exit a parse tree produced by [SwagParser.accept].
     *
     * @param ctx The parse tree
     */
    public fun exitAccept(ctx: SwagParser.AcceptContext)
    /**
     * Enter a parse tree produced by [SwagParser.produce].
     *
     * @param ctx The parse tree
     */
    public fun enterProduce(ctx: SwagParser.ProduceContext)

    /**
     * Exit a parse tree produced by [SwagParser.produce].
     *
     * @param ctx The parse tree
     */
    public fun exitProduce(ctx: SwagParser.ProduceContext)
    /**
     * Enter a parse tree produced by [SwagParser.param].
     *
     * @param ctx The parse tree
     */
    public fun enterParam(ctx: SwagParser.ParamContext)

    /**
     * Exit a parse tree produced by [SwagParser.param].
     *
     * @param ctx The parse tree
     */
    public fun exitParam(ctx: SwagParser.ParamContext)
    /**
     * Enter a parse tree produced by [SwagParser.comment].
     *
     * @param ctx The parse tree
     */
    public fun enterComment(ctx: SwagParser.CommentContext)

    /**
     * Exit a parse tree produced by [SwagParser.comment].
     *
     * @param ctx The parse tree
     */
    public fun exitComment(ctx: SwagParser.CommentContext)
    /**
     * Enter a parse tree produced by [SwagParser.isMandatory].
     *
     * @param ctx The parse tree
     */
    public fun enterIsMandatory(ctx: SwagParser.IsMandatoryContext)

    /**
     * Exit a parse tree produced by [SwagParser.isMandatory].
     *
     * @param ctx The parse tree
     */
    public fun exitIsMandatory(ctx: SwagParser.IsMandatoryContext)
    /**
     * Enter a parse tree produced by [SwagParser.success].
     *
     * @param ctx The parse tree
     */
    public fun enterSuccess(ctx: SwagParser.SuccessContext)

    /**
     * Exit a parse tree produced by [SwagParser.success].
     *
     * @param ctx The parse tree
     */
    public fun exitSuccess(ctx: SwagParser.SuccessContext)
    /**
     * Enter a parse tree produced by [SwagParser.failure].
     *
     * @param ctx The parse tree
     */
    public fun enterFailure(ctx: SwagParser.FailureContext)

    /**
     * Exit a parse tree produced by [SwagParser.failure].
     *
     * @param ctx The parse tree
     */
    public fun exitFailure(ctx: SwagParser.FailureContext)
    /**
     * Enter a parse tree produced by [SwagParser.response].
     *
     * @param ctx The parse tree
     */
    public fun enterResponse(ctx: SwagParser.ResponseContext)

    /**
     * Exit a parse tree produced by [SwagParser.response].
     *
     * @param ctx The parse tree
     */
    public fun exitResponse(ctx: SwagParser.ResponseContext)
    /**
     * Enter a parse tree produced by [SwagParser.header].
     *
     * @param ctx The parse tree
     */
    public fun enterHeader(ctx: SwagParser.HeaderContext)

    /**
     * Exit a parse tree produced by [SwagParser.header].
     *
     * @param ctx The parse tree
     */
    public fun exitHeader(ctx: SwagParser.HeaderContext)
    /**
     * Enter a parse tree produced by [SwagParser.router].
     *
     * @param ctx The parse tree
     */
    public fun enterRouter(ctx: SwagParser.RouterContext)

    /**
     * Exit a parse tree produced by [SwagParser.router].
     *
     * @param ctx The parse tree
     */
    public fun exitRouter(ctx: SwagParser.RouterContext)
    /**
     * Enter a parse tree produced by [SwagParser.extensions].
     *
     * @param ctx The parse tree
     */
    public fun enterExtensions(ctx: SwagParser.ExtensionsContext)

    /**
     * Exit a parse tree produced by [SwagParser.extensions].
     *
     * @param ctx The parse tree
     */
    public fun exitExtensions(ctx: SwagParser.ExtensionsContext)
    /**
     * Enter a parse tree produced by [SwagParser.returnCode].
     *
     * @param ctx The parse tree
     */
    public fun enterReturnCode(ctx: SwagParser.ReturnCodeContext)

    /**
     * Exit a parse tree produced by [SwagParser.returnCode].
     *
     * @param ctx The parse tree
     */
    public fun exitReturnCode(ctx: SwagParser.ReturnCodeContext)
    /**
     * Enter a parse tree produced by [SwagParser.path].
     *
     * @param ctx The parse tree
     */
    public fun enterPath(ctx: SwagParser.PathContext)

    /**
     * Exit a parse tree produced by [SwagParser.path].
     *
     * @param ctx The parse tree
     */
    public fun exitPath(ctx: SwagParser.PathContext)
    /**
     * Enter a parse tree produced by [SwagParser.json].
     *
     * @param ctx The parse tree
     */
    public fun enterJson(ctx: SwagParser.JsonContext)

    /**
     * Exit a parse tree produced by [SwagParser.json].
     *
     * @param ctx The parse tree
     */
    public fun exitJson(ctx: SwagParser.JsonContext)
    /**
     * Enter a parse tree produced by [SwagParser.obj].
     *
     * @param ctx The parse tree
     */
    public fun enterObj(ctx: SwagParser.ObjContext)

    /**
     * Exit a parse tree produced by [SwagParser.obj].
     *
     * @param ctx The parse tree
     */
    public fun exitObj(ctx: SwagParser.ObjContext)
    /**
     * Enter a parse tree produced by [SwagParser.pair].
     *
     * @param ctx The parse tree
     */
    public fun enterPair(ctx: SwagParser.PairContext)

    /**
     * Exit a parse tree produced by [SwagParser.pair].
     *
     * @param ctx The parse tree
     */
    public fun exitPair(ctx: SwagParser.PairContext)
    /**
     * Enter a parse tree produced by [SwagParser.arr].
     *
     * @param ctx The parse tree
     */
    public fun enterArr(ctx: SwagParser.ArrContext)

    /**
     * Exit a parse tree produced by [SwagParser.arr].
     *
     * @param ctx The parse tree
     */
    public fun exitArr(ctx: SwagParser.ArrContext)
    /**
     * Enter a parse tree produced by [SwagParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterValue(ctx: SwagParser.ValueContext)

    /**
     * Exit a parse tree produced by [SwagParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitValue(ctx: SwagParser.ValueContext)
}