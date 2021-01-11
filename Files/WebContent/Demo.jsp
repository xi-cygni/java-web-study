<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
From original
<!--<jsp:forward page="Forward.jsp"></jsp:forward>-->

<%

    request.getRequestDispatcher("Forward.jsp").forward(request, response);
    //forwarding request and response obj to another file 
	response.sendRedirect("Redirect.jsp");
%>
</body>
</html>