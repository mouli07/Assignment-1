<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search an Account</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<form action="viewAccount.app" method="get">

		<div>
			<table align="center" border="2">
				<tr>
					<th><h2>Money Money Bank</h2></th>
				</tr>
				
				<tr>
					<th> <input type="number" name="typedAccount"  placeholder="Enter Account Number" required="required"></th>
				</tr>
				
				<tr>
					<th><input type="submit" value="Search"></th>
				</tr>
			</table>	
		</div>

	</form>

</body>
</html>