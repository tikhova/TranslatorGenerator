grammar Logic ;

{
var value = false
}

ATOM : 'true' | 'false' | '[a-zA-Z]';

LBRACE : '\(' ;

RBRACE : '\)' ;

OR : 'or' ;

XOR : 'xor' ;

AND : 'and' ;

NOT : 'not' ;

EPS : ;

expression : x_value x_or_continuation <it.value = res.children[0].value> {res.value = res.children[1].value};

x_or_continuation : OR x_value {res.value = res.value || children[1].value} x_or_continuation <it.value = res.value> {res.value = res.children[2].value} |
                    XOR x_value {res.value = res.value xor children[1].value} x_or_continuation <it.value = res.value> {res.value = res.children[2].value} |
                    EPS ;

x_value : and_value and_continuation <it.value = res.children[0].value> {res.value = res.children[1].value} ;

and_value : NOT value {res.value = !res.children[1].value} | value {res.value = res.children[0].value} ;

and_continuation : AND and_value {res.value = res.value && children[1].value} and_continuation <it.value = res.value> {res.value = res.children[2].value} |
                   EPS ;

value : LBRACE expression RBRACE {res.value = res.children[1].value} |
        ATOM {res.value = res.children[0].text.toBoolean()} ;

skip -> [ \t\r\n] ;