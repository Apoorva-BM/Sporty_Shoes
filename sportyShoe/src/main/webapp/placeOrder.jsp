<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order</title>
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
<div>
<h1>Payment Details</h1>

    <form action="./placeOrderServlet" method="post">
        <label>Card Number:</label>
        <input type="text" name="cardNumber" required><br>
        <label>Expiration Date:</label>
        <input type="text" name="expirationDate" required><br>

        <input type="submit" value="Submit Payment">
    </form>
    
     <% if (request.getAttribute("paymentProcessed") != null && (Boolean) request.getAttribute("paymentProcessed")) { %>
        <h2>Payment Success</h2>

        <p>Payment was successful!</p>

    <% } %>

</div>
</body>
</html>