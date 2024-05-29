<%@page import="com.java.lib.LibraryDaoImpl"%>
<%@page import="com.java.lib.LibraryDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Menu.jsp" />
	<%
		String user = (String)session.getAttribute("user");
		LibraryDao dao = new LibraryDaoImpl();
		String[] bookId  = request.getParameterValues("bookid");
		for(String s : bookId) {
			int i = Integer.parseInt(s);
			out.println(dao.issueBook(user, i)  + "<br/>");
		}
	%>
</body>
</html>