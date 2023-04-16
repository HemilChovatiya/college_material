#include <stdio.h>
int prime(int);
int main()
{
   prime();
}

int prime(int x);
{   printf("Enter Number:");
    scanf("%d",&x);
    int i, num, p = 0;
   printf("Please enter a number: \n");
   scanf("%d", &num);
   for(i=1; i<=num; i++)
   {
      if(num%i==0)
      {
         p++;  //count factor
      }
   }
   if(p==2)
   {
     return 0; //prime
   }
   else
   {
      return 1; //not prime
   }
}