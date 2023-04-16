#include <stdio.h>
void swap(int *x,int *y)
{
    int p;
    p=*x;
    *x=*y;
    *y=p;
}
void selectionsort(int n,int A[])
{    
    for(int i=0;i<=n-2;i++)
    {
       int min=i;
        for(int j=i+1;i<=n-1;j++)
        {
            if(A[j]<A[min])
            {
                min=j;
            }
            swap(&A[0],&A[min]);
        }
    }
    
}

int main()
{
    int n,i;
	printf("Enter Element size: ");
    scanf("%d",&n);
    int A[n];
    
    for(i=0;i<n;i++)
    {
            printf("Enter Element: ");
            scanf("%d",&A[i]);
    }
    i=0;
    for(i=0;i<n;i++)
    {
        printf("%d\t",A[i]);
        
    }
    selectionsort(u,A);
   
    return 0;
}
