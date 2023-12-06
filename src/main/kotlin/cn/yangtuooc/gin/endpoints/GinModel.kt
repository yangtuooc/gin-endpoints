package cn.yangtuooc.gin.endpoints

import cn.yangtuooc.gin.endpoints.ext.findGinRouteExpressions
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.psi.util.CachedValueProvider
import com.intellij.psi.util.CachedValueProvider.Result
import com.intellij.psi.util.CachedValuesManager

/**
 * @author yangtuo
 */
internal fun hasGinLibrary(project: Project): Boolean {
    return true
}

internal fun hasGinLibrary(module: Module): Boolean {
    return true
}


internal fun findGinRoutes(module: Module): Set<GinRoutePointer> {
    return CachedValuesManager.getManager(module.project).getCachedValue(module, GinRoutePointerProvider(module))
}

class GinRoutePointerProvider(private val module: Module) : CachedValueProvider<Set<GinRoutePointer>> {
    override fun compute(): Result<Set<GinRoutePointer>> {
        val pointers = mutableSetOf<GinRoutePointer>()

        module.findGinRouteExpressions().forEach { pointers.add(GinRoutePointer(it)) }
        return Result.create(
            pointers,
            mutableListOf<Any>(
                ProjectRootManager.getInstance(module.project),
                GinModificationTrackersManager.getInstance(module.project).getEndpointsModificationTracker()
            )
        )
    }
}





