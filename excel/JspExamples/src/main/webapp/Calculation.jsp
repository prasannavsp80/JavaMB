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
		int firstNo=0, secondNo=0, result=0;
	%>
	<form name="frmCalc" action="Calculation.jsp">
		<center>
			First Number : 
			<input type="number" name="firstNo" value=<%=firstNo %> > <br/><br/>
			Second Number : 
			<input type="number" name="secondNo" value=<%=secondNo %> > <br/><br/>
			<input type="submit" value="Calculation" /> <br/><br/> 
			
		</center>
	</form>
	<%
	if (request.getParameter("firstNo")!=null && request.getParameter("secondNo")!=null) {
		firstNo = Integer.parseInt(request.getParameter("firstNo"));
		secondNo = Integer.parseInt(request.getParameter("secondNo"));
		result= firstNo + secondNo;
		out.println("Sum is  " +result);
	}
	%>
</body>
</html>