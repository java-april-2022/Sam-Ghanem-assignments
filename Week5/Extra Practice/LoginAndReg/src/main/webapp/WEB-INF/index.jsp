<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%><%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link href="https://unpkg.com/nes.css@latest/css/nes.min.css"
	rel="stylesheet" />
<meta charset="ISO-8859-1">
<title>LOGIN & REG</title>
</head>
<body>
	<div class="container-12 bg-dark d-flex justify-content-center">
		<h1 class="text-danger">Register</h1>
		<form:form action="/register" method="post" modelAttribute="newUser">
			<div class="nes-field nes-balloon  ">
				<form:label path="user_name" for="name_field">USER NAME</form:label>
				<form:errors path="user_name" />
				<form:input path="user_name" type="text" id="name_field"
					class="nes-tex is-success nes-input nes-pointer " />
				<form:label path="email">EMAIL</form:label>
				<form:errors path="email"></form:errors>
				<form:input path="email" class="nes-tex is-success nes-input nes-pointer "  />
				<form:label path="password" for="name_field">PASSWORD</form:label>
				<form:errors path="password" />
				<form:input path="password" type="password" id="name_field"
					class="nes-tex is-success nes-input nes-pointer " />
				<form:label path="conpassword" for="name_field">CONFIRM PASSWORD</form:label>
				<form:errors path="conpassword" />
				<form:input path="conpassword" type="password" id="name_field" class="nes-tex is-success nes-input nes-pointer " />
			</div>
			<div>
				<i class="nes-kirby"></i> <i class="nes-icon coin is-large"></i><input type="submit" value="Create" class="nes-btn is-success nes-pointer" /><i class="nes-icon coin is-large"></i>


			</div>
		</form:form>




		<h1 class="text-danger">Login</h1>
		<form:form action="/login" method="post" modelAttribute="newLogin">
			<div class="nes-field nes-balloon  ">
				<form:label path="email" for="name_field">EMAIL</form:label>
				<form:errors path="email" />
				<form:input path="email" type="text" id="name_field" class="nes-tex is-success nes-input nes-pointer " />
				<form:label path="password" for="name_field">PASSWORD</form:label>
				<form:errors path="password" />
				<form:input path="password" type="password" id="name_field" class="nes-tex is-success nes-input nes-pointer " />
			
			
			</div>
			<div>
				<i class="nes-kirby"></i> <i class="nes-icon coin is-large"></i> <input type="submit" value="Create" class="nes-btn is-success nes-pointer" /><i class="nes-icon coin is-large"></i>

			</div>
		</form:form>

	</div>



</body>
</html>