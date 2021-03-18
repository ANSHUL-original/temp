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
				</tr>
			</c:forEach>
		</tr>
	</table>
</body>
</html>