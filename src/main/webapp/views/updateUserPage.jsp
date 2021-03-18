<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update User</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<form action="/updateUser" method="post">
		<input type="hidden" name="uid" value="${user.uid }">
		<label>User Name: </label>
		<input type="text" name="uName" value="${user.uName}"><br>
		<label>Technology: </label>
		<input type="text" name="uTech" value="${user.uTech }"><br>
		<input type="submit" name="submit" value="submit">
	</form>
</body>
</html>