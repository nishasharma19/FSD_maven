

<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
	<title>Save Customer</title>

	
</head>

<body>
	<div class="container"> 
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>
	
	<%-- 	<form action="updateCustomer.do" method="POST">
		<input type="hidden" value="${customer.id}" name="id">
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><input name="firstName" type="text" value="${customer.firstName }" /></td>
					</tr>
				
					<tr>
						<td><label>Last name:</label></td>
						<td><input name="lastName" type="text" value="${customer.lastName}"/></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><input name="email" type="text" value="${customer.email}"/></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Update" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form> --%>
		<form action="updateCustomer.do" method="POST">
		<input type="hidden" value="${customer.id}" name="id">

			<div class="form-group">
				<label>First name:</label> <input name="firstName" type="text"
					class="form-control" value="${customer.firstName }"/>
			</div>
			<div class="form-group">
				<label>Last name:</label> <input name="lastName" type="text"
					class="form-control" value="${customer.lastName}" />
			</div>
			<div class="form-group">
				<label>Email:</label> <input name="email" type="text"
					class="form-control" value="${customer.email}" />
			</div>
			<button class="btn btn-primary btn-lg">SAVE</button>


		</form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="list.do">Back to List</a>
		</p>
	
	</div>
</div>
</body>

</html>










