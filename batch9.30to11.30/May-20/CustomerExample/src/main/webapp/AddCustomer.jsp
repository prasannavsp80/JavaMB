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
	<form method="get" action="AddCustomer.jsp">
		<center>
			First Name : 
			<input type="text" name="customerFirstName" /> <br/><br/>
			Last Name :
			<input type="text" name="customerLastName" /> <br/><br/>
			User Name : 
			<input type="text" name="customerUserName" /> <br/><br/>
			City : 
			<input type="text" name="customerCity" /> <Br/><br/>
			Email : 
			<input type="text" name="customerEmail" /> <Br/><br/>
			<input type="submit" value="Add Customer" />
		</center>
	</form>
	<c:if test="${param.customerFirstName !=null && param.customerLastName !=null}">
		<jsp:useBean id="beanDao" class="com.java.customer.CustomerDaoImpl" />
		<jsp:useBean id="beanCustomer" class="com.java.customer.Customer" />
		<jsp:setProperty property="*" name="beanCustomer"/>
		<c:out value="${beanDao.addCustomerDao(beanCustomer)}" />
	</c:if>
</body>
</html>