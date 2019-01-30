package org.oecm19.Controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.oecm19.Database.DatabaseConnection;

public class LoginController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String uname = req.getParameter("un");
		String pasword = req.getParameter("pwd");

		// checking with database//
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String qry = "select * from registration.login where username=" + "'" + uname + "'" + "and password=" + "'"
				+ pasword + "'";

		try {
			pstmt = DatabaseConnection.getConnection().prepareStatement(qry);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (uname.equalsIgnoreCase(rs.getString("username"))
						&& pasword.equalsIgnoreCase(rs.getString("password"))) {
					System.out.println("condition true");
					out.println("welcome  " + uname + "your entered password is " + pasword);
					HttpSession session = req.getSession(true);
					session.setAttribute("user", uname);
					session.setAttribute("password", pasword);
					resp.sendRedirect("home.jsp");

				}
			} else if (uname.length() == 0 && pasword.length() != 0) {
				RequestDispatcher rd = req.getRequestDispatcher("login.html");
				out.println("<font color=red> PLEASE ENTER USERNAME </font>");
				rd.include(req, resp);
			} else if (uname.length() != 0 && pasword.length() == 0) {
				RequestDispatcher rd = req.getRequestDispatcher("login.html");
				out.println("<font color=red> PLEASE ENTER PASSWORD </font>");
				rd.include(req, resp);
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("login.html");
				out.println("<font color=red> INVALID ENTRY </font>");
				rd.include(req, resp);
			}

		} catch (SQLException e) {
			System.out.println("print stack....");
			e.printStackTrace();

		}

	}

}

