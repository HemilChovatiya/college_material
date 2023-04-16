class DemoTh implements Runnable
{
public void run()
{
System.out.println("Started running new using runnable interface");
}
}
class MThread
{
public static void main(String args[])
{
DemoTh t=new DemoTh();
Thread t1=  new Thread(t);
t1.start();
System.out.println("Concureent program");
}
}