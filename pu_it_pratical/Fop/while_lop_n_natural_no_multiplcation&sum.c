#include <stdio.h>

int main()
{   int a,b=0,sum=0,mpy=1;
    printf("enter n nat_no :");
    scanf("%d",&a);
while(b<a)
{   b=b+1;
   sum= sum+b;
   mpy=mpy*b;
}
printf("Sum of n natural no. is : %d",sum);
printf("\nMultiplication of n natural no. is :%d",mpy);
    return 0;
}