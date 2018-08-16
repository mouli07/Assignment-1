<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Account Details</title>
</head>
<body>

		<div align="center"">
			<div class="container">
				<h1 align="center">Account Details</h1>
				<jstl:if test="${requestScope.allAccount.size() > 0 }">
					<table align="center">
						<tr>
							<th>Account Number</th>
							<th>Customer ID</th>
							<th>Account Type</th>
							<th>Account Balance</th>
							<th>Overdraft Limit</th>
							<th>Salary Account</th>
						</tr>
						<jstl:forEach var="account" items="${requestScope.allAccount}">
							<tr>
								<td>${account.accountNumber}</td>
								<td>${account.accountHolder.customerId}</td>
								<jstl:if
									test="${account['class'].simpleName.equals('MMSavingsAccount')}">
									<td>Savings Account</td>
								</jstl:if>
								<jstl:if
									test="${account['class'].simpleName.equals('MMCurrentAccount')}">
									<td>Current Account</td>
								</jstl:if>
								<td>${account.accountBalance}</td>

								<jstl:if
									test="${account['class'].simpleName.equals('MMSavingsAccount')}">
									<td>N/A</td>
									<td>${account.salary}
								</jstl:if>

								<jstl:if
									test="${account['class'].simpleName.equals('MMCurrentAccount')}">
									<td>${account.odLimit}</td>
									<td>N/A
								</jstl:if>
							</tr>
						</jstl:forEach>
					</table>
				</jstl:if>
				<jstl:if test="${requestScope.allAccount.size() == 0 }">
					<h4 align="center">No Accounts Found!</h4>
				</jstl:if>
			</div>
			<div></div>
		</div>

</body>
</html>
