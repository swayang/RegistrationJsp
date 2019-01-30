package org.oecm19.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.oecm19.Database.DatabaseConnection;

public class EmployeeRegistration extends HttpServlet {
	/**
	* 
	*/
	private static final long serialVersionUID = 595451572494469564L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String usrnm = req.getParameter("un");
		String fname = req.getParameter("fn");
		String lname = req.getParameter("ln");
		String email = req.getParameter("em");
		String phone = req.getParameter("ph");
		String zip = req.getParameter("zp");
		String pasword = req.getParameter("pw");
		String cpasword = req.getParameter("cpw");

		// validate given inputs//

		if (fname.isEmpty() || lname.isEmpty() || email.isEmpty() || phone.isEmpty() || zip.isEmpty() || usrnm.isEmpty()
				|| pasword.isEmpty() || cpasword.isEmpty()) {
			RequestDispatcher rd = req.getRequestDispatcher("registration.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(req, resp);

		} else if (!cpasword.equals(pasword)) {
			RequestDispatcher rd = req.getRequestDispatcher("registration.jsp");
			out.println("<font color=red>Please Enter Correct Password</font>");
			rd.include(req, resp);
		}

		else if (zip.length() > 6 || zip.length() < 6) {
			RequestDispatcher rd = req.getRequestDispatcher("registration.jsp");
			out.println("<font color=red>Zip Code Must Be Of 6 Digits</font>");
			rd.include(req, resp);
		}

		else if (phone.length() < 10 || phone.length() > 12) {
			RequestDispatcher rd = req.getRequestDispatcher("registration.jsp");
			out.println("<font color=red>Phone Number Must Be Of 10-12 Digits</font>");
			rd.include(req, resp);
		}

		// insert the data into database//
		else {
			String inqry = "insert into registration.employeereg values(?,?,?,?,?,?,?,?)";
			try {

				PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(inqry);

				pstmt.setString(1, usrnm);
				pstmt.setString(2, fname);
				pstmt.setString(3, lname);
				pstmt.setString(4, email);
				pstmt.setString(5, phone);
				pstmt.setString(6, zip);
				pstmt.setString(7, pasword);
				pstmt.setString(8, cpasword);

				pstmt.executeUpdate();
				System.out.println("SUCCESSFULLY INSERTED");
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
			rd.include(req, resp);
		}

	}

}

