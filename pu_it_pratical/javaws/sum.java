class sum
{
   public static void main(String args[])
   {
      double sum=0,k;
      for(int i=0;i<args.length;i++)
       { 
          k=Double.parseDouble(args[i]);
          sum=sum+k;  
       }
     System.out.println("Sum:"+sum);
   }
}