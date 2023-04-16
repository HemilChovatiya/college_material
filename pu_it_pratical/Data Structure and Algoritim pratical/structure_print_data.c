#include<stdio.h>

struct student
{   int eno;
    char name[30];
    char branch[10];

}s[3];
int main()
{
 for(int i=0;i<3;i++)   
  {
   printf("%d.Enter Name:\n",i+1);
   gets(s[i].name);
   printf("%d.Enter branch:\n",i+1);
   gets(s[i].branch);
   printf("%d.Enter eno:\n",i+1);
   scanf("%d",&s[i].eno);
  }
  
 for(int i=0;i<3;i++)   
  { printf("--------------------Printing the record of the student: %d--------------\n",i+1);
    printf("Name:\t");
   puts(s[i].name);
   printf("Branch:\t");
   puts(s[i].branch);
   printf("Eno:\t");
   printf("%d",&s[i].eno);
  }
    return 0;

}