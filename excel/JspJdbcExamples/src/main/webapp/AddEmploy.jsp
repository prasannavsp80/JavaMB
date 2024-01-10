<%@page import="com.java.jdbc.EmployDAOImpl"%>
<%@page import="com.java.jdbc.EmployDAO"%>
<%@page import="com.java.jdbc.Employ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="AddEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/>
			Employ Name : 
			<input type="text" name="name" /> <br/><br/> 
			Gender : 
			<select name="gender">
				<option value="Male">Male</option>
				<option value="Female">Female</option>
			</select> <br/><br/> 
			Department : 
			<select name="dept">
				<option value="Dotnet">Dotnet</option>
				<option value="Java">Java</option>
				<option value="Python">Python</option>
			</select> <br/><br/> 
			Designation : 
			<select name="desig">
				<option value="Programmer">Programmer</option>
				<option value="TeamLead">TeamLeada</option>
				<option value="Manager">Manager</option>
			</select> <br/><br/> 
			Basic : 
			<input type="number" name="basic" /> <br/><br/> 
			<input type="submit" value="Insert" />
		</center>
	</form>
	<%
		if (request.getParameter("empno")!=null && request.getParameter("basic")!=null) {
			Employ employ = new Employ();
			employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
			employ.setName(request.getParameter("name"));
			employ.setGender(request.getParameter("gender"));
			employ.setDept(request.getParameter("dept"));
			employ.setDesig(request.getParameter("desig"));
			employ.setBasic(Double.parseDouble(request.getParameter("basic")));
			EmployDAO dao = new EmployDAOImpl();
			out.println(dao.addEmployDao(employ));
		}
	%>
</body>
</html>