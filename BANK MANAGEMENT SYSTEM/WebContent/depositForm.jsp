<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<form action="depositForm.app" method="get">

			<div>
				<table align="center" border="2">
					<tr>
						<th><h2>Deposit</h2></th>
					</tr>
					<tr>
						<th>Account Number : </th>
						<th> <input type="number" name="typedAccount"  placeholder="Enter Account Number" required="required"></th>
					</tr>
					<tr>
						<th>Amount : </th>
						<th> <input type="number" name="typedAmount"  placeholder="Enter Amount" required="required" min="1"></th>
					</tr>
 					<tr>
						<th><input type="submit" value="Deposit"></th>
					</tr>
				</table>
			</div>

		</form>


</body>
</html>