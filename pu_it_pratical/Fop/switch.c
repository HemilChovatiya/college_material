

#include <stdio.h>
#include <string.h>
struct calc {
char a[1000],b[1000];
int res;
}cal[10];
int main()
{int p =0 
 int c = 0, countoperator = 0,i,length[1000];
 char s[1000],operator;
 printf("Input a string\n");
 gets(s);
 int slength = strlen(s);
 printf(" %d  ",slength);
 while (s[c] != '\0') {
 if (s[c] == '+' || s[c] == '-' || s[c] == '/' || s[c] == '*' || s[c] == '%')
 { p = c;
   countoperator++;
   operator=s[c];
   printf(" operator :%d ", countoperator);
   if(countoperator==1)
   { 
    
   }
 }
 if( c < p )
 c++;
 }

 printf("operator :%d", countoperator);
 return 0;
}



