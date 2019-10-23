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
		<h1>CRM/Customer Management Systems</h1>

		<br>
		<div class="row ">
			<div class="col-6">
				<input type="button" value="Add Customer"
					onclick="window.location.href='customer-form.jsp'; return false;"
					class="btn btn-primary btn-lg" />
			</div>
			<div class="col-6">
				<form action="search.do" class="form-inline">

					<input name="search" type="text" class="form-control" />
					<button class="btn btn-primary">SEARCH</button>
				</form>
			</div>

		</div>
		<br>
		<button class="btn btn-primary btn-sm" href="">Sort by Ascending</button>
		<button class="btn btn-primary btn-sm">Sort by Ascending</button>
		<br> <br>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="tempCustomer" items="${customers}">
					<c:url var="updateLink" value="update.do">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>

					<c:url var="deleteLink" value="delete.do">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>
					<tr>
						<td>${tempCustomer.id}</td>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
						<td><a href="${updateLink}" class="btn btn-success btn-md">Update</a>
							<a href="${deleteLink}"
							onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false"
							class="btn btn-danger btn-md">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
