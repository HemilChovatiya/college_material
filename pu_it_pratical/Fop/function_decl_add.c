//WAP to add 2 nos using user defined function
#include <stdio.h>
int add(int,int); 
int mul(int,int);
int sub(int,int);
int divs(int,int);//function declaration 
void main()
{
     int a,b,t1,t2,t3,t4;
     printf("Enter a and b:");
     scanf("%d%d",&a,&b);
     t1=add(a,b);
     t2=sub(a,b); 
     t3=mul(a,b); 
     t4=divs(a,b); // funnction call
     printf("\nAddition is %d",t1);
     printf("\nsubtraction is %d",t2);
     printf("\nMultiplication is %d",t3);
     printf("\nDivision is %d",t4);
}
int add(int a,int b)  //function defination
{
   int t1;
   t1=a+b;
   return t1;
}
int sub(int a,int b)  //function defination
{
   int t2;
   t2=a-b;
}
int mul(int a,int b)  //function defination
{
   int t3;
   t3=a*b;
}
int divs(int a,int b)  //function defination
{
   int t4;
   t4=a/b;
   return t4;
}




