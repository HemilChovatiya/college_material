#include <stdio.h>

int main()
{
   int a,b;
    printf("Enter the Number     : ");
    scanf("%d",&a);
    printf("The Reverse Digit is : ");
    do  {
         b=a%10;
         printf("%d",b);
         a=a/10;
         }
    while(a>0);
    
    return 0;
}