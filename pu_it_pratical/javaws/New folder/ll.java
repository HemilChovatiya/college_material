// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node
{
    int data;
    Node next;
}
class linklist{
   Node head;
   public void insert(int data)
   {
       Node newnode= new Node();
       newnode.data=data;
       newnode.next=null;
       if(head==null)
       {
           head = newnode;
       }
       else
       {
           Node n = head;
           while(n.next!=null)
           {
               n = n.next;
           }
           n.next = newnode;
       }
   }
   public void show()
   {
       Node node = head;
       while(node.next!=null)
       {
           System.out.println(node.data);
           node=node.next;
       }
       System.out.println(node.data);
   }
}
class ll {
    public static void main(String[] args) {
        linklist list=new linklist();
        list.insert(15);
        list.insert(14);
        list.insert(13);
        list.show();
        System.out.println("Hello, World!");
    }
}