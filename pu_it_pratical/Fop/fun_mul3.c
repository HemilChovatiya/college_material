#include<stdio.h>
void mul();
void main()
{
     mul(); 
     
}
void mul()  
{
  int a,b;
     printf("Enter a and b:\n");
     scanf("%d%d",&a,&b);
     printf("Multiplication is %d",a*b);
}


