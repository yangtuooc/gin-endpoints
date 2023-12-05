package cn.yangtuooc.gin.endpoints

import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.psi.search.GlobalSearchScope

/**
 * @author yangtuo
 */
internal fun hasGinFlow(project: Project): Boolean {
    return true
}

internal fun hasGinFlow(module: Module): Boolean {
    return true
}

internal fun findGinRoutes(project: Project, scope: GlobalSearchScope): Collection<GinRoute> {
    return emptyList()
}