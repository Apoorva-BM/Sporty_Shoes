<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
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
<h1>Enter your UserName and MailID</h1>
		<form method="post" action="./changepwd">
			<input type="text" name="username" placeholder="Username"><br>
			<input type="text" name="userEmail" placeholder="userEmail"><br>
			<input type="submit" value="Submit"><br>
		</form></div>
</body>
</html>