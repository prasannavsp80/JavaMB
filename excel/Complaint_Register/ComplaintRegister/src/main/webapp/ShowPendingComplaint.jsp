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
			<th>Turn Around Time</th>
			<th>Resolve</th>
		</tr>
		<c:forEach var="complaint" items="${beanComplaintDao.showPendingComplaint()}">
			<c:set var="tat" value="${beanComplaintDao.tat(complaint.complaintDate)}"/>
			<c:if test="${tat >= 7}">
			<tr style="color: red;">
				<td><c:out value="${complaint.complaintId}"/> </td>
				<td><c:out value="${complaint.complaintType}"/> </td>
				<td><c:out value="${complaint.cDescription}"/> </td>
				<td><c:out value="${complaint.complaintDate}"/> </td>
				<td><c:out value="${complaint.severity}"/> </td>
				<td><c:out value="${complaint.status}"/> </td>
				<td><c:out value="${tat}"/> </td>
				<td> 
					<a href=Resolve.jsp?complaintid=${complaint.complaintId}>Resolve</a>
				</td>
			</tr>
			</c:if>
			<c:if test="${tat <= 4}">
			<tr>
				<td><c:out value="${complaint.complaintId}"/> </td>
				<td><c:out value="${complaint.complaintType}"/> </td>
				<td><c:out value="${complaint.cDescription}"/> </td>
				<td><c:out value="${complaint.complaintDate}"/> </td>
				<td><c:out value="${complaint.severity}"/> </td>
				<td><c:out value="${complaint.status}"/> </td>
				<td><c:out value="${tat}"/> </td>
				<td> 
					<a href=Resolve.jsp?complaintid=${complaint.complaintId}>Resolve</a>
				</td>
			</tr>
			</c:if>
		</c:forEach>
	</table>
</body>
</html>