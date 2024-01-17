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
	<form method="get" action="Login.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" /> <br/><br/>
			Password : 
			<input type="password" name="passCode" /> <br/><br/> 
			<input type="submit" value="Login" />
		</center>
	</form>
	<c:if test="${param.userName !=null && param.passCode != null}">
		<jsp:useBean id="beanUsers" class="com.java.hib.EmployDAOImpl"/>
		<c:set var="count" value="${beanUsers.validateUser(param.userName, param.passCode)}"/>
		<c:if test="${count==1}">
			<jsp:forward page="EmployTable.jsp"/>
		</c:if>
	</c:if>
</body>
</html>