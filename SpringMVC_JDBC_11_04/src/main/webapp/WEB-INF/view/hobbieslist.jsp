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
   <td>Hobbies ID</td>
   <td>Hobbies name</td>
   
  
 </tr>
<c:forEach var="ul" items="${ulist}">
  <tr>
    <td>${ul.hoid}</td>
    <td>${ul.hobbiesname}</td>
   
   
    <td><a href="edithobbies?id=${ul.hoid}">Edit</a> || <a href="deletehobbies?id=${ul.hoid}">Delete </a></td>
  </tr>
</c:forEach>


</table>
</body>
</html>