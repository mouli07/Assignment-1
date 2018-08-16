<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Fund Transfer</title>
</head>
<body>
<form action="doFundTransfer.AppController" method="get">
	<div style="align-content: center">
		<table class="striped">
		<tr>
		<td>Enter Sender's Account number</td>
		<td><input type="text" name="accNoSender" required="required"></td>
		<td>Enter Recievers's Account number</td>
		<td><input type="text" name="accNoReciever" required="required"></td>
		<td>Enter Amount</td>
		<td><input type="text" name="amount" placeholder="0.0" required="required"></td>
		</tr>
		</table><br><br>
		<div class="center-align"><button type="submit" value="Deposit">Transfer Funds    <i class="material-icons right">send</i></button></div>
	</div>
</form>
</body>
</html>