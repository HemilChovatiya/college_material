#include <stdio.h>
#define void solve()
int main()
{
char b;
printf("Enter the value: ");
scanf("%c",&b);
if(b>=65 && b<=90)
{
    printf("The charactar is capital letter");
}
else 
           if(b>=97 && b<=122)
               {
    printf("The charactar is small letter");
               }
    

else if(b>=47 && b<=57)
               {
    printf("The charactar is digit");
               }
else 
{ printf("It is special Character");}
return 0;
}
void solve()
{   
  char exit;
   printf("Want to exit enter y or n");
   scanf("%c",&exit);
if (exit=="y")
{}
else  
 { main();}
}