#include<stdio.h>

void MainMenu();
void DrawLine(int n);
void AddBooks();
void AddStudentRecords();
void SearchBooks();
void IssueBooks();
void DisplayBooks();
void EditBooks();

int main(){

 MainMenu();

 return 0;
} //End of Main function

void MainMenu(){
 int choice;
 char chr;
 
 printf("\n");
 //system("cls");
 DrawLine(15);
 system("color 8");
 printf(" MAIN MENU ");
 DrawLine(15);
 //   0 = Black       8 = Gray
 //   1 = Blue        9 = Light Blue
 //   2 = Green       A = Light Green
 //   3 = Aqua        B = Light Aqua
 //   4 = Red         C = Light Red
 //   5 = Purple      D = Light Purple
 //   6 = Yellow      E = Light Yellow
 //   7 = White       F = Bright White
 printf("\n\t1. Add Books\n");
 printf("\t2. Add Student Record\n");
 printf("\t3. Search Books\n");
 printf("\t4. Issue Books\n");
 printf("\t5. Display Books\n");
 printf("\t6. Edit Book Records\n");
 printf("\t7. Exit System\n");
 DrawLine(41);

 printf("\nEnter your choice:");
 scanf("%d", &choice);

 switch(choice){
  case 1:
    AddBooks();
    break;
  case 2:
    AddStudentRecords();
    break;
  case 3:
    SearchBooks();
    break;
  case 4:
    IssueBooks();
    break;
  case 5:
    DisplayBooks();
    break;
  case 6:
    EditBooks();
    break;
  case 7:
    printf("Exiting System...\n");
    printf("\nAre you sure!!!\nPress Y/y to Exit and N/n to Continue..");
    scanf("%c",&chr);
    if(chr == 'Y' || chr == 'y')
     printf("\nHave a Nice Day..");
    else
     MainMenu();
    break;
  default: printf("Invalid Input...Try again...");
    break;
 }
}//End of MainMenu
void DrawLine(int n){
 int i;
 for(i=0; i<n; i++)
  printf("%c",254);
}
void AddBooks(){
 //system("cls");
 DrawLine(30);
 printf("\nAdd Logic of Add Books here...\n");
 DrawLine(30);
 //getch();
 MainMenu();
}

void AddStudentRecords(){
// system("cls");
 DrawLine(30);
 printf("\nAdd Logic of Student Record here...\n");
 DrawLine(30);
 //getch();
 MainMenu();
}

void SearchBooks(){
 //system("cls");
 DrawLine(30); 
 printf("\nAdd Logic of Search Books here...\n"); 
 DrawLine(30);
 //getch();
 MainMenu();
}

void IssueBooks(){
 //system("cls");
 DrawLine(30); 
 printf("\nAdd Logic of Issue Books here...\n"); 
 DrawLine(30);
 //getch();
 MainMenu();
}

void DisplayBooks(){
 //system("cls");
 DrawLine(30); 
 printf("\nAdd Logic of Display Books here...\n"); 
 DrawLine(30);
 //getch();
 MainMenu();
}

void EditBooks(){
 //system("cls");
 DrawLine(30); 
 printf("\nAdd Logic of Edit Books here...\n");
 DrawLine(30);
 //getch();
 MainMenu();
}