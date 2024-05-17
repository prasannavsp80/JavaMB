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
	<form method="get" action="Password.jsp">
		<center>
			Customer UserName : 
			<input type="text" name="userName" /> <br/><br/>
			<input type="submit" value="Reset Password" />
		</center>
	</form>
	<c:if test="${param.userName!=null}">
		<jsp:useBean id="beanDao" class="com.java.customer.CustomerDaoImpl" />
		<c:set var="customer" value="${beanDao.searchByUserName(param.userName)}" />
		<c:if test="${customer!=null}">
			<c:set var="custId" value="${customer.getCustId()}" scope="session" />
			<jsp:forward page="ChangePassword.jsp" />
		</c:if>
	</c:if>
</body>
</html>