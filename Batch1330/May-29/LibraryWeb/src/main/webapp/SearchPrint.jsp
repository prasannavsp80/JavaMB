<%@page import="com.java.lib.Books"%>
<%@page import="java.util.List"%>
<%@page import="com.java.lib.LibraryDaoImpl"%>
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
	LibraryDaoImpl impl = new LibraryDaoImpl();
	String searchType = request.getParameter("searchtype");
	String searchValue = request.getParameter("searchvalue");
	List<Books> booksList = impl.searchBooks(searchType, searchValue);
%>
		<form action="Issue.jsp">
		<table border="3" align="center">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Author</th>
			<th>Edition</th>
			<th>Department</th>
			<th>Total Books</th>
			<th>Select</th>
		</tr>
	<%
		for(Books book : booksList) {
			int totalBooks = book.getTotalBooks();
	%>
		<tr>
			<td> <%=book.getId() %> </td>
			<td><%=book.getName() %> </td>
			<td><%=book.getAuthor() %> </td>
			<td> <%=book.getEdition() %> </td>
			<td><%=book.getDept() %> </td>
			<td><%=book.getTotalBooks() %> </td>
			<td>
			<%
				if (totalBooks > 0) {
			%>
			<input type="checkbox" name="bookid" value=<%=book.getId() %> />
			<%
				}
			%>
			</td>
		</tr>
	<%
		}
	%>
	</table>
	<input type="submit" value="Issue Book(s)" />
	</form>
</body>
</html>