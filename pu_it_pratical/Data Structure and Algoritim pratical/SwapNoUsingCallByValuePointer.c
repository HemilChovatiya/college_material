void swap(int ,int);
int main()
{
   int a,b,c;
     printf("Enter the Numbers:");
     scanf("%d%d",&a,&b);
     printf("before Swaping 1st value is :%d ,2nd value is :%d",a,b);
     swap(a,b);
     
   return 0;
}

void swap(int x,int y)
{  int z;
   z=x;
   x=y;
   y=z;
   printf("\nAfter Swaping 1st value is :%d ,2nd value is :%d",a,b);
}
