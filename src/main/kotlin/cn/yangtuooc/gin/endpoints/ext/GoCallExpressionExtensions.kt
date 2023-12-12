package cn.yangtuooc.gin.endpoints.ext

import cn.yangtuooc.gin.endpoints.GinServerGroupDefinitionMethod
import com.goide.psi.*
import com.goide.psi.impl.GoTypeUtil

/**
 * @author yangtuo
 */
fun GoCallExpr.buildCompleteUrl(argumentIndex: Int): String {
    val segment = this.extractUrlSegment(argumentIndex) ?: ""
    val baseURLSegment = resolveBaseUrlSegment(this.expression)
    return combineUrlSegments(baseURLSegment, segment)
}

fun GoCallExpr.extractUrlSegment(argumentIndex: Int): String? {
    return this.argumentList.expressionList.getOrNull(argumentIndex)
        ?.takeIf { GoTypeUtil.isString(it.getGoType(null), it) }?.text?.trim('"')
}

internal fun combineUrlSegments(baseSegment: String?, additionalSegment: String): String {
    val normalizedBaseSegment = baseSegment?.trim('/') ?: ""
    val normalizedAdditionalSegment = additionalSegment.trim('/')
    return "/$normalizedBaseSegment/$normalizedAdditionalSegment".replace("//", "/")
}

internal fun resolveBaseUrlSegment(goExpression: GoExpression): String? {
    val resolvedElement =
        (goExpression as? GoReferenceExpression)?.qualifier?.reference?.resolve() ?: return null
    val baseUrlExpr = when (val declaration = resolvedElement.parent) {
        is GoShortVarDeclaration -> declaration.rightExpressionsList.firstOrNull() as GoCallExpr
        is GoVarDeclaration -> {
            // TODO: support var definition
            return null
        }

        else -> null
    }

    return baseUrlExpr?.extractUrlSegment(GinServerGroupDefinitionMethod.GROUP.argumentIndex)
}

