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
	<form method="post" action="Login.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" /> <br/><br/> 
			Password : 
			<input type="password" name="passCode" /> <br/><br/>
			<input type="submit" value="Login" />
		</center>
	</form>
	<%
		if (request.getParameter("userName")!=null && request.getParameter("passCode")!=null) {
			String user = request.getParameter("userName");
			String pwd = request.getParameter("passCode");
			EmployDAO dao = new EmployDAOImpl();
			int count = dao.authenticate(user, pwd);
			if (count==1) {
		%>
			<jsp:forward page="EmployTable.jsp"/>
		<%
			} else {
				out.println("<br/><br/> Invalid Credentials...");
			}
		}
	%>
</body>
</html>