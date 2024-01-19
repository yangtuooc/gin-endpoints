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
enum class MimeType(val value: String, val alias: String) {

    JSON("application/json", "json"),
    XML("application/xml", "xml"),
    TEXT("text/plain", "text"),
    HTML("text/html", "html"),
    MPFD("multipart/form-data", "mpfd"),
    URLENCODED("application/x-www-form-urlencoded", "x-www-form-urlencoded"),
    JSON_API("application/vnd.api+json", "json-api"),
    JSON_STREAM("application/x-json-stream", "json-stream"),
    OCTET_STREAM("application/octet-stream", "octet-stream"),
    PNG("image/png", "png"),
    JPEG("image/jpeg", "jpeg"),
    GIF("image/gif", "gif"),
    ;

    companion object {
        fun from(value: String): MimeType {
            values().forEach { if (it.value == value || it.alias == value) return it }
            throw IllegalArgumentException("Unknown mime type: $value")
        }
    }
}