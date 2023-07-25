<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
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
<h1>Register here!!</h1>
<form action="./register" method="post">
<input type="text" name="firstName" placeholder="FirstName"><br>
		<input type="text" name="lastName" placeholder="LastName"><br>
		<input type="text" name="username" placeholder="Username"><br>
		<input type="email" name="email" placeholder="Email"><br>
		<input type="text" name="phoneNumber" placeholder="PhoneNumber"><br>
		<input type ="text" name="street" placeholder="Street"><br>
		<input type ="text" name="city" placeholder="City"><br>
		<input type ="text" name="state" placeholder="State"><br>
		<input type ="text" name="country" placeholder="Country"><br>
		<input type ="text" name="postalCode" placeholder="PostalCode"><br>
			<input type="password" name="password" placeholder="Password"><br>
		<input type="submit" value="submit">
	</form>
	</div>
</body>
</html>