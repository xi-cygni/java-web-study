<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page import="java.util.Arrays" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile form</title>
</head>
<body>
	<form:form action="/ProcessUserForm" modelAttribute="user"> 
		Name: <form:input path="firstName"/> <br/><br/>
		Age: <form:select type="number" path="age">
		 		<form:options items="${user.ageOptions}"/>
		 	 </form:select><br/><br/>
		City: <form:input path="city"/> <br/><br/>
		Gender: <form:radiobuttons path="gender" items="${gender}"/><br/><br/>
		
		<input type="submit" value="submit"/>
	</form:form> 
</body>
</html>