<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Student_Registration</title>
    </head>
    <body>
        <div class="container">
            <form role="form" action="validation" method="get">
                <div class="form-group">
                    <label>Student name</label>
                    <input type="text" class="form-control" name="name">
                </div>
                <div class="form-group">
                    <label>Enrollment number</label>
                    <input type="number" class="form-control" name="rollno">
                </div>
                <div class="form-group">
                    <label>Mobile no</label>
                    <input type="text" class="form-control" name="mobile_no">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
    </body>
</html>
