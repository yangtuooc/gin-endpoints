package cn.yangtuooc.gin.endpoints

import java.util.*
import kotlin.jvm.internal.Intrinsics

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
    init {
        Intrinsics.checkNotNullParameter(importPath, "importPath")
        Intrinsics.checkNotNullParameter(packageName, "packageName")
        Intrinsics.checkNotNullParameter(structName, "structName")
        Intrinsics.checkNotNullParameter(fieldName, "fieldName")
    }


    override val shortName: String
        get() = fieldName
    override val asInPsi: String
        get() = "$packageName.$structName.$fieldName"
    override val asInIndex: String
        get() = asInPsi

    override fun toString(): String {
        return "Field(importPath=$importPath,packageName=$packageName,structName=$structName,fieldName=$fieldName)"
    }

    override fun hashCode(): Int {
        return Objects.hash(importPath, packageName, structName, fieldName)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other !is Field) {
            return false
        }
        return Intrinsics.areEqual(importPath, other.importPath) &&
                Intrinsics.areEqual(packageName, other.packageName) &&
                Intrinsics.areEqual(structName, other.structName) &&
                Intrinsics.areEqual(fieldName, other.fieldName)
    }
}

data class Function(
    override val importPath: String,
    val packageName: String,
    val functionName: String
) : GoQualifiedName() {

    init {
        Intrinsics.checkNotNullParameter(importPath, "importPath")
        Intrinsics.checkNotNullParameter(packageName, "packageName")
        Intrinsics.checkNotNullParameter(functionName, "functionName")
    }

    override val shortName: String
        get() = functionName
    override val asInPsi: String
        get() = "$packageName.$functionName"
    override val asInIndex: String
        get() = asInPsi

    override fun toString(): String {
        return "Function(importPath=$importPath, packageName=$packageName, functionName=$functionName)"
    }

    override fun hashCode(): Int = Objects.hash(importPath, packageName, functionName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Function) return false

        return Intrinsics.areEqual(importPath, other.importPath) &&
                Intrinsics.areEqual(packageName, other.packageName) &&
                Intrinsics.areEqual(functionName, other.functionName)
    }
}

data class Method(
    override val importPath: String,
    val packageName: String,
    val receiverTypeName: String,
    val methodName: String
) : GoQualifiedName() {
    init {
        Intrinsics.checkNotNullParameter(importPath, "importPath")
        Intrinsics.checkNotNullParameter(packageName, "packageName")
        Intrinsics.checkNotNullParameter(receiverTypeName, "receiverTypeName")
        Intrinsics.checkNotNullParameter(methodName, "methodName")
    }

    override val shortName: String
        get() = methodName
    override val asInPsi: String
        get() = "$receiverTypeName.$methodName"
    override val asInIndex: String
        get() = "$packageName.$methodName"

    override fun toString(): String {
        return "Method(importPath=$importPath, packageName=$packageName, receiverTypeName=$receiverTypeName, methodName=$methodName)"
    }

    override fun hashCode(): Int {
        return Objects.hash(importPath, packageName, receiverTypeName, methodName)
    }

    override fun equals(other: Any?): Boolean = when {
        this === other -> true
        other !is Method -> false
        else -> Intrinsics.areEqual(importPath, other.importPath) &&
                Intrinsics.areEqual(packageName, other.packageName) &&
                Intrinsics.areEqual(receiverTypeName, other.receiverTypeName) &&
                Intrinsics.areEqual(methodName, other.methodName)
    }
}