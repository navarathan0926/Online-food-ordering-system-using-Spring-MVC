	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="form1">

   <form action="register" method="post">
      <h3>register now</h3>
      <input type="text" name="username" placeholder="enter your name" class="box" >
      <input type="text" name="mobile" placeholder="enter your mobile number" class="box">
      <input type="email" name="email" placeholder="enter your email" class="box">
      <input type="password" name="password" placeholder="enter your password"  class="box">
      <input type="hidden" name="user_type" value="user" />
      <input type="submit" name="submit" value="Register" class="home-btn">
    <p>already have an account? <a href="${pageContext.request.contextPath}/user/login">login now</a></p>
   </form>
</div>
	
	<%@include file="footer.jsp"%>
</body>
</html>