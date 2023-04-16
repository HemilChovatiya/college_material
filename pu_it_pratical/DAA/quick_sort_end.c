#include <stdio.h>  

void swap(int *a, int *b) 
{
    int temp = *a;
    *a = *b;
    *b = temp;
}
int partition(int a[], int start, int end)  
{  
    int pivot = a[end];  
    int i = (start - 1);  
  
    for (int j = start; j <= end - 1; j++)  
    {  
        if (a[j] < pivot)  
        {  
            i++;   
            int t = a[i];  
            a[i] = a[j];  
            a[j] = t;  
        }  
    }  
    int t = a[i+1];  
    a[i+1] = a[end];  
    a[end] = t;  
    return (i + 1);  
}  
  
void quicksort(int a[], int start, int end)  
{  
    if (start < end)  
    {  
        int p = partition(a, start, end); 
        quicksort(a, start, p - 1);  
        quicksort(a, p + 1, end);  
    }  
}  
   
int main()  
{  
    int u,i=0;
	printf("Enter Element size: ");
    scanf("%d",&u);
    int A[u];
	for(i=0;i<u;i++)
    {
        printf("Enter Element: ");
        scanf("%d",&A[i]);
    }
    
    quicksort(A, 0, u - 1);  
    printf("\nSorted array:\n");    
    i=0;
	 for(i=0;i<u;i++)
    {
        printf("%d\t",A[i]);
    }
       
    return 0;  
}  