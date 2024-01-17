<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanEmployDao" class="com.java.hib.EmployDAOImpl"/>
	<c:set var="employList" value="${beanEmployDao.showEmploy()}"/>
	<table border="3">
		<th>Employ No</th>
		<th>Employ Name</th>
		<th>Gender</th>
		<th>Department</th>
		<th>Designation</th>
		<th>Basic</th>
		<th>Update</th>
		<th>Delete</th>
	<c:forEach var="employ" items="${employList}">
		<tr>
			<td><c:out value="${employ.empno}"/> </td>
			<td><c:out value="${employ.name}"/> </td>
			<td><c:out value="${employ.gender}"/> </td>
			<td><c:out value="${employ.dept}"/> </td>
			<td><c:out value="${employ.desig}"/> </td>
			<td><c:out value="${employ.basic}"/> </td>
			<td><a href=UpdateEmploy.jsp?empno=${employ.empno}>Update</a></td>
			<td><a href=DeleteEmploy.jsp?empno=${employ.empno}>Delete</a></td>
		</tr>
	</c:forEach>
	</table> <hr/>
	<a href="AddEmploy.jsp">Add Employ</a>
</body>
</html>