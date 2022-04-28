<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html >
<head>
<meta charset="ISO-8859-1">
<title>Author Registration</title>
</head>
<body>
<form action="SubmitUH" method="post">
<table align="center">
<tr>
 <td>Enter UserHobbies ID</td>
 <td><input type="text" name="uhid"></td>
</tr>
<tr>
 <td>Enter Hobbiesid</td>
 <td><input type="text" name="hoid"></td>
</tr>
<tr>
 <td>Enter User id</td>
 <td><input type="text" name="userid"></td>
</tr>
<tr>
 <td colspan="2" align="center">
  <input type="submit" value="signup"></td>
</tr>
</table>
</form>
</body>
</html>