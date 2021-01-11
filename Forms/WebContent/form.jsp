<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form demo</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Controller" method="post"> 
<!-- required means need input, checked that it will be checked by default -->
	Full name: <input type="text" name="name" required><br/>
	Gender: <input type="radio" name="gender" value="male" checked="checked"> Male
			<input type="radio" name="gender" value="female"> Female <br/>
	Known languages: <input type="checkbox" name="language" value="english"> English
					 <input type="checkbox" name="language" value="polish"> Polish
					 <input type="checkbox" name="language" value="russian"> Russian
					 <input type="checkbox" name="language" value="french"> French <br/>
	Country: <select name="country">
			 <option value="poland">Poland</option>
			 <option value="england">England</option>
			 <option value="russia">Russia</option>
			 <option value="france">France</option>
	 		 <option value="usa">USA</option>
	</select>
	<input type="submit" value="Submit">
</form>
</body>
</html>