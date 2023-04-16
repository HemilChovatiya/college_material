int factorial(int);
#include<stdio.h>

int factorial(int n)  
{
    int b,m=1;
    for(b=1;b<=n;b++) 
    {
        m=b*m;    
    }
  return m;
}
int main()
{  int n;
   printf("Enter the Number : ");
   scanf("%d",&n);
   int a=factorial(n);
   printf(" factorial of %d is %d",n,a); 
   return 0;
}







   

