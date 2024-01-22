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
	<section class="contacts">
		<form action="sent" method="post">
		<div class="inputBox">
        <label>Name</label><br>
        <input type="text" name="customer_name"  size="100">
        </div>
        <div class="inputBox">
        <label>Phone Number</label><br>
        <input type="text" name="phonenumber"  size="100">
        </div>
        <div class="inputBox">
        <label>Feedback</label><br>
        <input type="text" name="feedback"  size="100">
        </div>
        
        <div class="inputBox"><input type="submit" class="home-btn" value="Send feedback" /> </div>
			
		</form>
	</section>
	<%@include file="footer.jsp"%>
</body>
</html>