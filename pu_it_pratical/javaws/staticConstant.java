class Student
{  int rollno;
   String name;
   static String college ="PIET";
   static int count=0;
   static int branchcode=545;
   Student()
   { this.rollno =3;
     this.name ="Hemil ";
     count++;
   }
   Student(int r, String n)
   { rollno=r;
     name=n;
     count++;
   }
    void display()
    { System.out.println(rollno +"  "+ name +"  "+ college +"  "+ branchcode);
      System.out.println("Inserted record no." + count);
    }
}
class staticConstant
{   public static void main(String args[])
   { Student s1 = new Student(3,"Meet");        //count=1
     s1.display();
     Student s2 = new Student(4,"Raj");         //count=2
     s2.display();
     Student s3 = new Student(5,"Utsav");       //count=3
     s3.display();
     Student s = new Student();
     s.display();
    }
}