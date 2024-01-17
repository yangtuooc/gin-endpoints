parser grammar SwagParser;

options {
  tokenVocab=SwagLexer;
}

swags
  : swag+
  ;

swag
  : title
  | version
  | description
  | termsOfService
  | contactUrl
  | contactEmail
  | licenseName
  | licenseUrl
  | host
  | basePath
  | securityDefinitionsBasic
  | externalDocsDescription
  | externalDocsUrl
  | summary
  | tags
  | accept
  | produce
  | param
  ;

param
  : paramAnnotation paramName paramType dataType isMandatory comment attributes
  ;

paramAnnotation
  : AT_PARAM
  ;
paramName
  : PARAM_NAME
  ;
paramType
  : PARAM_IN
  ;
dataType
  : PARAM_DATA_TYPE
  ;
isMandatory
  : MANDATORY
  ;

comment
  : PARAM_COMMENT
  ;

attributes
  : attribute+
  ;

attribute
  : validate
  | maximum
  | minimum
  ;

minimum
  : ATTRIBUTE_MINIMUM
  ;

maximum
  : ATTRIBUTE_MAXIMUM
  ;



validate
  : ATTRIBUTE_VALIDATE
  ;

produce
  : produceAnnotation mimeTypes
  ;

produceAnnotation
  : AT_PRODUCE
  ;

accept
  : acceptAnnotation mimeTypes
  ;
acceptAnnotation
  : AT_ACCEPT
  ;

mimeTypes
  : MIME_TYPES
  ;





tags
  : tagsAnnotation stringComments
  ;

tagsAnnotation
  : AT_TAGS
  ;

externalDocsUrl
  : externalDocsUrlAnnotation stringComments
  ;
externalDocsUrlAnnotation
  : AT_EXTERNAL_DOCS_URL
  ;

externalDocsDescription
  : externalDocsDescriptionAnnotation stringComments
  ;
externalDocsDescriptionAnnotation
  : AT_EXTERNAL_DOCS_DESCRIPTION
  ;

securityDefinitionsBasic
  : securityDefinitionsBasicAnnotation stringComments
  ;
securityDefinitionsBasicAnnotation
  : AT_SECURITY_DEFINITIONS_BASIC
  ;


basePath
  : basePathAnnotation stringComments
  ;
basePathAnnotation
  : AT_BASE_PATH
  ;

host
  : hostAnnotation stringComments
  ;
hostAnnotation
  : AT_HOST
  ;

licenseUrl
  : licenseUrlAnnotation stringComments
  ;
licenseUrlAnnotation
  : AT_LICENSE_URL
  ;

licenseName
  : licenseNameAnnotation stringComments
  ;
licenseNameAnnotation
  : AT_LICENSE_NAME
  ;

contactEmail
  : contactEmailAnnotation stringComments
  ;
contactEmailAnnotation
  : AT_CONTACT_EMAIL
  ;

contactUrl
  : contactUrlAnnotation stringComments
  ;

contactUrlAnnotation
  : AT_CONTACT_URL
  ;

termsOfService
  : termsOfServiceAnnotation stringComments
  ;

termsOfServiceAnnotation
  : AT_TERMS_OF_SERVICE
  ;

description
  : descriptionAnnotation stringComments
  ;
descriptionAnnotation
  : AT_DESCRIPTION
  ;

version
  : versionAnnotation stringComments
  ;
versionAnnotation
  : AT_VERSION
  ;

title
  : titleAnnotation stringComments
  ;
titleAnnotation
  : AT_TITLE
  ;

summary
  : summaryAnnotation stringComments
  ;

summaryAnnotation
  : AT_SUMMARY
  ;

stringComments
  : STRING_COMMENTS
  ;