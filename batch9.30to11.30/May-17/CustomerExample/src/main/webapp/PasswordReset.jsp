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
	<p>Welcome to Password Reset Page</p>
	<form method="get" action="PasswordReset.jsp">
		<center>
			Customer User Name : 
			<input type="text" name="customerUserName" value="${param.customerUserName}" /> <br/><br/>
			Customer Password : 
			<input type="password" name="customerPassword" /> <br/><br/>
			Customer Reset Password : 
			<input type="password" name="customerResetPassword" /> <br/><br/>
			<input type="submit" value="Update Password" />
		</center>
	</form>
	<c:if test="${param.customerUserName !=null && param.customerPassword !=null}">
		<c:if test="${param.customerPassword == param.customerResetPassword}">
			<jsp:useBean id="beanDao" class="com.java.customer.CustomerDaoImpl" />
			<c:out value="${beanDao.updatePassword(param.customerUserName, param.customerPassword)}" />
		</c:if>
	</c:if>
</body>
</html>