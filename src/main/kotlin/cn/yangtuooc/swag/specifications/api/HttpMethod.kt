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

import com.intellij.microservices.oas.OasHttpMethod

/**
 * @author yangtuo
 */
enum class HttpMethod {
    GET, POST, PUT, DELETE, PATCH, HEAD, OPTIONS

    ;

    fun toOasHttpMethod(): OasHttpMethod {
        return when (this) {
            GET -> OasHttpMethod.GET
            POST -> OasHttpMethod.POST
            PUT -> OasHttpMethod.PUT
            DELETE -> OasHttpMethod.DELETE
            PATCH -> OasHttpMethod.PATCH
            HEAD -> OasHttpMethod.HEAD
            OPTIONS -> OasHttpMethod.OPTIONS
        }
    }

    companion object {
        fun fromString(method: String): HttpMethod {
            return when (method.uppercase()) {
                "GET" -> GET
                "POST" -> POST
                "PUT" -> PUT
                "DELETE" -> DELETE
                "PATCH" -> PATCH
                "HEAD" -> HEAD
                "OPTIONS" -> OPTIONS
                else -> throw IllegalArgumentException("Unknown HTTP method $method")
            }
        }
    }
}