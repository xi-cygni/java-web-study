<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<style>
		h1 {text-align: center;}
		p {text-align: center;}
		div {text-align: center;}
	</style>
	
	<meta charset="UTF-8">
	<title>Beer advice</title>
</head>
<body>
	<h1> Beer Selection Page</h1>

	Select beer characteristics: <br/>
	<!-- <form action="<%=request.getContextPath()%>/BeerController" method="post"> -->
	<form action=SelectBeer.do method="post">
	Color: 
	<select name="color">
		<option value="light">Light</option>
		<option value="dark">Dark</option>
	</select>
	<input type="submit" value="Submit">
	</form>
</body>
</html>


