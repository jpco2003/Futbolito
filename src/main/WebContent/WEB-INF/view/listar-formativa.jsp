<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

<link rel="stylesheet" type="text/css"
	href="../resources/css/styles.css">
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>

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
					<th>Logo</th>
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
						
						<td><img width="100" height="100" src="${pageContext.request.contextPath}/resources/img/${item.logo}"/></td>
						
						
						<td>

                        <button><a href= "${pageContext.request.contextPath}/formativa/findOne?idFormativa=${item.idFormativa}&opcion=1">Actualizar</a></button>
						<button id="eliminar" name="eliminar"  onclick="window.modal.showModal(); document.getElementById('idFormativa').value=${item.idFormativa}">Borrar</button>
						
                   		</td>


					</tr>

				</c:forEach>

			</tbody>

		</table>

		<br></br>


		<center>
			<a href="${pageContext.request.contextPath}/menu.jsp"
				class="btn-xl"> regresar </a>
		</center>



		<br></br> <br></br>
    
    <dialog id="modal">
  	<form action="del" method="get"> 
	
	<input type="hidden" id="idFormativa" name="idFormativa" value="">
	
	<strong> ¿Desea eliminar la formativa?</strong>
	
	 <br></br> 
	 
	<center> <button class="btn btn-outline-danger"  type="submit"> CONFIRMAR</button> </center>
	
	 <br></br>
	  
	<center> <button type="button" class="btn btn-outline-secondary" onclick="window.location.href='/Futbol-Proyecto/formativa/findAll' ; return false;"> CANCELAR</button></center>
	
	</form>
  
   
   
</dialog>
     

	</div>
</body>
</html>
