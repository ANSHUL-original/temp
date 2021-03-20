<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>ADD USER PAGE</title>
</head>
<body>
<div id="showTable">
	<form id="userForm" method="post">
		User Name:  <input id="uName" type="text" name="uName"><br>
		Technology: <input id="uTech" type="text" name="uTech"><br>
		<button id="submitButton" type="button" onclick="add()">submit</button>
	</form>
</div>	
</body>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript" src="/js/main.js"></script>
</html>