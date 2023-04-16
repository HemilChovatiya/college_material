#include<stdio.h>
int mul(int,int);
int main()
{
     int a,b,r;
     printf("Enter a and b:\n");
     scanf("%d%d",&a,&b);
     r=mul(a,b); 
     printf("\nMultiplication is %d",r);
}
int mul(int y,int z)  
{   int p;
   p=y*z;
   return p;
}





