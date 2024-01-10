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
<form method="get" action="DeleteEmploy.jsp">
	<center>
		Employ No : 
		<input type="number" name="empno" /> <br/><br/> 
		<input type="submit" value="Delete" /> 
	</center>
</form>
<%
	if (request.getParameter("empno")!=null) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmployDAO dao = new EmployDAOImpl();
		out.println(dao.deleteEmployDao(empno));		
	}
%>
</body>
</html>