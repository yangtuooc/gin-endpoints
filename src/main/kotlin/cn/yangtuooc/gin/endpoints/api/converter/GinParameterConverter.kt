package cn.yangtuooc.gin.endpoints.api.converter

import cn.yangtuooc.gin.endpoints.*
import cn.yangtuooc.gin.endpoints.api.GinHandlerFuncImpl
import cn.yangtuooc.gin.endpoints.oas.OasParameterInMapper
import cn.yangtuooc.gin.endpoints.oas.ParameterMapper
import cn.yangtuooc.gin.endpoints.visitor.OasPropertiesVisitor
import com.goide.psi.*
import com.intellij.microservices.oas.*
import com.intellij.openapi.options.SchemeManager
import com.intellij.psi.search.LocalSearchScope
import com.intellij.psi.search.SearchScope

/**
 * @author yangtuo
 */
class GinParameterConverter(val group: GoFile, private val endpoint: GinUrlData) :
    OpenApiSpecificationConverter<List<OasParameter>> {

    private val handlerFunc = GinHandlerFuncImpl(endpoint)

    internal var components: OasComponents? = null
    private var ref: String? = null
    override fun convert(): List<OasParameter> {
        return discoverParameterDeclarations().mapNotNull { buildOasParameter(it) }
    }

    private fun buildOasParameter(expr: GoCallExpr): OasParameter? {

        val parameterInfo = getParameterInfo(expr) ?: return null
        val argument = getArgumentByIndex(expr, parameterInfo.argumentIndex) ?: return null
        val mapper = OasParameterInMapper.map(parameterInfo) ?: return null
        val builder = OasParameter.Builder(getArgumentName(argument), mapper.parameterIn)

        builder.description = handlerFunc.description()
        builder.isDeprecated = handlerFunc.isDeprecated()
        builder.schema = buildSchema(argument, mapper)
        builder.style = buildStyle(expr)

//        buildComponents(argument, mapper)

        return builder.build()
    }

    private fun buildStyle(expr: GoCallExpr): OasParameterStyle? {
        return null
    }

    private fun buildSchema(argument: GoExpression, mapper: ParameterMapper): OasSchema {
        return OasSchema(
            type = mapper.type,
//            reference = "#/components/schemas/${getArgumentName(argument)}", // TODO: refactoring
//            properties = buildComponents(argument, mapper)
            properties = listOf(
                OasProperty(
                    name = "agentId",
                    schema = OasSchema(type = OasSchemaType.STRING, format = OasSchemaFormat.UUID)
                ),
            ),
            required = listOf("agentId")
        )
    }

    private fun buildComponents(
        argument: GoExpression,
        mapper: ParameterMapper
    ): List<OasProperty>? {
        if (OasSchemaType.OBJECT == mapper.type) {
            val properties = discoverProperties(argument)

            val schema = OasSchema(type = OasSchemaType.OBJECT, properties = properties)
            components = OasComponents(mapOf(getArgumentName(argument) to schema))
            ref = "#/components/schemas/${getArgumentName(argument)}"
            return properties
        }
        return null
    }

    private fun discoverProperties(argument: GoExpression): List<OasProperty> {
        val visitor = OasPropertiesVisitor()
        argument.accept(visitor)
        return visitor.properties
    }

    private fun getArgumentName(expr: GoExpression?): String {
        return when (expr) {
            is GoStringLiteral -> expr.value.toString()
            is GoReferenceExpression -> expr.identifier.text
            is GoUnaryExpr -> getArgumentName(expr.expression)
            else -> ""
        }
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

    private fun getParameterInfo(expr: GoCallExpr): FunctionOrMethodParameterInfo? {
        val identifierText = (expr.expression as GoReferenceExpression).identifier.text
        return GinServerParameterMappingMethod.values().find {
            it.fqn.shortName == identifierText
        }
    }

    private fun getArgumentByIndex(expr: GoCallExpr, index: Int): GoExpression? {
        return expr.argumentList.expressionList.getOrNull(index)
    }
}




