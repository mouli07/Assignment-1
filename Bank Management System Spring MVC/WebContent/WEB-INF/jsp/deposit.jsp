<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Deposit</title>
</head>

<body>
<form action="doDeposit.AppController" method="get">
	<h1  class="center-align">Deposit</h1>
		<table align="center">
		<tr>
		<td>Enter Account number</td>
		<td><input type="text" name="accNo" required="required"></td>
		<td>Enter Amount</td>
		<td><input type="number" min="0" name="amount" placeholder="0.0" required="required"></td>
		</tr>
		</table><br><br>
		<div class="center-align"><button type="submit" value="Deposit">Deposit     <i class="material-icons right">send</i></button></div>
</form>
</body>
</html>