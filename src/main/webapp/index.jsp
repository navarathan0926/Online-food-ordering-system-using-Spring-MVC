<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css/style19.css" />"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">


<title>Insert title here</title>
</head>
<body>
	<section class="box-container">


		<div class="form1">
			<div class="box-container">
				<table>
					<tr>
						<td><a class="home-btn"
							href="${pageContext.request.contextPath}/user/login">For
								Login</a></td>
						
					</tr>
				</table>

			</div>
		</div>
	</section>
	
	
	<%@include file="/WEB-INF/jsp/footer.jsp"%>
</body>
</html>