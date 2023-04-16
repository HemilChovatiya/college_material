#include <stdio.h>

int main()
{   int i,b=0,s=0,d=0;;
    
    printf("The Amstrong Number are:");
    for(i=100;i<1000;i++)
    {  
        d=i;
        while(d>0)
        {
        b=d%10;
        d=d/10;
        s=s+(b*b*b);
        }
    
        if(s==i)
          {
         printf(" %d",s);
          }
         s=0;
    }
    

    return 0;
}