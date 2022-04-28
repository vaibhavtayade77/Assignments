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
   <td>Userid</td>
   <td>First name</td>
   <td>Last name</td>
   <td>Email</td>
   <td>Password</td>
   <td>Gender</td>
   <td>DOB</td>
   <td>DOR</td>
   <td>Sec_question</td>
   <td>Sec_answer</td>
  
 </tr>
<c:forEach var="ul" items="${ulist}">
  <tr>
    <td>${ul.userid}</td>
    <td>${ul.fname}</td>
    <td>${ul.lname}</td>
    <td>${ul.email}</td>
    <td>${ul.password}</td>
    <td>${ul.gender}</td>
    <td>${ul.dob}</td>
    <td>${ul.dor}</td>
    <td>${ul.sec_question}</td>
    <td>${ul.sec_answer}</td>
   
    <td><a href="edituser?id=${ul.userid}">Edit</a> || <a href="deleteuser?id=${ul.userid}">Delete </a></td>
  </tr>
</c:forEach>


</table>
</body>
</html>