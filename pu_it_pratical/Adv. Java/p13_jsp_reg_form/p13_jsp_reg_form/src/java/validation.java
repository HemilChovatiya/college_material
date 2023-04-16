import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validation")
public class validation extends HttpServlet {


 public validation() {
 super();
 }
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 response.getWriter().append("Served at: ").append(request.getContextPath());
 PrintWriter pw = response.getWriter();
 String name = request.getParameter("name");
 String rollno = request.getParameter("rollno");
 String mobile_no=request.getParameter("mobile_no");
 if(!(name.isEmpty() && rollno.isEmpty() && mobile_no.isEmpty()))
 {
 if (rollno.chars().allMatch( Character::isDigit ) &&
mobile_no.chars().allMatch(Character::isDigit ))
 pw.println(" Valid Input");
 else
 pw.println(" Enter numeric value in 2nd and 3rd textbox");
 }
 else
 pw.println(" Enter value in all the textboxs");
 }
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 doGet(request, response);
 }
}