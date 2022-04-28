<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Item List</title>
</head>
<body>
<table align="center">
 <tr>
   <td>Item No</td>
   <td>Item Name</td>
   <td>Item Category</td>
 
 </tr>
<c:forEach var="ul" items="${ilist}">
  <tr>
    <td>${ul.i_no}</td>
    <td>${ul.i_name}</td>
    <td>${ul.cat_name}</td>
   
    <td><a href="edititem?id=${ul.i_no}">Edit Item</a> 
  </tr>
</c:forEach>


</table>
</body>
</html>