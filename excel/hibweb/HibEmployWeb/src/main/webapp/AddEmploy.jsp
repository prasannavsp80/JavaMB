<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
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
				<input type="number" name="empno"  /> <br/><br/>
				Employ Name : 
				<input type="text" name="name" /> <br/><br/>
				Gender : 
				<input type="text" name="gender" /> <br/><br/>
				Department : 
				<input type="text" name="dept" /> <br/><br/>
				Designation : 
				<input type="text" name="desig" /> <br/><br/>
				Basic : 
				<input type="text" name="basic" /> <br/><br/>
				<input type="submit" value="Add Employ" />
			</center>
		</form>
	<c:if test="${param.empno !=null && param.basic !=null}">
		<jsp:useBean id="beanDao" class="com.java.hib.EmployDAOImpl"/>
		<jsp:useBean id="beanEmploy" class="com.java.hib.Employ"/>
		<jsp:setProperty property="*" name="beanEmploy"/>
		<c:set var="result" value="${beanDao.addEmploy(beanEmploy)}"/>
		<jsp:forward page="EmployTable.jsp"/>
	</c:if>
</body>
</html>