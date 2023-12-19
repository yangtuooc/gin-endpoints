package cn.yangtuooc.gin.endpoints.visitor

import com.goide.psi.*
import com.intellij.microservices.oas.OasProperty
import com.intellij.microservices.oas.OasSchema
import com.intellij.microservices.oas.OasSchemaType
import java.util.*

/**
 * @author yangtuo
 */
class OasPropertiesVisitor : GoRecursiveVisitor() {

    internal val properties = mutableListOf<OasProperty>()
    private val schemaBuilderStack = Stack<Pair<String, OasSchema.Builder>>()


    override fun visitUnaryExpr(o: GoUnaryExpr) {
        this.visitReferenceExpression(o.expression as GoReferenceExpression)
    }

    override fun visitReferenceExpression(o: GoReferenceExpression) {
        val parent = o.resolve()?.parent ?: return
        when (parent) {
            is GoShortVarDeclaration -> this.visitShortVarDeclaration(parent)
        }
    }

    override fun visitShortVarDeclaration(o: GoShortVarDeclaration) {
        val expression = o.rightExpressionsList.firstOrNull() ?: return
        when (expression) {
            is GoCompositeLit -> this.visitCompositeLit(expression)
        }
    }

    override fun visitCompositeLit(o: GoCompositeLit) {
        val goType = o.getGoUnderlyingType(null) ?: return
        this.visitType(goType)
    }

    override fun visitType(o: GoType) {
        when (o) {
            is GoStructType -> this.visitStructType(o)
            is GoArrayOrSliceType -> this.visitArrayOrSliceType(o)
        }
    }

    override fun visitStructType(o: GoStructType) {
        o.fieldDeclarationList.forEach { this.visitFieldDeclaration(it) }
    }

    override fun visitFieldDeclaration(o: GoFieldDeclaration) {

        val name = o.tag?.getValue("json") ?: o.fieldDefinitionList.firstOrNull()?.name ?: return
        val type = o.type ?: return
        val schemaType = GoTypeMapper.map(type, type.context)

        val builder = OasSchema.Builder(schemaType)
        if (OasSchemaType.OBJECT == schemaType || OasSchemaType.ARRAY == schemaType) {
            schemaBuilderStack.push(name to builder)
            this.visitType(type)
        }
        if (schemaBuilderStack.empty().not()) {
            schemaBuilderStack.peek().second.properties = mutableMapOf(name to builder.build())
        } else {
            properties.add(OasProperty(name, builder.build()))
        }
    }
}