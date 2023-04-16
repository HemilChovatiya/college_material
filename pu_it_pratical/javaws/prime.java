import java.util.*;
class prime{
       public static void main(String args[])
       {
          int a,p,i;
          Scanner sc= new Scanner(System.in);    
           
          a= sc.nextInt(); 
          p=0;
          for(i=1;i<=a;i++)
            {
              if(a%i==0)
               {
                 p++;
               }
            }
          if(p==2)
              {
                 System.out.println(a+" is a Prime Number");
              }
          else 
              {
                 System.out.println(a+" is not a Prime Number");
              }


       } 
}