import java.util.*;
import java.sql.*;

class crud {
    Scanner sc = new Scanner(System.in);
    void delete() {
        System.out.println("Delete Row");
        System.out.println("Enter uname to delete row: ");
        String uname = sc.nextLine();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/farm", "root", "mysql");
            String qry = "delete from login where uname=?";
            PreparedStatement ps = con.prepareStatement(qry);
            ps.setString(1, uname);
            int rs = ps.executeUpdate();
            if (rs >= 1) {
                System.out.println(rs+" Row deleted successfuly");
            } else {
                System.out.println(rs+" Row deleted successfuly");
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    void update() {
        System.out.println("Updates values in Rows");
        System.out.println("Enter uname which you want to update row: ");
        String uname = sc.nextLine();
        System.out.println("Enter fname: ");
        String fname = sc.nextLine();
        System.out.println("Enter lname: ");
        String lname = sc.nextLine();
        System.out.println("Enter dob(YYYY-MM-DD): ");
        String dob = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/farm", "root", "mysql");
            String qry = "update login set fname=?,lname=?,dob=?,pwd=? where uname=?";
            PreparedStatement ps = con.prepareStatement(qry);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, dob);
            ps.setString(4, password);
            ps.setString(5, uname);
            int rs = ps.executeUpdate();
            if (rs >= 1) {
                System.out.println(rs+"Rows Updated successfuly");
            } else {
                System.out.println(rs+"Rows Updated successfuly");
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    void insert() {
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
            PreparedStatement ps = con.prepareStatement(qry);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, uname);
            ps.setString(4, dob);
            ps.setString(5, password);
            int rs = ps.executeUpdate();
            if (rs >= 1) {
                System.out.println(rs+" Rows Inserted successfuly");
            } else {
                System.out.println(rs+" Rows Inserted successfuly");
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    void insert(String fname,String lname,String uname,String dob,String password) {
       //insrt.insert("","","","","");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/farm", "root", "mysql");

            String qry = "insert into login values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(qry);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, uname);
            ps.setString(4, dob);
            ps.setString(5, password);
            int rs = ps.executeUpdate();
            if (rs >= 1) {
                System.out.println(rs+" Rows Inserted successfuly");
            } else {
                System.out.println(rs+" Rows Inserted successfuly");
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    void display() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farm", "root", "mysql");
            String qry = "select * from login;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(qry);
            System.out.println("fname \t lname \t uname \t dob \t password");
            while (rs.next()) {
                System.out.println("" + rs.getString(1) + "\t" + rs.getString(2) + 
                "\t" + rs.getString(3) + "\t"+ rs.getString(4) + "\t" + rs.getString(5));
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CRUD operation by hemil on mysql Database");
        crud isrt = new crud();

        int ch = 0;
        while (ch <= 4) {
            System.out.println("1.Insert Data");
            System.out.println("2.Update Data");
            System.out.println("3.Delete Data");
            System.out.println("4.Display Data");
            System.out.println("5.Exit");
            System.out.println("Enter Choice :");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    isrt.insert();
                    break;
                case 2:
                    isrt.update();
                    break;
                case 3:
                    isrt.delete();
                    break;
                case 4:
                    isrt.display();
                    break;
                default:
                    System.out.println("Default choice error");
                    break;
            }
        }
        sc.close();
    }
}