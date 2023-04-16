#include <stdio.h>

int main()
{
    int i, num[10];
    printf("Enter Array:");
    
    for(i=0;i<10;i++)
    {
        scanf("%d",&num[i]);
    }
    int odd=0, even=0;
    for(i=0;i<10;i++)
    {   
        if(num[i]%2==0)
        { even=even+1;}
        else
        { odd=odd+1;}
    }
   printf("odd Number in Array is:%d",odd);
   printf("\neven Number in Array is:%d",even);
    return 0;
}