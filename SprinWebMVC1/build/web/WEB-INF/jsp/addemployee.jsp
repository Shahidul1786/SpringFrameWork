<%-- 
    Document   : addemployee
    Created on : Sep 30, 2019, 9:38:22 PM
    Author     : Shahidul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form:errors path="employee.*"/>
        <form action="/SprinWebMVC1/add" method="post">


            <table>
                <tr>
                    <td><lebel>Employee Name</lebel></td>
                <td><input type="text" name="ename"></td>
                </tr>

                <tr>
                    <td><lebel>Employee Address</lebel></td>
                <td><input type="text" name="eaddress"></td>
                </tr>

                <tr>
                    <td><lebel>Employee Mobile No</lebel></td>
                <td><input type="text" name="empMobile"></td>
                </tr>

                <tr>
                    <td><lebel>Employee DOB</lebel></td>
                <td><input type="text" name="empDob"></td>
                </tr>

                <tr>
                    <td><lebel>Employee Skill</lebel></td>
                <td>
                    <select name="skillTest" multiple>
                        <option value="Spring core">Spring core</option>
                        <option value="Spring AOP">Spring AOP</option>
                        <option value="Spring JDBC">Spring JDBC</option>
                        <option value="Spring MVC">Spring MVC</option>
                    </select>
                </td>
                </tr>
                
                <tr>
                    <td><lebel>Department ID :</lebel></td>
                <td><input type="text" name="department.deptId"></td>
                </tr>
                <tr>
                    <td><lebel>Department Name :</lebel></td>
                <td><input type="text" name="department.deptName"></td>
                </tr>
                
                <tr><td><input type="submit" value="submit"</td></tr>
            </table>
        </form>
    </body>
</html>
