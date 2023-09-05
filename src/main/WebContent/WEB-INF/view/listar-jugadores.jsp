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

 <center><h1>JUGADORES</h1></center>

<button><a href= "${pageContext.request.contextPath}/jugadores/findOne?opcion=1">Agregar</a></button>
      <br></br>
      

<table>

			<thead>

				<tr>
					<th>IdJugadores</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Dorsal</th>
					<th>Edad</th>
					
					<th>Nacionalidad</th>
					<th>Posicion</th>
					<th>FormativaId</th>
					
					
				</tr>

			</thead>

			<tbody>

				<c:forEach var="item" items="${jugadoress}">

					<tr>

						<td>${item.idJugadores}</td>

						<td>${item.nombre}</td>

						<td>${item.apellido}</td>

						<td>${item.dorsal}</td>

						<td>${item.edad}</td>
						
						
						<td>${item.nacionalidad}</td>
						<td>${item.posicion}</td>
						<td>${item.formativa.nombre}</td>

						<td>

                        <button><a href= "${pageContext.request.contextPath}/jugadores/findOne?idJugadores=${item.idJugadores}&opcion=1">Actualizar</a></button>

						<button><a href= "${pageContext.request.contextPath}/jugadores/findOne?idJugadores=${item.idJugadores}&opcion=2">Borrar </a></button>

                   		</td>
                   		
					</tr>

				</c:forEach>

			</tbody>

		</table>
<br></br>
               <center><a href="${pageContext.request.contextPath}/formativa/findAll" class="btn-xl"> REGRESAR </a></center>
</div>
</body>
</html>