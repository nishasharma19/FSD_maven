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
	<style>
	tr,td{
	padding:10px;
	}
	</style>
</head>

<body>
	<div class="container">
		<h2>Select items to be added into your cart!</h2>
		<h4>
			<a href="ShoppingCart.jsp">Go To Cart</a>
		</h4>
		<br>
		<table style="width: 75%;">
			<tr>
				<td>
					<div class="card" >
						<div class="card-body">
							<form method="POST" action="CartController">
								<p><strong>
									Model:
								</strong> 
								TF-Model1 
								<input type="hidden" name="modelNo" value="TF-MODEL1"> </p>
								<p><strong>
									Description:
								</strong>
								Model 1
								<input type="hidden" name="description" value="Model1"></p>
								<p><strong>
									Quantity: 
								<input type="text" size="2" value="1" name="quantity">
								</strong> </p>
								<p><strong>
									Price:
								</strong> 
								$10.00 
								<input type="hidden" name="price" value="10"> </p>
								<input type="hidden" name="action" value="add"> 
								<input type="submit" name="addToCart" value="Add To Cart" class="btn btn-secondary">
							</form>
						</div>
					</div>
				</td>
				<td>
					<div class="card">
						<div class="card-body">
							<form method="POST" action="CartController">
								<p><strong>
									Model:
								</strong> 
								TF-Model2 
								<input type="hidden" name="modelNo" value="TF-MODEL2"> </p>
								<p><strong>
									Description:
								</strong>
								Model 2
								<input type="hidden" name="description" value="Model 2"></p>
								<p><strong>
									Quantity: 
								<input type="text" size="2" value="1" name="quantity">
								</strong> </p>
								<p><strong>
									Price:
								</strong> 
								$30.00 
								<input type="hidden" name="price" value="30"> </p>
								<input type="hidden" name="action" value="add"> 
								<input type="submit" name="addToCart" value="Add To Cart" class="btn btn-secondary">
							</form>
						</div>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="card">
						<div class="card-body">
							<form method="POST" action="CartController">
								<p><strong>
									Model:
								</strong> 
								TF-Model3
								<input type="hidden" name="modelNo" value="TF-MODEL3"> </p>
								<p><strong>
									Description:
								</strong>
								Model 3
								<input type="hidden" name="description" value="Model 3"></p>
								<p><strong>
									Quantity: 
								<input type="text" size="2" value="1" name="quantity">
								</strong> </p>
								<p><strong>
									Price:
								</strong> 
								$15.00 
								<input type="hidden" name="price" value="15"> </p>
								<input type="hidden" name="action" value="add"> 
								<input type="submit" name="addToCart" value="Add To Cart" class="btn btn-secondary">
							</form>
						</div>
					</div>
				</td>
				<td>
					<div class="card">
						<div class="card-body">
							<form method="POST" action="CartController">
								<p><strong>
									Model:
								</strong> 
								TF-Model4 
								<input type="hidden" name="modelNo" value="TF-MODEL4"> </p>
								<p><strong>
									Description:
								</strong>
								Model 4
								<input type="hidden" name="description" value="Model 4"></p>
								<p><strong>
									Quantity: 
								<input type="text" size="2" value="1" name="quantity">
								</strong> </p>
								<p><strong>
									Price:
								</strong> 
								$50.00 
								<input type="hidden" name="price" value="50"> </p>
								<input type="hidden" name="action" value="add"> 
								<input type="submit" name="addToCart" value="Add To Cart" class="btn btn-secondary">
							</form>
						</div>
					</div>
				</td>
			</tr>
		</table>


	</div>
</body>
</html>