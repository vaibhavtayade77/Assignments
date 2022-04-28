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
   <td>User Hobby ID</td>
   <td>Hobbies ID</td>
   <td>UserID</td>
  
  
 </tr>
<c:forEach var="ul" items="${ulist}">
  <tr>
    <td>${ul.uhid}</td>
    <td>${ul.hoid}</td>
    <td>${ul.userid}</td>
    
   
    <td><a href="edituserh?id=${ul.uhid}">Edit</a> || <a href="deleteuserh?id=${ul.uhid}">Delete </a></td>
  </tr>
</c:forEach>


</table>
</body>
</html>