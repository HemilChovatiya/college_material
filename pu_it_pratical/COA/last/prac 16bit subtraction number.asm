;Hemil Chovatiya
;200303108003
;16 bit Subtration

MVI E,00
LHLD 3000
XCHG
LHLD 3002
MOV A,E
SUB L
STA 3003
MOV A,D
SBB H
STA 3004
HLT       


