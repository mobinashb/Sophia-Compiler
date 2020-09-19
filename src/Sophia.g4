grammar Sophia;

sophia : program EOF;

program: (class)* mainclass (class)*;

class: LBRACE RBRACE;

mainclass: LBRACE RBRACE;

//tokens

DEF: 'def';
INHERITS: 'inherits';
CLASS: 'class';

PRINT: 'print';
FUNC: 'func';

MAIN: 'Main';
NEW: 'new';

CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';

FOREACH: 'foreach';
FOR: 'for';
IF: 'if';
ELSE: 'else';

BOOLEAN: 'bool';
STRING: 'string';
INT: 'int';
VOID: 'void';
NULL: 'null';
LIST: 'list';

TRUE: 'true';
FALSE: 'false';

THIS: 'this';
SUPER: 'super';

ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';
NOT_EQUAL: '=!';
EQUAL: '==';

MULT: '*';
DIVIDE: '/';
MOD: '%';
PLUS: '+';
MINUS: '-';
AND: '&&';
OR: '||';
NOT: '!';
QUESTION_MARK: '?';

ASSIGN: '=';

INCREASE: '++';
DECREASE: '--';

LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

SHARP: '#';
COMMA: ',';
DOT: '.';
COLON: ':';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
STRING_VALUE: '"'~["]*'"';
COMMENT: ('//' ~( '\r' | '\n')*) -> skip;
WS: ([ \t\n\r]) -> skip;