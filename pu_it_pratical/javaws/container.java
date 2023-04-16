import java.util.*;
class Box{
     double l;
     double h; 
     double b;
     Box()
     {
        System.out.println("Constructing Box");
        h = 10 ;
        l = 10;
        b = 10;
     }
     double volume()
     {
       return l * b * h;
     }
     
}

class BoxDemo6{
       public static void main(String args[])
       {    
            Box mybox1 = new Box();
            Box mybox2 = new Box();
            double vol;
	    
            vol = mybox1.volume();
            System.out.println("Volume is "+vol);
 	    vol = mybox2.volume();
            System.out.println("Volume is "+vol);
       }
}