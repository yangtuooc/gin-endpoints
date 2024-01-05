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

/**
 * @author yangtuo
 */

// 通用API信息
data class Title(val value: String) // 注释:title 说明:必填 应用程序的名称 示例: // @title Swagger Example API
data class Version(val value: String) // 注释:version 说明:必填 提供应用程序API的版本 示例: // @version 1.0
data class Description(val value: String) // 说明:应用程序的简短描述 示例: // @description This is a sample server Petstore server.
data class Tag(
    val name: String? = null, // 注释: tag.name 说明: 标签的名称 示例: // @tag.name This is the name of the tag
    val description: String? = null, // 注释: tag.description 说明: 标签的描述 示例: // @tag.description Cool Description
    val docsUrl: String? = null, // 注释: tag.docs.url 说明: 标签的外部文档说明 示例: // @tag.docs.url https://example.com
    val docsDescription: String? = null // 注释: tag.docs.description 说明: 标签的外部文档说明。	// @tag.docs.description Best example documentation
)

data class TermsOfService(val value: String) // 注释:termsOfService 说明:应用程序的服务条款 示例: // @termsOfService http://swagger.io/terms/
data class Contract(
    val name: String? = null, // 注释: contract.name 说明: 公开的API的联系信息 示例: // @contact.name API Support
    val url: String? = null, // 注释: 联系信息的URL。 必须采用网址格式。示例: // @contact.url http://www.swagger.io/support
    val email: String? = null, // 注释: 联系人/组织的电子邮件地址。 必须采用电子邮件地址的格式。 必须采用电子邮件格式。示例: // @contact.email support@swagger.io
)

data class License(
    val name: String? = null, // 注释: license.name 说明: 必填 用于API的许可证名称。 示例: // @license.name Apache 2.0
    val url: String? = null // 注释: license.url 说明: 用于API的许可证的URL。 必须采用网址格式。示例: // @license.url
)

data class Host(val value: String) // 注释:host 说明:运行API的主机（主机名或IP地址）。示例: // @host localhost:8080
data class BasePath(val value: String) // 注释:BasePath 说明:运行API的基本路径。 示例: // @BasePath /api/v1
data class Accept(val value: String) // 注释:accept 说明:API 可以使用的 MIME 类型列表。 请注意，Accept 仅影响具有请求正文的操作，例如 POST、PUT 和 PATCH。 值必须如“Mime类型”中所述。 示例: // @accept json
data class Produce(val value: String) // 注释:produce 说明:API可以生成的MIME类型的列表。值必须如“Mime类型”中所述。示例: // @produce json
data class QueryCollectionFormat(val value: String) // 注释:query.collection.format 说明:请求URI query里数组参数的默认格式：csv，multi，pipes，tsv，ssv。 如果未设置，则默认为csv。 可能的值为：csv、ssv、tsv、pipes、multi。 默认值为 csv。 示例: // @query.collection.format multi
data class Schemas(val values: List<String>) // 注释:schemas 说明:用空格分隔的请求的传输协议。 示例: // @schemes http https
data class ExternalDocs(
    val url: String? = null, // 注释: externalDocs.url 说明: 外部文档的URL。 必须采用网址格式。 示例: // @externalDocs url http://swagger.io
    val description: String? = null // 注释: externalDocs.description 说明: 外部文档的描述 示例: // @externalDocs description Find out more about Swagger
)

data class Extensions(val pair: Pair<String, String>) // 注释: x-name 说明: 扩展的键必须以x-开头，并且只能使用json值 示例: // @x-example-key {"key": "value"}

// API操作
data class Id(val value: String) // 注释:ID 说明:操作的唯一标识符。示例: // @operationId getPetById
data class Tags(val values: List<String>) // 注释:Tags 说明:操作的标签列表。 示例: // @tags pet
data class Summary(val value: String) // 注释:Summary 说明:操作的简短摘要。 示例: // @summary Find pet by ID
data class Param(
    val name: String,
    val type: String,
    val dataType: String,
    val mandatory: Boolean = false,
    val comment: String,
    val attribute: String
) // 注释: Param 说明:用空格分隔的参数。param name,param type,data type,is mandatory?,comment attribute(optional) 示例: // @Param enumstring	query string	false	"string enums"	Enums(A, B, C)

data class Success(
    val code: String,
    val paramType: String,
    val dataType: String,
    val comment: String
) // 注释: Success 说明: 以空格分隔的成功响应。 return code, {param type}, data type, comment 示例: //	@Success 200 {string} string "answer"

data class Failure(
    val code: String,
    val paramType: String,
    val dataType: String,
    val comment: String
) // 注释: Failure 说明: 以空格分隔的失败响应。 return code, {param type}, data type, comment 示例: //	@Failure 400 {string} string "fail"

data class Response(
    val code: String,
    val paramType: String,
    val dataType: String,
    val comment: String
) // 注释: Response 说明: 以空格分隔的响应。 return code, {param type}, data type, comment 示例: //	@Response 200 {string} string "answer"

data class Header(
    val name: String,
    val dataType: String,
    val comment: String
) // 注释: Header 说明: 以空格分隔的头字段。 return code,{param type},data type,comment 示例: //	@Header X-MyHeader {string} string "response header"

data class Router(
    val path: String,
    val method: String,
) // 注释: Router 说明: 以空格分隔的路径定义。 path,[httpMethod] 示例: //	@Router /api/v1/get/{id} [get]