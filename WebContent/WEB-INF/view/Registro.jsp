<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	Ingrese sus datos
	<label>FORMULARIO CON MODEL</label>
	<form:form action="perfil" modelAttribute="usr">
		<div>
			Nombre (*):
			<form:input path="nombre" />
			<form:errors path="nombre" style="color:red" />
			<br />
			<br /> 
			Usuario (*):
			<form:input path="usuario" />
			<form:errors path="usuario" style="color:red" />
			<br />
			<br /> 
			Email (*):
			<form:input path="email" />
			<form:errors path="email" style="color:red" />
			<br />
			<br /> 
			Telefono (*):
			<form:input path="telefono" />
			<form:errors path="telefono" style="color:red" />
			<br />
			<br /> 
			Clave (*):
			<form:password path="clave" />
			<form:errors path="clave" style="color:red" />
			<br />
			<br />
		</div>

		<div>
			<input type=submit value="Registrarme">
		</div>

	</form:form>
</body>
</html>