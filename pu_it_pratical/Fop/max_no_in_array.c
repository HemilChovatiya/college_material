#include <stdio.h>

int main()
{
    int i, num[5];
    printf("Enter Array:");
    
    for(i=0;i<5;i++)
    {
        scanf("%d",&num[i]);
    }
    int max=num[0];
    int min=num[0];
    for(i=0;i<5;i++)
    {   
        if(num[i]<min)
        { min=num[i];}
        if(num[i]>max)
        { max=num[i];}
    }
   printf("Maximum Number in Array is:%d",max);
   printf("\nMinimum Number in Array is:%d",min);
    return 0;
}
