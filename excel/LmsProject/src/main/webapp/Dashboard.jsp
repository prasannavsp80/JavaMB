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
<jsp:useBean id="beanLms" class="com.java.lms.EmployeeDAOImpl"/>
		<c:set var="empId" value="${param.empId}"/>
		<c:set var="mgrId" value="${param.mgr}" />
<table border="3" align="center">
	<tr>
		<th>My Details
		
		<c:set var="employData" value="${beanLms.searchEmployeeDao(empId)}"/>
		<p>Employee Id : ${employData.empId} </p>
		<p>Employee Name : ${employData.empName} </p>
		<p>Email : ${employData.empEmail}</p>
		<p>Mobile : ${employData.empMobile}</p>
		<p>Manager Id : ${employData.managerId} </p>
		<p>Leave Avail : ${employData.leaveAvail} </p>
		</th>
		<th>My Manager Details
			<c:if test="${mgrId==0}">
				<p>No Manager</p>
			</c:if>
			<c:if test="${mgrId!=0}">
			<c:set var="managerData" value="${beanLms.searchEmployeeDao(mgrId)}"/>
				<p>Employee Id : ${managerData.empId} </p>
				<p>Employee Name : ${managerData.empName} </p>
				<p>Email : ${managerData.empEmail}</p>
				<p>Mobile : ${managerData.empMobile}</p>
				<p>Manager Id : ${managerData.managerId} </p>
				<p>Leave Avail : ${managerData.leaveAvail} </p>
			</c:if>
		</th>	
	</tr>
	
</table>

<a href="ApplyLeave.jsp?empId=${param.empId}">Apply Leave</a>
</body>
</html>