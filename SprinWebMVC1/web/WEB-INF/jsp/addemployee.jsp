<%-- 
    Document   : addemployee
    Created on : Sep 30, 2019, 9:38:22 PM
    Author     : Shahidul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/SprinWebMVC1/add" method="post">
            <label> Employee Name</label>
            <input type="text" name="ename"><br>
            <label> Employee Address</label>
            <input type="text" name="eaddress"><br>
            <input type="submit" value="submit"/>
        </form>
    </body>
</html>
