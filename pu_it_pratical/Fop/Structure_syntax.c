#include <stdio.h>

struct personal
{
    char name[20];  // Struct Member
    char doj[20];
    int salary;
} p1,p2;
int main()
{
    struct personal p1,p2;//structure variable
    printf("Enter the Name\n");
    gets(p1.name);
    printf("Enter Dat of joining");
    gets(p1.doj);
    printf("\n enter salary");
    scanf("%d",&p1.salary);

    
    printf("Enter the Name\n");
    gets(p2.name);
    printf("Enter Dat of joining");
    gets(p2.doj);
    printf("\n enter salary");
    scanf("%d",&p2.salary);
    printf("Details are");
    puts(p2.name);
    puts(p2.doj);
    puts(p2.salary);
    return 0;

}