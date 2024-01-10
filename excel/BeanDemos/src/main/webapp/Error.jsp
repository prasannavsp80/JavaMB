<%@ page isErrorPage="true" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
		There is an Error Occurred in this page...
	</p>
	Error Message : 
	<%=exception.getMessage() %>
	Status : 
	<%=response.getStatus() %>
	Exception Class : 
	<%=exception.getClass() %>
</body>
</html>