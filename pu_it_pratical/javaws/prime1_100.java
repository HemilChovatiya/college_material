import java.util.*;
class prime1_100{
       public static void main(String args[])
       {
          int p,i,y;
         System.out.println("Prime Numbers:");
         for(y=1;y<=100;y++)         
         {   p=0;
              for(i=1;i<=y;i++)
                {
                  if(y%i==0)
                    {
                     p++;
                     }
                }
               if(p==2)
               {
                 System.out.println(y+" is a Prime Number");
               }
  
         }
       } 
}