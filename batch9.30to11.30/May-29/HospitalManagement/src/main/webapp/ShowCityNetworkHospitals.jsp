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
<jsp:useBean id="beanDao" class="com.java.hosp.HospitalDaoImpl" />
<c:set var="cityHospitals" value="${beanDao.showAllCities()}" />
<form method="get" action="ShowCityNetworkHospitals.jsp">
<table border="3" align="center">
	<tr>
		<th>Select City</th>
		<td>
			<select name="city" onchange="submit()">
				<option value="select">Select City</option>
				<c:forEach var="c" items="${cityHospitals}">
					<option value="${c}">${c}</option>
				</c:forEach>
			</select>
		</td>
	</tr>
</table>
<c:set var="city" value="${param.city}" />
<c:set var="hospitalList" value="${beanDao.searchByCityNetworkHosp(city)}" />
<table border=3 align="center">
		<tr>
			<th>Hospital Id</th>
			<th>Hospital Name</th>  
			<th>IsNetwork</th>
			<th>Hospital Type</th>
			<th>City</th>
			<th>Address</th>
			<th>Mobile</th>
			<th>Email</th>
		</tr>
		<c:forEach var="hospital" items="${hospitalList}">
			<tr>	
				<td><c:out value="${hospital.hospitalId}" /> </td>
				<td><c:out value="${hospital.hospitalName}" /> </td>
				<td>
					<c:if test="${hospital.isNetwork==1}">
						<c:out value="Network Hospital" />
					</c:if>
					<c:if test="${hospital.isNetwork==0}">
						<c:out value="Non-Network Hospital"/>
					</c:if>
				</td>
				<td><c:out value="${hospital.hospitalType}" /> </td>
				<td><c:out value="${hospital.city}" /> </td>
				<td><c:out value="${hospital.address}" /> </td>
				<td><c:out value="${hospital.mobile}" /> </td>
				<td><c:out value="${hospital.email}" /> </td>
			</tr>
		</c:forEach>		
	</table>      
</form>
</body>
</html>