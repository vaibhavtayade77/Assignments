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
<form action="Submit" method="post">
<table align="center">
<tr>
 <td>Enter User ID</td>
 <td><input type="text" name="userid"></td>
</tr>
<tr>
 <td>Enter First Name</td>
 <td><input type="text" name="fname"></td>
</tr>
<tr>
 <td>Enter Last Name</td>
 <td><input type="text" name="lname"></td>
</tr>
<tr>
 <td>Enter Email </td>
 <td><input type="email" name="email"></td>
</tr>
<tr>
 <td>Enter *Password</td>
 <td><input type="password" name="password"></td>
</tr>
<tr>
 <td>Enter Gender</td>
 <td><input type="text" name="gender"></td>
</tr>
<tr>
 <td>Enter DOB</td>
 <td><input type="text" name="dob"></td>
</tr>
<tr>
 <td>Enter DOR</td>
 <td><input type="text" name="dor"></td>
</tr>
<tr>
 <td>Enter Sec_Question</td>
 <td><input type="text" name="sec_question"></td>
</tr>
<tr>
 <td>Enter Sec_Answer</td>
 <td><input type="text" name="sec_answer"></td>
</tr>
<tr>
 <td colspan="2" align="center">
  <input type="submit" value="signup"></td>
</tr>
</table>
</form>
</body>
</html>