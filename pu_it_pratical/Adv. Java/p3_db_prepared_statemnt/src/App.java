import java.sql.*;
import java.util.*;

public class App{
public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter uname: ");
    String a=sc.nextLine();
   
            try
            {  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/farm","root","mysql");  
            //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from login where uname='"+a+"';");  
        while(rs.next())  
        {
        System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));  
        }
        con.close();  
           }
    catch(Exception e)
    { System.out.println(e);}  
}  
}