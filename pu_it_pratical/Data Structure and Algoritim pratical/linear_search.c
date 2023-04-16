#include<stdio.h>
#include<stdlib.h>
int main()
{
   int i,a[10],n,key;
   printf("Enter Size of array:");
   scanf("%d",&n);
   printf("Enter array:");
   for(i=0;i<n;i++)
   {
        
        scanf("%d",&a[i]);
        
    }
    printf("Key Value:");
    scanf("%d",&key);
    for(i=0;i<n;i++)
    {
        if(a[i]==key)
       { printf("key value: %d at index is:%d",key,i);
       }
    }
    return 0;

   

}