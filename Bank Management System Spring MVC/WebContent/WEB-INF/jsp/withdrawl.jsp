<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Withdrawal</title>
</head>
<body>
<div>
<form action="doWithdraw.AppController" method="get">

	<div align="center">
		<h1  align="center">Withdrawal</h1>
		<table align="center">
		<tr>
		<td>Enter Account number</td>
		<td><input type="text" name="accNo" required="required"></td>
		<td>Enter Amount</td>
		<td><input type="number" min="0" name="amount" placeholder="0.0" required="required"></td>
		</tr>
		</table><br><br>
		<div align="center"><button type="submit" value="Deposit">Withdrawal     <i class="material-icons right">send</i></button></div>
	</div>
</form>
</div>
</body>
</html>