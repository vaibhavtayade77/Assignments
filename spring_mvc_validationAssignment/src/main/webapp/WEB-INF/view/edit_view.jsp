<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Client</title>
</head>


<body>
<form:form action="update" modelAttribute="objclient">
	<table width="500" border="1">
	  <tr>
	   <td>Edit Client id</td>
	   <td><input type="text" name="cid" th:field="*{cid}" /></td>
	  </tr>
	  <tr>
	   <td>Edit Name</td>
	   <td><input type="text" name="cname" th:field="*{cname}" /></td>
	  </tr>
	   <tr>
	   <td>Edit Password</td>
	   <td><input type="password" name="password" th:field="*{password}" /></td>
	  </tr>
	    <tr>
	   <td>Edit Email</td>
	   <td><input type="email" name="email" th:field="*{email}" /></td>
	  </tr>
	   <tr>
	   <td>Edit City Address</td>
	   <td><input type="text" name="cityaddress" th:field="*{cityaddress}" /></td>
	  </tr>
	   <tr>
	   <td>Edit Contact</td>
	   <td><input type="text" name="contactno" th:field="*{contactno}" /></td>
	  </tr>
	  <tr>
	   <td><input type="submit" value="update"></td>
	  </tr>
	</table>
</form:form>
</body>
</html>