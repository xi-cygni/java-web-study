<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get property</title>
</head>
<body>
<jsp:useBean id="user" class="org.studyeasy.beanss.User" scope="request"></jsp:useBean>
First name: <jsp:getProperty property="firstName" name="user" /> <br/>
Last name: <jsp:getProperty property="lastName" name="user" />
</html>