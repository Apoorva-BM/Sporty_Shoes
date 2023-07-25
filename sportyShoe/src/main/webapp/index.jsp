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
		<h1>Welcome to Sporty Shoe</h1>
		<form method="post" action="./login">
			<input type="text" name="username" placeholder="Username"><br>
			<input type="password" name="password" placeholder="Password"><br>
			<input type="submit" value="Submit"><br>
		</form>
		<h3>Or, Register here!!</h3>
		<a href="register.jsp">Register</a>
		<br><br>
		<h3>Forgot Password??</h3>
		<a href="password.jsp">Change Password</a>
	</div>
</body>
</html>