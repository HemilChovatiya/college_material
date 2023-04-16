import java.util.*;
interface Shape 
{
    public double getArea();
    public double getPerimeter();
}

class Rectangle implements Shape {
    private double width;
    private double height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
     
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return 2.0 * (width + height);
    }
}
  class Circle implements Shape {
    private double radius;
    
     
     Circle(double radius) {
        this.radius = radius;
    }
    
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    // Returns the perimeter of this circle.
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
}
 class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    
    
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
     
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
     
    public double getPerimeter() {
        return a + b + c;
    }
}
class interP5
{
	public static void main(String args[])
		{ 
                double a1,b1,a2,a3,b3,c3;  
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Rectangle side");
                a1=sc.nextDouble();
		b1=sc.nextDouble();
		Rectangle r = new Rectangle(a1,b1); // Rectangle object 
		System.out.println("Area of Rectangle =" +(r.getArea()));
		System.out.println("Perimeter of Rectangle =" +(r.getPerimeter()));
		
		System.out.println("Enter Radius");
                a2=sc.nextDouble();
		Circle c = new Circle(a2);  // Circleobject 
		System.out.println("Area of Circle =" +(c.getArea()));
		System.out.println("Perimeter of Circle =" +(c.getPerimeter()));
		
		System.out.println("Enter Triangle side");
                a3=sc.nextDouble();
		b3=sc.nextDouble();
		c3=sc.nextDouble();
		Triangle t = new Triangle(a3,b3,c3); // Triangle object 
		System.out.println("Area of Triangle =" +(t.getArea()));
		System.out.println("Perimeter of Triangle =" +(t.getPerimeter()));
		}
}
