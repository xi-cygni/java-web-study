<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date, org.studyeasy.User" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jspppe</title>
</head>
<body>
<%= new Date() %>
<br/>
<% User u = new User();
   out.print(u.Demo()); %>
</body>
</html>