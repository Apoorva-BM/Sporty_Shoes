<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import ="java.util.Arrays" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart Item</title>
<style>
body {
   background-image:url("https://i.pinimg.com/564x/03/d1/a3/03d1a39ae2b5c4fe83277af2f8de5275.jpg");  
    background-size: cover;
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100vh;
	margin: 0;
}

.form-container {
	width: 400px;
	padding: 20px;
	background-color: #f2f2f2;
	border: 1px solid #ccc;
	border-radius: 5px;
}
</style>
</head>
<body>
<div class="form-container">
<table>
        <tr>
            <th>Name</th>
            <th>Quantity</th>
        </tr>
        <c:forEach items="${sessionScope.cartItem}" var="cartItem">
         <c:forEach items="${cartItem.product}" var="product">
    <tr>
            <td>${product.productName}</td>
            <td>${cartItem.quantity}</td>
    </tr>
    </c:forEach>
</c:forEach>
    </table>
    <form action="./placeOrderServlet" method="post">
                    <input type="hidden" name="productId" value="${product.productId}">
                    <button type="submit">Place Order</button>
                </form>
</div>
</body>
</html>