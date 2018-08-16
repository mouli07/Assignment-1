<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Account Details</title>
</head>
<body>

	<div align="center">
		<h1  class="center-align">Customer Details</h1>
		<jstl:if test="${requestScope.allAccount.size() > 0 }">
			<table align="center">
				<tr>
					<th>Customer ID</th>
					<th>Customer Name</th>
					<th>Account Number</th>
					<th>Email ID</th>
					<th>Phone No</th>
					<th>Date Of Birth</th>
				</tr>
				<jstl:forEach var="account" items="${requestScope.allAccount}">
					<tr>
						<td>${account.accountHolder.customerId}</td>
						<td>${account.accountHolder.customerName}</td>
						<td>${account.accountNumber}</td>
						<td>${account.accountHolder.emailId}</td>
						<td>${account.accountHolder.contactNumber}</td>
						<td>${account.accountHolder.dateOfBirth}</td>
						<td>
					</tr>
				</jstl:forEach>
			</table>

		</jstl:if>
		<jstl:if test="${requestScope.allAccount.size() == 0 }">
			<h4 class="center-align">No Customer Found!</h4>
		</jstl:if>
	</div>
<div>
	</div>
</body>
</html>