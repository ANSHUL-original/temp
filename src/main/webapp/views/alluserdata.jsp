<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
</head>
<body>
<div id="showTable">
<%@ include file="header.jsp" %>
	<div>
		<form id="userForm" method="post">
			<label> technology </label>
			<select name="uTech" id="uTech"> 
				<option value = "java" > java </option>
				<option value = "python"> python </option>
				<option value = "javascript" > javascript </option>
				<option value = "c++" > c++ </option>
 			</select>
			<input type="submit" id="submitButton" onclick="filter()" value="submit"/>
		</form>
	</div>

	<table id="showTable">
		<tr>
			<th>User id</th>
			<th>User Name</th>
			<th>Technology</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<tr>
			<c:forEach var="user" items="${list}">
				<tr>
					<td id="userId">${user.uid}</td>
					<td>${user.uName}</td>
					<td>${user.uTech}</td>
					<td><button id="updateId" type="button" onclick="up(${user.uid})">Update</button></td>
					<td><button id="deleteId" type="button" onclick="del(${user.uid})">Delete</button></td>
				<tr>		
			</c:forEach>
		</tr>
	</table>	

	<a href="/adduserpage">add user</a><br>
	<a href="/">Home</a>
	
</div>
	
	<script type="text/javascript" src="/js/main.js"></script>

</body>
</html>