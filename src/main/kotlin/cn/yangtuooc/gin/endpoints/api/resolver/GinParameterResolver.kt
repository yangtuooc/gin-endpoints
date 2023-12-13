package cn.yangtuooc.gin.endpoints.api.resolver

import cn.yangtuooc.gin.endpoints.GinServerParameterMappingMethod
import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.api.AbstractOasParameter
import cn.yangtuooc.gin.endpoints.discoverStdLibDeclaration
import cn.yangtuooc.gin.endpoints.findArgumentCallExpressionByIndexAmongUsages
import com.goide.psi.GoCallExpr
import com.goide.psi.GoFile
import com.intellij.psi.search.LocalSearchScope
import com.intellij.psi.search.SearchScope

/**
 * @author yangtuo
 */
class GinParameterResolver(val group: GoFile, private val endpoint: GinUrlData) :
    GinResolver<List<AbstractOasParameter>> {
    override fun resolve(): List<AbstractOasParameter> {
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

