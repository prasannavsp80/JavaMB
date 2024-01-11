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
	<jsp:useBean id="beanDao" class="com.java.lms.EmployeeDAOImpl"/>
	<c:set var="employList" value="${beanDao.showEmployeeDao()}" />
	<table border="3" align="center">
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Email</th>
			<th>Mobile No</th>
			<th>Manager id</th>
			<th>Leave Balance</th>
			<th>MyDashBoard</th>
		</tr>
	<c:forEach var="employ" items="${employList}">
		<tr>
			<td> <c:out value="${employ.empId}"/> </td>
				<td> <c:out value="${employ.empName}"/> </td>
			<td> <c:out value="${employ.empEmail}"/> </td>
			<td> <c:out value="${employ.empMobile}"/> </td>
			<td> <c:out value="${employ.managerId}"/> </td>
			<td> <c:out value="${employ.leaveAvail}"/> </td>
			<td><a href=Dashboard.jsp?empId=${employ.empId}&mgr=${employ.managerId} >Show Info</a> </td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>