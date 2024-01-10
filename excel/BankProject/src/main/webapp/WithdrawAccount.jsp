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
	<form method="get" action="WithdrawAccount.jsp">
		<center>
			Account No : 
			<input type="number" name="accountNo" /> <br/><br/>
			Withdraw Amount : 
			<input type="number" name="withdrawAmount" /> <br/><br/> 
			<input type="submit" value="Withdraw" />
		</center>
	</form>
	<%
		if (request.getParameter("accountNo")!=null && 
				request.getParameter("withdrawAmount") !=null
				) {
			int accno = Integer.parseInt(request.getParameter("accountNo"));
			double withdrawAmount = Double.parseDouble(request.getParameter("withdrawAmount"));
			BankDAO dao = new BankDAOImpl();
			out.println(dao.withdrawAccount(accno, withdrawAmount));
		}
	%>
</body>
</html>