<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="mystyle.css">

<meta charset="ISO-8859-1">
<title>Money Money Bank</title>
</head>
<body>
	
	<form action=".app" method="get">

		<div>
			<table align="center" border="2">
				<tr>
					<th><h2>Money Money Bank</h2></th>
				</tr>
				
				<tr>
					<th> <a href = "addNewAccount.jsp">Add Account</a> </th>
					<th><a href = "searchAccount.jsp"> Search Account</a></th>
				</tr>
				
				<tr>
					<th><a href = "viewAllAccount.app">View All Customers</a></th>
					<th><a href = "depositForm.jsp">Deposit</a></th>
				</tr>
				
				<tr>
					<th><a href = "withdrawForm.jsp">Withdraw</a></th>
					<th><a href = "fundTransfer.jsp">Fund Transfer</a></th>
				</tr>
			</table>	
		</div>

	</form>

</body>
</html>