#include <stdio.h>

int main()
{    int a=0,b=0;
     float s=0;
    printf("enter the no.");
    scanf("%d",&a);
     for(b=1;b<=a;b++)
     {  s=s+(1.0/b);
          if(b!=a)
          {
            printf("1/%d + ",b);
          }
          else {printf("1/%d",b);}
     }
     printf("\n Sum =%f",s);
    return 0;
}