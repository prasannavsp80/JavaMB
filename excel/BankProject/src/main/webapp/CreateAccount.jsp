<%@page import="com.java.bank.BankDAOImpl"%>
<%@page import="com.java.bank.BankDAO"%>
<%@page import="com.java.bank.Bank"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="CreateAccount.jsp">
		<center>
			First Name : 
			<input type="text" name="firstName" /> <br/><br/> 
			Last Name : 
			<input type="text" name="lastName" /> <br/><br/> 
			City : 
			<input type="text" name="city" /> <br/><br/> 
			State : 
			<input type="text" name="state" /> <br/><br/>
			Amount : 
			<input type="number" name="amount" /> <Br/><Br/>
			CheqFacility : 
			<select name="cheqFacil">
				<option value="Yes">Yes</option>
				<option value="No">No</option>
			</select> <br/><br/>
			Account Type : 
			<select name="accountType">
				<option value="Savings">Savings</option>
				<option value="Current">Current</option>
				<option value="Recurring">Recurring</option>
			</select> <br/><br/>
			<input type="submit" value="Create Account" />
		</center>
	</form>
	<%
		if (request.getParameter("amount")!=null) {
			
		
		Bank bank = new Bank();
		bank.setFirstName(request.getParameter("firstName"));
		bank.setLastName(request.getParameter("lastName"));
		bank.setCity(request.getParameter("city"));
		bank.setState(request.getParameter("state"));
		bank.setAmount(Double.parseDouble(request.getParameter("amount")));
		bank.setCheqFacil(request.getParameter("cheqFacil"));
		bank.setAccountType(request.getParameter("accountType"));
		BankDAO dao = new BankDAOImpl();
		out.println(dao.createAccount(bank));
		}
	%>
</body>
</html>