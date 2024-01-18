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
		<c:set var="employList" value="${beanEmployDao.showProjections()}"/>
		<c:forEach var="employ" items="${employList}">
			<c:forEach var="rec" items="${employ}">
				<c:out value="${rec}"/> 
		</c:forEach>
		<hr/>
		</c:forEach>
</body>
</html>