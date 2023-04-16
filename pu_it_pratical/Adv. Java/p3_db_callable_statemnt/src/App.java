import java.sql.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Values:");
        System.out.println("Enter fname: ");
        String fname = sc.nextLine();
        System.out.println("Enter lname: ");
        String lname = sc.nextLine();
        System.out.println("Enter uname: ");
        String uname = sc.nextLine();
        System.out.println("Enter dob(YYYY-MM-DD): ");
        String dob = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/farm", "root", "mysql");

            String qry = "insert into login values(?,?,?,?,?)";
            CallableStatement cst = con.prepareCall(qry);
            cst.setString(1, fname);
            cst.setString(2, lname);
            cst.setString(3, uname);
            cst.setString(4, dob);
            cst.setString(5, password);
            int rs = cst.executeUpdate();
            if (rs >= 1) {
                System.out.println(rs + " Rows Inserted successfuly");
            } else {
                System.out.println(rs + " Rows Inserted successfuly");
            }
            cst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}