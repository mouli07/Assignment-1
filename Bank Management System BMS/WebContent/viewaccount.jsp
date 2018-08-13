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
	<table align="center">
	<tr>
	<th>Account Number</th>
	<th>Customer ID</th>
	<th>Account Balance</th>
	</tr>
	<jstl:forEach var="viewAcc" items="${sessionScope.viewAcc}">
	<tr>
	<td>${viewAcc.accountNumber}</td>
	<td>${viewAcc.custId}</td>
	<td>${viewAcc.accountBalance}</td>
	</tr>
	</jstl:forEach>
	</table>
</body>
</html>