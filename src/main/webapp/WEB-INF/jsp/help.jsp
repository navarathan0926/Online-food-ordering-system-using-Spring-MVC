<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div class="heading"></div>
<h1>${msg}</h1>
	<section class="contact">

		<form action="message" method="post">
			<h3>Report issues</h3>
			<textarea name="message" class="box" placeholder="Enter your message"
				id="" cols="40" rows="10"></textarea>

			<input type="submit" value="send message" name="send"
				class="home-btn">
		</form>

		<table>
			<c:forEach var="help" items="${helping}">

				<tr id="user">
					<td>${help.user_name}</td>
					<td>
						${help.message}
					</td>
				</tr>
				<tr id="admin">
					<td>
						<p>Admin</p>
					</td>
					<td>
						${help.reply}
					</td>
				</tr>

			</c:forEach>

		</table>

	</section>
	<%@include file="footer.jsp"%>
</body>
</html>