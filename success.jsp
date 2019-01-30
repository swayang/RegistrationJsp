<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SuccessPage</title>

	<style >
	
	table 
		{
			background-color:orange;
  			border-collapse: collapse;
  			width: 600;
  			height: auto;
  			border: 1px solid black;
 		 }
 		 td
 		 {
 		 width: 70%;
 		 text-align: left;
 		 }
 		 th, td
 		 {
 			 padding: 15px;
 			 border: 1px solid black;
		 }
		 tr:hover 
		 {
		  border: 1px solid black;
		 background-color:pink;
		 }
	
	
	
	</style>
</head>
<body >
	<%
	
	 String usrnm=request.getParameter("un");
	 String fname=request.getParameter("fn");
	 String lname=request.getParameter("ln");
	 String email=request.getParameter("em");
	 String phone=request.getParameter("ph");
	 String zip=request.getParameter("zp");
	 String pasword=request.getParameter("pw");
	 String cpasword=request.getParameter("cpw");
	
	
	%>
	<table>
	
	
	<tr>
	<th  >
	<font size=5 >Employee Details Based On UserName Provided</font>
	</th>
	</tr>
	
	
		
			
		<tr>
		<td>UserName :</td>
		<td><%= usrnm  %></td>
		</tr>
		
		<tr>
		<td>FirstName :</td>
		<td><%=fname %></td>
		</tr>
		
		<tr>
		<td>LastName :</td>
		<td><%=lname %></td>
		</tr>
		
		<tr>
		<td>Email-Id :</td>
		<td><%=email %></td>
		</tr>
		
		<tr>
		<td>PhoneNo :</td>
		<td><%=phone %></td>
		</tr>
		
		<tr>
		<td>ZipCode :</td>
		<td><%=zip %></td>
		</tr>
		
		<tr>
		<td>Password :</td>
		<td><%=pasword %></td>
		</tr>
		
		<tr>
		<td>ConfirmPassword :</td>
		<td><%=cpasword %></td>
		</tr>
	
	
	
	
	
	
	</table>

</html>