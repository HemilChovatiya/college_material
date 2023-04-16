#include<stdio.h>
#include<stdlib.h>

struct node{
        int data;
        struct node *next;

};
struct node *head,*newnode;

void insert_first();
void insert_last();
void display();

void main()
{
   int c;
   
    while(c!=4)
    {   printf("\n1.insert_first()\n2.insert_last()\n3.display()\nEnter your Choice:");
        scanf("%d",&c);
        switch(c)
        {
            case 1:   insert_first();
                      break;
            case 2:   insert_last();
                      break;
            case 3:   display();
                      break;
            case 4:  break;
            default: printf(" Invalid Input");                       

        }
    }
}
void insert_first()
{    
     
    newnode=(struct node*)malloc(sizeof(struct node));
     if(newnode==NULL)
     {
         printf("\noverflow");
     }
     else{
         printf("\nEnter data value to insert at first :");
         scanf("%d",&newnode->data);
         newnode->next=head;
         head=newnode;
         printf("\nNode Inserted");
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

void display()
{
    struct node *newnode;  
    newnode = head;   
    if(newnode == NULL)  
    {  
        printf("\nNothing to print");  
    }  
    else  
    {  
        printf("\nNode value are:");   
        while (newnode!=NULL)  
        {  
            printf(" %d ",newnode->data);  
            newnode = newnode->next;  
        }  
    }  
}





