<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>user name</th>
			<th>email</th>
		</tr>
		<c:forEach items="${allUser}" var="user">
			<tr>
				<td>${user.username}</td>
				<td>${user.email}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>