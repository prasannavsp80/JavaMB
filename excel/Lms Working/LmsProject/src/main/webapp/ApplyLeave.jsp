<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="get" action="ApplyLeave.jsp">
	<table border="3" align="center">
	<tr>
		<th colspan="2">Apply Leave</th>
	</tr>
	<tr>
		<th>Employee Id</th>
		<td>
		<input type="number" name="empId" value="${param.empId}" /> </td>
	</tr>
	<tr>
		<th>Leave StartDate</th>
		<td>
			<input type="date" name="leaveStartDate" /> 
		</td>
	</tr>
	<tr>
		<th>Leave EndDate</th>
		<td> 
			<input type="date" name="leaveEndDate" />
		</td>
	</tr>
	<tr>
		<th>Leave Type</th>
		<td>
			<select name="leaveType">
				<option value="EL">EL</option>
				<option value="PL">PL</option>
				<option value="ML">ML</option>
			</select>
		</td>
	</tr>
	<tr>
		<th>Leave Reason</th>
		<td>
			<input type="text" name="leaveReason" />
		</td>
	</tr>
	<tr>
		<th colspan="2">
			<input type="submit" value="Apply Leave" />
		</th>
	</tr>
	</table>
	</form>
<c:if test="${param.empId!=null && param.leaveReason !=null}">
<jsp:useBean id="leaveHistory" class="com.java.lms.LeaveHistory"/>
<jsp:useBean id="leaveDao" class="com.java.lms.LeaveHistoryDAOImpl"/>
<jsp:setProperty property="empId" name="leaveHistory" value="${param.empId}"/>
<jsp:setProperty property="leaveStartDate" name="leaveHistory" value="${leaveDao.convertToSql(param.leaveStartDate)}"/>
<jsp:setProperty property="leaveEndDate" name="leaveHistory" value="${leaveDao.convertToSql(param.leaveEndDate)}"/>
<jsp:setProperty property="leaveReason" name="leaveHistory" value="${param.leaveReason}"/>
<jsp:setProperty property="leaveType" name="leaveHistory" value="${param.leaveType}"/>	
<c:out value="${leaveDao.applyLeave(leaveHistory)}"/>
<a href="EmployeeShow.jsp">Show Info</a>
</c:if>
</body>
</html>