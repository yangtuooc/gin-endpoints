grammar Swag;

swag
  : title
  | version
  | description
  | termsOfService
  | contactName
  | contactUrl
  | contactEmail
  | licenseName
  | licenseUrl
  | host
  | basePath
//  | securityDefinitionsBasic
//  | externalDocsDescription
//  | externalDocsUrl
  | summary
  | tags
  | accept
  | produce
  | param
  | success
  | failure
  | response
  | header
  | router
  | extensions
  ;

title
  : AT TITLE TEXT_CONTENT
  ;

version
  : AT VERSION TEXT_CONTENT
  ;

description
  : AT DESCRIPTION TEXT_CONTENT
  ;

termsOfService
  : AT TERMS_OF_SERVICE TEXT_CONTENT
  ;

contactName
  : AT CONTACT DOT NAME TEXT_CONTENT
  ;

contactUrl
  : AT CONTACT DOT URL TEXT_CONTENT
  ;

contactEmail
  : AT CONTACT DOT EMAIL TEXT_CONTENT
  ;

licenseName
  : AT LICENSE DOT NAME TEXT_CONTENT
  ;

licenseUrl
  : AT LICENSE DOT URL TEXT_CONTENT
  ;

host
  : AT HOST TEXT_CONTENT
  ;

basePath
  : AT BASE PATH TEXT_CONTENT
  ;

summary
  : AT SUMMARY TEXT_CONTENT
  ;

tags
  : AT TAGS tag+
  ;

tag
  : TEXT_CONTENT (COMMA TEXT_CONTENT)*
  ;

accept
  : AT ACCEPT MIME (COMMA MIME)*
  ;

produce
  : AT PRODUCE MIME (COMMA MIME)*
  ;

param
  : AT PARAM IDENTIFIER REQUEST_TYPE DATA_TYPE isMandatory comment attributes*
  ;

isMandatory
  : TRUE
  | FALSE
  ;

comment
  : TEXT_CONTENT
  ;

attributes
  : DEFAULT LEFT_PAREN DATA_TYPE RIGHT_PAREN
  | MAXIMUM LEFT_PAREN NUMBER RIGHT_PAREN
  | MINIMUM LEFT_PAREN NUMBER RIGHT_PAREN
  | MAX_LENGTH LEFT_PAREN NUMBER RIGHT_PAREN
  | MIN_LENGTH LEFT_PAREN NUMBER RIGHT_PAREN
  | ENUMS LEFT_PAREN IDENTIFIER (COMMA IDENTIFIER)* RIGHT_PAREN
  | FORMAT LEFT_PAREN IDENTIFIER RIGHT_PAREN
  | 'collectionFormat' LEFT_PAREN COLLECTION_FORMAT RIGHT_PAREN
  ;

success
  : AT SUCCESS returnCode LEFT_BRACE DATA_TYPE RIGHT_BRACE DATA_TYPE comment
  ;

failure
  : AT FAILURE returnCode LEFT_BRACE DATA_TYPE RIGHT_BRACE DATA_TYPE comment
  ;

response
  : AT RESPONSE returnCode LEFT_BRACE DATA_TYPE RIGHT_BRACE DATA_TYPE comment
  ;

header
  : AT HEADER returnCode LEFT_BRACE DATA_TYPE RIGHT_BRACE DATA_TYPE comment
  ;

returnCode
  : DIGITS
  ;

router
  : AT ROUTER path LEFT_BRACKET httpMethod RIGHT_BRACKET
  ;

path
  : // TODO
  ;

httpMethod
  : GET
  | POST
  | PUT
  | DELETE
  | PATCH
  | HEAD
  | OPTIONS
  ;

extensions
  : EXTENSION_MARK json
  ;

json
    : value EOF
    ;

obj
    : LEFT_BRACE pair (COMMA pair)* RIGHT_BRACE
    | LEFT_BRACE RIGHT_BRACE
    ;

pair
    : STRING COLON value
    ;

arr
    : LEFT_BRACKET value (COMMA value)* RIGHT_BRACKET
    | LEFT_BRACKET RIGHT_BRACKET
    ;

value
    : STRING
    | NUMBER
    | obj
    | arr
    | TRUE
    | FALSE
    | NULL
    ;



fragment DEC_DIGIT          : [0-9];
fragment A                  : [aA] ;
fragment B                  : [bB] ;
fragment C                  : [cC] ;
fragment D                  : [dD] ;
fragment E                  : [eE] ;
fragment F                  : [fF] ;
fragment G                  : [gG] ;
fragment H                  : [hH] ;
fragment I                  : [iI] ;
fragment J                  : [jJ] ;
fragment K                  : [kK] ;
fragment L                  : [lL] ;
fragment M                  : [mM] ;
fragment N                  : [nN] ;
fragment O                  : [oO] ;
fragment P                  : [pP] ;
fragment Q                  : [qQ] ;
fragment R                  : [rR] ;
fragment S                  : [sS] ;
fragment T                  : [tT] ;
fragment U                  : [uU] ;
fragment V                  : [vV] ;
fragment W                  : [wW] ;
fragment X                  : [xX] ;
fragment Y                  : [yY] ;
fragment Z                  : [zZ] ;

fragment ESCAPE             : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE            : 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;
fragment HEX_DIGIT          : [0-9a-fA-F] ;
fragment SAFECODEPOINT      : ~ ["\\\u0000-\u001F] ;
fragment INT                : '0' | [1-9] [0-9]* ;
fragment EXP                : [Ee] [+\-]? [0-9]+ ;

fragment LETTER             : [a-zA-Z$_] | ~[\u0000-\u007F\uD800-\uDBFF] | [\uD800-\uDBFF] [\uDC00-\uDFFF] ;
fragment LETTER_OR_DIGIT    : LETTER | [0-9] ;

TITLE                       : T I T L E ;
VERSION                     : V E R S I O N ;
DESCRIPTION                 : D E S C R I P T I O N ;
TAG                         : T A G ;
NAME                        : N A M E ;
CONTACT                     : C O N T A C T ;
LICENSE                     : L I C E N S E ;
TERMS_OF_SERVICE            : T E R M S O F S E R V I C E ;
URL                         : U R L ;
EMAIL                       : E M A I L ;
BASE                        : B A S E ;
PATH                        : P A T H ;
QUERY                       : Q U E R Y ;
COLLECTION                  : C O L L E C T I O N ;
FORMAT                      : F O R M A T ;
SCHEMA                      : S C H E M A ;
ID                          : I D ;
TAGS                        : T A G S ;
SUMMARY                     : S U M M A R Y ;
ACCEPT                      : A C C E P T ;
PRODUCE                     : P R O D U C E ;
PARAM                       : P A R A M ;
SECURITY                    : S E C U R I T Y ;
HOST                        : H O S T ;
SUCCESS                     : S U C C E S S ;
FAILURE                     : F A I L U R E ;
RESPONSE                    : R E S P O N S E ;
HEADER                      : H E A D E R ;
ROUTER                      : R O U T E R ;
DEFAULT                     : D E F A U L T ;
MAXIMUM                     : M A X I M U M ;
MINIMUM                     : M I N I M U M ;
MAX_LENGTH                  : M A X L E N G T H ;
MIN_LENGTH                  : M I N L E N G T H ;
ENUMS                       : E N U M S ;

GET                         : G E T ;
POST                        : P O S T ;
PUT                         : P U T ;
DELETE                      : D E L E T E ;
PATCH                       : P A T C H ;
HEAD                        : H E A D ;
OPTIONS                     : O P T I O N S ;

TRUE                        : T R U E ;
FALSE                       : F A L S E ;
NULL                        : N U L L ;

IDENTIFIER                  : LETTER LETTER_OR_DIGIT* ;

DIGITS                      : [0-9]+ ;


REQUEST_TYPE                :'query'
                            |'path'
                            |'header'
                            |'body'
                            |'formData'
                            ;

DATA_TYPE                   :'string'
                            |'integer'
                            |'number'
                            |'boolean'
                            |'array'
                            |'file'
                            |'object'
                            | IDENTIFIER (DOT IDENTIFIER)*
                            ;


COLLECTION_FORMAT           :'csv'
                            |'ssv'
                            |'tsv'
                            |'pipes'
                            |'multi'
                            ;

MIME                        :'json'
                            |'application/json'
                            |'xml'
                            |'application/xml'
                            |'plain'
                            |'text/plain'
                            |'html'
                            |'text/html'
                            |'mpfd'
                            |'multipart/form-data'
                            |'x-www-form-urlencoded'
                            |'application/x-www-form-urlencoded'
                            |'json-api'
                            |'application/vnd.api+json'
                            |'json-stream'
                            |'application/x-json-stream'
                            |'octet-stream'
                            |'application/octet-stream'
                            |'png'
                            |'image/png'
                            |'jpg'
                            |'image/jpeg'
                            |'gif'
                            |'image/gif'
                           ;

AT                          : '@' ;
COLON                       : ':' ;
DOT                         : '.' ;
COMMA                       : ',' ;
STAR                        : '*' ;
SLASH                       : '/' ;
DASH                        : '-' ;
UNDERSCORE                  : '_' ;
LEFT_BRACKET                : '[' ;
RIGHT_BRACKET               : ']' ;
LEFT_PAREN                  : '(' ;
RIGHT_PAREN                 : ')' ;
LEFT_BRACE                  : '{' ;
RIGHT_BRACE                 : '}' ;
SPACE                       : ' ' ;

STRING                      : '"' (ESCAPE | SAFECODEPOINT)* '"' ;
NUMBER                      : '-'? INT ('.' [0-9]+)? (EXP)? ;

EXTENSION_MARK              : 'x-' ;
TEXT_CONTENT                : ~[\n\r\t @*{}/]+ ;

WS                          : [ \t\r\n]+ -> skip ;
