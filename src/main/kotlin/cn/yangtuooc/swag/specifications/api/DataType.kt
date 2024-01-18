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

/**
 * @author yangtuo
 */
enum class DataType {
    STRING, NUMBER, INTEGER, BOOLEAN, ARRAY, OBJECT, FILE;

    companion object {
        fun fromString(value: String): DataType {
            return when (value) {
                "string" -> STRING
                "number" -> NUMBER
                "integer" -> INTEGER
                "boolean" -> BOOLEAN
                "array" -> ARRAY
                "object" -> OBJECT
                "file" -> FILE
                else -> throw IllegalArgumentException("Unknown data type $value")
            }
        }
    }
}
