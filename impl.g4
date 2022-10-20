grammar impl;

start   : cs=commands EOF;


commands : cmds+=command* simdecl ;


command : x=IDENTIFIER '=' e=expr               # Assignment

	| '.hardware' e=expr+                       # StartHardware
	| '.inputs' e=expr+                         # Inputs
	| '.outputs' e=expr+                        # Outputs
	| '.latch' e1=expr '->' e2=expr             # Latch
	| '.update' c=command+                      # Update
	;


simdecl : '.simulate' (x=IDENTIFIER '=' c=CONST)    # Simulate
;

expr : '(' e1=expr ')'   	                    # Parentheses
    | op='!' e1=expr  	                        # Not
    | e1=expr op='&&' e2=expr                   # And
    | e1=expr op='||' e2=expr                   # Or
    | c=CONST		     	                    # Constant
    | x=IDENTIFIER     	                        # Variable
    ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;
CONST : [0-1]+;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 

