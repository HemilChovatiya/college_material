#include <stdio.h>
int add(int ,int);
int main()
{
   int a,b,c;
     printf("Enter the Numbers:");
     scanf("%d%d",&a,&b);
     c=add(a,b);
      printf("Addition of two Number is:%d",c);
   return 0;
}

int add(int x,int y)
{
   int z;
   z=x+y;
   return z;
}