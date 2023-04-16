#include <stdio.h>

int main()
{
    int a,b,sum=0;
        printf("Enter the Number      : ");
    scanf("%d",&a);
        printf("The Reverse Digit is  : ");
    for(a;a>0;a=a/10)
    {  
        b=a%10;
        printf("%d",b);
        sum=sum+b;
    } 
        printf("\nThe Sum of Digit is   : %d",sum);
    return 0;
}