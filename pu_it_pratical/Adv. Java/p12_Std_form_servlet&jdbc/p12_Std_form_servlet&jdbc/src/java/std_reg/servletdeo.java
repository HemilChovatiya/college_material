package std_reg;
import std_reg.servletdemo2;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class servletdeo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            response.getWriter().append("Served at: ").append(request.getContextPath());
            
            String name = request.getParameter("name");
            String rollno = request.getParameter("rollno");
            String mobile_no = request.getParameter("mobile_no");
            try {
                servletdemo2 obj = new servletdemo2();

                obj.demo(name, rollno, mobile_no);
                out.println("record inserted successfully");
            } catch (Exception e) {
                out.println(e.getMessage());
            }
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
  
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
