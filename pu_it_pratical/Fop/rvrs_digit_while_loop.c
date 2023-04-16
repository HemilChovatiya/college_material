#include <stdio.h>

int main()
{   int a,b,sum=0;
    printf("Enter the Number: ");
    scanf("%d",&a);
    printf("The Reverse Digit is :");
    while (a>0)
    {
         b=a%10;
         printf("%d",b);
         a=a/10;
         sum=sum+b;
         
    } 
    printf("\nThe sum of digit is:%d",sum);
   return 0;
}
