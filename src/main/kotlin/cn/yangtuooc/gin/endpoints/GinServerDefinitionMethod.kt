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

enum class GinServerParameterMappingMethod(
    override val fqn: GoQualifiedName,
    override val argumentIndex: Int
) : FunctionOrMethodParameterInfo {
    BIND(Method("github.com/gin-gonic/gin", "gin", "Context", "Bind"), 0),
    BIND_JSON(Method("github.com/gin-gonic/gin", "gin", "Context", "BindJSON"), 0),
    BIND_XML(Method("github.com/gin-gonic/gin", "gin", "Context", "BindXML"), 0),
    BIND_QUERY(Method("github.com/gin-gonic/gin", "gin", "Context", "BindQuery"), 0),
    BIND_HEADER(Method("github.com/gin-gonic/gin", "gin", "Context", "BindHeader"), 0),
    BIND_URI(Method("github.com/gin-gonic/gin", "gin", "Context", "BindUri"), 0),
    BIND_BODY(Method("github.com/gin-gonic/gin", "gin", "Context", "BindBody"), 0),
    BIND_YAML(Method("github.com/gin-gonic/gin", "gin", "Context", "BindYAML"), 0),
    BIND_TOML(Method("github.com/gin-gonic/gin", "gin", "Context", "BindTOML"), 0),

    MUST_BIND_WITH(Method("github.com/gin-gonic/gin", "gin", "Context", "MustBindWith"), 0),

    SHOULD_BIND(Method("github.com/gin-gonic/gin", "gin", "Context", "ShouldBind"), 0),
    SHOULD_BIND_JSON(Method("github.com/gin-gonic/gin", "gin", "Context", "ShouldBindJSON"), 0),
    SHOULD_BIND_XML(Method("github.com/gin-gonic/gin", "gin", "Context", "ShouldBindXML"), 0),
    SHOULD_BIND_QUERY(Method("github.com/gin-gonic/gin", "gin", "Context", "ShouldBindQuery"), 0),
    SHOULD_BIND_HEADER(Method("github.com/gin-gonic/gin", "gin", "Context", "ShouldBindHeader"), 0),
    SHOULD_BIND_URI(Method("github.com/gin-gonic/gin", "gin", "Context", "ShouldBindUri"), 0),
    SHOULD_BIND_WITH(Method("github.com/gin-gonic/gin", "gin", "Context", "ShouldBindWith"), 0),
    SHOULD_BIND_BODY_WITH(
        Method(
            "github.com/gin-gonic/gin",
            "gin",
            "Context",
            "ShouldBindBodyWith"
        ), 0
    ),

    PARAM(Method("github.com/gin-gonic/gin", "gin", "Context", "Param"), 0),
    QUERY(Method("github.com/gin-gonic/gin", "gin", "Context", "Query"), 0),
    DEFAULT_QUERY(Method("github.com/gin-gonic/gin", "gin", "Context", "DefaultQuery"), 0),
    GET_QUERY(Method("github.com/gin-gonic/gin", "gin", "Context", "GetQuery"), 0),
    QUERY_ARRAY(Method("github.com/gin-gonic/gin", "gin", "Context", "QueryArray"), 0),
    GET_QUERY_ARRAY(Method("github.com/gin-gonic/gin", "gin", "Context", "GetQueryArray"), 0),
    QUERY_MAP(Method("github.com/gin-gonic/gin", "gin", "Context", "QueryMap"), 0),
    GET_QUERY_MAP(Method("github.com/gin-gonic/gin", "gin", "Context", "GetQueryMap"), 0),

    POST_FORM(Method("github.com/gin-gonic/gin", "gin", "Context", "PostForm"), 0),
    DEFAULT_POST_FORM(Method("github.com/gin-gonic/gin", "gin", "Context", "DefaultPostForm"), 0),
    GET_POST_FORM(Method("github.com/gin-gonic/gin", "gin", "Context", "GetPostForm"), 0),
    POST_FORM_ARRAY(Method("github.com/gin-gonic/gin", "gin", "Context", "PostFormArray"), 0),
    GET_POST_FORM_ARRAY(
        Method("github.com/gin-gonic/gin", "gin", "Context", "GetPostFormArray"),
        0
    ),
    POST_FORM_MAP(Method("github.com/gin-gonic/gin", "gin", "Context", "PostFormMap"), 0),
    GET_POST_FORM_MAP(Method("github.com/gin-gonic/gin", "gin", "Context", "GetPostFormMap"), 0),

    FROM_FILE(Method("github.com/gin-gonic/gin", "gin", "Context", "FormFile"), 0),

    ;
}

enum class GinServerResponseMethod(
    override val fqn: GoQualifiedName,
    override val argumentIndex: Int
) : FunctionOrMethodParameterInfo {
    JSON(Method("github.com/gin-gonic/gin", "gin", "Context", "JSON"), 0),
    XML(Method("github.com/gin-gonic/gin", "gin", "Context", "XML"), 0),
    YAML(Method("github.com/gin-gonic/gin", "gin", "Context", "YAML"), 0),
    PROTOBUF(Method("github.com/gin-gonic/gin", "gin", "Context", "ProtoBuf"), 0),
    ASCII_JSON(Method("github.com/gin-gonic/gin", "gin", "Context", "AsciiJSON"), 0),
    PURE_JSON(Method("github.com/gin-gonic/gin", "gin", "Context", "PureJSON"), 0),
    JSONP(Method("github.com/gin-gonic/gin", "gin", "Context", "JSONP"), 0),
    JSONP_WITH_CALLBACK(
        Method("github.com/gin-gonic/gin", "gin", "Context", "JSONPWithCallback"),
        0
    ),
    STRING(Method("github.com/gin-gonic/gin", "gin", "Context", "String"), 0),
    HTML(Method("github.com/gin-gonic/gin", "gin", "Context", "HTML"), 0),
    HTML_TEMPLATE(Method("github.com/gin-gonic/gin", "gin", "Context", "HTMLTemplate"), 0),
    REDIRECT(Method("github.com/gin-gonic/gin", "gin", "Context", "Redirect"), 0),
    DATA(Method("github.com/gin-gonic/gin", "gin", "Context", "Data"), 0),
    DATA_FROM_READER(Method("github.com/gin-gonic/gin", "gin", "Context", "DataFromReader"), 0),

    INDENTED_JSON(Method("github.com/gin-gonic/gin", "gin", "Context", "IndentedJSON"), 0),
    SECURE_JSON(Method("github.com/gin-gonic/gin", "gin", "Context", "SecureJSON"), 0),
    TOML(Method("github.com/gin-gonic/gin", "gin", "Context", "Toml"), 0),
    ABORT(Method("github.com/gin-gonic/gin", "gin", "Context", "Abort"), 0),
    ABORT_WITH_STATUS(Method("github.com/gin-gonic/gin", "gin", "Context", "AbortWithStatus"), 0),
    ABORT_WITH_STATUS_JSON(
        Method("github.com/gin-gonic/gin", "gin", "Context", "AbortWithStatusJSON"),
        0
    ),
    ABORT_WITH_ERROR(Method("github.com/gin-gonic/gin", "gin", "Context", "AbortWithError"), 0),
    ERROR(Method("github.com/gin-gonic/gin", "gin", "Context", "Error"), 0),
    ;

}

