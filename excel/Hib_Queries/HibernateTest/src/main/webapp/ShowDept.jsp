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
	<c:set var="names" value="${beanEmployDao.showDept()}"/>
	<form method="get" action="ShowDept.jsp">
	Select Name : 
	<select name="employ" onchange="submit()">
		<c:forEach var="employ" items="${names}">
			<option value=${employ}>${employ}</option>
		</c:forEach>
	</select>
	<table border="3" align="center">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Salary</th>
		</tr>
	<c:set var="dept" value="${param.employ}"/>
	<c:set var="employList" value="${beanEmployDao.showByDeptName(dept)}"/>
	<c:forEach var="emp" items="${employList}">
		<tr>
			<td><c:out value="${emp.empno}"/> </td>
			<td><c:out value="${emp.name}"/> </td>
			<td><c:out value="${emp.gender}"/> </td>
			<td><c:out value="${emp.dept}"/> </td>
			<td><c:out value="${emp.desig}"/> </td>
			<td><c:out value="${emp.basic}"/> </td>
		</tr>
	</c:forEach>
	</table>
	</form>
</body>
</html>