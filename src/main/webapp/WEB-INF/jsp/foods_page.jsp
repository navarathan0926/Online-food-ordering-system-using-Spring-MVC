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
	<div class="heading">
		<h3>Green kitchen</h3>
	</div>
	<section class="products">

		<h1 class="caption">Tasty foods</h1>
		<div class="box-container">
		<c:forEach var="food" items="${allFoods}">
			
				<form action="" method="post" class="box">
					<img src="<c:url value="/resources/images/${food.image}"/>"
						alt="${food.image}" width="200" height="200">
					<div class="name">${food.foodName}</div>
					<div class="price">Rs ${food.price} /-</div>
					<input type="hidden" name="food_name" value="${food.foodName}">
					<input type="hidden" name="food_price" value="${food.price}">
					<input type="hidden" name="food_image" value="${food.image}">
					<a href="customize" class="delete-btn">Customize</a>
					<form action="" method="post">
						<div class="rateyo" id="rate" data-rateyo-rating="4"
							data-rateyo-num-stars="5" data-rateyo-score="3"></div>

						<span class='result'>0</span> <input type="hidden" name="rating">
						<input type="hidden" name="food_name" value="${food.foodName}">
						<div class="inputBox">
							<input type="submit" name="add" value="Rating" class="rate-btn">
						</div>

					</form>

				</form>
		</c:forEach>

		</div>
	</section>


	<%@include file="footer.jsp"%>
</body>
</html>