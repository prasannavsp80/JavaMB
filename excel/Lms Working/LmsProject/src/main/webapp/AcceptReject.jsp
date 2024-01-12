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
<jsp:useBean id="leaveDao" class="com.java.lms.LeaveHistoryDAOImpl"/>
<c:set var="leaveRecord" value="${leaveDao.searchByLeaveId(param.leaveId)}"/>
<c:out value="${leaveRecord.leaveId}"/>
<form method="get" action="AcceptReject.jsp">
	<center>
		Leave Id : 
			<c:out value="${param.leaveId}"/> <br/><br/>
		Employ Id :
			<c:out value="${leaveRecord.empId}"/> <br/><br/>
		Leave Status : 
		<select name="status">
			<option value="YES">YES</option>
			<option value="NO">NO</option>
		</select> <br/><br/>
		Manager Comments : 
		<input type="text" name="managerComments" /> <br/><br/> 
		<input type="submit" value="Accept/Reject" />
	</center>
</form>
<c:if test="${param.status != null && param.managerComments != null}">
	Leave Id is : <c:out value="${leaveRecord.leaveId}"/>
	<c:set var="result" value="${leaveDao.acceptReject(leaveRecord.leaveId, param.status, param.managerComments)}"/>
	<c:out value="${result}"/>
</c:if>
</body>
</html>