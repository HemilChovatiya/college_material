class Student
{
     int Enrollment_No;
     String name;
     static String college="PU";
     static int a;
     static int count=0;
     static int branchcode=303;
     Student()
     {
        this.Enrollment_No=20;
        this.name="Hemil";
        count++;
     }
     Student(int r,String n)
     {
        Enrollment_No=r;
        name=n;
        count++;
     } 
     void display()
     {
       System.out.println(Enrollment_No+" "+name+" "+college+" "+branchcode+" "+count);
       System.out.println("Inserted Record no."+count);
     }
}
class staticConstant{
   public static void main(String args[])
   {
      Student s3=new Student(3,"Utsav");
      s3.display();

      Student s11=new Student(11,"Hemil");
      s11.display();

      Student s12=new Student(12,"Hardik");
      s12.display();


      Student s=new Student();
      s.display();

      Student s5=new Student(5,"Raj");
      s5.display();
   }
}