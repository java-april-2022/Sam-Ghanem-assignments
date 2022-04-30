<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form"%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Save Travels</h1>
	<table class="table">
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Description</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="expense" items="${allexpense}">
			<tr>
				
				
				<td><a href="/show/${expense.id}">${expense.name}</a></td>
				<td>${expense.vendor}</td>
				<td>${expense.amount}</td>
				<td>${expense.description}</td>
				<td><a href="/edit/${expense.id}" >edit</a> 
				<form:form  action="/delete/${expense.id}" method="post"  >
				<input type="submit" value="Delete" />
				<input type="hidden" name="_method" value="delete">
				</form:form>
				</td>
				
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<h2>Add an Expense</h2>
	<form:form action="/new" method="post" modelAttribute="newexpense">
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


</body>
</html>