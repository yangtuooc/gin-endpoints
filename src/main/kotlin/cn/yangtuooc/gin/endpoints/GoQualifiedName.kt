package cn.yangtuooc.gin.endpoints

sealed class GoQualifiedName {

    abstract val shortName: String
    abstract val importPath: String
    abstract val asInPsi: String
    abstract val asInIndex: String
}

data class Field(
    override val importPath: String,
    val packageName: String,
    val structName: String,
    val fieldName: String
) : GoQualifiedName() {

    override val shortName: String
        get() = fieldName
    override val asInPsi: String
        get() = "$packageName.$structName.$fieldName"
    override val asInIndex: String
        get() = asInPsi

    override fun toString(): String {
        return "Field(importPath=$importPath,packageName=$packageName,structName=$structName,fieldName=$fieldName)"
    }
}

data class Function(
    override val importPath: String,
    val packageName: String,
    val functionName: String
) : GoQualifiedName() {


    override val shortName: String
        get() = functionName
    override val asInPsi: String
        get() = "$packageName.$functionName"
    override val asInIndex: String
        get() = asInPsi

    override fun toString(): String {
        return "Function(importPath=$importPath, packageName=$packageName, functionName=$functionName)"
    }


}

data class Method(
    override val importPath: String,
    val packageName: String,
    val receiverTypeName: String,
    val methodName: String
) : GoQualifiedName() {


    override val shortName: String
        get() = methodName
    override val asInPsi: String
        get() = "$receiverTypeName.$methodName"
    override val asInIndex: String
        get() = "$packageName.$methodName"

    override fun toString(): String {
        return "Method(importPath=$importPath, packageName=$packageName, receiverTypeName=$receiverTypeName, methodName=$methodName)"
    }
}