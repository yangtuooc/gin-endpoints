package cn.yangtuooc.gin.endpoints.ext

import cn.yangtuooc.gin.endpoints.GinModificationTrackersManager
import cn.yangtuooc.gin.endpoints.GinRoutePointer
import com.goide.GoFileType
import com.goide.psi.GoCallExpr
import com.goide.psi.GoFile
import com.goide.psi.GoRecursiveVisitor
import com.intellij.openapi.module.Module
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.util.CachedValueProvider
import com.intellij.psi.util.CachedValuesManager

/**
 * @author yangtuo
 */

private fun Module.findGinRouteExpressions(): Set<GoCallExpr> {

    val routes = mutableSetOf<GoCallExpr>()
    val goFiles = FileTypeIndex.getFiles(GoFileType.INSTANCE, moduleContentScope)
    goFiles.forEach { virtualFile ->
        val goFile = PsiManager.getInstance(project).findFile(virtualFile) as GoFile
        if (goFile.hasImportsGin()) {
            goFile.accept(object : GoRecursiveVisitor() {
                override fun visitCallExpr(o: GoCallExpr) {
                    if (o.isGinRoute()) {
                        routes.add(o)
                    }
                }
            })
        }
    }
    return routes
}

fun Module.findGinRoutes(): Set<GinRoutePointer> {
    return CachedValuesManager.getManager(project).getCachedValue(this, GinRoutePointerProvider(this))
}

class GinRoutePointerProvider(private val module: Module) : CachedValueProvider<Set<GinRoutePointer>> {
    override fun compute(): CachedValueProvider.Result<Set<GinRoutePointer>> {
        val pointers = mutableSetOf<GinRoutePointer>()

        module.findGinRouteExpressions().forEach { pointers.add(GinRoutePointer(it)) }
        return CachedValueProvider.Result.create(
            pointers,
            mutableListOf<Any>(
                ProjectRootManager.getInstance(module.project),
                GinModificationTrackersManager.getInstance(module.project).getEndpointsModificationTracker()
            )
        )
    }
}
