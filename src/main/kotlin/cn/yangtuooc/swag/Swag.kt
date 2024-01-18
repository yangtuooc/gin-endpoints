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
import com.intellij.microservices.oas.OpenApiSpecification
import kotlin.reflect.KClass

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
    var accepts: Accepts? = null
    var produces: Produces? = null
    var queryCollectionFormat: QueryCollectionFormat? = null
    var schemes: Schemes? = null
    var externalDocsDescription: ExternalDocsDescription? = null
    var externalDocsUrl: ExternalDocsUrl? = null

    var id: Id? = null
    var tags: Tags? = null
    var summary: Summary? = null
    var param: Param? = null
    var success: Success? = null
    var failure: Response? = null
    var response: Response? = null
    var header: Response? = null
    var router: Router? = null

    fun toOpenApiSpecification(): OpenApiSpecification? {
        return null
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

        fun accepts(accepts: List<MimeType>) {
            swag.accepts = Accepts(accepts)
        }

        fun produces(produces: List<MimeType>) {
            swag.produces = Produces(produces)
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
            swag.success = success
        }

        fun failure(failure: Response) {
            swag.failure = failure
        }

        fun response(response: Response) {
            swag.response = response
        }

        fun header(header: Response) {
            swag.header = header
        }

        fun router(router: Router) {
            swag.router = router
        }

        fun build(): Swag {
            return swag
        }
    }
}