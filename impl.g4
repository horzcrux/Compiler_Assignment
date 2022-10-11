grammar impl;

start   : cs=commands EOF;

/*
commands : c=command cs=commands   # Sequence
	 | 	   	           # NOP
	 ;
*/

commands : cmds+=command* ;


command : x=IDENTIFIER '=' e=expr               # Assignment

	| '.hardware' e=expr+                       # StartHardware
	| '.inputs' e=expr+                         # Inputs
	| '.outputs' e=expr+                        # Outputs
	| '.latch' e1=expr '->' e2=expr             # Latch
	| '.update'                                 # Update
	| '.simulate' command                       # Simulate
	;
	
//block : '{' cs=commands '}'                   # MultiCommand
//      | c=command	     	                    # SingleCommand
//      ;
//
//condition : e1=expr op=('>'|'<'|'=='|'!=') e2=expr ;

expr : '(' e1=expr ')'   	            # Parentheses

     | e1=expr op='||' e2=expr          # Or
     | e1=expr op='&&' e2=expr          # And

     | op='!' e1=expr  	                # Not

     | c=CONST		     	            # Constant
     | x=IDENTIFIER     	            # Variable
     ;


IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-9]+ ('.' [0-9]+)? ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 

