<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set property</title>
</head>
<body>
<jsp:useBean id="user" class="org.studyeasy.beanss.User" scope="request"></jsp:useBean>
<jsp:setProperty property="firstName" name="user" value="Twoja"/>
<jsp:setProperty property="lastName" name="user" value="Stara"/>

First name: <jsp:getProperty property="firstName" name="user"/>
Last name: <jsp:getProperty property="lastName" name="user"/>

Values have been set <br/>

<%
// forwarding our request to be able to see it in getreqprop.jsp
	request.getRequestDispatcher("GetRequestProperty.jsp").forward(request, response);
%>
</body>
</html>