<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Another Page</title>
</head>
<body>
<%
String url = "<a href='http://google.com'>Home</a>";
ServletContext context = getServletContext();

//available throughout the app
context.setAttribute("Url", url);

// if session destroyed, so does this val
session.setAttribute("author", "Aga");
%>
${author}
${Url}
</body>
</html>