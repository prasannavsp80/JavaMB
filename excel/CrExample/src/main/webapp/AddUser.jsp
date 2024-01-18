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
	<form method="get" action="AddUser.jsp">
		User Name : 
		<input type="text" name="userName" /> <br/><br/>
		Password : 
		<input type="password" name="passCode" /> <br/><br/> 
		ReType Password : 
		<input type="password" name="retypeCode" /> <br/><br/>
		<input type="submit" value="Add User" />
	</form>
<c:if test="${param.userName !=null && param.passCode !=null && param.retypeCode !=null}">

<c:if test="${param.passCode == param.retypeCode}">
	<jsp:useBean id="beanUserDao" class="com.java.hib.EmployDAOImpl"/>
	<jsp:useBean id="beanUser" class="com.java.hib.Users"/>
	<jsp:setProperty property="*" name="beanUser"/>
	<c:out value="${beanUserDao.addUser(beanUser)}"/>
</c:if>
</c:if>
</body>
</html> 