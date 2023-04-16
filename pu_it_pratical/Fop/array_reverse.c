#include <stdio.h>

int main()
{   int i, num[5];
printf("Enter Array:");
    for(i=1;i<=5;i++)
    {
        scanf("%d",&num[i]);
    }
    printf("Reverse Array is :");
    for(i=5;i>=1;i--)
    {
        printf("%d ",num[i]);
    }
   
 
    return 0;
}