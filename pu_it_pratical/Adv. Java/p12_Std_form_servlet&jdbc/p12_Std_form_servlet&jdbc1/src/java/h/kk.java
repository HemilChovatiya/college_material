package h;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class kk {
 public void demo(String name,int enroll,int mobileno) {
 try {Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con =
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mobile1");
PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
 ps.setString(1, name);
 ps.setInt(2, enroll);
 ps.setInt(3, mobileno);
 ps.executeUpdate();
 con.close();
 } catch (Exception e) {
 }}}