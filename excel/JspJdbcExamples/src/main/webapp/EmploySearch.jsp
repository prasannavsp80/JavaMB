<%@page import="com.java.jdbc.Employ"%>
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
	<form method="get" action="EmploySearch.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/> 
			<input type="submit" value="Search" />
		</center>
	</form>
	<%
		if (request.getParameter("empno")!=null) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			EmployDAO dao = new EmployDAOImpl();
			Employ employ = dao.searchEmployDao(empno);
			if (employ!=null) {
				out.println("Employ Name  " +employ.getName() + "<br/>");
				out.println("Gender  " +employ.getGender() + "<br/>");
				out.println("Department   " +employ.getDept() + "<br/>");
				out.println("Designation  " +employ.getDesig() + "<br/>");
				out.println("Basic   " +employ.getBasic() + "<br/>");
			} else {
				out.println("*** Record Not Found ***");
			}
		}
	%>
</body>
</html>