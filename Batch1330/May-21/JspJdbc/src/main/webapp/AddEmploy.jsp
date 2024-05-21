<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
			<input type="text" name="name" /> <br/><Br/>
			Gender : 
			<select name="gender">
				<option value="MALE">Male</option>
				<option value="FEMALE">FEMALE</option>
			</select> <br/><br/>
			Department : 
			<select name="dept">
				<option value="Dotnet">Dotnet</option>
				<option value="Java">Java</option>
				<option value="Angular">Angular</option>
				<option value="React">React</option>
			</select> <br/><br/>
			Designation : 
			<select name="desig">
				<option value="Senior">Senior</option>
				<option value="Junior">Junior</option>
				<option value="Head">Head</option>
			</select> <br/><br/>
			Basic : 
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Insert" />
		</center>
	</form>
<%
	if (request.getParameter("empno")!=null && request.getParameter("basic")!=null){
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonixpractice",
				"root","root");
		String cmd = "Insert into Employ(empno, name, gender, dept, desig, basic) " +
					" values(?,?,?,?,?,?)"; 
		PreparedStatement pst = connection.prepareStatement(cmd);
		pst.setInt(1, Integer.parseInt(request.getParameter("empno")));
		pst.setString(2, request.getParameter("name"));
		pst.setString(3, request.getParameter("gender"));
		pst.setString(4, request.getParameter("dept"));
		pst.setString(5, request.getParameter("desig"));
		pst.setDouble(6, Double.parseDouble(request.getParameter("basic")));
		pst.executeUpdate();
		out.println("*** Record Inserted ***");
	}
%>
</body>
</html>