
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 


class demo {
    void demo(String name){
    System.out.println("<h1>hello all</h1>");
    }
   void demo(String name,String enroll,String mobileno){
       try { System.out.println("<h1>hello all</h1>");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hemil?autoReconnect=true&useSSL=false", "root", "mysql");
            PreparedStatement ps = con.prepareStatement("insert into stdu values(?,?,?);");
            ps.setString(1, name);
            ps.setString(2, enroll);
            ps.setString(3, mobileno);
            ps.executeUpdate();
            {
                    System.out.println("<h1>hello all</h1>");}
            con.close();
        } catch (Exception e) {
        }  
}
}
            demo obj = new demo();
            obj.demo("hemil", "12", "9921");
            obj.demo("hemil"); %>
        <h1>Hello World!</h1>
    </body>
</html>
