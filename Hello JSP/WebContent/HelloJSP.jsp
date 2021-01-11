<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
	<h1> Hello JSP </h1>
	<%! public int x = 22; %> 
	<%= x %>
<br/>
	<%= new Integer(2137) %>
<br/>
	<%= new java.util.Date() %>
<br/>
	<%= 21*37 %>
<br/>
	<%= 2>1 %>
<br/>
<%
	int x = 45;
	out.print(x + "<br/>" );
	
	
	if( x > 44) out.println("Greater than 44");
%>
<%= x %>

<%! int a = 33; // only devlarations without access specifiers %>
 
<%! String message() {
		return " <br/> I like trains <br/>";
	}
%>
 
<%= message() %>
 
 
 
 
 
</body>
</html>