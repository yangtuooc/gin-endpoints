parser grammar SwagParser;

import JSON;

options {
  tokenVocab = SwagLexer;
}

title: TITLE TEXT;
version: VERSION TEXT;
description: DESCRIPTION TEXT;
termsOfService: TERMS_OF_SERVICE TEXT;

contactName: CONTACT_NAME TEXT;
contactUrl: CONTACT_URL TEXT;
contactEmail: CONTACT_EMAIL EMAIL;

licenseName: LICENSE_NAME TEXT;
licenseUrl: (HTTP_URL | HTTPS_URL);
host: HOST TEXT;
basePath: BASE_PATH TEXT;

securityDefinitionsBasic: SECURITY_DEFINITIONS_BASIC TEXT;
externalDocsDescription: EXTERNAL_DOCS_DESCRIPTION TEXT;
externalDocsUrl: EXTERNAL_DOCS_URL TEXT;

summary: SUMMARY TEXT;
tags: TAGS tag+;
tag: TEXT (COMMA TEXT)*;

accept: ACCEPT MIME;
produce: PRODUCE MIME;

param: PARAM IDENTIFIER PARAM_TYPE DATA_TYPE  isMandatory comment  (ATTRIBUTES)*;
comment: TEXT;
isMandatory: (TRUE | FALSE);

// TODO add support for security

success: returnCode PARAM_TYPE DATA_TYPE comment;
failure: returnCode PARAM_TYPE DATA_TYPE comment;
response: returnCode PARAM_TYPE DATA_TYPE comment;
header: returnCode PARAM_TYPE DATA_TYPE comment;
router: path HTTP_METHODS;

extensions: extensionMark json;
extensionMark: 'x-';

returnCode: INTERGER;
path
  : IDENTIFIER
  | SLASH
  | LEFT_BRACE
  | RIGHT_BRACE
  | STAR
  ;





