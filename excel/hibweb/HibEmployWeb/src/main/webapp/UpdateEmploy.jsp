<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="empno" value="${param.empno}"/>
	<jsp:useBean id="beanEmployDao" class="com.java.hib.EmployDAOImpl"/>
	<c:set var="employFound" value="${beanEmployDao.searchEmploy(empno)}"/>
	<c:if test="${employFound != null}">
		<form method="get" action="UpdateEmploy.jsp">
			<center>
				Employ No : 
				<input type="number" name="empno" value="${employFound.empno}" 
					readonly="readonly" /> <br/><br/>
				Employ Name : 
				<input type="text" name="name" value="${employFound.name}" /> <br/><br/>
				Gender : 
				<input type="text" name="gender" value="${employFound.gender}" /> <br/><br/>
				Department : 
				<input type="text" name="dept" value="${employFound.dept}" /> <br/><br/>
				Designation : 
				<input type="text" name="desig" value="${employFound.desig}" /> <br/><br/>
				Basic : 
				<input type="text" name="basic" value="${employFound.basic}" /> <br/><br/>
				<input type="submit" value="Update Employ" />
			</center>
		</form>
		<c:if test="${param.empno!=null && param.basic!=null}">
		<jsp:useBean id="beanEmploy" class="com.java.hib.Employ"/>
		
		<jsp:setProperty property="*" name="beanEmploy"/>
			<c:out value="${beanEmploy}"/>
			<c:out value="${beanEmployDao.updateEmploy(beanEmploy)}"/>
			<jsp:forward page="EmployTable.jsp"/>
		</c:if>
	</c:if>
</body>
</html>