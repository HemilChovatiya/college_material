import javax.faces.context.FacesContext;
import javax.faces.context.*;
import java.sql.*;
import javax.naming.*;
import javax.sql.DataSource;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dbPassword;
    private String dbName;
    DataSource ds;

    public User() {
        try {
            Context ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("java:comp/env/jdbc/database");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public String getDbName() {
        return dbName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public String add() {
        int i = 0;
        if (firstName != null) {
            PreparedStatement ps = null;
            Connection con = null;
            try {
                if (ds != null) {
                    con = ds.getConnection();
                    if (con != null) {
                        String sql = "INSERT INTO user(firstname, password, lastname, email) VALUES( ?,  ?,  ?,  ?)";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, firstName);
                        ps.setString(2, password);
                        ps.setString(3, lastName);
                        ps.setString(4, email);
                        i = ps.executeUpdate();
                        System.out.println("Data Added Successfully");
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    con.close();
                    ps.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (i > 0) {
            return "success";
        } else {
            return "unsuccess";
        }
    }

    public void dbData(String uName) {
        if (uName != null) {
            PreparedStatement ps = null;
            Connection con = null;
            ResultSet rs = null;
            if (ds != null) {
                try {
                    con = ds.getConnection();
                    if (con != null) {
                        String sql = "select firstname,password from user where firstname = '"
                                + uName + "'";
                        ps = con.prepareStatement(sql);
                        rs = ps.executeQuery();
                        rs.next();
                        dbName = rs.getString("firstname");
                        dbPassword = rs.getString("password");
                    }
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
        }
    }

    public String login() {
        dbData(firstName);
        if (firstName.equals(dbName) && password.equals(dbPassword)) {
            return "output";
        } else {
            return "invalid";
        }
    }

    public void logout() {
        FacesContext.getCurrentInstance().getExternalContext()
                .invalidateSession();
        FacesContext.getCurrentInstance()
                .getApplication().getNavigationHandler()
                .handleNavigation(FacesContext.getCurrentInstance(), null, "/login.xhtml");
    }
}
