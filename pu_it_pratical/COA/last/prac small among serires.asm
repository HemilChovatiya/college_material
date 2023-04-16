;Hemil Chovatiya
;200303108003

LXI H,2000       
         MOV B,M        
         INX H 
         MOV A,M          
         DCR B            
 LOOP: INX H 
         CMP M            
         JC AHEAD
         MOV A,M          
AHEAD: DCR B 
         JNZ LOOP         
         STA 2009
         HLT


