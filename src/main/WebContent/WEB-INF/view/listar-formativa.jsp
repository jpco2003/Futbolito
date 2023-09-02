<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet" type="text/css"
	href="../resources/css/styles.css">

<meta charset="ISO-8859-1">
<title>Formativas Softbol</title>
</head>


<body class="fondo">

	<div class="arr">

		 <center><h1>Formativa</h1></center>

  <button><a href= "${pageContext.request.contextPath}/formativa/findOne?opcion=1">Agregar</a></button>
      <br></br>
      
		<table>

			<thead>

				<tr>
					<th>IdFormativa</th>
					<th>Nombre</th>
					<th>Direccion</th>
					<th>Correo</th>
					<th>Telefono</th>
				</tr>

			</thead>

			<tbody>

				<c:forEach var="item" items="${formativas}">

					<tr>

						<td>${item.idFormativa}</td>

						<td>${item.nombre}</td>

						<td>${item.direccion}</td>

						<td>${item.correo}</td>

						<td>${item.telefono}</td>
						
						
						<td>

                        <button><a href= "${pageContext.request.contextPath}/formativa/findOne?idFormativa=${item.idFormativa}&opcion=1">Actualizar</a></button>

						<button><a href= "${pageContext.request.contextPath}/formativa/findOne?idFormativa=${item.idFormativa}&opcion=2">Borrar </a></button>

                   		</td>


					</tr>

				</c:forEach>

			</tbody>

		</table>

		<br></br>


		<center>
			<a href="${pageContext.request.contextPath}/directiva/findAll"
				class="btn-xl"> DIRECTIVA </a>
		</center>


		<br></br> <br></br> <br></br>

		<center>
			<a href="${pageContext.request.contextPath}/jugadores/findAll"
				class="btn-xl"> JUGADORES </a>
		</center>


		<br></br> <br></br> <br></br>

		<center>
			<a href="${pageContext.request.contextPath}/patrocinadores/findAll"
				class="btn-xl"> PATROCINADORES </a>
		</center>

		<br></br> <br></br>


	</div>
</body>
</html>
