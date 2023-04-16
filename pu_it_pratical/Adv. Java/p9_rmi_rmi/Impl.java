import java.rmi.server.*;
 public class Impl extends UnicastRemoteObject
 implements AddInterface, subInterface, mulInterface, divInterface {
  public Impl() throws Exception { super(); }
  public int Add(int x, int y) { return x + y; }
  public int sub(int x, int y) { return x - y; }
  public int mul(int x, int y) { return x * y; }
  public int div(int x, int y) { return x / y; }
 }