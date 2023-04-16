#include <stdio.h>

int main()
{
    int a[3][3],max,min,i,j;
    printf("Enter Matrix \n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("Enter Element %d%d: ",i,j);
            scanf("%d",&a[i][j]);
           
            if(max<=a[i][j])
            {
                max=a[i][j];
            }
            if(min>=a[i][j])
            {
                min=a[i][j];
            }
        }
       
    }
   printf("Maximum Number From 3X3 Matrix is : %d",max);
   printf("\nMinimum Number From 3X3 Matrix is : %d",min);
    

    return 0;
}
