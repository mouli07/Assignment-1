<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="alfa" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="mystyle.css">

<meta charset="ISO-8859-1">
<title>Alfa Alfa Bank</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<form action=".app" method="get">

		<div>
			<table cellspacing="30" align="center" border="2">
				<tr>
					<th colspan="6" height="35"><h2>Alfa Alfa Bank</h2></th>
				</tr>
				
				<tr>
					<th height="40" colspan="3"> <a href = "addNewAccount.jsp"> Add New Account</a> </th>
					<th height="40" colspan="3"><a href = "searchAccount.jsp"> Search for a Account</a></th>
				</tr>
				
				<tr>
					<th height="40" colspan="3" ><a href = "viewAllAccount.app"> View All Customers</a></th>
					<th height="40" colspan="3"><a href = "depositForm.jsp"> Deposit into a Account</a></th>
				</tr>
				
				<tr>
					<th height="40" colspan="3"><a href = "withdrawForm.jsp"> Withdraw from a Account</a></th>
					<th height="40" colspan="3"><a href = "fundTransfer.jsp"> Fund Transfer</a></th>
				</tr>
			</table>	
		</div>

	</form>
	<jsp:include page="footer.html"></jsp:include>

</body>
</html>