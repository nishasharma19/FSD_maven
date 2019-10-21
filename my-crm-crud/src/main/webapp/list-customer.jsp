<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
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
		<h2>CRM-Customer Relationship Management</h2>
		<a class="btn btn-primary btn-md" href="customerform.jsp">Add
			Customer</a>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Email</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tempCustomer" items="${customers}">
					<tr>

						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.secondName}</td>
						<td>${tempCustomer.email}</td>
						<td><a class="btn btn-success btn-md" href="${updateLink}">Update</a>
						<a class="btn btn-danger btn-md" href="${deleteLink}">Delete</a></td>
					</tr>


				</c:forEach>

			</tbody>
		</table>
	</div>

</body>
</html>