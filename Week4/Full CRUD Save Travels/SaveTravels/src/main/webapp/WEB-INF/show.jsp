<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Your Expense page</h1>
	<div>
		<p>Expense name: <c:out value="${expense.name}"/></p>
		<p>Vendor Name: <c:out value="${expense.vendor}"/></p>
		<p>Amount: $<c:out value="${expense.amount}"/></p>
		<p>Description: <c:out value="${expense.description}"/></p>
	</div>


</body>
</html>