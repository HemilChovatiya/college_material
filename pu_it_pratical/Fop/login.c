#include<stdio.h>
#include<stdlib.h>
int Login_check(char id[], char pass[]);

int main()
{
 int check=0;
 char id[20], pass[20];
 printf("Enter your User ID:");
 scanf("%s", id);
 
 printf("Enter your Password:");
 scanf("%s", pass);
 
 check = Login_check(id, pass);

 if (check==1)
   printf("\nLogin successful...\n\nDisplay Menu Here...\n");
   //write main program logic here...  
 else
   printf("\nLogin failed. Try again...\n");

 return 0;
}

int Login_check(char id[], char pass[])
{
 FILE *fp;
 char *fid, *fpass, *token;
 int check=0;
 const char str[40] = "", s[2] = " ";
 
 fp = fopen("cl.txt", "r");

 if(fp==NULL) 
 { 
   printf("File error..."); exit(0); 
 }
 while(fgets(str, 40, fp)!=NULL)
 {
   fid = strtok(str,s);  
   fpass = strtok(NULL,s);
   fpass[strlen(fpass)-1]='\0';
  
   if((strcmp(id,fid) == 0) && (strcmp(pass,fpass) == 0 ))
   {
     check=1;  
   }
 }
 return check;
}