import java.util.*;
class factorial{
   public static void main(String args[])
    {
      int a,p,i;
          Scanner sc= new Scanner(System.in);    
          System.out.println("Enter Number:");  
          a= sc.nextInt(); 
          p=1;
          i=a;
          while(a>1)
             {
                 p=p*a;
                 a--;
             }
          
           System.out.println(p+" is a Factorial of "+i);
           

    }
}