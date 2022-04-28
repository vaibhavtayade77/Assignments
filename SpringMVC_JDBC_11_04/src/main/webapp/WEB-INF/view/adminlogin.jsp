<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>
.error { color:red;
background-color: cyan;
}
</style>
<meta charset="ISO-8859-1">
<title>Admin Registration</title>
</head>
<body>
<form:form action="SignUpSubmit" modelAttribute="objuser">
<table border="1" align="center">
 <tr>
  <td>Admin ID</td>
  <td><form:input path="adminid"/>
      <form:errors path="adminid" cssClass="error"/>
  </td>
 </tr>
<tr>
  <td>Admin Name</td>
  <td><form:input path="adminname"/>
    <form:errors path="adminname" cssClass="error"/>
  </td>
 </tr>
 <tr>
  <td>(*) Password</td>
  <td><form:password path="password"/>
   <form:errors path="password" cssClass="error"/>
  </td>
 </tr>
 
  
  <td colspan="2"><input type="submit" value="signup"/></td>
  
 </tr>
</table>
</form:form>
</body>
</html>