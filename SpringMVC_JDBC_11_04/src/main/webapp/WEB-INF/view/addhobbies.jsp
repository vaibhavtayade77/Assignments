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
<form action="SubmitH" method="post">
<table align="center">
<tr>
 <td>Enter Hobbies ID</td>
 <td><input type="text" name="hoid"></td>
</tr>
<tr>
 <td>Enter Hobbiesname</td>
 <td><input type="text" name="hobbiesname"></td>
</tr>

<tr>
 <td colspan="2" align="center">
  <input type="submit" value="signup"></td>
</tr>
</table>
</form>
</body>
</html>