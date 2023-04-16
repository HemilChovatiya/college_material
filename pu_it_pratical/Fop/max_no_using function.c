#include <stdio.h>
int max(int ,int);
int main()
{
   int a,b,c;
     printf("Enter the Numbers:");
     scanf("%d%d",&a,&b);
     c=max(a,b);
      printf("Maximum Number is:%d",c);
   return 0;
}

int max(int x,int y)
{

   if (x>y)
  {
   return x;
  }
  else
  {
   return y;
  }
}