package cn.yangtuooc.gin.endpoints.api.converter

import cn.yangtuooc.gin.endpoints.*
import cn.yangtuooc.gin.endpoints.api.GinHandlerFuncImpl
import cn.yangtuooc.gin.endpoints.oas.OasParameterInMapper
import com.goide.psi.GoCallExpr
import com.goide.psi.GoFile
import com.goide.psi.GoReferenceExpression
import com.intellij.microservices.oas.OasParameter
import com.intellij.microservices.oas.OasParameterStyle
import com.intellij.microservices.oas.OasSchema
import com.intellij.microservices.oas.OasSchemaType
import com.intellij.psi.search.LocalSearchScope
import com.intellij.psi.search.SearchScope

/**
 * @author yangtuo
 */
class GinParameterConverter(val group: GoFile, private val endpoint: GinUrlData) :
    OpenApiSpecificationConverter<List<OasParameter>> {

    private val handlerFunc = GinHandlerFuncImpl(endpoint)
    override fun convert(): List<OasParameter> {
        return discoverParameterDeclarations().mapNotNull { buildOasParameter(it) }
    }

    private fun buildOasParameter(expr: GoCallExpr): OasParameter? {
        val builder = OasParameterBuilderFactory.create(expr) ?: return null
        builder.description = handlerFunc.description()
        builder.isDeprecated = handlerFunc.isDeprecated()
        builder.schema = buildSchema(expr)
        builder.style = buildStyle(expr)

        return builder.build()
    }

    private fun buildStyle(expr: GoCallExpr): OasParameterStyle? {
        return null
    }

    private fun buildSchema(expr: GoCallExpr): OasSchema {
        return OasSchema(
            type = OasSchemaType.STRING
        )
    }

    private fun discoverParameterDeclarations(): List<GoCallExpr> {
        val parameterDeclarations =
            GinServerParameterMappingMethod.values().flatMap { suitableLocation ->
                discoverStdLibDeclaration(group.project, suitableLocation)
            }

        val searchScope = useScope() ?: return emptyList()
        return parameterDeclarations.flatMap {
            findArgumentCallExpressionByIndexAmongUsages(it, searchScope)
        }
    }

    private fun useScope(): SearchScope? {
        val element = endpoint.getDocumentationPsiElement() ?: return null
        return LocalSearchScope(element)
    }
}

object OasParameterBuilderFactory {
    fun create(expr: GoCallExpr): OasParameter.Builder? {
        val identifierText = (expr.expression as GoReferenceExpression).identifier.text
        val parameterInfo = findParameterInfo(identifierText) ?: return null

        val argumentExpression =
            expr.argumentList.expressionList.getOrNull(parameterInfo.argumentIndex) ?: return null
        val parameterIn = OasParameterInMapper.map(parameterInfo) ?: return null

        return OasParameter.Builder(argumentExpression.text, parameterIn)
    }

    private fun findParameterInfo(identifier: String): FunctionOrMethodParameterInfo? {
        return GinServerParameterMappingMethod.values().find {
            it.fqn.shortName == identifier
        }
    }
}


