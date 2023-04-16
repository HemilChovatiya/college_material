import java.rmi.*;
import java.rmi.registry.*;
public class Client {
	public static void main(String args[])
	{try
	{
		Display d=(Display)Naming.lookup("rmi://localhost:1099/displayservice");
		System.out.println(d.dis());
		}catch(Exception e)
	{
			System.out.println(e);
	}
	}
	
	}

