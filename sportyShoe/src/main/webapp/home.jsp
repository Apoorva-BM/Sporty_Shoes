<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import ="java.util.Arrays" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sporty Shoes</title>
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
<h2>${msg}</h2>
    <h1>Welcome to our Sporty Shoe Store</h1>
    
    <h2>Products</h2>
    <table>
        <tr>
            <th>Name</th>
            <th>Category</th>
            <th>Brand</th>
            <th>Price</th>
            <th>Image</th>
            <th>Cart</th>
        </tr>
        <c:forEach items="${sessionScope.products}" var="product">
            <tr>
                <td><a href="${product.productName}">${product.productName}</a></td>
                <td>${product.category}</td>
                <td>${product.brand}</td>
                <td>${product.price}</td>
                <td><img src="${product.imageUrl}" alt="${product.productName}" width="100" height="100"></td>
                <td> <form action="./addToCartServlet" method="post">
                        <input type="hidden" name="productName" value="${product.productName}">
                        <input type="text" name="quantity" placeholder="Quantity">
                        <button type="submit">Add to Cart</button>
                    </form></td>
            </tr>
        </c:forEach>
    </table>
    <form action="./viewCartServlet" method="get">
    <button type="submit">View Cart</button>
   </form>
   <form action="./placeOrderServlet" method="post">
    <button type="submit">Place Order</button>
   </form>
	</div>
	<script>
        // Function to call the ProductController servlet using AJAX
        function fetchProducts() {
            var xhr = new XMLHttpRequest();
            xhr.open('GET', 'ProductController', true);
            xhr.onreadystatechange = function () {
                if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
                    // Reload the page to display the updated product data
                    location.reload();
                }
            };
            xhr.send();
        }

        // Call the fetchProducts function when the page loads
        fetchProducts();
    </script>
</body>
</html>