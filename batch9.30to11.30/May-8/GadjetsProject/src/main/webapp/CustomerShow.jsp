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
<jsp:useBean id="beanDao" class="com.java.gadjet.CustomerDaoImpl" />
<c:set var="clist" value="${beanDao.showCustomer()}" />
	<table border="3" align="center">
		<tr>
			<th>Customer Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Address</th>
		</tr>
		<c:forEach var="customer" items="${clist}">
			<tr>
				<td><c:out value="${customer.customerId}"/> </td>
				<td><c:out value="${customer.firstName}"/> </td>
				<td><c:out value="${customer.lastName}"/> </td>
				<td><c:out value="${customer.email}"/> </td>
				<td><c:out value="${customer.address}"/> </td>
				<td><c:out value="${customer.phone}"/> </td>
			</tr>
			
		</c:forEach>
	</table>
</body>
</html>