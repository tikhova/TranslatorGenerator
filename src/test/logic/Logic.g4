grammar Logic ;

ATOM : 'true' | 'false' ;

LBRACE : '\(' ;

RBRACE : '\)' ;

OR : '||' ;

XOR : '\^' ;

AND : '&&' ;

NOT : '\!' ;

expression : x_value x_or_continuation ;

x_or_continuation : OR expression | XOR expression | EPS ;

x_value : and_value and_continuation ;

and_value : NOT value | value ;

and_continuation : AND x_value | EPS ;

value : LBRACE expression RBRACE | ATOM ;

EPS: ;

