<%-- 
    Document   : einfo
    Created on : Sep 30, 2019, 10:01:37 PM
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
        <%-- <h1>${edetails}</h1> --%>
        ${msg}
        <table>
            <tr>
                <td>employee name :</td>
                <td>${employee.ename}</td>

            </tr>
            <tr>
                <td>employee address : </td>
                <td>${employee.eaddress}</td>

            </tr>
            <tr>
                <td>employee Mobile no : </td>
                <td>${employee.empMobile}</td>

            </tr>
            <tr>
                <td>employee DOB : </td>
                <td>${employee.empDob}</td>

            </tr>

            <tr>
                <td>employee Email : </td>
                <td>${employee.email}</td>

            </tr>
            <tr>
                <td>employee Skills : </td>
                <td>${employee.skillTest}</td>

            </tr>

            <tr>
                <td>Department ID : </td>
                <td>${employee.department.deptId}</td>

            </tr>

            <tr>
                <td>Department Name : </td>
                <td>${employee.department.deptName}</td>

            </tr>
        </table>
    </body>
</html>
