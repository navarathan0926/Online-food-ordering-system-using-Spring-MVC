<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css/style19.css" />" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">


<title>Insert title here</title>
</head>
<body>
	<div class="form1">
		<form action="home" method="post">
			  <h3>login now</h3>
		      <input type="text" name="username" placeholder="Enter username"  class="box">
		      <input type="password" name="password" placeholder="enter your password" class="box">
		      <input type="submit" name="submit" value="login now" class="home-btn">
		</form>
	</div>

</body>
</html>