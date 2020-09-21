grammar Sophia;

sophia : program EOF;

program: (sophiaClass)*;

sophiaClass: CLASS IDENTIFIER (INHERITS IDENTIFIER)? LBRACE classBody RBRACE;

classBody: (varDeclaration | method)* constructor? (varDeclaration | method)*;

varDeclaration: type IDENTIFIER SEMICOLLON;

method: DEF (type | VOID) IDENTIFIER LPAR methodArguments RPAR LBRACE methodBody RBRACE;

constructor: DEF IDENTIFIER LPAR methodArguments RPAR LBRACE methodBody RBRACE;

methodArguments: (variableWithType (COMMA variableWithType)*)?;

variableWithType: IDENTIFIER COLON type;

type: primitiveDataType | listType | functioPointerType | classType;

classType: IDENTIFIER;

listType: LIST LPAR ((INT_VALUE SHARP type) | (listItemsTypes)) RPAR;

listItemsTypes: (listItemType (COMMA listItemType)*)?;

listItemType: variableWithType | type;

functioPointerType: FUNC LESS_THAN (VOID | typesWithComma) ARROW (VOID | type) GREATER_THAN;

typesWithComma: type (COMMA type)*;

primitiveDataType: INT | STRING | BOOLEAN;

values: boolValue | STRING_VALUE | INT_VALUE | NULL | listValus;

boolValue: TRUE | FALSE;

listValus: LBRACK methodCallArguments RBRACK;

methodBody: superStatement? (varDeclaration)* (statement)*;

statement: forStatement | foreachStatement | ifStatement | assignmentStatement | printStatement | continueBreakStatement | methodCallStatement | returnStatement | block;

block: LBRACE (statement)* RBRACE;

superStatement: SUPER LPAR methodCallArguments RPAR SEMICOLLON;

assignmentStatement: assignmentStmt SEMICOLLON;

assignmentStmt: orExpression ASSIGN expression;

printStatement: PRINT LPAR expression RPAR SEMICOLLON;

returnStatement: RETURN expression SEMICOLLON;

methodCallStatement: methodCall SEMICOLLON;

methodCall: otherExpression ((DOT (INVOKE | IDENTIFIER) LPAR methodCallArguments RPAR) | (DOT IDENTIFIER) | (LBRACK expression RBRACK))* (DOT (INVOKE | IDENTIFIER) LPAR methodCallArguments RPAR);

methodCallArguments: (expression (COMMA expression)*)?;

continueBreakStatement: (BREAK | CONTINUE) SEMICOLLON;

forStatement: FOR LPAR (assignmentStmt)? SEMICOLLON (expression)? SEMICOLLON (assignmentStmt)? RPAR singleOrMultiStatements;

foreachStatement: FOREACH LPAR IDENTIFIER IN expression RPAR singleOrMultiStatements;

ifStatement: IF LPAR expression RPAR singleOrMultiStatements (ELSE singleOrMultiStatements)?;

singleOrMultiStatements: block | statement;

expression: orExpression (ASSIGN expression)?;

orExpression: andExpression (OR andExpression)*;

andExpression: equalityExpression (AND equalityExpression)*;

equalityExpression: relationalExpression ((EQUAL | NOT_EQUAL) relationalExpression)*;

relationalExpression: additiveExpression ((GREATER_THAN | LESS_THAN) additiveExpression)*;

additiveExpression: multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*;

multiplicativeExpression: preUnaryExpression ((MULT | DIVIDE | MOD) preUnaryExpression)*;

preUnaryExpression: NOT postUnaryExpression | MINUS postUnaryExpression | INCREMENT postUnaryExpression | DECREMENT postUnaryExpression | postUnaryExpression;

postUnaryExpression: accessExpression (INCREMENT | DECREMENT)?;

accessExpression: otherExpression ((DOT (INVOKE | IDENTIFIER) LPAR methodCallArguments RPAR) | (DOT IDENTIFIER) | (LBRACK expression RBRACK))*;

otherExpression: THIS | newExpression | values | IDENTIFIER | LPAR (expression) RPAR | IDENTIFIER LBRACK expression RBRACK;

newExpression: NEW classType LPAR methodCallArguments RPAR;


DEF: 'def';
INHERITS: 'inherits';
CLASS: 'class';

PRINT: 'print';
FUNC: 'func';
INVOKE: 'invoke';

NEW: 'new';

CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';

FOREACH: 'foreach';
IN: 'in';
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

INCREMENT: '++';
DECREMENT: '--';

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