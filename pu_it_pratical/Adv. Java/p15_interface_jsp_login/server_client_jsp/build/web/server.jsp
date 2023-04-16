<%-- 
    Document   : server
    Created on : 18 Sep, 2022, 12:32:44 PM
    Author     : raj
--%>
<%@page import="java.net.ServerSocket"%>
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
            %>
        <h1>Hello World!</h1>
    </body>
</html>
