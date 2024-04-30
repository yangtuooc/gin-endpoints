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
enum class ParamDataType {
    STRING, INTEGER, NUMBER, BOOLEAN, FILE, USER_DEFINED
    ;

    override fun toString(): String {
        return when (this) {
            STRING -> "string"
            INTEGER -> "integer"
            NUMBER -> "number"
            BOOLEAN -> "boolean"
            FILE -> "file"
            USER_DEFINED -> "user_defined"
        }
    }

    fun toOasSchemaType(): OasSchemaType? {
        return when (this) {
            STRING -> OasSchemaType.STRING
            INTEGER -> OasSchemaType.INTEGER
            NUMBER -> OasSchemaType.NUMBER
            BOOLEAN -> OasSchemaType.BOOLEAN
            FILE -> OasSchemaType.OBJECT
            USER_DEFINED -> null
        }
    }

    companion object {

        fun from(value: String): ParamDataType {
            return when (value) {
                "bool" -> BOOLEAN
                "int", "uint", "uint32", "uint64" -> INTEGER
                "float32" -> NUMBER
                "string" -> STRING
                "file" -> FILE
                else -> USER_DEFINED
            }
        }

        fun isAllowed(value: String): Boolean {
            return when (value) {
                "bool", "float32", "uint64", "uint32", "uint", "int", "string", "integer", "number", "boolean", "file" -> true
                else -> false
            }
        }
    }
}