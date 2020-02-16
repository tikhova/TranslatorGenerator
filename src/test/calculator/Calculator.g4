grammar Calculator;

{
var value: Int? = null;
}

expression : complex expressionPrime <it.value = res.children[0].value> {res.value = children[1].value!!};
expressionPrime : EPS  |
                  PLUS complex expressionPrime  <it.value = res.value!! + children[1].value!!> {res.value = children[2].value!!} |
                  MINUS complex expressionPrime <it.value = res.value!! - children[1].value!!> {res.value = children[2].value!!} ;

complex : value complexPrime <it.value = res.children[0].value!!> {res.value = children[1].value!!};

complexPrime: EPS |
              MULTIPLICATION value complexPrime <it.value = res.value!! * children[1].value!!> {res.value = children[2].value!!} |
              DIVISION value complexPrime <it.value = res.value!! / children[1].value!!> {res.value = children[2].value!!} ;

value : NUMBER {res.value = children[0].name.toInt()} |
        LBRACE expression RBRACE { res.value = children[1].value!! } ;

DIVISION: '/' ;
MINUS: '-' ;
PLUS : '\+' ;
MULTIPLICATION : '\*' ;
NUMBER : '0' | '[1-9][0-9]*';
LBRACE : '\(' ;
RBRACE : '\)' ;
EPS : '' ;
skip -> [ \t\r\n] ;

