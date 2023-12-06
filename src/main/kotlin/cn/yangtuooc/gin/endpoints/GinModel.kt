package cn.yangtuooc.gin.endpoints

import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project

/**
 * @author yangtuo
 */
internal fun hasGinLibrary(project: Project): Boolean {
    return true
}

internal fun hasGinLibrary(module: Module): Boolean {
    return true
}








