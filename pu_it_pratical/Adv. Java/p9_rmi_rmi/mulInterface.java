import java.rmi.Remote;
import java.rmi.RemoteException;
public interface mulInterface extends Remote {
 public int mul(int x, int y) throws RemoteException;
}