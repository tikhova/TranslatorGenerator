grammar Grammar ;

grammar_:  GRAMMAR LEXER_IDENTIFIER SEMICOLON Attributes? rule_* ;

Attributes: LBRACE (LITERAL+ SEMICOLON)* RBRACE ;

rule_: parsingRule | lexingRule | SkipRule;

parsingRule: PARSER_IDENTIFIER COLON parsingRuleOptions SEMICOLON ;

parsingAtom:
    PARSER_IDENTIFIER SemanticRules? |
    LEXER_IDENTIFIER SemanticRules? |
    LPARENTHESIS parsingAtom RPARENTHESIS ;

parsingRuleOptions: parsingAtom+ | parsingAtom+ OR parsingRuleOptions ;

lexingRule: LEXER_IDENTIFIER COLON lexingRuleOptions SEMICOLON ;

lexingAtom:
   LexerLiteral? CountMark? |
   LEXER_IDENTIFIER CountMark? |
   LPARENTHESIS lexingAtom RPARENTHESIS ;

lexingRuleOptions: lexingAtom | lexingAtom OR lexingRuleOptions ;

SkipRule: SKIP_ LEXER_IDENTIFIER COLON LBRACKET LITERAL+ RBRACKET SEMICOLON ;

// Lexer

GRAMMAR: 'grammar' ;
FRAGMENT: 'fragment' ;
SKIP_: 'skip' ;
LPARENTHESIS: '(' ;
RPARENTHESIS: ')' ;
LBRACKET: '[' ;
RBRACKET: ']' ;
LBRACE: '{' ;
RBRACE: '}' ;

PARSER_IDENTIFIER: LowercaseLetter String ;

LEXER_IDENTIFIER: UppercaseLetter String ;

Identifier: LEXER_IDENTIFIER | PARSER_IDENTIFIER ;

CountMark: QUESTION | STAR | PLUS;

fragment
UppercaseLetter: [A-Z] ;

fragment
LowercaseLetter: [a-z] ;

fragment
Letter: LowercaseLetter | UppercaseLetter | '_';

fragment
String: Letter* ;

APOSTROPHE: '\'' ;
SEMICOLON: ';' ;
COLON: ':' ;
OR: '|' ;
QUESTION: '?' ;
STAR: '*' ;
PLUS: '+' ;
ARROW: '->' ;

WS : [ \t\r\n\u000C]+ -> skip ;

SemanticRules: LBRACE LITERAL+? RBRACE ;

LexerLiteral: APOSTROPHE LITERAL+? APOSTROPHE ;

fragment
LITERAL : . ;
