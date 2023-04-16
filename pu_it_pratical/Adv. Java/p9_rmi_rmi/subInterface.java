import java.rmi.Remote;
import java.rmi.RemoteException;
public interface subInterface extends Remote {
 public int sub(int x, int y) throws RemoteException;
}