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
	<form method="get" action="AddHospital.jsp">
		<table border="3" align="center">
			<tr>
				<th colspan="2">Add Hospital</th>
			</tr>
			<tr>
				<th>Hospital Name</th>
				<td><input type="text" name="hospitalName" /> </td>
			</tr>
			<tr>
				<th>Is Network Hospital</th>
				<td>
					<select name="isNetwork">
						<option value="1">Yes</option>
						<option value="0">No</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>Hospital Type</th>
				<td>
				<select name="hospitalType">
					<option value="ThyroCare">ThyroCare</option>
					<option value="ENT">ENT</option>
					<option value="Kidney">Kidney</option>
					<option value="OrthoCare">OrthoCare</option>
					<option value="Heart">Heart</option>
					<option value="General">General</option>
					<option value="MultiSpeciality">Multi-Speciality</option>
				</select> 
			</tr>
			<tr>
				<th>City</th>
				<td><input type="text" name="city" /> </td>
			</tr>
			<tr>
				<th>Address</th>
				<td><input type="text" name="address" /> </td>
			</tr>
			<tr>
				<th>Mobile</th>
				<td>
					<input type="text" name="mobile" /> 
				</td>
			</tr>
			<tr>
				<th>Email</th>
				<td>
					<input type="text" name="email" />
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="Add Hospital" />
				</th>	
			</tr>
		</table>
	</form>
	<c:if test="${param.isNetwork !=null}">
		<jsp:useBean id="beanHospital" class="com.java.hosp.Hospital" />
		<jsp:setProperty property="*" name="beanHospital"/>
		<jsp:useBean id="beanDao" class="com.java.hosp.HospitalDaoImpl" />
		<c:out value="${beanDao.addHospital(beanHospital)}" />
	</c:if>
</body>
</html>