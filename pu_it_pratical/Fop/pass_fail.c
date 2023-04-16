#include<stdio.h>
#include<conio.h>
void main()
{   int m;
    printf("Enter the Marks: ");
    scanf("%d",&m);
    if (m>=80 && m<=100)
    {  
        printf("your grade is  Dist");
    }
    else {
             if(m>=60 && m<=79)
             {
             printf("your grade is  First Class");
             }
        else 
             {   if(m>=35 && m<=59)
                   { printf("your grade is  Second Class");
                   }
               else {
                        if(m>=0 && m<=34)
                            {
                                printf("Sorry you are fail");
                            }
                        else {
                              printf("Error you have enter Invalid Marks");
                             }
                    }
             }
        }
    getch();
}