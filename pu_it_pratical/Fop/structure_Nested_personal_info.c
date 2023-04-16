#include <stdio.h>
#include<conio.h>
struct personal
{
    char name[20];  // Struct Member
    int age;
    char gender[2];
struct address{
    char street[200];  // Struct Member
    int pincode;
    char city[50];
    char state[20];
    char country[20];
}  a[10];
}  p[10];

int main()
{
   

for(int i=0;i<3;i++)
{
    printf("\nEnter the Name\n");
    gets(p[i].name);
    printf("\nEnter Gender:");
    gets(p[i].gender);
    printf("\nEnter age");
    scanf("%d",&p[i].age);
    printf("\nEnter Pincode");
    scanf("%d",&p[i].a[i].pincode);
    printf("\nEnter country");
    gets(p[i].a[i].country);
    printf("\nEnter State");
    gets(p[i].a[i].state);
    printf("\nEnter City");
    gets(p[i].a[i].city);
    printf("\nEnter Address");
    gets(p[i].a[i].street);
}

for(int i=0;i<3;i++)
{
    printf("Details are:\n");
    printf("\nName:\t");
    puts(p[i].name);
    printf("\nage:\t");
    printf("%d",&p[i].age);
    printf("\nGender:\t");
    puts(p[i].gender);
    printf("\nAddress:\t");
    puts(p[i].a[i].street);
    printf("\nPincode:\t");
    printf("%d",&p[i].a[i].pincode);
    printf("\nCity:\t");
    puts(p[i].a[i].city);
    printf("\nState:\t");
    puts(p[i].a[i].state);
    printf("\ncountry:\t");
    puts(p[i].a[i].country);

}

return 0;
}