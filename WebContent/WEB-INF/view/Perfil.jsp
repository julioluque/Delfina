<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Perfil</title>
</head>
<body>

INGRESASTE!!!!!!

	<h2>MI PERFIL</h2>

	<div>
		<label>NOMBRE: </label>
		<strong>${usr.nombre}</strong>
	</div>
	<div>
		<label>USUARIO: </label>
		<strong>${usr.usuario}</strong>
	</div>
	<div>
		<label>EMAIL: </label>
		<strong>${usr.email}</strong>
	</div>
	<div>
		<label>TELEFONO: </label>
		<strong>${usr.telefono}</strong>
	</div>
	<div>
		<label>CLAVE: </label>
		<strong>${usr.clave}</strong>
	</div>
	
</body>
</html>