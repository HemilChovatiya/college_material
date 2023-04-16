#include <stdio.h>
void star()
{   int a,b;
    printf("\n");
    for (a=0;a<3;a++)
    {for(b=0;b<=a;b++)
    { printf("*");
    }printf("\n");
}}
void main()
{   printf("Hello");
    star();
    printf("Parul University");
    star();
    printf("World of Programing");
    star();
}