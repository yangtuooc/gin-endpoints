package cn.yangtuooc.gin.endpoints

/**
 * @author yangtuo
 */

enum class GinServerDefinitionMethod(
    override val fqn: GoQualifiedName,
    override val argumentIndex: Int
) : FunctionOrMethodParameterInfo {

    GET(Method("github.com/gin-gonic/gin", "gin", "RouterGroup", "GET"), 0),
    POST(Method("github.com/gin-gonic/gin", "gin", "RouterGroup", "POST"), 0),
    PUT(Method("github.com/gin-gonic/gin", "gin", "RouterGroup", "PUT"), 0),
    DELETE(Method("github.com/gin-gonic/gin", "gin", "RouterGroup", "DELETE"), 0),
    PATCH(Method("github.com/gin-gonic/gin", "gin", "RouterGroup", "PATCH"), 0),
    OPTIONS(Method("github.com/gin-gonic/gin", "gin", "RouterGroup", "OPTIONS"), 0),
    HEAD(Method("github.com/gin-gonic/gin", "gin", "RouterGroup", "HEAD"), 0),
    ANY(Method("github.com/gin-gonic/gin", "gin", "RouterGroup", "Any"), 0),
}

enum class GinServerGroupDefinitionMethod(
    override val fqn: GoQualifiedName,
    override val argumentIndex: Int
) : FunctionOrMethodParameterInfo {
    GROUP(Method("github.com/gin-gonic/gin", "gin", "RouterGroup", "Group"), 0),
    ;
}


