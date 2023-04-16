//Sum of Natural Numbers Using Recursion
int sum(int);
#include<stdio.h>

int main()
{  int n,f;
   printf("Enter the Number : ");
   scanf("%d",&n);
   int a=sum(n);
   printf(" sum of %d natural number is %d",n,a); 
   
}
int sum(int n)  
{
   if (n==1)
   {
       return 1;
   }
   else
   {
      return n+sum(n-1);     //Recursion
   }
   
}






   


