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
<body>
<h1>PATROCINADORES</h1>



<table>

			<thead>

				<tr>
					<th>IdPatrocinadores</th>
					<th>Nombre</th>
					<th>Telefono</th>
					<th>Correo</th>
					<th>Direccion</th>
					<th>Pais</th>
					<th>DirectivaId</th>
					
					
				</tr>

			</thead>

			<tbody>

				<c:forEach var="item" items="${patrocinadoress}">

					<tr>

						<td>${item.idPatrocinadores}</td>

						<td>${item.nombre}</td>

						<td>${item.telefono}</td>

						<td>${item.correo}</td>

						<td>${item.direccion}</td>
						<td>${item.pais}</td>
						<td>${item.directiva.nombre}</td>


					</tr>

				</c:forEach>

			</tbody>

		</table>

              <a href="${pageContext.request.contextPath}/formativa/findAll" class="btn-xl"> REGRESAR </a>
</body>
</html>