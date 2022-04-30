<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form"%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/edit" method="post" modelAttribute="expense">
		<p>
			<form:label path="name">Expense name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="Vendor">Vendor name</form:label>
			<form:errors path="Vendor" />
			<form:input path="Vendor" />
		</p>
		<p>
			<form:label path="Amount">Amount</form:label>
			<form:errors path="Amount" />
			<form:input type="number" path="Amount" />
		</p>
		<p>
			<form:label path="Description">Description</form:label>
			<form:errors path="Description" />
			<form:textarea type="textarea" path="Description" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
	
	<a href="/" >go home</a>

</body>
</html>