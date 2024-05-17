package com.java.bank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchAccountServlet
 */
public class SearchAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accountNo = Integer.parseInt(request.getParameter("accountNo"));
		BankDao dao = new BankDaoImpl();
		PrintWriter out = response.getWriter();
		try {
			Bank bank = dao.searchAccount(accountNo);
			if (bank!=null) {
				out.println("Account No   " +bank.getAccountNo() + "<br/>");
				out.println("First Name  " +bank.getFirstName() + "<br/>");
				out.println("Last Name  " +bank.getLastName() + "<br/>");
				out.println("City  " +bank.getCity() + "<br/>");
				out.println("State  " +bank.getState() + "<br/>");
				out.println("Amount  " +bank.getAmount() + "<br/>");
				out.println("Cheq Facility  " +bank.getCheqFacil() + "<br/>");
				out.println("Account Type   " +bank.getAccountType() + "<br/>");				
			} else {
				out.println("Invalid Bank Account No...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
