<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="alfa" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="home.jsp" method="get">

		<div>
			<table cellspacing="15" align="center" border="2">
				<tr>
					<th colspan="9" height="35"><h2>Account Detail</h2></th>
				</tr>
				<tr>
					<th height="20">Account Number</th>
					<th height="20">Customer Name</th>
					<th height="20">Customer ID</th>
					<th height="20">Account Balance</th>
				</tr>
				<tr>
					<td align="center">${sessionScope.BankAccounts.accountNumber}</td>
					<td align="center">${sessionScope.BankAccounts.accountHolder.customerName}</td>
					<td align="center">${sessionScope.BankAccounts.accountHolder.customerId}</td>
					<td align="center">${sessionScope.BankAccounts.accountBalance}</td>

				</tr>
            		<tr>
						<th colspan="9"  height="40"><input type="submit" value="Home"></th>
					</tr>
          
			</table>
		</div>

	</form>


</body>
</html>