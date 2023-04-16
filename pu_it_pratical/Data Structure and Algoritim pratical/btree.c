#include<stdio.h>
#include<stdlib.h>

struct tree{
 int root;
 struct tree *LeftRoot;
 struct tree *RightRoot;
};
struct tree *newtree,*head;

void main()
{ int a,*b;
  printf("1.insert_value_to_tree\n2.Exit\nEnter Choice:");
  scanf("%d",&a);

  while(a!=2)
  {  newtree = (struct tree *)malloc(sizeof(struct tree));  
     printf("Enter Value to insert:");
     scanf("%d",&b);
     if(newtree->root == NULL)
     {
         newtree->root=*b;
     }
     else(newtree->root != NULL)
     {
           if(newtree->root>b)
           {
               newtree->LeftRoot=tree->root;
           }
           else{
               newtree->RightRoot=tree->root;
           }
     }  
  }

}