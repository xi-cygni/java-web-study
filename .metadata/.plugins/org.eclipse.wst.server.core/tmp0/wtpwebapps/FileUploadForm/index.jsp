<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Image upload from</title>
</head>
<body>
<form action="ImageUpload?action=filesUpload" method="post" enctype="multipart/form-data">
Select images: <input type="file" name="files" multiple/><br/>
<input type="submit" value="upload"/>
<br/> <br/>

<a href="${pageContext.request.contextPath}/ImageUpload?action=listingImages">View available images</a>

</form>
</body>
</html>