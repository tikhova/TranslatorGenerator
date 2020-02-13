grammar Grammar ;

grammar_:  GRAMMAR LEXER_IDENTIFIER SEMICOLON SemanticRules? rule_* ;

rule_: parsingRule | lexingRule | SkipRule;

parsingRule: PARSER_IDENTIFIER COLON parsingRuleOptions SEMICOLON ;

parsingAtom:
    PARSER_IDENTIFIER InheritedRules? SemanticRules? |
    LEXER_IDENTIFIER InheritedRules? SemanticRules? |
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
APOSTROPHE: '\'' ;
SEMICOLON: ';' ;
COLON: ':' ;
OR: '|' ;
QUESTION: '?' ;
STAR: '*' ;
PLUS: '+' ;
ARROW: '->' ;
LSIGN: '<' ;
GSIGN: '>' ;

WS : [ \t\r\n\u000C]+ -> skip ;

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

InheritedRules: LSIGN .*? GSIGN ;

SemanticRules: LBRACE .*? RBRACE ;

LexerLiteral: APOSTROPHE .*? APOSTROPHE ;

fragment
LITERAL : . ;
