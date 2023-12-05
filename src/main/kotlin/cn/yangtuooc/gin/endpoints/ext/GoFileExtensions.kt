package cn.yangtuooc.gin.endpoints.ext

import com.goide.psi.GoFile

/**
 * @author yangtuo
 */
fun GoFile.hasImportsGin(): Boolean {
    return this.imports.any {
        it.text.contains("github.com/gin-gonic/gin")
    }
}