/**
 * @author Jonas Demski
 * @id 11739260
 */
grammar BigCalcProg;
/*
PARSER
*/


expressionStatement
        : statement+ EOF
        ;

statement
        : expression';' # expres
        | assignment';' # assign
        ;

expression  
        : expression op=('*' | '/') expression  # mulDiv
        | expression op=('+' | '-') expression  # addSub
        | Number                                # num
        | Identifier                            # ident
        ;

assignment
        :   Identifier'='expression
        ;
/*
LEXER
*/
Identifier
        : (UPPERCASE|LOWERCASE)DIGIT*
        ;

Number  
        : DIGIT+ ('.' DIGIT+)?
        ;

WS      : [ \t\r\n\u000C]+ -> skip  
        ;

COMMENT
        :   '/*' .*? '*/' -> skip
        ;

LINE_COMMENT
        : '//' ~[\r\n]* -> skip 
        ;
/*
LEXER FRAGMENTS
*/
fragment UPPERCASE  :   [A-Z];
fragment LOWERCASE  :   [a-z];
fragment DIGIT      :   [0-9];

