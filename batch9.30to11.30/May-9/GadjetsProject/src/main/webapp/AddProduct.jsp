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
	<form method="post" action="AddProduct.jsp">
		<center>
			Product Name : 
			<input type="text" name="productName" /> <br/><br/>
			Description : 
			<input type="text" name="description" /> <br/><br/>
			Price : 
			<input type="number" name="price" /> <br/><br/>
			<input type="submit" value="Add Product" />
		</center>
	</form>
	<c:if test="${param.price != null}">
		<jsp:useBean id="beanProduct" class="com.java.gadjet.Products"/>
		<jsp:setProperty property="*" name="beanProduct"/>
		<jsp:useBean id="beanProductsDao" class="com.java.gadjet.ProductDaoImpl" />
		<c:out value="${beanProductsDao.addProductDao(beanProduct)}" />
	</c:if>
</body>
</html>