#include<stdio.h>
#include<conio.h>
int main(){
   int n, temp, i, j, number[30];
   printf("Enter number of elemnts:");
   scanf("%d",&n);
   printf("Enter %d numbers: ",n);
   for(i=0;i<n;i++)
   scanf("%d",&number[i]);
   for(i=n-2;i>=0;i--){
      for(j=0;j<=i;j++){
        if(number[j]>number[j+1]){
           temp=number[j];
           number[j]=number[j+1];
           number[j+1]=temp;
        }} }
   printf("Sorted elements: ");
   for(i=0;i<n;i++)
      printf(" %d",number[i]);
   return 0;
}
