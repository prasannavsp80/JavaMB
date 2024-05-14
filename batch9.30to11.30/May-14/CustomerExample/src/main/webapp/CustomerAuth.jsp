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
	<form method="get" action="CustomerAuth.jsp">
		<center>
			Customer User Name : 
			<input type="text" name="customerUserName" /> <br/><br/>
			Customer Auth Code : 
			<input type="text" name="custAuthCode" /> <br/><br/>
			<input type="submit" value="Authenticate" />
		</center>
	</form>
	
	<c:if test="${param.customerUserName !=null && param.custAuthCode !=null}">
		<jsp:useBean id="beanDao" class="com.java.customer.CustomerDaoImpl" />
		<c:set var="count" value="${beanDao.authenticate(param.customerUserName, param.custAuthCode)}" />
		<c:out value="${count}" />
		<c:if test="${count==1}">
			<jsp:forward page="PasswordReset.jsp" />
		</c:if>
	</c:if>
</body>
</html>