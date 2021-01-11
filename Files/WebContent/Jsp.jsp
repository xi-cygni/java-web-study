<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>
<!-- we can add static file, content copied and pasted on the webpage -->
<%@ include file="file1.txt" %>
<br/>
<!-- For dynamic content, after refreshing a fresh call will be fetched -->
<jsp:include page="file2.txt"></jsp:include>

</body>
</html>