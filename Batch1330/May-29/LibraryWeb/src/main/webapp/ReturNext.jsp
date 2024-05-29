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
		LibraryDao dao = new LibraryDaoImpl();
		String user = (String)session.getAttribute("user");
		String[] books = request.getParameterValues("chkBook");
		for(String s : books) {
			int i = Integer.parseInt(s);
			out.println(dao.returnBook(user, i));
		}
	%>
</body>
</html>