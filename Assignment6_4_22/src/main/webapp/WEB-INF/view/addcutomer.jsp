<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Cutomers page</title>
</head>
<body>
<form action="custad" method="post">
	<table align="center">
	 <tr>
	   <td>Customer id</td>
	   <td><input type="text" name="cusid"></td>	   
	 </tr>
	<tr>
	   <td>Customer Name</td>
	   <td><input type="text" name="customername"></td>	   
	 </tr>
	 <tr>
	   <td>Customer email</td>
	   <td><input type="text" name="emailid"></td>	   
	 </tr>
	 <tr>
	   <td>Customer Address</td>
	   <td><input type="text" name="address"></td>	   
	 </tr>
	 <tr>
	   <td>Customer mobile no</td>
	   <td><input type="text" name="mobileno"></td>	   
	 </tr>
	 <tr>	    
	   <td colspan="2"><input type="submit" value="Submit"></td>	   
	 </tr>
	</table>
</form>
</body>
</html>