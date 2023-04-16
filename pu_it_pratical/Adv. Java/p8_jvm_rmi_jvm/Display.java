import java.rmi.*;
public interface Display extends Remote
{
	public String dis() throws RemoteException;
}