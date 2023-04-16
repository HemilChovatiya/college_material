class array
{
    public static void main(String num[]) 
    {
    int n;
    double sum = 0;

    for (int i = 0; i <= 3; i++) 
          {
            n = Integer.parseInt(num[i]);
            sum=sum+n;
          }
        System.out.println("Avg:"+sum/4);
    }
}
