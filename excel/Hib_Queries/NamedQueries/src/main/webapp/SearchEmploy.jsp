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
<form method="get" action="SearchEmploy.jsp">
	<center>
		Employ No : 
		<input type="number" name="empno" /> <br/><br/>
		<input type="submit" value="Search" />
	</center>
</form>
<c:if test="${param.empno != null}">
	<c:set var="employFound" value="${beanEmployDao.searchEmploy(param.empno)}"/>
	Employ No : <b>
	<c:out value="${employFound.empno}"/> </b> <br/>
	Employ Name : <b>
	<c:out value="${employFound.name}"/> </b> <br/>
	</b>
</c:if>
</body>
</html>