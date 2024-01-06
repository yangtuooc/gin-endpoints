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

import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.OpenAPISpecificationProvider
import com.goide.psi.GoFile
import com.intellij.microservices.oas.OpenApiSpecification

/**
 * @author yangtuo
 */
class SwagOpenAPISpecificationProvider(
    val group: GoFile,
    private val endpoint: GinUrlData
) : OpenAPISpecificationProvider {

    override fun getOpenAPISpecification(): OpenApiSpecification? {
        return null
    }
}