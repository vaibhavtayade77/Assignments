<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align="center">
 <tr>
   <td>Cid</td>
   <td>Name</td>
   <td>Email</td>
   <td>Cityaddress</td>
   <td>Contact no</td>
   <td>Action</td>
 </tr>
<c:forEach var="ul" items="${clientlist}">
  <tr>
    <td>${ul.cid}</td>
    <td>${ul.cname}</td>
    <td>${ul.email}</td>
    <td>${ul.cityaddress}</td>
    <td>${ul.contactno}</td>
    <td><a href="edit?id=${ul.cid}">Edit user</a> || <a href="delete?id=${ul.cid}">Delete user</a></td>
  </tr>
</c:forEach>


</table>
</body>
</html>