#include<stdio.h>
void push(int [],int *,int , int );
void display(int [],int);
int pop(int [],int *);
void change(int [],int ,int,int);
int peep(int [],int ,int );

int main()
{   int e,n=10,t=-1,s[10],c=0,i,in;
    while(c!=6)
    {    printf("1.Push\n2.Display\n3.Pop\n4.Change\n5.Peep\n6.Exit\nEnter Choice :");
         scanf("%d",&c);
    
        switch(c)
        {
            case 1: {
                    printf("Enter the Elements to push\n");
                    scanf("%d",&e);
                    push(s,&t,n,e);   //e= data to insert,
                   
                    break;
                    }
            case 2: {   printf("\nElements are : ");
                        display(s,t); 
                        break;
                    }   
            case 3: {
                    e=pop(s,&t);
                    printf("%d is poped \n,e");                    
                    break;
                    } 
            case 4: {
                    printf("\nEnter Element e and index to change:");
                    scanf("%d%d",&e,&in);
                    change(s,t,in,e);
                    break;
                    }
            case 5: {
                  printf("\nEnter Index to peep:\n");
                  scanf("%d",&in);
                  e=peep(s,t,in);
                  printf("\n%d is peeped\n",e);
                  break;
            }
            case 6: break;
            default: printf("invalid choice,try again");
            
        }
    }
  
   return 0;
}
void push(int s[],int *t,int n,int e)
{  printf(" %d ",*t);
   if(*t>=n-1)
   {
       printf("\nStack is full");
   }   
   else{
       s[++*t]=e;
   }
   
}
void display(int s[],int t)
{ 

    for(int i=0;i<=t;i++)
  {
      printf("%d",s[i]);
      printf("\n");
  }
}
int pop(int s[],int *t)
{
    if(*t==-1)
    {
         return(-1);
    }
    else
    {
        printf("Removed element is %d:",s[*t]);
        *t=*t-1;
    }
}
int peep(int s[],int t,int index)
{  if((t-index)<0)
   {
       printf("\nUnderflow");
       return(-1);
   }   
   else{
       return(s[t-index]);
   }
}
void change(int s[],int t,int index,int e)
{
    if((t-index)<0)
    {
        printf("underflow");
    }
    else{
        s[t-index]=e;
    }
}
