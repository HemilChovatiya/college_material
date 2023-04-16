void swap(int *a,int *b);
#include<stdio.h>
#include<conio.h>

void main()
{
    int a,b;
    printf("Enter 2 number:-");
    scanf("%d%d",&a,&b);
    swap(&a,&b);
    printf("Now a in main function %d",a);
    printf("\n Now b in main function %d",b);

}
void swap(int *a,int *b)
{ int t;
t=*a;
*a=*b;
*b=t;
printf("\nNow a is %d",*a);
printf("\n Now b is %d",*b);
 return;
 }