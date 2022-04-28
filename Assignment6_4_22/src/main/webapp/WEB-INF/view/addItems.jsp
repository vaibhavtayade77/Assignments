<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Items</title>
</head>
<body>
<form action="itemad" method="post">
	<table align="center">
	 <tr>
	   <td>Item id</td>
	   <td><input type="text" name="itemid"></td>	   
	 </tr>
	<tr>
	   <td>Item catid</td>
	   <td><input type="text" name="catid"></td>	   
	 </tr>
	 <tr>
	   <td>Item name</td>
	   <td><input type="text" name="itemname"></td>	   
	 </tr>
	 <tr>
	   <td>Item price</td>
	   <td><input type="text" name="price"></td>	   
	 </tr>
	 <tr>
	   <td>Item DOM</td>
	   <td><input type="text" name="dom"></td>	   
	 </tr>
	 <tr>
	   <td>Item DOE</td>
	   <td><input type="text" name="doe"></td>	   
	 </tr>
	 <tr>	    
	   <td colspan="2"><input type="submit" value="Submit"></td>	   
	 </tr>
	</table>
</form>
</body>
</html>