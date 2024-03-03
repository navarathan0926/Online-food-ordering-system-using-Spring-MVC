<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

<link href="<c:url value="/resources/css/style19.css" />" rel="stylesheet">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>home</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<link rel="stylesheet"
	href="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />">
<link rel="stylesheet"
	href="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/rateYo/2.3.2/jquery.rateyo.min.css" />">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/rateYo/2.3.2/jquery.rateyo.min.css">

</head>
<body>
	<header class="header">
		<div class="header-2">
			<div class="flex">

				<img src="<c:url value="/resources/images/green.png"/>" height="60"
					width="100">
				<nav class="navbar">

				<a href="${pageContext.request.contextPath}/food/special" title="to home page">Home</a>
					<a href="${pageContext.request.contextPath}/feedback/all">About Us</a>
					<a href="${pageContext.request.contextPath}/food/all">Foods</a>
					<a href="${pageContext.request.contextPath}/feedback/feed">Feedback</a>
					
					<a href="${pageContext.request.contextPath}/help/inf">Help</a>
					
					<a href="${pageContext.request.contextPath}/user/logout">Logout</a>
				</nav>
			</div>

		</div>

	</header>
</body>