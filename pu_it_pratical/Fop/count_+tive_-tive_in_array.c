#include <stdio.h>

int main()
{
    int i, num[10],t;
    printf("Enter Array tot. no.:");
    scanf("%d",&t);
    for(i=0;i<t;i++)
    {   printf("Enter Array Element%d:",i+1);
        scanf("%d",&num[i]);
    }
    int pos=0, neg=0, zero=0;
    for(i=0;i<t;i++)
    {   
        if(num[i]<0)
        { neg=neg+1;}
        if(num[i]>0)
        { pos=pos+1;}
        if(num[i]==0)
        { zero=zero+1;}
    }
   printf("Positive Number in Array is:%d",pos);
   printf("\nNegative Number in Array is:%d",neg);
   printf("\nZero Number in Array is :%d",zero);
    return 0;
}
