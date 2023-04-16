import java.rmi.Remote;
import java.rmi.RemoteException;
public interface AddInterface extends Remote {
 public int Add(int x, int y) throws RemoteException;
}