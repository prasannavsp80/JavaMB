<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="Hobbies.jsp">
		<center>
			Hobbies : 
			<input type="checkbox" name="hobby" value="Listening Music"> Listening Music
			<input type="checkbox" name="hobby" value="Playing Cricket"> Playing Cricket
			<input type="checkbox" name="hobby" value="Watching Movies"> Wating Movies
			<input type="checkbox" name="hobby" value="Fighting Practice"> Fighting Practice
			<input type="checkbox" name="hobby" value="Arguing"> Arguing
			<input type="checkbox" name="hobby" value="Writing Java Code"> Writing Java Code
			<input type="checkbox" name="hobby" value="Cleaning Home"> Cleaning Home
			<br/><br/>
			<input type="submit" value="Show Hobby" />
		</center>
	</form>
	<%
	if (request.getParameter("hobby")!=null) {
		String values[] = request.getParameterValues("hobby");
		for(String v : values) {
			out.println(v + "<br/>");
		}
	}
	%>
</body>
</html>