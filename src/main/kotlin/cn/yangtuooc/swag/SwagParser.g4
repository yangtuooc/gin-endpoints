parser grammar SwagParser;

options {
  tokenVocab = SwagLexer;
}

title: TITLE SPACE TEXT;
version: VERSION SPACE TEXT;
description: DESCRIPTION SPACE TEXT;
termsOfService: TERMS_OF_SERVICE SPACE TEXT;

contactName: CONTACT_NAME SPACE TEXT;
contactUrl: CONTACT_URL SPACE TEXT;
contactEmail: CONTACT_EMAIL SPACE EMAIL;

licenseName: LICENSE_NAME SPACE TEXT;
licenseUrl: (HTTP_URL | HTTPS_URL);
host: HOST SPACE TEXT;
basePath: BASE_PATH SPACE TEXT;

securityDefinitionsBasic: SECURITY_DEFINITIONS_BASIC SPACE TEXT;
externalDocsDescription: EXTERNAL_DOCS_DESCRIPTION SPACE TEXT;
externalDocsUrl: EXTERNAL_DOCS_URL SPACE TEXT;

summary: SUMMARY SPACE TEXT;
tags: TAGS SPACE tag+;
tag: TEXT (COMMA TEXT)*;

accept: ACCEPT SPACE MIME;
produce: PRODUCE SPACE MIME;

param
  : PARAM SPACE
    IDENTIFIER SPACE
    PARAM_TYPE SPACE
    DATA_TYPE SPACE isMandatory SPACE comment SPACE attributes;

isMandatory: (TRUE | FALSE);

