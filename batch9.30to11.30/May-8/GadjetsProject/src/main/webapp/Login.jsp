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
	<form action="Login.jsp">
		<table border="3" align="center">
			<tr>
				<th colspan="2">
					Login Page
				</th>
			</tr>
			<tr>
				<th>User Name</th>
				<td><input type="text" name="userName" /> </td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="password" name="passCode" /> </td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="Login" />
				</th>
			</tr>
		</table>
	</form>
	<c:if test="${param.userName !=null && param.passCode !=null}">
		<jsp:useBean id="beanDao" class="com.java.gadjet.CustomerDaoImpl" />
		<jsp:useBean id="login" class="com.java.gadjet.Login" />
		<jsp:setProperty property="*" name="login"/>
		<c:set var="count" value="${beanDao.LoginCheck(login)}" />
		<c:if test="${count==1}">
			<jsp:forward page="CustomerShow.jsp" />
		</c:if>
		<c:if test="${count==0}">
			<c:out value="Invalid Credentials..."/>
		</c:if>
	</c:if>
</body>
</html>