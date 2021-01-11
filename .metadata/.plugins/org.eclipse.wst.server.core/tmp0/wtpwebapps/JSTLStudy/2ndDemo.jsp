<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String[] names = {"Aga", "Wojtek", "Madzia"};
%>

<c:set var="namesArray" value="<%=names%>"/>

${fn:length(namesArray) }
<br/>

${fn:trim("   study   . he")}

<h1> Escape XML DEMO </h1>

${fn:escapeXml("<h1> Escape XML DEMO </h1>") }

<br/>

<c:set var="we" value="hehe.org"/>

${fn:startsWith("hehe", "h") }


</body>
</html>