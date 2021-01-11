<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix = "x" uri = "http://java.sun.com/jsp/jstl/xml" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XML fun</title>
</head>
<body>
<c:import url="/Users.xml" var="XMLFile"/>
<x:parse xml="${XMLFile}" var="XMLdoc"></x:parse>
<!--  first name: -->
<x:out select="$XMLdoc/users/user/name"></x:out>
<!--  2nd name: -->
<x:out select="$XMLdoc/users/user[2]/name"></x:out>
<br/>

<c:import url="/Users.xml" var="XMLFile" />
<x:parse xml="${XMLFile}" var="XMLdoc" />

<table border=1>
	<x:forEach select="$XMLdoc/users/user">
	<tr>
		<x:if select="age < 30 ">
		
		<td><x:out select="name"/> </td>
		<td><x:out select="gender"/> </td>
		<td><x:out select="age"/> </td>
		
		</x:if>
	</tr>
	</x:forEach>
</table>

<br/>
<br/>

<table border=1>
	<x:forEach select="$XMLdoc/users/user">
	<tr>
	
	<x:choose>
		<x:when select="gender='Male'">
	
		<td><x:out select="name"/> </td>
		<td><x:out select="gender"/> </td>
		<td><x:out select="age"/> </td>
		
	</x:when>
	<x:otherwise>
	
		<td><x:out select="name"/> </td>
		<td><x:out select="gender"/> </td>
		<td><x:out select="age"/> </td>
		
	</x:otherwise>
	</x:choose>
	
	</tr>
	</x:forEach>
</table>

</body>
</html>