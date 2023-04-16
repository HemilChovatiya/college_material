;khanpara jay ashokbhai
;200303108017
;<Program title>

jmp start

;data


;code
start: nop

LDA 2011
MOV B,A
MVI C,00
LDA 2010
NEXT: CMP B
JC LOOP
SUB B
INR C
JMP NEXT
LOOP: STA 2012
MOV A,B
STA 2013
HLT


hlt