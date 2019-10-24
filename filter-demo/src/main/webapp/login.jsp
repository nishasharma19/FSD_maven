<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

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
<form action="login.do" method="post">
	<label for="input-1">User Name:</label>
	<input id="input-1" name="uName" placeholder="user name" type="text"/>
<br/>
<label for="input-2">Password</label>
<input id="input-2" name="uPassword" placeholder="password" required="true" type="password"/>
<br/>
<button class="btn btn-danger">LOGIN</button>

</form>
</body>
</html>