//WAP to count odd number elements , even number elements and 
//number of zero elements from 3*3 Matrix.

#include <stdio.h>

int main()
{
    int a[3][3],i,j,odd,even,zero;
    
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("Enter Element: ");
            scanf("%d",&a[i][j]);
            int z=a[i][j];
            if(z==0)
            { zero++; }
            else
            { int b=a[i][j]%2; 
               if(b==0)
                 {  
                     even++;
                 }
                else
                {  odd++;  }
            }
        }
    }
printf("\nMatrix 3*3 is:\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("%d\t",a[i][j]);
            
        }
        printf("\n");
    }
printf("odd number elements are:%d",odd);
printf("\nEven number elements are:%d",even);
printf("\n0th number are:%d",zero);


    return 0;
}





