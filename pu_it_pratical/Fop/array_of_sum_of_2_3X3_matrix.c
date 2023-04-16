
#include <stdio.h>

int main()
{
    int a[3][3],b[3][3],i,j;
    printf("Enter Matrix 1\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("Enter Element %d%d: ",i,j);
            scanf("%d",&a[i][j]);
        }
    }
    printf("\nEnter Matrix 2\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("Enter Element %d%d: ",i,j);
            scanf("%d",&b[i][j]);
            
        }
    
    }
    printf("Sum of 2 matric 3X3 is:\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("\t%d",a[i][j]+b[i][j]);
            
        }
       printf("\n");
    }
    printf("Multiplication of 2 matric 3X3 is:\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("\t%d",a[i][j]*b[i][j]);
            
        }
       printf("\n");
    }

    return 0;
}
