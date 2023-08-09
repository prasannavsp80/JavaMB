<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
		<table border="3" align="center">
			<tr>
				<th>Employ No</th>
				<th>Employ Name</th>
				<th>Department</th>
				<th>Designation</th>
				<th>Basic</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="employ" items="${employList}">
				<tr>
					<td>${employ.empno} </td>
					<td>${employ.name} </td>
					<td>${employ.dept} </td>
					<td>${employ.desig} </td>
					<td>${employ.basic} </td>
					<td>
       			<a href="editemploy?empno=${employ.empno}">Edit</a>
        			</td>
						<td>
       			<a href="deleteemploy?empno=${employ.empno}">Delete</a>
        			</td>
				</tr>
				
			</c:forEach>
		</table>
		<a href="createEmploy">Create Employ</a>
		
    </body>
</html>
