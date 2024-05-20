<%@page import="java.util.Date"%>
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
	Date date = new Date();
%>
Time is : 
<b>
<%=date.getHours() %> : <%=date.getMinutes() %> : <%=date.getSeconds() %>
</b>
</body>
</html>