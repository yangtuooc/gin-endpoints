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
open class Response(
    private val code: String,
    private val paramType: DataType,
    private val dataType: String,
    private var comment: String?
) {
    companion object {
        const val ANNOTATION = "@response"
    }

    fun paramType(): DataType {
        return paramType
    }

    fun dataType(): String {
        return dataType
    }

    fun code(): String {
        return code
    }

    fun comment(): String? {
        return comment
    }

    fun success(): Success {
        return Success(code, paramType, dataType, comment)
    }

    fun failure(): Failure {
        return Failure(code, paramType, dataType, comment)
    }

    fun header(): Header {
        return Header(code, paramType, dataType, comment)
    }

    fun reference(): String? {
        if (paramType().isReference()) {
            return dataType()
        }
        return null
    }
}

class ResponseParser(private val content: String) {

    private val pattern = Regex("(\\d+)\\s+\\{(\\w+)}\\s+(\\w+)\\s+\"(.*)\"").toPattern()

    fun parse(): Response {
        val matcher = pattern.matcher(content)
        if (!matcher.matches()) {
            throw IllegalArgumentException("invalid response: $content")
        }
        val code = matcher.group(1)
        val paramType = DataType.from(matcher.group(2))
        val dataType = matcher.group(3)
        val comment = matcher.group(4)
        return Response(code, paramType, dataType, comment)
    }
}

