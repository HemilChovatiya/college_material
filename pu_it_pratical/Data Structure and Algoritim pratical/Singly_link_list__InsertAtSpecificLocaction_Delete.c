#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};
struct node *newnode, *head;
void insert_at_specific_loc();
void delete_first();
void display();
void insert_last();
void main()
{  
    int c;
   while(c!=5)
   {   printf("\n1.Insert node at specific location\n2.Delete from first\n3.Display\n4.insert_last()\n5.Exit\nEnter your Choice:");
        scanf("%d",&c);
       switch(c)
       {
          case 1: insert_at_specific_loc();
                break;
          case 2: delete_first();
                 break;
          case 3:display();
                 break;
          case 4:   insert_last();
                      break;
          case 5:
                break;
          default:printf("\nInvalid Input");
        }
   }
   
}
void insert_at_specific_loc()
{  
    int val,key;
    printf("Enter the number after which you want to add newnode:-");
    scanf("%d",&key);
    struct node *newnode,*ptr,*preptr;
    newnode=(struct node *)malloc(sizeof(struct node));
    if(newnode==NULL)
     {
       printf("no node is created");
     }
     printf("\nEnter value to be insert after a position :-\n");
     scanf("%d",&val);
     newnode->data=val;
    if (head==NULL)
       { 
           printf("o linked list exist so adding at first");
           newnode->next=NULL;
           head=newnode;
       }
    else
      { 
          ptr=head;
          preptr=head;
          ptr=ptr->next;
          while(preptr->data!=key)
          {
            ptr=ptr->next;
            preptr=preptr->next;
          }
         newnode->next=preptr->next;
         preptr->next=newnode;
      }

}
void insert_last()
{
    struct node *newnode,*temp;  
        
    newnode = (struct node*)malloc(sizeof(struct node));      
    if(newnode == NULL)  
    {  
        printf("\nOVERFLOW");     
    }  
    else  
    {  
        printf("\nEnter value to insert at last:");  
        scanf("%d",&newnode->data);  
          
        if(head == NULL)  
        {  
            newnode->next = NULL;  
            head = newnode;  
            printf("\nNode value inserted at last");  
        }  
        else  
        {  
            temp = head;  
            printf("%d",*temp);
            while (temp->next != NULL)  
            {  
                temp = temp->next;  
            }  
            temp->next = newnode;  
            newnode->next = NULL;  
            printf("\nNode value inserted at last");  
          
        }  
    }  
}
void delete_first()
{ 
    struct node *ptr;        
     if(head==NULL) 
        { 
                printf("List is Empty:\n");
        }         
      else         
        {            
                 ptr=head;                 
                 head=head->next ; 
                 printf("The deleted element is :%d",ptr->data); 
                 free(ptr); 
        } 



}
void display()
{
    struct node *temp;  
    temp = head;   
    if(temp == NULL)  
    {  
        printf("\nNothing to print");  
    }  
    else  
    {  
        printf("\nNode value are:");   
        while (temp!=NULL)  
        {  
            printf(" %d ",temp->data);  
            temp = temp->next;  
        }  
    }  
}
