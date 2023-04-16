import java.io.*;

class Exception {
	public static void main(String[] args)
	{
	try {
		int number;
		number = 30 / 0;
	     }
	catch (ArithmeticException e) {
		System.out.println(
		"Zero cannot divide any number\n"+e);
		}
		
	}
}
