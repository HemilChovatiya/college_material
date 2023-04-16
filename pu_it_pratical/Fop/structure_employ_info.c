#include <stdio.h>
#include<conio.h>
struct personal
{
    char name[20];  // Struct Member
    char doj[20];
    int salary;
}  person[3];
int main()
{
   

for(int i=0;i<3;i++)
{
    printf("Enter the Name\n");
    gets(person[i].name);
    printf("Enter Dat of joining");
    gets(person[i].doj);
    printf("\n enter salary");
    scanf("%d",&person[i].salary);
}

for(int i=0;i<3;i++)
{

    puts(person[i].name);
    puts(person[i].doj);
    printf("%d",person[i].salary);
}

return 0;
}