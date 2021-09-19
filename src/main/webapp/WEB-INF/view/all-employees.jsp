<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>All Employees</title>
    </head>

    <body>
        <h2>All Employees</h2>

        <br>

        <table>
            <tr>
                <th>Name</th>
                <th>Surname</th>
                <th>Department</th>
                <th>Salary</th>
            </tr>

            <jsp:useBean id="allEmps" scope="request" type="java.util.List"/>
            <c:forEach var="emp" items="${allEmps}">
                <tr>
                    <td>${emp.name}</td>
                    <td>${emp.surname}</td>
                    <td>${emp.department}</td>
                    <td>${emp.salary}</td>
                </tr>
            </c:forEach>
        </table>

    <br>

    <input type="button" value="add"
        onclick="window.location.href = 'addNewEmployee'"/>
    </body>
</html>
