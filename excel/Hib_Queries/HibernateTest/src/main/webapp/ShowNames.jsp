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
	<c:set var="names" value="${beanEmployDao.showNames()}"/>
	Select Name : 
	<select name="employ">
		<c:forEach var="employ" items="${names}">
			<option value=${employ}>${employ}</option>
		</c:forEach>
	</select>
</body>
</html>