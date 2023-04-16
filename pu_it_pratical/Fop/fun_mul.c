#include<stdio.h>
void mul(int,int);
void main()
{
     int a,b;
     printf("Enter a and b:\n");
     scanf("%d%d",&a,&b);
     mul(a,b); 
     
}
void mul(int y,int z)  //function defination
{
   int p;
   p=y*z;
   printf("\nMultiplication is %d",p);
}





