class Box
{
 double l;
 double h;
 double b;
 void volume()
 {
  System.out.print("Volume is : ");
  System.out.println(l*h*b);
  }
}

class box1
{
  public static void main(String args[])
  { 
    Box b1=new Box();
   
    b1.l=22.50102;
    b1.h=50.44252;
    b1.b=42.52471;
    b1.volume();
    
  }
} 