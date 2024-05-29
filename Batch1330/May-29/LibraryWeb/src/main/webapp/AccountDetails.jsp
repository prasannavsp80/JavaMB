<%@page import="com.java.lib.TranBook"%>
<%@page import="java.util.List"%>
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
		List<TranBook> listBooks = dao.showIssuedBooks(user);
	%>
	<table border="3" align="center">
		<tr>
			<th>Book Id</th>
			<th>User Name</th>
			<th>From Date</th>
		</tr>
		<%
			for(TranBook t : listBooks){
		%>
			<tr>
				<td><%=t.getBookId() %> </td>
				<td><%=t.getUserName() %> </td>
				<td><%=t.getFromDate() %> </td>
			</tr>
		<%		
			}
		%>
	</table>
</body>
</html>