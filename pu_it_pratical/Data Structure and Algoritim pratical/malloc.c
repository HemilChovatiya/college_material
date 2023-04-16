#include<stdio.h>
#include<stdlib.h>
void main()
{
   int i,n,*p;
   printf("Enter Size of array:");
   scanf("%d",&n);
      p=(int *)malloc(n*sizeof(int));        
//(int *)=used to type casting(convert to int DataType),malloc is used to create chunk of memory 
   for(i=0;i<n;i++)
   {
        printf("Enter Elements:");
        scanf("%d",p);     //p=store address of p
        p++;
    }
    p=p-n;
    printf("printing:");
    for(i=0;i<n;i++)
    {
        printf("%d ",*p);  //  *p = store the value of the p
        p++;
    }
    free(p);

   

}