grammar Logic ;

{
var value = false
}

ATOM : 'true' | 'false' ;

LBRACE : '\(' ;

RBRACE : '\)' ;

OR : '||' ;

XOR : '\^' ;

AND : '&&' ;

NOT : '\!' ;

expression : x_value x_or_continuation <it.value = res.children[0].value> {res.value = res.children[1].value};

x_or_continuation : OR expression {res.value = res.value || children[1].value} | XOR expression {res.value = res.value xor children[1].value} | EPS ;

x_value : and_value and_continuation <it.value = res.children[0].value> {res.value = res.children[1].value} ;

and_value : NOT value {res.value = !res.children[0].value} | value {res.value = res.children[0].value} ;

and_continuation : AND x_value {res.value = res.value && children[1].value} | EPS ;

value : LBRACE expression RBRACE { res.value = res.children[1].value } | ATOM { res.value = res.children[0].name.toBoolean() } ;

EPS: ;

