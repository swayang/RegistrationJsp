<%@page import="org.oecm19.Model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SEARCH RESULT</title>

<style>
table {
	background-color: orange;
	border-collapse: collapse;
	width: 600;
	height: auto;
	border: 1px solid black;
}

td {
	width: 70%;
	text-align: left;
}

th, td {
	padding: 15px;
	border: 1px solid black;
}

tr:hover {
	border: 1px solid black;
	background-color: pink;
}
</style>
</head>
<body>
	<%
		Student std = (Student) request.getAttribute("studentData");
		String usrnm = std.getUserName();
		String fname = std.getFirstName();
		String lname = std.getLastName();
		String email = std.getEmailId();
		String phone = std.getPhNo();
		String zip = std.getZipCode();
	%>
	<table>


		<tr>
			<th><font size=5>Employee Details Based On UserName
					Provided</font></th>
		</tr>




		<tr>
			<td>UserName :</td>
			<td><%=usrnm%></td>
		</tr>

		<tr>
			<td>FirstName :</td>
			<td><%=fname%></td>
		</tr>

		<tr>
			<td>LastName :</td>
			<td><%=lname%></td>
		</tr>

		<tr>
			<td>Email-Id :</td>
			<td><%=email%></td>
		</tr>

		<tr>
			<td>PhoneNo :</td>
			<td><%=phone%></td>
		</tr>

		<tr>
			<td>ZipCode :</td>
			<td><%=zip%></td>
		</tr>








	</table>
</html>