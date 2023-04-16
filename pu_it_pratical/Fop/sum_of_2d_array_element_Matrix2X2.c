#include <stdio.h>

int main()
{
    int a[2][2],i,j,sum;
    printf("Enter Matrix \n");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            printf("Enter Element %d%d: ",i,j);
            scanf("%d",&a[i][j]);
            sum=sum+a[i][j];
        }
    }
    
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            
            
            printf("\t%d",a[i][j]);
            
        }printf("\n");
    }
    
   printf("Sum of 2D array element is:%d",sum);
   

    return 0;
}
