<%-- 
    Document   : newjsp
    Created on : 18 Sep, 2022, 12:32:25 PM
    Author     : raj
--%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.net.Socket"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                  Socket s=new Socket("localhost",1527);
		PrintWriter p=new PrintWriter(s.getOutputStream());
		BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader ink=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many numbers to sort? ");
		int num=Integer.parseInt(ink.readLine());
		p.println(num);
		p.flush();
		System.out.println("Enter "+num+" numbers to sort :");
		String sarr[]=new String[num];
		for(int i=0;i<num;i++)
		{
			System.out.print("no. "+i+"=");
			sarr[i]=ink.readLine();
			p.println(sarr[i]);
			p.flush();
		}
		String res;
		System.out.println("\nSorted array::\n");
		while((res=in.readLine())!=null)
		{
			System.out.println(res);
		}			
		s.close();
        %>
        <h1>Hello World!</h1>
    </body>
</html>
