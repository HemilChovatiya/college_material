class sample
{
    protected void finalize()
     {
ystem.out.println("Finalize method called by garbage collector"); 
     }
}
class GCFinalize
{
   public static void main(String[] arg)throws Throwable
   {
      for(int i=0;i<5;i++)
       {
          sample s=new sample();
          System.gc(); // forcefully calling finalize() method
          System.out.println("GC done");
       }
   }
}