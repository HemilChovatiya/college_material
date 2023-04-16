import java.rmi.server.*;
import java.rmi.*;

public class DisplayRemote extends UnicastRemoteObject implements Display
{
	DisplayRemote()throws RemoteException
	{
		super();
	}
	public String dis()
	{
		return "hello World";
	}
}
