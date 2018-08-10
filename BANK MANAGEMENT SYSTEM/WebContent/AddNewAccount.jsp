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
	<h1>Welcome to CapG Bank</h1>
	<form action="addnewacc.app" method="get">
	<table align="center" border="1">
	<tr>
	<td>Account Holder Name : </td>
	<td><input type="text" id="name" name="name" required></td>
	</tr>
	<tr>
	<td>E-mail ID : </td>
	<td><input type="email" id="email" name="email" required></td>
	</tr>
	<tr>
	<td>Date of Birth : </td>
	<td><input type="date" data-date-inline-picker="true" name="dob" id="dob" required></td>
	</tr>
	<tr>
	<td>Contact Number : </td>
	<td><input type="text" id="contact" name="contact" required></td>
	</tr>
	<tr>
	<td>Account Type : </td>
	<td><select name="choice" required>
	<option value="Current Account">Current Account</option>
	<option value="Savings Account">Savings Account</option>
	</select></td>
	</tr>
	<jstl:if test=("{request.getParameter("choice")}").equals("Savings Account") >
	<tr>
	<td>Salaried : </td>
	<td><input type="radio" name="salary" value="Yes" required>Yes</td>
	<td><input type="radio" name="salary" value="No">No</td>
	</tr>
		<jstl:if test=("{request.getParameter("salary")}").equals("Yes") >
		<tr>
		<td>Enter the account balance : </td>
		<td><input type="number" name="accbal" id="accbal" min="0" required></td>
		</tr>
		</jstl:if>
		<jstl:otherwise>
		<tr>
		<td>Enter the account balance : </td>
		<td><input type="number" name="accbal" id="accbal" min="5000" required></td>
		</tr>
		</jstl:otherwise>
	</jstl:if>
	<jstl:otherwise>
		<tr>
		<td>Enter the Overdraft limit : </td>
		<td><input type="number" name="odlimit" id="odlimit" required></td>
		</tr>
		<tr>
		<td>Enter the account balance : </td>
		<td><input type="number" name="accbal" id="accbal" min="10000" required></td>
		</tr>
	</jstl:otherwise>
	<tr>
	<td><input type="submit" onclick="success.app" name="submit" value="Submit"></td>
	<td><input type="reset" name="reset" value="Reset"></td>
	</tr>
	</table>
	</form>
</body>
</html>