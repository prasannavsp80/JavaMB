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
<jsp:useBean id="beanComplaintDao" class="com.java.hib.ComplaintDAOImpl"/>
	<table border="3">
		<tr>
			<th>Complaint Id</th>
			<th>Complaint Type</th>
			<th>Complaint Description</th>
			<th>Complaint Date</th>
			<th>Severity</th>
			<th>Status</th>
		</tr>
		<c:forEach var="complaint" items="${beanComplaintDao.showComplaint()}">
			<tr>
				<td><c:out value="${complaint.complaintId}"/> </td>
				<td><c:out value="${complaint.complaintType}"/> </td>
				<td><c:out value="${complaint.cDescription}"/> </td>
				<td><c:out value="${complaint.complaintDate}"/> </td>
				<td><c:out value="${complaint.severity}"/> </td>
				<td><c:out value="${complaint.status}"/> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>