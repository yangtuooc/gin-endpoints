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
data class Router(val path: String, val method: HttpMethod) {
    companion object {
        const val ANNOTATION = "@Router"
    }
}

class RouterParser(private val content: String) {

    private val pattern = Regex("(/*\\w+)\\s+\\[(\\w+)]").toPattern()

    fun parse(): Router {
        val matcher = pattern.matcher(content)
        if (!matcher.matches() || matcher.groupCount() < 2) {
            throw IllegalArgumentException("Invalid router: $content")
        }
        val path = matcher.group(1)
        val method = HttpMethod.from(matcher.group(2).uppercase())
        return Router(path, method)
    }
}
