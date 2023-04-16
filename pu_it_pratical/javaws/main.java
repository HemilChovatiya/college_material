abstract class Base
{
  Base()
  {
    System.out.println("Base Constructor called"); 
  }
  abstract void fun();
}
class Derived extends Base
{
  Derived()
  { 
    System.out.println("Derived Constructor Called");
  }
  void fun()
  {
    System.out.println("Derived fun() Called");
  }
}
class Main
{
  public static void main(String args[])
  {
    Derived d= new Derived();
  }
}

//abstract method=1 void fun(); we can call by variable_name.fun
//derived() = constructor  we can call by creating new object
//in abstract class concreate=base()