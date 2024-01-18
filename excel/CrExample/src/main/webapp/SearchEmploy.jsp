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
	<form method="get" action="SearchEmploy.jsp">
		Employ No : 
		<input type="number" name="empno" /> <br/><br/> 
		<input type="submit" value="Search" />
	</form>
	<c:if test="${param.empno != null}">
		<jsp:useBean id="beanEmployDao" class="com.java.hib.EmployDAOImpl"/>
		<c:set var="empno" value="${param.empno}"/>
		<c:set var="employFound" value="${beanEmployDao.searchEmploy(empno)}"/>
		Employ No : 
		<c:out value="${employFound.empno}"/> <br/>
		Employ Name :
		<c:out value="${employFound.name}"/> <br/>
		Gender : 
		<c:out value="${employFound.gender}"/> <br/>
		Department : 
		<c:out value="${employFound.dept}"/> <br/>
		Designation : 
		<c:out value="${employFound.desig}"/> <br/>
		Basic : 
		<c:out value="${employFound.basic}"/> <br/>
	</c:if>
</body>
</html>