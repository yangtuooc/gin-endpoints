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

package cn.yangtuooc.swag

import cn.yangtuooc.swag.specifications.api.*
import cn.yangtuooc.swag.specifications.general.*
import cn.yangtuooc.swag.specifications.general.Summary

/**
 * @author yangtuo
 */
class Swag {

    var title: Title? = null
    var version: Version? = null
    var description: Description? = null
    var tagName: TagName? = null
    var tagDescription: TagDescription? = null
    var tagDocsUrl: TagDocsUrl? = null
    var tagDocsDescription: TagDocsDescription? = null
    var termsOfService: TermsOfService? = null
    var contactName: ContactName? = null
    var contactUrl: ContactUrl? = null
    var contactEmail: ContactEmail? = null
    var licenseName: LicenseName? = null
    var licenseUrl: LicenseUrl? = null
    var host: Host? = null
    var basePath: BasePath? = null
    var accept: Accept? = null
    var produce: Produce? = null
    var queryCollectionFormat: QueryCollectionFormat? = null
    var schemes: Schemes? = null
    var externalDocsDescription: ExternalDocsDescription? = null
    var externalDocsUrl: ExternalDocsUrl? = null

    var id: Id? = null
    var tags: Tags? = null
    var summary: Summary? = null
    var param: Param? = null
    val successes = mutableListOf<Success>()
    val failures = mutableListOf<Failure>()
    val responses = mutableListOf<Response>()
    val headers = mutableListOf<Header>()
    var router: Router? = null

    fun deprecated(): Boolean {
        return false
    }

    fun id(): String {
        return id?.value ?: ""
    }

    fun tags(): List<String> {
        return tags?.values ?: emptyList()
    }

    fun description(): String {
        return description?.value ?: ""
    }

    fun method(): HttpMethod {
        return router?.method ?: HttpMethod.GET
    }

    fun path(): String {
        return router?.path ?: ""
    }

    fun summary(): String {
        return summary?.value ?: ""
    }

    fun tagName(): String {
        return tagName?.name ?: ""
    }

    fun tagDescription(): String {
        return tagDescription?.value ?: ""
    }

    class Builder {
        val swag = Swag()

        fun title(title: String) {
            swag.title = Title(title)
        }

        fun version(version: String) {
            swag.version = Version(version)
        }

        fun description(description: String) {
            swag.description = Description(description)
        }

        fun tagName(tagName: String) {
            swag.tagName = TagName(tagName)
        }

        fun tagDescription(tagDescription: String) {
            swag.tagDescription = TagDescription(tagDescription)
        }

        fun tagDocsUrl(tagDocsUrl: String) {
            swag.tagDocsUrl = TagDocsUrl(tagDocsUrl)
        }

        fun tagDocsDescription(tagDocsDescription: String) {
            swag.tagDocsDescription = TagDocsDescription(tagDocsDescription)
        }

        fun termsOfService(termsOfService: String) {
            swag.termsOfService = TermsOfService(termsOfService)
        }

        fun contactName(contactName: String) {
            swag.contactName = ContactName(contactName)
        }

        fun contactUrl(contactUrl: String) {
            swag.contactUrl = ContactUrl(contactUrl)
        }

        fun contactEmail(contactEmail: String) {
            swag.contactEmail = ContactEmail(contactEmail)
        }

        fun licenseName(licenseName: String) {
            swag.licenseName = LicenseName(licenseName)
        }

        fun licenseUrl(licenseUrl: String) {
            swag.licenseUrl = LicenseUrl(licenseUrl)
        }

        fun host(host: String) {
            swag.host = Host(host)
        }

        fun basePath(basePath: String) {
            swag.basePath = BasePath(basePath)
        }

        fun accept(accept: MimeType) {
            swag.accept = Accept(accept)
        }

        fun produce(produce: MimeType) {
            swag.produce = Produce(produce)
        }

        fun queryCollectionFormat(collectionFormat: CollectionFormat) {
            swag.queryCollectionFormat = QueryCollectionFormat(collectionFormat)
        }

        fun schemes(schemes: List<HttpScheme>) {
            swag.schemes = Schemes(schemes)
        }

        fun externalDocsDescription(externalDocsDescription: String) {
            swag.externalDocsDescription = ExternalDocsDescription(externalDocsDescription)
        }

        fun externalDocsUrl(externalDocsUrl: String) {
            swag.externalDocsUrl = ExternalDocsUrl(externalDocsUrl)
        }

        fun id(id: String) {
            swag.id = Id(id)
        }

        fun tags(tags: List<String>) {
            swag.tags = Tags(tags)
        }

        fun summary(summary: String) {
            swag.summary = Summary(summary)
        }

        fun param(param: Param) {
            swag.param = param
        }

        fun success(success: Success) {
            swag.successes.add(success)
        }

        fun failure(failure: Failure) {
            swag.failures.add(failure)
        }

        fun response(response: Response) {
            swag.responses.add(response)
        }

        fun header(header: Header) {
            swag.headers.add(header)
        }

        fun router(router: Router) {
            swag.router = router
        }

        fun build(): Swag {
            return swag
        }
    }
}