<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../resources/css/styles.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="fondo2">

<div class="arr2">

 <center><h1>DIRECTIVA</h1></center>


<table>

			<thead>

				<tr>
					<th>IdDirectiva </th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Cargo</th>
					<th>Correo</th>
					<th>Telefono</th>
					<th>Direccion</th>
					<th>FormativaId</th>
				</tr>

			</thead>

			<tbody>

				<c:forEach var="item" items="${directivas}">
					<tr>
						
						<td>${item.idDirectiva}</td>
						<td>${item.nombre}</td>
						<td>${item.apellido}</td>
						<td>${item.cargo}</td>
						<td>${item.correo}</td>
						<td>${item.telefono}</td>
						<td>${item.direccion}</td>
						<td>${item.formativa.formativa}</td>
						<td>${item.formativa.nombre}</td>
				


					</tr>

				</c:forEach>

			</tbody>

		</table>	
<br></br>
<br>


                <center><a href="${pageContext.request.contextPath}/formativa/findAll" class="btn-xl"> REGRESAR </a></center>
</div>
</body>
</html>