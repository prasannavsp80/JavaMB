<%@page import="com.java.bank.Bank"%>
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
	<form method="get" action="SearchAccount.jsp">
		<center>
			Account No : 
			<input type="number" name="accountNo" /> <br/><br/> 
			<input type="submit" value="Search" />
		</center>
	</form>
	<%
		if (request.getParameter("accountNo")!=null) {
			int accno = Integer.parseInt(request.getParameter("accountNo"));
			BankDAO dao = new BankDAOImpl();
			Bank bank = dao.searchAccount(accno);
			if (bank!=null) {
				out.println("First Name " +bank.getFirstName() + "<br/>");
				out.println("Amount  " +bank.getAmount() + "<br/>");
			}
		}
	%>
</body>
</html>