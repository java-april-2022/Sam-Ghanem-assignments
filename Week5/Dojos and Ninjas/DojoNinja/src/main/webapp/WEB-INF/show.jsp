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
<title>Insert title here</title>
</head>
<body>

	<div class="nes-table-responsive bg-dark">
	  <i class="nes-ash"></i>
  <i class="nes-pokeball"></i>
  <i class="nes-bulbasaur"></i>
  <i class="nes-charmander"></i>
  <i class="nes-squirtle"></i>
 
		<table class="nes-table is-bordered is-dark text-light">
			<thead>
				<tr>
					<th>${findDojo.name } Gym and its Trainers</th>
					
					<th>Last Name</th>
					<th>AGE</th>
				</tr>
			</thead>
				<c:forEach var="Red" items="${findDojo.ninjas}">
			<tbody>
					<tr>
						<td>${Red.first_name }</td>
						<td>${Red.last_name }</td>
						<td>${Red.age }</td>
					</tr>
			</tbody>
				</c:forEach>
		</table>
		  <i class="nes-ash"></i>
  <i class="nes-pokeball"></i>
  <i class="nes-bulbasaur"></i>
  <i class="nes-charmander"></i>
  <i class="nes-squirtle"></i>
 
	<a href="/home">go home</a>
	</div>
</body>
</html>