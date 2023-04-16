#include <stdio.h>

int main()
{   int i,s=0;
    
    printf("The sum of number from 500 to 999 divisible by 5 is:");
    for(i=500;i<1000;i++)
    {    if(i%5==0)
        { s=s+i;}
    }
    printf(" %d",s);

    return 0;
}