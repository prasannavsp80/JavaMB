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
	<c:set var="complaintFound" value="${beanComplaintDao.searchByComplaintId(param.complaintid)}"/>
	<form method="get" action="Resolve.jsp">
		<center>
			Complaint Id : 
			<input type="text" name="complaintId" value=${complaintFound.complaintId} />
			<br/><br/>
			Complaint Date : 
			<input type="date" name="complaintDate" value=${complaintFound.complaintDate} />
		</center>
	</form>
</body>
</html>