<%@ page errorPage="Error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="DivEx.jsp">
	<center>
		First No : 
		<input type="number" name="firstNo" /> 
		<br/>
		Second No : 
		<input type="number" name="secondNo" />
		<br/>
		<input type="submit" value="Calc" />
	</center>
</form>
<%
	if (request.getParameter("firstNo")!=null && 
		request.getParameter("secondNo")!=null
			) {
		int firstNo = Integer.parseInt(request.getParameter("firstNo"));
		int secondNo = Integer.parseInt(request.getParameter("secondNo"));
		int result = firstNo / secondNo;
		out.println(result);
	}
%>
</body>
</html>