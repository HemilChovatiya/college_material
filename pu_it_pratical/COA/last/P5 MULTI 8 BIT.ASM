;khanpara jay ashokbhai
;200303108017
;<Program title>

jmp start

;data


;code
start: nop

LDA 4200
MOV B,A
LDA 4201
MOV D,A
MVI A,00
Loop: ADD B
DCR D 
JNZ Loop
STA 4202
hlt

