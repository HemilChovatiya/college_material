class Boxdem
{
   double l;
   double b;
   double h;
   Boxdem()
    { 
       System.out.println("constucting Box");
       l=11.2;b=780.7;h=93.1;
    }
   double volume()
      {
         return l*b*h;
      }
}
class Box4
{
    public static void main(String args[])
      {
         Boxdem b1=new Boxdem();
         double vol;
         vol = b1.volume();
         System.out.println("The volume is : " + vol);
      }
}