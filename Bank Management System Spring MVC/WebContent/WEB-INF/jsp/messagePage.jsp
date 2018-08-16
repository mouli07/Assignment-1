<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Message</title>
</head>
<body>
<div class="container">
<form action="index.jsp" method="get">
	<h2 class="center-align">${message}</h2><br>
<br><br>
<button type="submit" value="Go Back Home">
						Go Back Home <i class="material-icons right">home</i>
					</button></div>
</form>
</body>
</html>