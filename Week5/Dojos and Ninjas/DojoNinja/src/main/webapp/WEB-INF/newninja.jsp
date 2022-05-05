<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link href="https://unpkg.com/nes.css@latest/css/nes.min.css"
	rel="stylesheet" />
<meta charset="ISO-8859-1">
<title>New Ninjas</title>
</head>
<body>
	<div class="bg-dark text-light nes-pointer">
		<form:form action="/ninja/new" method="post" modelAttribute="newninja">
			<h1>New Pokemon Trainer</h1>
			<label for="error_select">Pick Your Starting Gym</label>
			<div
				class="nes-select is-error nes-text is-primary  nes-balloon from-left">
				<form:select   path="dojo">
					<option  value="" disabled selected hidden>Select...</option>
					<c:forEach var="Gyms" items="${allDojos}">
					<option  value="${Gyms.id } ">${Gyms.name}</option>
				
					</c:forEach>
				</form:select>
			</div>
			<div class="nes-field nes-text is-primary  nes-balloon from-left">
				<form:label for="name_field" path="first_name">Your First Name</form:label>
				<form:errors path="first_name" /> 
				<form:input type="text" id="name_field" class="nes-input" path="first_name"/>
			</div>
			<div class="nes-field nes-text is-primary  nes-balloon from-left">
				<form:label for="name_field" path="last_name">Your Last Name</form:label>
				<form:errors path="last_name" />
				<form:input type="text" id="name_field" class="nes-input" path="last_name"/>
			</div>
			<div class=" nes-balloon">
			<p>
				<form:label class=" nes-balloon text-primary" path="age">Age</form:label>
				<form:errors path="age" />
				<form:input type="number" path="age" />
			</p>
			
			</div>
			<div>
				<i class="nes-ash"></i> <i class="nes-pokeball"></i> 
				<i class="nes-bulbasaur"></i>
				<i class="nes-charmander"></i>
				<i class="nes-squirtle"></i>
				<button type="submit" class="nes-btn is-success nes-pointer">Create</button>
				

			</div>

		</form:form>
		<a href="/home" >go home</a>

	</div>
</body>
</html>