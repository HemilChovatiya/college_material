#include <stdio.h>

int main()
{
    int b,c;
     printf("Enter the no.");
     scanf("%d",&b);
     for(int a=1;a<=10;a++)
     {  
        c=a*b;
        printf("%d * %d = %d\n",a,b,c); 
     }
         
    return 0;
    
}