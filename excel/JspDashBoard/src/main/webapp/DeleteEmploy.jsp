<%@page import="com.java.jdbc.EmployDAOImpl"%>
<%@page import="com.java.jdbc.EmployDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int empno = Integer.parseInt(request.getParameter("empno"));
	EmployDAO dao = new EmployDAOImpl();
	dao.deleteEmployDao(empno);
%>
<jsp:forward page="EmployTable.jsp"/>
</body>
</html>