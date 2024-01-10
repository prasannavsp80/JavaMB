<%@page import="com.java.bank.BankDAOImpl"%>
<%@page import="com.java.bank.BankDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="DepositAccount.jsp">
	<center>
		Account No : 
		<input type="number" name="accountNo" /> <br/><br/> 
		Deposit Amount : 
		<input type="number" name="depositAmount" /> <br/><br/>
		<input type="submit" value="Deposit" /> 
	</center>
</form>
<%
	if (request.getParameter("accountNo")!=null && 
			request.getParameter("depositAmount")!=null
			) {
		int accno = Integer.parseInt(request.getParameter("accountNo"));
		double depAmount = Double.parseDouble(request.getParameter("depositAmount"));
		BankDAO dao = new BankDAOImpl();
		out.println(dao.depositAccount(accno, depAmount));
	}
%>
</body>
</html>