#include <stdio.h>

int main () {
   FILE *fp;
   char str[80];
   int newmarks;
   
   fp = fopen("student.txt","r+");

   printf("Original File Data:\n");
   while(fgets(str,80,fp)!=NULL)
    printf("%s", str);
   //getch();
   
   printf("\n\nEnter new marks of Roll no. 101:");
   scanf("%d", &newmarks);
      
   printf("Updated File Data:\n\n");
   
   itoa(newmarks,str, 10);
      //convert int to string; fputs() write "string" to fp
   
   fseek(fp, 4, 0); //set the pointer to position no. 4

 

   
   fputs(str, fp);  //write string to current position of fp
   fclose(fp);
   
   fp = fopen("student.txt","r");

   while(fgets(str,80,fp)!=NULL)
    printf("%s", str);
    
   fclose(fp);
   getch();
   return(0);
}
