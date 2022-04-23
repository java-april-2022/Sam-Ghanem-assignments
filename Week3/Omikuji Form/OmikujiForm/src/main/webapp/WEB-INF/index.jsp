<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Omukuji form</title>
</head>
<body>
<h1>Get your Omukuji here</h1>
	<form action="/show_results" method="post">
		<div>
			<label>Pick any number from 5 to 25</label><hr>
			<input type="number"  name="number"/>
		</div>
		<div>
			<label>Please type a city name</label><hr>
			<input type="text" name="city"/>
		</div>
		<div>
			<label>Please add a name of a real person</label><hr>
			<input type="text" name="name"/>
		</div>
		<div>
			<label>Please type dream job or hobbies</label><hr>
			<input type="text" name="job"/>
		</div>
		<div>
			<label>Please type a living creature</label><hr>
			<input type="text" name="animal"/>
		</div>
		<div>
			<label>Please type something nice about someone</label><hr>
			<textarea rows="5" cols="40" name="nice"></textarea>
		</div>
		<div>
			<label>send and show a friend</label><hr>
			<input type="submit" value="submit"  >
		</div>
	</form>


</body>
</html>