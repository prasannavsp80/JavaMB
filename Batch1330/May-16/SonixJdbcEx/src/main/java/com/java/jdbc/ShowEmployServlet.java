package com.java.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowEmployServlet
 */
public class ShowEmployServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowEmployServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =  response.getWriter();
		EmployDao dao = new EmployDaoImpl();
		try {
			List<Employ> employList = dao.showEmployDao();
			out.println("<table border='3'>");
			out.println("<tr><th>Employ No</th><th>Employ Name</th><th>Gender</th><th>Department</th><th>Designation</th><th>Basic</th></tr>");
			for(Employ employ : employList) {
				out.println("<tr><td>" +employ.getEmpno() + "</td>");
				out.println("<td>" +employ.getName() + "</td>");
				out.println("<td>" +employ.getGender() + "</td>");
				out.println("<td>" +employ.getDept() + "</td>");
				out.println("<td>" +employ.getDesig() + "</td>");
				out.println("<td>" +employ.getBasic() + "</td></tr>");
			}
			out.println("</table>");
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
