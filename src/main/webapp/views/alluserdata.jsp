<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
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
			<%--  <label>User Name	</label>
			<select name="uName" id="uName">
				<c:forEach var="namelist" items="${ namelist }">
					<option value="${ namelist }">${ namelist }</option>
				</c:forEach>
			</select> --%>
			<input type="submit" id="submitButton" value="submit"/> 
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
				<td>${user.uid}</td>
				<td>${user.uName}</td>
				<td>${user.uTech}</td>
				<td><a href="updateuser/${user.uid}">update</a></td>
				<td><a href="deleteuser/${user.uid}">delete</a></td>
			<tr>		
		</c:forEach>
	</tr>
	</table>	
	<div id="for-printing"></div>
	
	<a href="/adduserpage">add user</a><br>
	<a href="/">Home</a>

	<script type="text/javascript">
		$(document).ready(
				function(){
					$("#userForm").submit(
						function(event){
							event.preventDefault();
					        fire_ajax_submit();
						});
				});
		function fire_ajax_submit(){
			var search = $("#uTech").val();

		    $("#submitButton").prop("enable", true);

		    $.ajax({
		        type: "POST",
		        contentType: "application/json",
		        url: "${pageContext.request.contextPath}/filterTechnology/"+search,
		        data: JSON.stringify(search),
		        success: function (data) {
/*                  alert(search);
                 alert(url); */
		            var data = "<h4>Ajax Responsewweeeee</h4>"
		                + data;
		            $("#showTable").html(data);

		            console.log("SUCCESS : ", json);
		            $("#submitButton").prop("disabled", false);

		        },
		        error: function (e) {
		            var json = "<h4>Ajax Response</h4><pre>"
		                + e.responseText + "</pre>";
		            $("#showTable").html(json);

		            console.log("ERROR : ", e);
		            $("#submitButton").prop("disabled", false);

		        }
		        
		    });
		}
	
	</script>

</body>

</html>