#include <stdio.h>
int main()
{
    
    int i,num[5],sum;
    for(i=0;i<5;i++)
    {   
        printf("Enter Array Element%d:",i+1);
        scanf("%d",&num[i]);
        sum=sum+num[i];
    }
    printf("Sum of the 1D array is :%d",sum);
}
