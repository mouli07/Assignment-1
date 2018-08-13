<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	

	<form action="home.jsp" method="get">

		<div>
			<table align="center" border="2">
				<tr>
					<th colspan="9" height="35"><h2>Account Detail</h2></th>
				</tr>
				<tr>
					<th height="20">Account Number</th>
					<th height="20">Customer Name</th>
					<th height="20">Customer ID</th>
					<th height="20">Account Type</th>
					<th height="20">Account Balance</th>
					<th height="20">Overdraft Limit</th>
					<th height="20">Salary Account ?</th>
				</tr>
				<tr>
					<td align="center">${sessionScope.createdbankAccount.accountNumber}</td>
					<td align="center">${sessionScope.createdbankAccount.accountHolder.customerName}</td>
					<td align="center">${sessionScope.createdbankAccount.accountHolder.customerId}</td>
					<td align="center">${sessionScope.createdbankAccount.accountType}</td>
					<td align="center">${sessionScope.createdbankAccount.accountBalance}</td>

					<jstl:choose>
						<jstl:when
							test='${sessionScope.createdbankAccount.accountType.equals("currentAccount")}'>
							<td align="center">${sessionScope.createdbankAccount.odLimit}</td>
							<td align="center">NA</td>
						</jstl:when>
						<jstl:otherwise>
							<td align="center">NA</td>
							<td align="center">${sessionScope.createdbankAccount.salary}</td>
						</jstl:otherwise>
					</jstl:choose>
            		<tr>
						<th><input type="submit" value="Home"></th>
					</tr>
          
			</table>
		</div>

	</form>
	


</body>
</html>