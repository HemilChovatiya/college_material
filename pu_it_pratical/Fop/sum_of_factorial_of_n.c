#include <stdio.h>
int main()
{   long int n,b,m=1,s=0;
    printf("Enter the Number N : ");
    scanf("%ld",&n);
    for(b=1;b<=n;b++)  //1 to n number
    {
        m=b*m;    //factorial of individual
        if(b==1){printf("%ld!",b);}
        else{printf("+%ld!",b); }
        s=s+m;    //sumation of individual factorial
    }
    printf("\nThe Sum of %ld! is : %ld",n,s);
    return 0;
}