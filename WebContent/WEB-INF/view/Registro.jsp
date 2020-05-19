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
	
	<label>ALTA</label>
	<form:form action="guardarUsuario" modelAttribute="usr">
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
	
	<br/><br/>
	<label>BUSQUEDA</label>
	<form action="buscarUsuario" method="GET">
		<input type="text" name="id">
		<input type="submit" value="Buscar">
	</form>
	<br/><br/>
	<label>BAJA</label>
	<form action="borrarUsuario" method="POST">
		<input type="text" name="id">
		<input type="submit" value="ELIMINAR">
	</form>
	
	<br/><br/>	
	<label>MODIFICACION</label>
	<form:form action="actualizarUsuario" modelAttribute="usr">
		<div>
			Id (*):
			<form:input path="id" />
			<form:errors path="id" style="color:red" />
			<br />
			<br />
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
			<input type=submit value="Actualizar">
		</div>

	</form:form>
	
</body>
</html>