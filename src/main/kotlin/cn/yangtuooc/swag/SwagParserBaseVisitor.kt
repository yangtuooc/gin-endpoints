// Generated from /Users/yangtuo/projects/open-source/gin-endpoints/src/main/kotlin/cn/yangtuooc/swag/SwagParser.g4 by ANTLR 4.13.1
package cn.yangtuooc.swag

import org.antlr.v4.kotlinruntime.tree.AbstractParseTreeVisitor

/**
 * This class provides an empty implementation of [SwagParserVisitor],
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param T The return type of the visit operation.
 *   Use [Unit] for operations with no return type
 */
public open class SwagParserBaseVisitor<T> : AbstractParseTreeVisitor<T>(), SwagParserVisitor<T> {
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitStatement(ctx: SwagParser.StatementContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTitle(ctx: SwagParser.TitleContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitVersion(ctx: SwagParser.VersionContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitDescription(ctx: SwagParser.DescriptionContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTermsOfService(ctx: SwagParser.TermsOfServiceContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitContactName(ctx: SwagParser.ContactNameContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitContactUrl(ctx: SwagParser.ContactUrlContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitContactEmail(ctx: SwagParser.ContactEmailContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitLicenseName(ctx: SwagParser.LicenseNameContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitLicenseUrl(ctx: SwagParser.LicenseUrlContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitHost(ctx: SwagParser.HostContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitBasePath(ctx: SwagParser.BasePathContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitSecurityDefinitionsBasic(ctx: SwagParser.SecurityDefinitionsBasicContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitExternalDocsDescription(ctx: SwagParser.ExternalDocsDescriptionContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitExternalDocsUrl(ctx: SwagParser.ExternalDocsUrlContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitSummary(ctx: SwagParser.SummaryContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTags(ctx: SwagParser.TagsContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTag(ctx: SwagParser.TagContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitAccept(ctx: SwagParser.AcceptContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitProduce(ctx: SwagParser.ProduceContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitParam(ctx: SwagParser.ParamContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitComment(ctx: SwagParser.CommentContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitIsMandatory(ctx: SwagParser.IsMandatoryContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitSuccess(ctx: SwagParser.SuccessContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitFailure(ctx: SwagParser.FailureContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitResponse(ctx: SwagParser.ResponseContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitHeader(ctx: SwagParser.HeaderContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitRouter(ctx: SwagParser.RouterContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitExtensions(ctx: SwagParser.ExtensionsContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitReturnCode(ctx: SwagParser.ReturnCodeContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitPath(ctx: SwagParser.PathContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitJson(ctx: SwagParser.JsonContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitObj(ctx: SwagParser.ObjContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitPair(ctx: SwagParser.PairContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitArr(ctx: SwagParser.ArrContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitValue(ctx: SwagParser.ValueContext): T {
        return this.visitChildren(ctx)!!
    }
}