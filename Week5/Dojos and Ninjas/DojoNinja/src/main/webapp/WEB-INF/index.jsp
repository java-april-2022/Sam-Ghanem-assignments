<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>




<meta charset="ISO-8859-1">
<title>Dojos and Ninjas</title>
</head>
<body>
	
		<h1>
			<span class="nes-text nes-balloon ">New Gym</span>
		</h1>
		<form:form action="/dojo/new" method="post" modelAttribute="newdojo">
			<div class="nes-field nes-balloon ">
				<form:label path="name" for="name_field">ADD A Gym</form:label>
				<form:errors path="name" />
				<form:input path="name" type="text" id="name_field"
					class="nes-text is-success nes-input  " />
			</div>
			<div>

				<input type="submit" value="Create"
					class="nes-btn is-success " /> <a href="/ninja/new">Become
					a Trainer</a>

			</div>
		</form:form>


		<table class="nes-table is-bordered is-dark text-light">
			<thead>
				<tr>
					<th>Gyms</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Gyms" items="${allDojos}">
					<tr>
						<td><a href="/showdojo/${Gyms.id }">${Gyms.name }</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	
</body>
</html>