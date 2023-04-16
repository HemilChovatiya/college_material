import java.rmi.*;
public class Server {
 public static void main(String[] args) throws Exception
 {
 Impl obj = new Impl();
 Naming.rebind("ADD", obj);
 
 System.out.println("Server Started");
 }
}
