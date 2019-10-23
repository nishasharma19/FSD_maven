<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Shopping Cart</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Welcome!</h1>
		<h3>Login to continue</h3>
		<div>
			<form action="login.do" method="post" class="form-group p-2 border border-primary">
			<h3>Enter the details</h3>
			<div>
			<label for="username">UserName:</label>
			<input type="text" name="username" id="username" class="form-control"> 
			</div>
			<div>
			<label for="password">Password:</label>
			<input type="password" name="password" id="password" class="form-control"> 
			</div>
			<div class="mt-3"><label></label>
			<button class="btn btn-primary  from-control" type="submit">Login</button>
			</div>
			</form>
		</div>
	</div>
</body>
</html>