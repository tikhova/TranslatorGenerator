grammar Calculator;

{
var value: Int? = null;
}

expression : complex expressionPrime(second.value)  <it.value = res.children[0].value> {res.value = res.children[1].value};
expressionPrime : EPS  |
                  PLUS expression  {res.value = res.value + children[1].value} |
                  MINUS expression {res.value = res.value - children[1].value} ;

complex : value complexPrime <it.value = res.children[0].value> {res.value = res.children[1].value};

complexPrime: EPS |
              MULTIPLICATION complex {res.value = res.value * children[1].value} |
              DIVISION complex {res.value = res.value / children[1].value} ;

value : NUMBER {res.value = res.children[0].name.toInt()} |
        LBRACE expression RBRACE { res.value = res.children[1].value } ;

DIVISION: '/' ;
MINUS: '-' ;
PLUS : '\+' ;
MULTIPLICATION : '\*' ;
NUMBER : '0' | '[1-9][0-9]*';
LBRACE : '\(' ;
RBRACE : '\)' ;
WHITESPACE : '[ \t\r\n]' -> skip ;

