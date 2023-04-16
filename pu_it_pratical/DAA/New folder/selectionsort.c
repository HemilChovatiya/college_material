#include<stdio.h>
int main(){
   
   int i, j, count, temp, number[25];

   printf("enter the number of inputs: ");
   scanf("%d",&count);

   printf("Enter %d elements: ", count);
  
   for(i=0;i<count;i++)
      scanf("%d",&number[i]);
 
  
   for(i=0;i<count;i++){
      for(j=i+1;j<count;j++)
      {
         if(number[i]>number[j]){
            temp=number[i];
            number[i]=number[j];
            number[j]=temp;
         }
      }
   }

   printf("your Sorted elements are: ");
   for(i=0;i<count;i++)
      printf(" %d",number[i]);

   return 0;
}