grammar Sophia;

sophia : program EOF;

program: (actor)* main;

actor: ACTOR actorName=IDENTIFIER (EXTENDS actorParent=IDENTIFIER)? LPAR INT_VALUE RPAR
        {
            System.out.print("ActorDec:");
            System.out.print($actorName.text);
            if($actorParent != null) {
                System.out.print(",");
                System.out.print($actorParent.text);
            }
            System.out.print("\n");
       }
        LBRACE actorBody RBRACE;

actorBody: knownActors actorVars (initialMsgHandler)? (msgHandler)*;

//knownActors

knownActors: KNOWNACTORS LBRACE knownActorsBody RBRACE;

knownActorsBody: (knownActorsStmt)*;

knownActorsStmt: knownActorType=IDENTIFIER knownActorName=IDENTIFIER SEMICOLLON
                {
                    System.out.print("KnownAcor:");
                    System.out.print($knownActorType.text);
                    System.out.print(",");
                    System.out.print($knownActorName.text);
                    System.out.print("\n");
                };

//actorVars

actorVars: ACTORVARS LBRACE defineVars RBRACE;

defineVars: (defineVarsStmt)*;

defineVarsStmt:
    ( (defineIntArray) | (actorVarType=primitiveDataType actorVarName=IDENTIFIER)) SEMICOLLON
    {
        if($actorVarName != null) {
            System.out.print("VarDec:");
            System.out.print($actorVarType.text);
            System.out.print(",");
            System.out.print($actorVarName.text);
            System.out.print("\n");
        }
    };

//msgHandler

msgHandler: MSGHANDLER msgHandlername=IDENTIFIER
            {
                            System.out.print("MsgHandlerDec:");
                            System.out.print($msgHandlername.text);
                            System.out.print("\n");
            }
            LPAR argumentBody RPAR LBRACE msgHandlerBody RBRACE;


initialMsgHandler: MSGHANDLER INITIAL LPAR argumentBody RPAR
            {
                System.out.print("MsgHandlerDec:");
                System.out.print("initial");
                System.out.print("\n");
            }
            LBRACE msgHandlerBody RBRACE;

argumentBody: (oneArgument)(() | (COMMA oneArgument)*) | ();

oneArgument: ((oneArgumentTypeName=primitiveDataType oneArgumentName=IDENTIFIER) | (defineIntArray))
             {
                System.out.print("VarDec:");
                System.out.print($oneArgumentTypeName.text);
                System.out.print(",");
                System.out.print($oneArgumentName.text);
                System.out.print("\n");
             };

//main

main: MAIN LBRACE mainBody RBRACE;

mainBody: (mainStatement)*;

mainStatement: (actorInstantiationType=IDENTIFIER actorInstantiationName=IDENTIFIER)
                {
                    System.out.print("ActorInstantiation:");
                    System.out.print($actorInstantiationType.text);
                    System.out.print(",");
                    System.out.print($actorInstantiationName.text);
                }
                LPAR ((mainKnownActorName1=IDENTIFIER)
                {
                    System.out.print(",");
                    System.out.print($mainKnownActorName1.text);
                }
                (() | (COMMA mainKnownActorName2=IDENTIFIER
                {
                    System.out.print(",");
                    System.out.print($mainKnownActorName2.text);
                }
                )*) | ())
                {System.out.print("\n");}
                RPAR COLON  LPAR
               ((expression)(() | (COMMA expression)*) | ()) RPAR SEMICOLLON;

//data types

defineIntArray: INT defineIntArrayName=IDENTIFIER LBRACK INT_VALUE RBRACK {
                    System.out.print("VarDec:int[],");
                    System.out.print($defineIntArrayName.text);
                    System.out.print("\n");
                };

primitiveDataType: INT | STRING | BOOLEAN;

values: boolValue | STRING_VALUE | INT_VALUE;

boolValue: TRUE | FALSE;

//other

msgHandlerBody: defineVars restOfStatements;

restOfStatements: (statement)*;

statement: scopeStatement | forStatement | ifStatement | ((assignmentStatement |  callMsgHandler | printFunction | continueBreak ) SEMICOLLON);

scopeStatement: LBRACE (statement)* RBRACE;

assignmentStatement: ((SELF DOT IDENTIFIER) | arrayWithIndex | IDENTIFIER) ASSIGN { System.out.print("Operator:=\n");} expression;

printFunction: PRINT { System.out.print("Built-in:Print\n");}
               LPAR (values | arrayWithIndex | IDENTIFIER | expression) RPAR;

callMsgHandler: (actorInstance=(SELF | SENDER | IDENTIFIER) DOT) calledMsgHandler=IDENTIFIER
                {
                    System.out.print("MsgHandlerCall:");
                    System.out.print($actorInstance.text);
                    System.out.print(",");
                    System.out.print($calledMsgHandler.text);
                    System.out.print("\n");
                }
                LPAR ( (SELF DOT IDENTIFIER | expression)(() | (COMMA (SELF DOT IDENTIFIER | expression))*) | ()) RPAR;

arrayWithIndex: IDENTIFIER LBRACK expression RBRACK;

forStatement: FOR { System.out.print("Loop:for\n");}
              LPAR (assignmentStatement)? SEMICOLLON (expression)? SEMICOLLON (assignmentStatement)? RPAR
              ((LBRACE ((statement)*) RBRACE) | (statement));

continueBreak: (BREAK | CONTINUE);

ifStatement: IF { System.out.print("Conditional:if\n");}
    LPAR expression RPAR ( (LBRACE ((statement)*) RBRACE) | (statement))
    (ELSE { System.out.print("Conditional:else\n");} ( (LBRACE ((statement)*) RBRACE) | (statement)))? ;

expression: expression00 | ternaryExpression;
expression00 : expression0 | {System.out.print("Operator:=\n");} assignmentStatement;
expression0 : expression1 | {System.out.print("Operator:||\n");} expression1 OR expression0;
expression1 : expression2 | {System.out.print("Operator:&&\n");} expression2 AND expression1;
expression2 : expression3 | {System.out.print("Operator:==\n");} expression3 EQUAL expression2 | {System.out.print("Operator:!=\n");} expression3 NOT_EQUAL expression2;
expression3 : expression4 | {System.out.print("Operator:<\n");} expression4 GREATER_THAN expression3 | {System.out.print("Operator:>\n");} expression4 LESS_THAN expression3;
expression4 : {System.out.print("Operator:+\n");} expression5 PLUS expression4 | {System.out.print("Operator:-\n");} expression5 MINUS expression4 | expression5;
expression5 : expression6 | {System.out.print("Operator:*\n");} expression6 MULT expression5 | {System.out.print("Operator:/\n");} expression6 DIVIDE expression5 | {System.out.print("Operator:%\n");} expression6 MOD expression5;
expression6 : expression7 | {System.out.print("Operator:--\n");} INCREASE expression7 | {System.out.print("Operator:++\n");} DECREASE expression7 | {System.out.print("Operator:!\n");} NOT expression7 | {System.out.print("Operator:-\n");} MINUS expression7;
expression7 : {System.out.print("Operator:++\n");} expression8 INCREASE | {System.out.print("Operator:--\n");} expression8 DECREASE | expression8;
expression8 : expression9 | LPAR (expression00) RPAR;
expression9 : SENDER |  (SELF DOT IDENTIFIER) | arrayWithIndex | values | IDENTIFIER;

ternaryExpression :  (((LPAR ternaryExpression RPAR) | expression00 ) QUESTION_MARK {System.out.print("Operator:?:\n");} (expression) COLON (expression)) | (LPAR ternaryExpression RPAR);

//tokens

MSGHANDLER: 'msghandler';
INITIAL: 'initial';
EXTENDS: 'extends';

ACTORVARS: 'actorvars';
KNOWNACTORS: 'knownactors';
ACTOR: 'actor';

PRINT: 'print';

MAIN: 'main';

CONTINUE: 'continue';
BREAK: 'break';

FOR: 'for';
IF: 'if';
ELSE: 'else';

BOOLEAN: 'boolean';
STRING: 'string';
INT: 'int';

TRUE: 'true';
FALSE: 'false';

SELF: 'self';
SENDER: 'sender';

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

COMMA: ',';
DOT: '.';
COLON: ':';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
STRING_VALUE: '"'~["]*'"';
WS: ([ \t\n\r] | '//' ~( '\r' | '\n')*) -> skip;