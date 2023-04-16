import java.rmi.*;
public class Server {
	public static void main(String args[])
	{
		try
		{	Display d=new DisplayRemote();
			Naming.rebind("rmi://localhost:1099/displayservice",d);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
}
