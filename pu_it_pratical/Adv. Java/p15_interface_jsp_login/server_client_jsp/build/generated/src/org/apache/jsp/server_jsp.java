package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public final class server_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            
		ServerSocket s1=new ServerSocket(1527);
		System.out.println(" Server Started");
		Socket s=s1.accept();
                PrintWriter p=new PrintWriter(s.getOutputStream());
                BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
                String num=in.readLine();
                int n=Integer.parseInt(num);
                System.out.println("Client want to sort "+n+" numbers");
		String sarr[]=new String[n];
		int arr[]=new int[n];
		int swap,c,d;
		System.out.println("received numbers::\n");
		for(int i=0;i<n;i++)
		{
			sarr[i]=in.readLine();
			arr[i]=Integer.parseInt(sarr[i]);
			System.out.println("no. "+i+"="+arr[i]);
		
		}
	
		for (c = 0; c < ( n - 1 ); c++)
		{
			for (d = 0; d < n - c - 1; d++)
			{
				if (arr[d] > arr[d+1])
				{
					swap     = arr[d];
					arr[d]   = arr[d+1];
					arr[d+1] = swap;
				}
			}
		}
 
		System.out.println("\nSorted list of numbers");
		String sendarr=new String();
		for (c = 0; c < n; c++) 
		{
			sendarr+="\nnum ("+c+")="+arr[c];
		}
		System.out.println(sendarr);
		p.println(sendarr);
		p.flush();
		s.close();
            
      out.write("\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
