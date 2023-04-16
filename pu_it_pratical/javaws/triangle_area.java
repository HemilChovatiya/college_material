interface Shape
{
  void Triangle1();
  void double getArea();
  void double getPerimeter();
}
class Triangle implements Shape
{
  private double a;
  private double b;
  private double c;

  //construct a new triangle given side lengths
  void Triangle1(double a, double b,double c)
  {
    this.a=a;
    this.b=b;
    this.c=c;
    
  }
  //return triagle's area using heron's formula
  void double getArea()
  {
    double s=(a+b+c)/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }
  //return parameter of this triangle
  void double getPerimeter()
  {
    return (a+b+c);
  }
}
class measuration
{
  public static void main(String args[])
  {
      Triangle a = new Triangle(); 
      a.Triangle1(1,2,3);
      double perimeter,area;
      area = a.gotArea();
      perimeter = a.getPerimeter();
      System.out.println("Area is : "+area);
      System.out.println("perimeter is : "+perimeter);
  } 
}
