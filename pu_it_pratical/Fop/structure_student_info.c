#include<stdio.h>
#include<conio.h>
struct student
{
    char name[20];  
    long int rollno;  
    long int m1;
    long int hi  m2;
    long int hi  m3;
    long int hi  m4;
    long int hi  m5;
    long int hi  total;
    long int hi  avg;
    
}  p[20];

int main()
{
   struct student p[20]; // p[20] can be written short eg. p[20] as o

for(int i=0;i<3;i++)
{
    printf("\nEnter the Name:");
    scanf("%s",&p[i].name);
    printf("\nEnter Rollno:");
    scanf("%ld",&p[i].rollno);
    printf("\nEnter Marks1:");
    scanf("%ld",&p[i].m1);
    printf("\nEnter Marks2:");
    scanf("%ld",&p[i].m2);
    printf("\nEnter Marks3:");
    scanf("%ld",&p[i].m3);
    printf("\nEnter Marks4:");
    scanf("%ld",&p[i].m4);
    printf("\nEnter Marks5:");
    scanf("%ld",&p[i].m5);
    p[i].total=(p[i].m1+p[i].m2+p[i].m3+p[i].m4+p[i].m5);
    p[i].avg=(p[i].total)/5;
}

for(int i=0;i<3;i++)
{
    printf("\nStudents Details are:\n");
    printf("\nName :%s",p[i].name);
    printf("\nRollno :%ld",p[i].rollno);
    printf("\nMarks1:%ld",p[i].m1);
    printf("\nMarks2:%ld",p[i].m2);
    printf("\nMarks3:%ld",p[i].m3);
    printf("\nMarks4:%ld",p[i].m4);
    printf("\nMarks5:%ld",p[i].m5);
    printf("\nTotal Marks:%ld",p[i].total);
    printf("\nAverage Marks:%ld",p[i].avg);   
}
 hi 
return 0;
}