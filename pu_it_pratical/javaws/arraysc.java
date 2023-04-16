import java.util.*;
class arraysc
{
    public static void main(String args[])
     {
        int sum=0;

	Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
	int n=sc.nextInt();
	int[] a= new int[n];
	System.out.println("enter the value in array:");
	for(int i=0;i<n;i++)
	{       System.out.println("Enter Value "+i+":");
 		a[i]=sc.nextInt();
 		sum=sum+a[i];
	}
	System.out.println("Average : "+(sum/n));
	} 
}