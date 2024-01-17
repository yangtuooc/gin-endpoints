lexer grammar SwagLexer;

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
DEFINITIONS                 : D E F I N I T I O N S ;
BASIC                       : B A S I C ;
EXTERNAL_DOCS              : E X T E R N A L D O C S ;

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

COLLECTION_FORMAT_MARK      : 'collectionFormat'
                            ;

COLLECTION_FORMAT           :'csv'
                            |'ssv'
                            |'tsv'
                            |'pipes'
                            |'multi'
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

STRING                      : '"' (ESCAPE | SAFECODEPOINT)* '"' ;
NUMBER                      : '-'? INT ('.' [0-9]+)? (EXP)? ;

EXTENSION_MARK              : 'x-' ;

WS                          : [ \t\r\n]+ -> skip ;


AT_SUMMARY
  : AT SUMMARY -> pushMode(COMMENT_MODE)
  ;

AT_TITLE
  : AT TITLE -> pushMode(COMMENT_MODE)
  ;

AT_VERSION
  : AT VERSION -> pushMode(COMMENT_MODE)
  ;

AT_DESCRIPTION
  : AT DESCRIPTION -> pushMode(COMMENT_MODE)
  ;

AT_TERMS_OF_SERVICE
  : AT TERMS_OF_SERVICE -> pushMode(COMMENT_MODE)
  ;

AT_CONTACT_URL
  : AT CONTACT DOT URL -> pushMode(COMMENT_MODE)
  ;

AT_CONTACT_EMAIL
  : AT CONTACT DOT EMAIL -> pushMode(COMMENT_MODE)
  ;

AT_LICENSE_NAME
  : AT LICENSE DOT NAME -> pushMode(COMMENT_MODE)
  ;

AT_LICENSE_URL
  : AT LICENSE DOT URL -> pushMode(COMMENT_MODE)
  ;

AT_HOST
  : AT HOST -> pushMode(COMMENT_MODE)
  ;

AT_BASE_PATH
  : AT BASE PATH -> pushMode(COMMENT_MODE)
  ;

AT_SECURITY_DEFINITIONS_BASIC
  : AT SECURITY DEFINITIONS DOT BASIC -> pushMode(COMMENT_MODE)
  ;

AT_EXTERNAL_DOCS_DESCRIPTION
  : AT EXTERNAL_DOCS DOT DESCRIPTION -> pushMode(COMMENT_MODE)
  ;

AT_EXTERNAL_DOCS_URL
  : AT EXTERNAL_DOCS DOT URL -> pushMode(COMMENT_MODE)
  ;
AT_TAGS
  : AT TAGS -> pushMode(COMMENT_MODE)
  ;

AT_ACCEPT
  : AT ACCEPT -> pushMode(MIME_MODE)
  ;

AT_PRODUCE
  : AT PRODUCE -> pushMode(MIME_MODE)
  ;

AT_PARAM
  : AT PARAM -> pushMode(PARAM_MODE)
  ;

mode COMMENT_MODE;

STRING_COMMENTS
  : STRING_COMMENT+ -> popMode
  ;

fragment STRING_COMMENT
  : ~[\r\n]
  ;

mode MIME_MODE;

MIME_TYPES
  :MIME(COMMA MIME)* -> popMode
  ;

WS_MIME
  : [ \t\r\n]+ -> skip
  ;

fragment MIME                        :'json'
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

mode PARAM_MODE;

PARAM_NAME
  : IDENTIFIER -> pushMode(PARAM_IN_MODE)
  ;

WS_PARAM
  : [ \t\r\n]+ -> skip
  ;

mode PARAM_IN_MODE;

PARAM_IN
  : REQUEST_TYPE -> pushMode(DATA_TYPE_MODE)
  ;

fragment REQUEST_TYPE       :'query'
                            |'path'
                            |'header'
                            |'body'
                            |'formData'
                            ;
WS_PARAM_IN
  : [ \t\r\n]+ -> skip
  ;

mode DATA_TYPE_MODE;

PARAM_DATA_TYPE
  : DATA_TYPE -> pushMode(MANDATORY_MODE)
  ;

DATA_TYPE                      :'string'
                               |'integer'
                               |'number'
                               |'boolean'
                               |'array'
                               |'file'
                               |'object'
                               | IDENTIFIER
                               | IDENTIFIER DOT IDENTIFIER
                               ;

WS_DATA_TYPE
  : [ \t\r\n]+ -> skip
  ;

mode MANDATORY_MODE;

MANDATORY
  : MANDATORY_MARK -> pushMode(PARAM_COMMENT_MODE)
  ;

MANDATORY_MARK
  : TRUE
  | FALSE
  ;

WS_MANDATORY
  : [ \t\r\n]+ -> skip
  ;

mode PARAM_COMMENT_MODE;

PARAM_COMMENT
  : STRING -> pushMode(ATTRIBUTE_MODE)
  ;

WS_PARAM_COMMENT
  : [ \t\r\n]+ -> skip
  ;

mode ATTRIBUTE_MODE;

ATTRIBUTE_VALIDATE
  : 'validate' LEFT_PAREN ATTRIBUTE_VALIDATE_VALUES RIGHT_PAREN
  ;

ATTRIBUTE_MAXIMUM
  : 'maximum' LEFT_PAREN NUMBER RIGHT_PAREN
  ;

ATTRIBUTE_MINIMUM
  : 'minimum' LEFT_PAREN NUMBER RIGHT_PAREN
  ;


ATTRIBUTE_VALIDATE_VALUES
  : 'required'
  | 'optional'
  ;

WS_ATTRIBUTE
  : [ \t\r\n]+ -> skip
  ;