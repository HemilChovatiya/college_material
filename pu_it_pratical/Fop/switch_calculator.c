#include <stdio.h>

int main()
{   
    int a,b,res;
    char ope;
    printf("Enter operator:");
    scanf("%c",&ope);
    printf("Enter the Number a:");
    scanf("%d",&a);
    printf("Enter the Number b:");
    scanf("%d",&b);
    
switch(ope)
     {  
        case '+': 
        res=a+b;
        break;
        case '-': 
        res=a-b;
        break;
        case '*':
        res=a*b;
        break;
        case '/':
        res=a/b;
        break;
        case '%':
        res=a%b;
        break;
        default: printf("Invalid Operator");
      }
      printf("Result : %d",res);
    return 0;
}