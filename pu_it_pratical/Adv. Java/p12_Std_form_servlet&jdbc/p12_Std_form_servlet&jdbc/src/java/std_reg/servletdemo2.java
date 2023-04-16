package std_reg;
import java.beans.Statement;
import java.sql.*;
public class servletdemo2 {
    public void demo(String name, String enroll, String mobileno) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hemil?autoReconnect=true&useSSL=false", "root", "mysql");
            PreparedStatement ps = con.prepareStatement("insert into stdu values(?,?,?)");
            ps.setString(1, name);
            ps.setString(2, enroll);
            ps.setString(3, mobileno);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
        }
    }
}
