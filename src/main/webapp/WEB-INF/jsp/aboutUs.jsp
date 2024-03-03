<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About us page</title>
</head>
<body>
	<div class="heading"></div>
	<section class="about_us">

		<div class="flex">
			<div class="content">
				<h3>about us</h3>
				<p>Our restaurant is very famous one in the hometown.Here we
					serve healthy advised food in healthy advised cooking manner. We
					will deliver the food items which you preferred within the time
					limit.You can make the pre orders for any functions for a big
					amount of people.Join with us in your precious occations.</p>
				<a href="#" class="home-btn">contact us</a>
			</div>
		</div>

	</section>
	<section class="message">
		<h1 class="caption">Reviews</h1>
		<div class="box-container">
			<c:forEach var="feed" items="${feedbacks}">
				<div class="box">
					<img src="<c:url value="/resources/images/user.png"/>" width="50"
						height="50"></img>

					<p id="head">
						<span> ${feed.customer_name} </span>
					</p>
					<p>
						<span> ${feed.feedback} </span>
					</p>
					<div class="rateyo" id="rate" data-rateyo-rating="${feed.rating}"
						data-rateyo-num-stars="5" data-rateyo-score="3"></div>

				</div>
			</c:forEach>
		</div>
	</section>







	<%@include file="footer.jsp"%>

</body>
</html>