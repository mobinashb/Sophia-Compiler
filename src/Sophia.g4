grammar Sophia;

sophia : program EOF;

program: (sophiaClass)*;

sophiaClass: CLASS IDENTIFIER (INHERITS IDENTIFIER)? LBRACE classBody RBRACE;

classBody: (varDeclaration | method)* constructor (varDeclaration | method)*;

varDeclaration: type IDENTIFIER SEMICOLLON;

method: DEF (type | VOID) IDENTIFIER LPAR methodArguments RPAR LBRACE methodBody RBRACE;

constructor: DEF IDENTIFIER LPAR methodArguments RPAR LBRACE methodBody RBRACE;

methodArguments: (variableWithType)(() | (COMMA variableWithType)*) | ();

variableWithType: IDENTIFIER COLON type;

type: primitiveDataType | listType | functioPointerType | classType;

classType: IDENTIFIER;

listType: LIST LPAR ((INT_VALUE SHARP type) | (listItemsTypes)) RPAR;

listItemsTypes: (listItemType)(() | (COMMA listItemType)*) | ();

listItemType: variableWithType | type;

functioPointerType: FUNC LESS_THAN (VOID | typesWithComma) ARROW (VOID | type) GREATER_THAN;

typesWithComma: type (() | (COMMA type)*);

primitiveDataType: INT | STRING | BOOLEAN;

values: boolValue | STRING_VALUE | INT_VALUE | NULL | listValus;

boolValue: TRUE | FALSE;

listValus: LBRACK methodCallArguments RBRACK;

methodBody: superStatement? (varDeclaration)* (statement)*;

statement: forStatement | foreachStatement | ifStatement | assignmentStatement | printStatement | continueBreakStatement | methodCallStatement | returnStatement | scope;

scope: LBRACE (statement)* RBRACE;

superStatement: SUPER LPAR methodCallArguments RPAR SEMICOLLON;

assignmentStatement: assignment SEMICOLLON;

assignment: lvalue ASSIGN expression;

lvalue: fieldAccess | listAccess | IDENTIFIER;

fieldAccess: (THIS | IDENTIFIER) (DOT (IDENTIFIER | listAccess))+;

listAccess: IDENTIFIER ((LBRACK expression RBRACK) | (DOT IDENTIFIER))+;

printStatement: PRINT LPAR expression RPAR SEMICOLLON;

returnStatement: RETURN expression SEMICOLLON;

methodCallStatement: methodCall SEMICOLLON;

methodCall: expression LPAR methodCallArguments RPAR;

methodCallArguments: expression (() | (COMMA expression)*) | ();

continueBreakStatement: (BREAK | CONTINUE) SEMICOLLON;

forStatement: FOR LPAR (assignment)? SEMICOLLON (expression)? SEMICOLLON (assignment)? RPAR singleOrMultiStatements;

foreachStatement: FOREACH LPAR IDENTIFIER IN expression RPAR singleOrMultiStatements;

ifStatement: IF LPAR expression RPAR singleOrMultiStatements (ELSE singleOrMultiStatements)?;

singleOrMultiStatements: LBRACE (statement)* RBRACE | statement;

expression: orExpression | assignment;

orExpression : andExpression | andExpression OR orExpression;

andExpression : equalityExpression | equalityExpression AND andExpression;

equalityExpression : relationalExpression | relationalExpression EQUAL equalityExpression | relationalExpression NOT_EQUAL equalityExpression;

relationalExpression : additiveExpression | additiveExpression GREATER_THAN relationalExpression | additiveExpression LESS_THAN relationalExpression;

additiveExpression : multiplicativeExpression PLUS additiveExpression | multiplicativeExpression MINUS additiveExpression | multiplicativeExpression;

multiplicativeExpression : preUnaryExpression | preUnaryExpression MULT multiplicativeExpression |preUnaryExpression DIVIDE multiplicativeExpression | preUnaryExpression MOD multiplicativeExpression;

preUnaryExpression : postUnaryExpression | INCREASE postUnaryExpression | DECREASE postUnaryExpression | NOT postUnaryExpression | MINUS postUnaryExpression;

postUnaryExpression : parExpression INCREASE | parExpression DECREASE | parExpression;

parExpression : otherExpression | LPAR (methodCall) RPAR | LPAR (expression) RPAR;

otherExpression : fieldAccess | listAccess | newExpression | values | IDENTIFIER;

newExpression: NEW classType LPAR methodCallArguments RPAR;


DEF: 'def';
INHERITS: 'inherits';
CLASS: 'class';

PRINT: 'print';
FUNC: 'func';

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