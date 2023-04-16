import java.io.*;

class Main1
{
   public static void main(String[] args)
   {
    try
     {
      BufferedReader in = new BufferedReader(new FileReader("a.txt"));
      String str;

      while((str = in.readLine()) != null)
       {
       System.out.println(str);
       }

      }
    catch (IOException e)
    {
    }
    System.out.println("Hello"); 
  }
}