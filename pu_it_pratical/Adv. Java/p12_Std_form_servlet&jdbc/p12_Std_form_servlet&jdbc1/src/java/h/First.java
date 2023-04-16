package h;

import h.kk;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class First extends HttpServlet {


    public First() {
    
 super();
 }
        /**
         *
         * @param request
         * @param response
         * @throws ServletException
         * @throws IOException
         */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        //response.getWriter().append("Served at: ").append(request.getContextPath());
        PrintWriter pw = response.getWriter();
        String name = request.getParameter("name");
        String rollno = request.getParameter("rollno");
        String mobile_no = request.getParameter("mobile_no");
        try {
            kk obj = new kk();
            obj.demo(name, Integer.parseInt(rollno), Integer.parseInt(mobile_no));
            pw.println("record inserted successfully");
        } catch (Exception e) {
            pw.println(e.getMessage());
        }}
 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
