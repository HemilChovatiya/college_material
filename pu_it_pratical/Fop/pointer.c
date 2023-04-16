#include<stdio.h>
int main()
{   int *p;
int var=10;
p= &var;
printf("Value of variable as var is:%d",var);
printf("\nValue of variable var as *p is:%d",*p);
printf("\nAddress of variable as &var is:%p",&var);
printf("\nAddress of variable as p is:%p",p);
printf("\nAddress of variable as *p is:%p",*p);
printf("\nAddress of pointer as &p is:%p",&p);

printf("\nValue of variable as p is:%d",p);
printf("\nValue of variable var as *p is:%d",*p);
printf("\nValue of variable as &p is:%d",&p);

    return 0;
}