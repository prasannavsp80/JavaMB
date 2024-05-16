package com.java.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmploySearchServlet
 */
public class EmploySearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmploySearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		EmployDao dao = new EmployDaoImpl();
		try {
			Employ employ = dao.searchEmployDao(Integer.parseInt(request.getParameter("empno")));
			if (employ!=null) {
				out.println("Employ Name  " +employ.getName() + "<br/>");
				out.println("Employ Gender  " +employ.getGender() + "<br/>");
				out.println("Employ Department  " +employ.getDept() + "<br/>");
				out.println("Employ Designation  " +employ.getDesig() + "<br/>");
				out.println("Employ Basic  " +employ.getBasic() + "<br/>");
			} else {
				out.println("*** Record Not Found ***");
			}
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
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
