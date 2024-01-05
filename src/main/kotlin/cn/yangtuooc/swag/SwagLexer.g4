lexer grammar SwagLexer;

TITLE: '@title';
VERSION: '@version';
DESCRIPTION: '@description';
TAG_NAME: '@tag.name';
TAG_DESCRIPTION: '@tag.description';
TAG_DOCS_URL: '@tag.docs.url';
TERMS_OF_SERVICE: '@termsOfService';
CONTACT_NAME: '@contact.name';
CONTACT_URL: '@contact.url';
CONTACT_EMAIL: '@contact.email';
LICENSE_NAME: '@license.name';
LICENSE_URL: '@license.url';
HOST: '@host';
BASE_PATH: '@BasePath';
SECURITY_DEFINITIONS_BASIC: '@securityDefinitions.basic';
EXTERNAL_DOCS_DESCRIPTION: '@externalDocs.description';
EXTERNAL_DOCS_URL: '@externalDocs.url';
QUERY_COLLECTION_FORMAT: '@query.collection.format';
SCHEMA: '@schema';

DESCRIPTION_MARKDOWN: '@description.markdown';
ID: '@Id';
TAGS: '@Tags';
SUMMARY: '@Summary';
ACCEPT: '@Accept';
PRODUCE: '@Produce';
PARAM: '@Param';
SECURITY: '@Security';
SUCCESS: '@Success';
FAILURE: '@Failure';
RESPONSE: '@Response';
HEADER: '@Header';
ROUTER: '@Router';

MIME
  :'json'
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

IDENTIFIER: [a-zA-Z0-9_\-]+;

PARAM_TYPE
  : 'query'
  | 'path'
  | 'header'
  | 'body'
  | 'formData'
  ;

DATA_TYPE
  : 'string'
  | 'integer'
  | 'number'
  | 'boolean'
  | IDENTIFIER (COMMA IDENTIFIER)*
  ;

ATTRIBUTE
  : 'default' LEFT_PAREN DATA_TYPE RIGHT_PAREN
  | 'maximum' LEFT_PAREN NUMBER RIGHT_PAREN
  // TODO: add more attributes: https://github.com/swaggo/swag/blob/master/README_zh-CN.md#mime%E7%B1%BB%E5%9E%8B
  ;

NUMBER: [0-9]+;
LEFT_PAREN: '(';
RIGHT_PAREN: ')';

TRUE: 'true';
FALSE: 'false';

COMMA: ',';
SPACE: [ \t]+;
TEXT: ~[\r\n]+;
HTTP_URL: 'http://' ~[\r\n]+;
HTTPS_URL: 'https://' ~[\r\n]+;
EMAIL: ~[\r\n]+ '@' ~[\r\n]+;

WS: [ \t\r\n]+ -> skip;


