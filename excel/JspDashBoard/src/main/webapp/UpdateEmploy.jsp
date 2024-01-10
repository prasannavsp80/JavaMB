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
<%
	int empno = Integer.parseInt(request.getParameter("empno"));
	EmployDAO dao = new EmployDAOImpl();
	Employ employFound = dao.searchEmployDao(empno);
%>
<form method="get" action="UpdateEmploy.jsp">
	<center>
		Employ No : 
		<input type="number" name="empno" value=<%=employFound.getEmpno() %> > 
		<br/> <br/> 
		Employ Name : 
		<input type="text" name="name" value=<%=employFound.getName() %> >
		<br/><br/>
		Gender : 
		<input type="text" name="gender" value=<%=employFound.getGender() %> >
		<br/><br/>
		Department : 
		<input type="text" name="dept" value=<%=employFound.getDept() %> >
		<br/><br/>
		Designation : 
		<input type='text' name="desig" value=<%=employFound.getDesig() %> >
		<br/><br/>
		Basic : 
		<input type="number" name="basic" value=<%=employFound.getBasic() %> > 
		<br/><br/>
		<input type="submit" value="Update" />
	</center>
</form>
<%
	if (request.getParameter("empno")!=null && 
			request.getParameter("basic") !=null
			) {
		Employ employUpdated = new Employ();
		employUpdated.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employUpdated.setName(request.getParameter("name"));
		employUpdated.setGender(request.getParameter("gender"));
		employUpdated.setDept(request.getParameter("dept"));
		employUpdated.setDesig(request.getParameter("desig"));
		employUpdated.setBasic(Double.parseDouble(request.getParameter("basic")));
		dao.updateEmployDao(employUpdated);
	%>
		<jsp:forward page="EmployTable.jsp"/>
	<%
	}
%>
</body>
</html>