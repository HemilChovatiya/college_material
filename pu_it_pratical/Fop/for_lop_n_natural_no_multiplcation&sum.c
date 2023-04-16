#include <stdio.h>

int main()
{   int a,b,sum=0,mpy=1;
    printf("enter n nat_no :");
    scanf("%d",&a);
for(b=1;b<=a;b++)
{  sum= sum+b;
   mpy=mpy * b;
}
printf("Sum of n natural no. is : %d",sum);
printf("\nMultiplication of n natural no. is :%d",mpy);
    return 0;
}