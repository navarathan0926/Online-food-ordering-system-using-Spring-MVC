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
	<div class="logi"></div>




	<section class="home">

		<div class="content">
			<h3>Take a bite feel the taste</h3>

			
		</div>

	</section>

	<section class="products">

		<h1 class="caption">Special foods of today</h1>

		<div class="box-container">
			<c:forEach var="food" items="${specialFood}">
				<form action="" method="post" class="box">
					<img src="<c:url value="/resources/images/${food.image}"/>"
						alt="${food.image}" width="200" height="200">
					<div class="name">${food.foodName}</div>
					<div class="price">${food.price}/-</div>

					<input type="hidden" name="product_name" value="${food.foodName}">
					<input type="hidden" name="product_price" value="${food.price}">
					<input type="hidden" name="product_image" value="${food.image}">

				</form>
			</c:forEach>
		</div>


		<div class="load-more" style="margin-top: 20px; text-align: center">
			<a href="all" class="home-btn">View more</a>
		</div>
		<h1 class="caption">Must Tryable Foods</h1>


		<div class="box-container">
			<c:forEach var="food" items="${mustFood}">
				<form action="" method="post" class="box">
					<img src="<c:url value="/resources/images/${food.image}"/>"
						alt="${food.image}" width="200" height="200">
					<div class="name">${food.foodName}</div>
					<div class="price">Rs. ${food.price} /-</div>

					<input type="hidden" name="product_name" value="${food.foodName}">
					<input type="hidden" name="product_price" value="${food.price}">
					<input type="hidden" name="product_image" value="${food.image}">

					<div class="rateyo" id="rate" data-rateyo-rating="${food.rating}"
						data-rateyo-num-stars="5" data-rateyo-score="3"></div>



				</form>
			</c:forEach>
		</div>

		<div class="load-more" style="margin-top: 20px; text-align: center">
			<a href="all" class="home-btn">View more</a>
		</div>

	</section>
	<%@include file="footer.jsp"%>
</body>
</html>
