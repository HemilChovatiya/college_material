import java.util.*;
class box{
     double l;
     double b; 
     double h;
     void volume()
     {
       System.out.println("Volume : "+(l*b*h));
     }
     
}
class box3{
       public static void main(String args[])
       {    Scanner sc= new Scanner(System.in);  
	    System.out.print("Enter first number- ");  
	    double vol;
            box mybox1 = new box();
            System.out.print("Enter Length:");
	    mybox1.l=sc.nextDouble();
	    System.out.print("Enter Breath:");
            mybox1.b=sc.nextDouble();
	    System.out.print("Enter Height:");
            mybox1.h=sc.nextDouble();
	    h1.volume();
       }
}