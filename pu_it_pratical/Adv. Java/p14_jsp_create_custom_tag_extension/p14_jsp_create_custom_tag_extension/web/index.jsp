

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Custom Tag Page</title>
    </head>
    <body>
       <%@ taglib uri="WEB-INF/tlds/mytags.tld" prefix="m" %>
Current Date and Time is: <m:today/>

    </body>
</html>
