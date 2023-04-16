#include <stdio.h>
void mul(int a,int b);

void main()
{
     int a,b,d;
     printf("Enter a and b:");
     scanf("%d%d",&a,&b);
     d=mul(a,b); 
     printf("\nMultiplication is %d",d);
}
void mul(int a,int b)  //function defination
{
   int d;
   d=a*b;
}





