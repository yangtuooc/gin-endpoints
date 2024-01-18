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

package cn.yangtuooc.swag.specifications

import cn.yangtuooc.swag.Swag
import cn.yangtuooc.swag.specifications.api.*
import cn.yangtuooc.swag.specifications.general.*
import cn.yangtuooc.swag.specifications.general.Summary
import com.intellij.psi.PsiComment

/**
 * @author yangtuo
 */
class SwagParser(private val comments: List<PsiComment>) {

    private val builder = Swag.Builder()

    private val pattern = Regex("(@\\w+[.\\w+]*)\\s+(.*)").toPattern()

    fun parse(): Swag {
        comments.forEach { processComment(it) }
        return builder.build()
    }

    private fun processComment(comment: PsiComment) {
        val text = comment.text.trimStart()
        val matcher = pattern.matcher(text)
        if (!matcher.matches() || matcher.groupCount() < 2) {
            return
        }
        val annotation = matcher.group(1).lowercase()
        val content = matcher.group(2)

        when (annotation) {
            Title.ANNOTATION.lowercase() -> builder.title(content)
            Version.ANNOTATION.lowercase() -> builder.version(content)
            Description.ANNOTATION.lowercase() -> builder.description(content)
            TagName.ANNOTATION.lowercase() -> builder.tagName(content)
            TagDescription.ANNOTATION.lowercase() -> builder.tagDescription(content)
            TagDocsUrl.ANNOTATION.lowercase() -> builder.tagDocsUrl(content)
            TagDocsDescription.ANNOTATION.lowercase() -> builder.tagDocsDescription(content)
            TermsOfService.ANNOTATION.lowercase() -> builder.termsOfService(content)
            ContactName.ANNOTATION.lowercase() -> builder.contactName(content)
            ContactUrl.ANNOTATION.lowercase() -> builder.contactUrl(content)
            ContactEmail.ANNOTATION.lowercase() -> builder.contactEmail(content)
            LicenseName.ANNOTATION.lowercase() -> builder.licenseName(content)
            LicenseUrl.ANNOTATION.lowercase() -> builder.licenseUrl(content)
            Host.ANNOTATION.lowercase() -> builder.host(content)
            BasePath.ANNOTATION.lowercase() -> builder.basePath(content)
            Accepts.ANNOTATION.lowercase() -> builder.accepts(content.split(",").map { MimeType.from(it.trim()) })
            Produces.ANNOTATION.lowercase() -> builder.produces(content.split(",").map { MimeType.from(it.trim()) })
            QueryCollectionFormat.ANNOTATION.lowercase() ->
                builder.queryCollectionFormat(CollectionFormat.fromString(content))

            Schemes.ANNOTATION.lowercase() ->
                builder.schemes(content.split(" ").map { HttpScheme.fromString(it.trim()) })

            ExternalDocsDescription.ANNOTATION.lowercase() -> builder.externalDocsDescription(content)
            ExternalDocsUrl.ANNOTATION.lowercase() -> builder.externalDocsUrl(content)

            Id.ANNOTATION.lowercase() -> builder.id(content)
            Tags.ANNOTATION.lowercase() -> builder.tags(content.split(",").map { it.trim() })
            Summary.ANNOTATION.lowercase() -> builder.summary(content)
            Param.ANNOTATION.lowercase() -> builder.param(ParamParser(content).parse())
            Success.ANNOTATION.lowercase() -> builder.success(ResponseParser(content).parse().success())
            Failure.ANNOTATION.lowercase() -> builder.failure(ResponseParser(content).parse().failure())
            Response.ANNOTATION.lowercase() -> builder.response(ResponseParser(content).parse())
            Header.ANNOTATION.lowercase() -> builder.header(ResponseParser(content).parse().header())
            Router.ANNOTATION.lowercase() -> builder.router(RouterParser(content).parse())
        }
    }
}