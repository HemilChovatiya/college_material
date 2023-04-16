class Box 
{
int  l,b,h;
Box()
{
l=10;
b=20;
h=30;
}

Box(int w, int h ,int d) 
{ 	l = w;
	h= h;
	b = d;
 }
Box(int n)
{
l = n;
	h= n;
	b = n;
}
 void display()
{
System.out.println("Length of Box="+l);
System.out.println("Height of Box="+h);
System.out.println("Width of Box="+b);
}
int volume()
{
return l*b*h;
}

}

class MainBox
{
public static void main(String Arg[])

{
Box b1= new Box();//default
b1.display();
System.out.print("Volume of 3rd Box is "+b1.volume());
Box b2= new Box(1,2,3);//default
b2.display();
System.out.print("Volume of 3rd Box is "+b2.volume());
Box b3= new Box(5);//default
b3.display();
System.out.print("Volume of 3rd Box is "+b3.volume());
}

//javac box_method.java
//java MainBox


}