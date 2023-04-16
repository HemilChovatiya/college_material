int factorial(int);
#include<stdio.h>

int main()
{  int n,f;
   printf("Enter the Number : ");
   scanf("%d",&n);
   int a=factorial(n);
   printf(" factorial of %d is %d",n,a); 
   
}
int factorial(int n)  
{
   if (n==0)
   {
       return 1;
   }
   else
   {
      return n*factorial(n-1);     //Recursion
   }
   
}






   

