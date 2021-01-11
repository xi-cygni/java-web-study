<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.study.hubernate.entity.Files"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Listing images</title>
</head>
<body>
<table border="1">
<tr>
<th>Preview</th>
<th>Available information</th>
<th>Update information</th>
<th>Action</th>
<% 
String path = (String) request.getAttribute("path");
List<Files> files = (List<Files>) request.getAttribute("files");

for(Files file : files) {
	out.print("<tr><td><img src=\"" + path + file.getFileName() + "\" height=\"200\" width=\"255\"</tr></td>>");
}
%>
</tr>
</table>
</body>
</html>