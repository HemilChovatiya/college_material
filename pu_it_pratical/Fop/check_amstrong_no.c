
#include <stdio.h>

int main()
{    
    int a=1,b=0,s=0,d;
    printf("Enter Number:");
    scanf("%d",&a);
    d=a;
    while(a>=1)
    {
        b=a%10;
        printf("%d^3",b);
        if(a!=1)
        printf(" + ");
        a=a/10;
        s=s+(b*b*b);
    }
    printf(" = %d",s);
    if(s==d)
    {
        printf("\nIt is an Armstrong Number");
    }
    else {printf("\nIt is not an Armstrong number"); }

    return 0;
}
