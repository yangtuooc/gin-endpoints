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
data class Param(
    val name: String,
    val paramIn: ParamIn,
    val dataType: String,
    val required: Boolean,
    val comment: String,
    val attributes: List<Attribute>
) {
    fun deprecated(): Boolean {
        return false
    }

    companion object {
        const val ANNOTATION = "@param"
    }
}

class ParamParser(private val content: String) {
    fun parse(): Param {

        var parts = content.split("\"")
        var comment = ""
        if (parts.size == 2) {
            comment = parts[1]
        }

        parts = parts[0].split(Regex("\\s+"))
        var name = ""
        var paramIn = ParamIn.QUERY
        var dataType = ParamDataType.STRING.toString()
        var required = false

        val attributes = mutableListOf<Attribute>()

        parts.forEachIndexed { index, part ->
            when (index) {
                0 -> name = part
                1 -> paramIn = ParamIn.from(part)
                2 -> dataType = part
                3 -> required = part == "true"
                else -> {
                    attributePattern.matcher(part).takeIf { it.matches() }?.let {
                        val attributeName = it.group(1)
                        val attributeValue = it.group(2)
                        attributes.add(Attribute(attributeName, attributeValue))
                    }
                }
            }
        }

        return Param(name, paramIn, dataType, required, comment, attributes)
    }
}

private val attributePattern = Regex("(\\w+)\\((.*)\\)").toPattern()

data class Attribute(
    val name: String,
    val value: String
)




