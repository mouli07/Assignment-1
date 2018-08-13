<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<form action="fundTransfer.app" method="get">

			<div>
				<table align="center" border="2">
					<tr>
						<th"><h2>Fund Transfer</h2></th>
					</tr>
					<tr>
						<th>From Account Number : </th>
						<th> <input type="number" name="typedFromAccount"  placeholder=" From Account Number " required="required"></th>
					</tr>
					<tr>
						<th>To Account Number : </th>
						<th> <input type="number" name="typedToAccount"  placeholder=" To Account Number " required="required"></th>
					</tr>
					<tr>
						<th>Amount : </th>
						<th> <input type="number" name="typedAmount"  placeholder="Enter Amount" required="required"></th>
					</tr>
					<tr>
						<th>Remarks : </th>
						<th> <input type="text" name="typedremarks"  placeholder=" Remarks "></th>
					</tr>
 					<tr>
						<th><input type="submit" value="Tranfer"></th>
					</tr>
				</table>
			</div>

		</form>
	


</body>
</html>