package cn.yangtuooc.gin.handlerFunc

import com.intellij.microservices.oas.OasSchemaType

/**
 * @author yangtuo
 */
enum class ParameterType(val goType: String, val oasType: OasSchemaType) {
    STRING("string", OasSchemaType.STRING),
    INT("int", OasSchemaType.INTEGER),
    INT8("int8", OasSchemaType.INTEGER),
    INT16("int16", OasSchemaType.INTEGER),
    INT32("int32", OasSchemaType.INTEGER),
    INT64("int64", OasSchemaType.INTEGER),
    UINT("uint", OasSchemaType.INTEGER),
    UINT8("uint8", OasSchemaType.INTEGER),
    UINT16("uint16", OasSchemaType.INTEGER),
    UINT32("uint32", OasSchemaType.INTEGER),
    UINT64("uint64", OasSchemaType.INTEGER),
    FLOAT32("float32", OasSchemaType.NUMBER),
    FLOAT64("float64", OasSchemaType.NUMBER),
    BOOL("bool", OasSchemaType.BOOLEAN),
    ARRAY("array", OasSchemaType.ARRAY),
    OBJECT("object", OasSchemaType.OBJECT),
    FILE("file", OasSchemaType.STRING),
    TIME("time.Time", OasSchemaType.STRING),
    DURATION("time.Duration", OasSchemaType.STRING),
    UNKNOWN("unknown", OasSchemaType.STRING);

    companion object {
        fun fromGoType(goType: String): ParameterType {
            return values().find { it.goType == goType } ?: UNKNOWN
        }
    }

}