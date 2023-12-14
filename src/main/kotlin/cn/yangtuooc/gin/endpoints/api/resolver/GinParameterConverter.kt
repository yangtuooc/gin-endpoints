package cn.yangtuooc.gin.endpoints.api.resolver

import cn.yangtuooc.gin.endpoints.GinServerParameterMappingMethod
import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.discoverStdLibDeclaration
import cn.yangtuooc.gin.endpoints.findArgumentCallExpressionByIndexAmongUsages
import com.goide.psi.GoCallExpr
import com.goide.psi.GoFile
import com.intellij.microservices.oas.OasSchema
import com.intellij.psi.search.LocalSearchScope
import com.intellij.psi.search.SearchScope

/**
 * @author yangtuo
 */
class GinParameterConverter(val group: GoFile, private val endpoint: GinUrlData) :
    OpenApiSpecificationConverter<List<OasSchema>> {
    override fun convert(): List<OasSchema> {
        return emptyList()
    }

    private fun discoverParameterDeclarations(): List<GoCallExpr> {
        val parameterDeclarations =
            GinServerParameterMappingMethod.values().flatMap { suitableLocation ->
                discoverStdLibDeclaration(group.project, suitableLocation)
            }

        val searchScope = useScope() ?: return emptyList()
        return parameterDeclarations.flatMap {
            findArgumentCallExpressionByIndexAmongUsages(
                it,
                searchScope
            )
        }
    }

    private fun useScope(): SearchScope? {
        val element = endpoint.getDocumentationPsiElement() ?: return null
        return LocalSearchScope(element)
    }
}

