<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRATION PAGE</title>
</head>
	<style>
	
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
		 .w3-button
  
	
	
	</style>
<body >
	<form action="employeeregistr" method="post">


	
	<center>
	
	<table cellpadding=2 cellspacing=1 bgcolor="lightblue">
	
	<tr>
	<th >
	<font size=5 >Employee Registration</font>
	<br>
	<font size=2 color="red"><sup>*</sup>Required Fields</font>
	</th>
	</tr>
	
	<tr >
	<td valign="top">
	<b>User Name<sup>*</sup></b>
	<br>
	<input type="text" name="un" value="" >
	</td>
	</tr>
	
	<tr >
	<td valign="top">
	<b>First Name<sup>*</sup></b>
	<br>
	<input type="text" name="fn" value="" >
	</td>
	</tr>
	
	<tr >
	<td valign="top">
	<b>Last Name<sup>*</sup></b>
	<br>
	<input type="text" name="ln" value="">
	</td>
	</tr>
	
	<tr >
	<td valign="top">
	<b>Email-Id<sup>*</sup></b>
	<br>
	<input type="text" name="em" value="" >
	</td>
	</tr>
	
	<tr >
	<td valign="top">
	<b>Phone No<sup>*</sup></b>
	<br>
	<input type="text" name="ph" value="" >
	</td>
	</tr>
	
	<tr >
	<td valign="top">
	<b>Zip Code<sup>*</sup></b>
	<br>
	<input type="text" name="zp" value="" >
	</td>
	</tr>
	
	
	
	<tr >
	<td valign="top">
	<b>Password<sup>*</sup></b>
	<br>
	<input type="password" name="pw" value="" >
	</td>
	</tr>
	
	<tr>
	<td valign="top">
	<b>Confirm Password<sup>*</sup></b>
	<br>
	<input type="password" name="cpw" value="" >
	</td>
	</tr>
	
	<tr >
	<td align="center" >
	<input type="submit"  value="Register">
	
	</table>
	
	
	
	
	</center>
		
  





</form>
</body>
</html>