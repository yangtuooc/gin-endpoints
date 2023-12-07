package cn.yangtuooc.gin.handlerFunc

/**
 * @author yangtuo
 */
interface GinParameter {
    fun getName(): String
    fun getType(): ParameterType
    fun getRequired(): Boolean
    fun getDefaultValue(): String?
    fun getDescription(): String?
    fun getExample(): String?
    fun getDeprecated(): Boolean
    fun getIn(): String
    fun getReferences(): List<GinParameter>
}