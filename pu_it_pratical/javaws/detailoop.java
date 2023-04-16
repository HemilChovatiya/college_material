import java.util.*;
class name
{
   int rollno;
   string name[];
   void display()
   {
     System.out.println("rollno:"+rollno);
     System.out.println("name:"+name);
   }
}
class display
{       Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{  name n=new name();
           System.out.println("Enter Name:");
           n.rollno=sc.nextString();
        }
}