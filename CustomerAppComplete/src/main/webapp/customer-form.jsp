

<!DOCTYPE html>
<html>

<head>
<title>Save Customer</title>

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
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>

		<form action="saveCustomer.do" method="POST">

			<div class="form-group">
				<label>First name:</label> <input name="firstName" type="text"
					class="form-control" />
			</div>
			<div class="form-group">
				<label>Last name:</label> <input name="lastName" type="text"
					class="form-control" />
			</div>
			<div class="form-group">
				<label>Email:</label> <input name="email" type="text"
					class="form-control" />
			</div>
			<button class="btn btn-primary btn-lg">SAVE</button>


		</form>

		<div style=""></div>

		<p>
			<a href="list.do">Back to List</a>
		</p>

	</div>
</div>
</body>

</html>










