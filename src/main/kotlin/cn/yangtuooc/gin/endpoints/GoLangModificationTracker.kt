package cn.yangtuooc.gin.endpoints

import com.goide.GoLanguage
import com.intellij.openapi.components.ComponentManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.ModificationTracker
import com.intellij.psi.PsiManager

/**
 * @author yangtuo
 */
class GoLangModificationTracker(project: Project) : ModificationTracker {

    private val goLangTracker: ModificationTracker =
        PsiManager.getInstance(project).modificationTracker.forLanguage(GoLanguage.INSTANCE)

    override fun getModificationCount(): Long = goLangTracker.modificationCount

    companion object {
        fun getInstance(project: Project): ModificationTracker {
            return (project as ComponentManager).getService(GoLangModificationTracker::class.java)
        }
    }
}