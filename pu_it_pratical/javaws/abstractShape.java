import java.util.*;
abstract class Shape1
{
    double dim1,dim2,radius;
    abstract double area();
}
class Triangle1 extends Shape1
{
        Triangle1(double d1, double d2)
        {
            dim1=d1;
            dim2=d2;
        }
        double area()
        {
            System.out.println("Area of Triangle is ");
            return (dim1*dim2)/2;
        }
}
class Rectangle1 extends Shape1
{
    Rectangle1(double d1, double d2)
    {
        dim1=d1;
        dim2=d2;
    }
    double area()
    {
        System.out.println("Area of Rectangle is ");
        return dim1*dim2;
    }
}
class Circle1 extends Shape1
{
    Circle1(double d1)
    {
        radius=d1;
    }
    double area()
    {
        System.out.println("Area of Circle is ");
        return 3.14*radius*radius;
    }
}
class AbstractClassShape
{
    public static void main(String arg[])
    {
 	double a1,b1,a2,b2,r1;  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rectangle side");
        a1=sc.nextDouble();
	b1=sc.nextDouble();

	System.out.println("Enter Radius");
	r1=sc.nextDouble();

	System.out.println("Enter Triangle base and height");
        a2=sc.nextDouble();
	b2=sc.nextDouble();   
     
	Triangle1 t=new Triangle1(a1,b1);
        Rectangle1 r=new Rectangle1(a2,b2);
        Circle1 c=new Circle1(r1);
        
        System.out.println(t.area());
        System.out.println(r.area());
        System.out.println(c.area());
        
    }
}