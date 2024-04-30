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

package cn.yangtuooc.swag.specifications.general

/**
 * @author yangtuo
 */
data class Schemes(val values: List<HttpScheme>) {
    companion object {
        const val ANNOTATION = "@schemes"
    }
}

enum class HttpScheme(val value: String) {
    HTTP("http"),
    HTTPS("https"),

    ;

    companion object {
        fun fromString(value: String): cn.yangtuooc.swag.specifications.general.HttpScheme {
            return when (value) {
                "http" -> HTTP
                "https" -> HTTPS
                else -> throw IllegalArgumentException("Unknown HttpScheme value: $value")
            }
        }
    }
}