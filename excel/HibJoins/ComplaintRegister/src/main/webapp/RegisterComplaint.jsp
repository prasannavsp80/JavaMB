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
<form action="RegisterComplaint.jsp">
	<center>
		Complaint Type :
		<select name="complaintType">
			<option value="Laptop">Laptop</option>
			<option value="Outlook">Outlook</option>
			<option value="Access Card">Access Card</option>
			<option value="Accounts">Accounts</option>
			<option value="Other">Other</option>
		</select> <br/><br/> 
		Complaint Description : 
		<input type="text" name="cDescription" /> <br/><br/> 
		Severity : 
		<select name="severity">
			<option value="High">High</option>
			<option value="Medium">Medium</option>
			<option value="Low">Low</option>
		</select> <br/><br/>
		<input type="submit" value="Raise Complaint" />
	</center>
</form>
<c:if test="${param.complaintType !=null && param.cDescription !=null && 
			param.severity != null
			}">
<jsp:useBean id="beanComplaint" class="com.java.hib.Complaint"/>
<jsp:setProperty property="*" name="beanComplaint"/>	
<jsp:useBean id="beanComplaintDao" class="com.java.hib.ComplaintDAOImpl"/>
<c:out value="${beanComplaintDao.addComplaint(beanComplaint)}" />		
</c:if>
</body>
</html>