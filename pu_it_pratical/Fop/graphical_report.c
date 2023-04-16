#include<stdio.h>
#include<stdlib.h>
int main()
{
  FILE *fp;
  int marks, i;
  const char str[80], s[2]=" ";
  char *token;

  fp = fopen("cl.txt","r");

  if(fp == NULL) 
   { 
      printf("File error.."); 
      exit(0);
   }

  system("color A1");
  printf("  Class Test Graphical Report(2018)\n");
  printf("=====================================\n");
  printf(" Roll No.| Marks Obtained (Out of 20)\n");
  printf("=====================================\n");

  while(fgets(str,80,fp)!=NULL)
  { 
 token = strtok(str,s); 
 printf("     %s   | ", token);
 token = strtok(NULL, s);
 marks = atoi(token);
 for(i=0; i<marks; i++) 
   printf("%c", 254);
 printf(" %d\n", marks);  
  }
  fclose(fp);
  return 0;    
}