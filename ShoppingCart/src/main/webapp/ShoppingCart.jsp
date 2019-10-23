<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
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
	<div class="container">
		<h1>Shopping Cart</h1>
		<p>
			<a href="ModelList.jsp">Go back to the List</a>
		</p>
		<table class="table-bordered">
			<tr>
				<td><h5>Model Description</h5></td>
				<td><h5>Quantity</h5></td>
				<td><h5>Unit Price</h5></td>
				<td><h5>Total</h5></td>
			</tr>
			<jsp:useBean id="cart" scope="session"
				class="comm.example.bean.CartBean" />
			<c:if test="${cart.lineItemCount==0}">
				<tr>
					<td colspan="4">--Cart is empty -<br />
				</tr>
			</c:if>
			<c:forEach var="cartItem" items="${cart.cartItems}"
			varStatus="counter">
				<form name="item" method="POST" action="CartController">
					<tr>
						<td><b><c:out value="${cartItem.strPartNumber}" /></b><br /> 
						<c:out value="${cartItem.strModelDescription}" /></td>
						<td>
							<input type='hidden' name='itemIndex' value='<c:out value="${counter.count}"/>'> 
							<input type='text' name="quantity" value='<c:out value="${cartItem.iQuantity}"/>'> 
							<input type="submit" name="action" value="Update">
							<input type="submit" name="action" value="Delete">
						</td>
						<td>
							$<c:out value="${cartItem.dblUnitCost}" />
						</td>
						<td>
							$<c:out value="${cartItem.dblTotalCost}" />
						</td>
					</tr>
				</form>
			</c:forEach>
			<tr>
				<td colspan="2"></td>
				<td></td>
				<td>Subtotal: $<c:out value="${cart.orderTotal}" />
			</td>
		</tr>
		</table>
	</div>
</body>
</html>