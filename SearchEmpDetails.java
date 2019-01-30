package org.oecm19.Controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.oecm19.Database.DatabaseConnection;

import org.oecm19.Model.Student;

public class SearchEmpDetails extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String userName = req.getParameter("sr");

		String reqry = "select * from registration.employeereg where username=" + "'" + userName + "'";
		try {
			PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(reqry);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastname");
				String emailId = rs.getString("email");
				String phNo = rs.getString("phoneno");
				String zipCode = rs.getString("zipcode");
				String pasWord = rs.getString("password");
				String cpasWord = rs.getString("confirmpassword");

				Student student1 = new Student(userName, firstName, lastName, emailId, phNo, zipCode, pasWord,
						cpasWord);
				req.setAttribute("studentData", student1);
				RequestDispatcher rd = req.getRequestDispatcher("searchdetails.jsp");
				rd.forward(req, resp);
			} else {

				RequestDispatcher rd = req.getRequestDispatcher("search.jsp");
				out.println("<font color=red>INVALID INPUTS</font>");
				rd.include(req, resp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

