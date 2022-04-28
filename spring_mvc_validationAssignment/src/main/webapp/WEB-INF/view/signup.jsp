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
<title>Client Registration</title>
</head>
<body>
<form:form action="SignUpSubmit" modelAttribute="objclient">
<table border="1" align="center">
 <tr>
  <td>Client Name</td>
  <td><form:input path="cname"/>
      <form:errors path="cname" cssClass="error"/>
  </td>
 </tr>
<tr>
  <td>Client Email</td>
  <td><form:input path="email"/>
    <form:errors path="email" cssClass="error"/>
  </td>
 </tr>
 <tr>
  <td>(*) Password</td>
  <td><form:password path="password"/>
   <form:errors path="password" cssClass="error"/>
  </td>
 </tr>
 <tr>
  <td>City Address</td>
  <td><form:textarea path="cityaddress"/>
     <form:errors path="cityaddress" cssClass="error"/>
  </td>
 </tr>
 <tr>
  <td>Contact No</td>
  <td><form:input path="contactno"/>
     <form:errors path="contactno" cssClass="error"/>
  </td>
 </tr>
  <tr>
  
  <td colspan="2"><input type="submit" value="signup"/></td>
 </tr>
</table>
</form:form>
</body>
</html>