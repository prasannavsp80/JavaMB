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
<form method="post" action="Login.jsp">
	<center>
		User Name : 
		<input type="text" name="userName" /> <br/><br/>
		Password : 
		<input type="password" name="passWord" /> <br/><br/>
		<input type="submit" value="Login" />
	</center>
</form>
<c:if test="${param.userName !=null && param.passWord !=null}">
	<jsp:useBean id="beanDao" class="com.java.customer.CustomerDaoImpl" />
	<c:set var="count" value="${beanDao.login(param.userName, param.passWord)}" />
	<c:if test="${count==1}">
		<jsp:forward page="DashBoard.jsp" />
	</c:if>
	<c:if test="${count==0}">
		<c:out value="Invalid Credentials..." />
	</c:if>
</c:if>
</body>
</html>