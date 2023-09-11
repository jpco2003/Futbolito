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
 
  <button><a href= "${pageContext.request.contextPath}/directiva/findOne?opcion=1">Agregar</a></button>
      <br></br>
      


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
						<td>${item.formativa.nombre}</td>
				
						<td>

                        <button><a href= "${pageContext.request.contextPath}/directiva/findOne?idDirectiva=${item.idDirectiva}&opcion=1">Actualizar</a></button>

						<button><a href= "${pageContext.request.contextPath}/directiva/findOne?idDirectiva=${item.idDirectiva}&opcion=2">Borrar </a></button>

                   		</td>

					</tr>

				</c:forEach>

			</tbody>

		</table>	
<br></br>
<br>


                <center><a href="${pageContext.request.contextPath}/formativa/findAll" class="btn-xl"> REGRESAR </a></center>
</d iv>
</body>
</html>