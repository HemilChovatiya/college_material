
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raj
 */
class demo {
    void demo(String name){
    System.out.println("<h1>hello all</h1>");
    }
   void demo(String name,String enroll,String mobileno){
       try { System.out.println("<h1>hello all</h1>");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hemil?autoReconnect=true&useSSL=false", "root", "mysql");
            PreparedStatement ps = con.prepareStatement("insert into stdu values(?,?,?)");
            ps.setString(1, name);
            ps.setString(2, enroll);
            ps.setString(3, mobileno);
            ps.executeUpdate();
            System.out.println("<h1>hello all</h1>");
            con.close();
        } catch (Exception e) {
        }  
}
}