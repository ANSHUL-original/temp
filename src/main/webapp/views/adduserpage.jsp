<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD USER PAGE</title>
</head>
<body>
	<form action="/adduser" method="post">
		User Name: <input type="text" name="uName"><br>
		Technology: <input type="text" name="uTech"><br>
		<input type="submit" value="submit"/>
	</form>
</body>
</html>