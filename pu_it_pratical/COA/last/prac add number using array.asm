;Hemil Chovatiya
;200303108003

LXI H,2001 
 	MOV C,A 
 	MVI B,00 	 
BACK:	MOV A,B 
 	ADD M 
 	MOV B,A 
SKIP:   INX H 
 	DCR C 
 	JNZ BACK 
 	MOV A,B 
 	STA 2009
 	HLT
