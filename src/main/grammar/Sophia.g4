grammar Sophia;

@header{
    import main.ast.types.*;
    import main.ast.types.functionPointer.*;
    import main.ast.types.list.*;
    import main.ast.types.single.*;
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.declaration.classDec.*;
    import main.ast.nodes.declaration.classDec.classMembersDec.*;
    import main.ast.nodes.declaration.variableDec.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.values.*;
    import main.ast.nodes.expression.values.primitive.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.statement.loop.*;
}

sophia returns [Program sophiaProgram]:
    {$sophiaProgram = new Program();}
    program EOF;

program: (sophiaClass)*;

sophiaClass: CLASS identifier (EXTENDS identifier)? LBRACE classBody RBRACE;

classBody: (varDeclaration | method)* constructor? (varDeclaration | method)*;

varDeclaration: type identifier SEMICOLLON;

method: DEF (type | VOID) identifier LPAR methodArguments RPAR LBRACE methodBody RBRACE;

constructor: DEF identifier LPAR methodArguments RPAR LBRACE methodBody RBRACE;

methodArguments: (variableWithType (COMMA variableWithType)*)?;

variableWithType: identifier COLON type;

type: primitiveDataType | listType | functioPointerType | classType;

classType: identifier;

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

returnStatement: RETURN expression? SEMICOLLON;

methodCallStatement: methodCall SEMICOLLON;

methodCall: otherExpression ((DOT (INVOKE | identifier) LPAR methodCallArguments RPAR) | (DOT identifier) | (LBRACK expression RBRACK))* (DOT (INVOKE | identifier) LPAR methodCallArguments RPAR);

methodCallArguments: (expression (COMMA expression)*)?;

continueBreakStatement: (BREAK | CONTINUE) SEMICOLLON;

forStatement: FOR LPAR (assignmentStmt)? SEMICOLLON (expression)? SEMICOLLON (assignmentStmt)? RPAR singleOrMultiStatements;

foreachStatement: FOREACH LPAR identifier IN expression RPAR singleOrMultiStatements;

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

accessExpression: otherExpression ((DOT (INVOKE | identifier) LPAR methodCallArguments RPAR) | (DOT identifier) | (LBRACK expression RBRACK))*;

otherExpression: THIS | newExpression | values | identifier | LPAR (expression) RPAR | identifier LBRACK expression RBRACK;

newExpression: NEW classType LPAR methodCallArguments RPAR;

identifier: IDENTIFIER;


DEF: 'def';
EXTENDS: 'extends';
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