import java.util.*;
class Inheritance_multiply
{
      public static void main(String args[])
       {
         sub sub1 = new sub();
         Scanner sc = new Scanner(System.in);
              System.out.print("Enter Number 1 : ");
	      Double a = sc.nextDouble();
              System.out.print("Enter Number 2 : ");
	      Double b = sc.nextDouble();
	 sub1.setij(a,b);
	 sub1.multiply();
	}
}
class inhertmultiply
{
 	Double a;
	Double b;
}
class sub extends inhertmultiply
{
 	Double c;
	void setij(Double i,Double j)
	{ a=i;
          b=j;
         }
        void multiply()
        {
         c=a*b;
         System.out.println("Multiplication of 2 Number : "+c);
        }
}












