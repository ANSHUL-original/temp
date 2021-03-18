<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<table>
		<tr>
			<c:forEach var="newlist" items="${ list }">
				<tr>
					<td>${ newlist[0] }</td>
					<td>${ newlist[1] }</td>
					<td>${ newlist[2] }</td>
					<td>${ newlist[3] }</td>
					<td>${ newlist[4] }</td>
					<td>${ newlist[5] }</td>
					<td>${ newlist[6] }</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
</body>
</html>