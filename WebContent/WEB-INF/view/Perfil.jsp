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

	<h2>MI PERFIL </h2>

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
	
	
	<br/><br/>
	<div>
		<label>RESULTADOS: </label>
		<table>
			<tr>
				<td>NOMBRE</td>
				<td>EMAIL</td>
				<td>TELEFONO</td>
			</tr>
			<tr>
				<td>${buscar.usuario}</td>
				<td>${buscar.email}</td>
				<td>${buscar.telefono}</td>
			</tr>
		</table>
	</div>
	
		<br/><br/>
	<div>
		<label>REGISTRO ELIMINADO : ${eliminado}</label>
	</div>
</body>
</html>