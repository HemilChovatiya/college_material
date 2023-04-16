
#include <stdio.h>

int main()
{   
   int i,j,n, num[5],temp;
   printf("Enter Array No of Number:");
   scanf("%d",&n);
    for(i=0;i<n;i++)
    {   printf("Enter Number %d: ",i+1);
        scanf("%d",&num[i]);
    }   
        printf("Array Number in Assending Order:");
    for(i=0;i<n;i++)
    {  
        for(j=i+1;j<n;j++)
        {
            if(num[i]>num[j])
            {
               temp=num[i];
               num[i]=num[j];
               num[j]=temp;
            }
        }
         printf(" %d ",num[i]);   
    }
     
    return 0;
}
