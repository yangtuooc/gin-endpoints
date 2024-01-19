/*
 * Copyright (c) 2023 yangtuooc
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package cn.yangtuooc.swag.specifications.api

import com.intellij.microservices.oas.OasSchemaType

/**
 * @author yangtuo
 */
enum class DataType {
    STRING, NUMBER, INTEGER, BOOLEAN, ARRAY, OBJECT,
    ;

    fun toOasSchemaType(): OasSchemaType {
        return when (this) {
            STRING -> OasSchemaType.STRING
            NUMBER -> OasSchemaType.NUMBER
            INTEGER -> OasSchemaType.INTEGER
            BOOLEAN -> OasSchemaType.BOOLEAN
            ARRAY -> OasSchemaType.ARRAY
            OBJECT -> OasSchemaType.OBJECT
        }
    }

    fun isReference(): Boolean {
        return this == OBJECT || this == ARRAY
    }

    companion object {
        fun from(value: String): DataType {
            return when (value) {
                "string" -> STRING
                "number" -> NUMBER
                "integer" -> INTEGER
                "boolean" -> BOOLEAN
                "array" -> ARRAY
                "object" -> OBJECT
                else -> throw IllegalArgumentException("Unknown data type $value")
            }
        }
    }
}
