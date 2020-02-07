grammar Grammar ;

grammar_:  GRAMMAR LEXER_IDENTIFIER SEMICOLON attributes rule_* ;

attributes: LBRACE (Attribute SEMICOLON)* RBRACE ;

Attribute: LITERAL+? ;

rule_: parsingRule | lexingRule | skipRule;

parsingRule: PARSER_IDENTIFIER COLON parsingRuleOptions SemanticRules? SEMICOLON ;

Identifier: LEXER_IDENTIFIER | PARSER_IDENTIFIER ;

parsingAtom: Identifier | LPARENTHESIS parsingAtom RPARENTHESIS ;

parsingRuleOptions: parsingAtom | parsingAtom OR parsingRuleOptions ;

lexingRule: LEXER_IDENTIFIER COLON lexingRuleOptions SEMICOLON ;

lexingAtom:
   LexerLiteral CountMark |
   LEXER_IDENTIFIER CountMark |
   LPARENTHESIS lexingAtom RPARENTHESIS ;

CountMark: (QUESTION | STAR | PLUS)? ;

lexingRuleOptions: lexingAtom OR lexingRuleOptions ;

skipRule: LEXER_IDENTIFIER COLON lexingAtom ARROW SKIP_ SEMICOLON ;

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
LEXER_IDENTIFIER : UppercaseLetter String ;

fragment
UppercaseLetter: [A-Z] ;

fragment
LowercaseLetter: [a-z] ;

fragment
Letter: LowercaseLetter | UppercaseLetter;

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

WS :  [ \t\r\n\u000C]+ -> skip ;

SemanticRules: LBRACE LITERAL+? RBRACE ;

LexerLiteral:
    APOSTROPHE LITERAL+? APOSTROPHE |
    LBRACKET LITERAL+? RBRACKET ;

fragment
LITERAL : . ;