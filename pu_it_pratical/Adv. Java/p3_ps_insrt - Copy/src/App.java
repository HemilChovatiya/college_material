import java.sql.*;
import java.util.*;

public class App{
     public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter fname: ");
    String fname=sc.nextLine();
    System.out.println("Enter lname: ");
    String lname=sc.nextLine();
    System.out.println("Enter uname: ");
    String uname=sc.nextLine();
    System.out.println("Enter dob(YYYY-MM-DD): ");
    String dob=sc.nextLine();
    System.out.println("Enter password: ");
    String password=sc.nextLine();

    try
            {  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/farm","root","mysql");  
            
            String qry="insert into login values('"+fname+"','"+lname+"','"+uname+"','"+dob+"','"+password+"');";
        PreparedStatement stmt=con.prepareStatement(qry);  
        int rs=stmt.executeUpdate(qry); 
       if(rs>=1)  
        {
        System.out.println("Rows Inserted successfuly");  
        }
        else{
            System.out.println("Rows not Inserted successfuly"); 
        }
        con.close();  
           }
    catch(Exception e)
    { System.out.println(e);}  
}  
}