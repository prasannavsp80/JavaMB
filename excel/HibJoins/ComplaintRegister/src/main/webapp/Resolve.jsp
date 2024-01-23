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
			<br/><br/>
			Resolved By : 
			<input type="text" name="resolvedBy" /> <br/><br/>
			Comments :
			<input type="text" name="comments" /> <br/><br/>
			<input type="submit" value="Resolve" />
		</center>
	</form>
	<c:if test="${param.complaintId !=null && param.resolvedBy !=null && param.comments !=null}">
	<c:set var="cdate" value="${beanComplaintDao.convert(param.complaintDate)}"/>
		<jsp:useBean id="beanResolve" class="com.java.hib.Resolve"/>
		<jsp:setProperty property="complaintId" name="beanResolve" value="${param.complaintId}"/>
		<jsp:setProperty property="complaintDate" name="beanResolve" value="${cdate}"/>
		<jsp:setProperty property="resolvedBy" name="beanResolve" value="${param.resolvedBy}"/>
		<jsp:setProperty property="comments" name="beanResolve" value="${param.comments}"/>
		<c:out value="${beanComplaintDao.resolve(beanResolve)}"/>
	</c:if>
</body>
</html>