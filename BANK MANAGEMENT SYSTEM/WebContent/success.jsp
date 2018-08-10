<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header align="left">
<input type="button" value="Back" onclick="home.jsp">

</header>
<h3>Account Creation Successfull</h3>
<h4>Your account number is : ${requestScope.bankAccount.accountNumber}</h4>
</body>
</html>