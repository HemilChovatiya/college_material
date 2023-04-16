#include<stdio.h>

struct cricket
{
    char name[20];
    char team[20];
    int avg;
    
    
}player[3];
int main()
{
   
    int i;
    
    printf("\n\nPlayers details:\n");
    for(i=0;i<3;i++)
    {
    printf("Enter Name:");
    gets(player[i].name);
    printf("\nTeam name:");
    gets(player[i].team);
    printf("\nBatting Average:");
    scanf("%d",&player[i].avg);
    printf("\n");
 
    }
    for(i=0;i<3;i++)
    {
        puts(player[i].name);
        puts(player[i].team);
        printf("%d",player[i].avg);
 
    }
       
}