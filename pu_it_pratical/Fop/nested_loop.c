#include<stdio.h>
#include<conio.h>
void main()
{
    int i,j;
    for(i=1;i<=3;i++)        //3=no. of rows
    {                                // matrix [c]ij
        for(j=1;j<=i;j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    getch();
}