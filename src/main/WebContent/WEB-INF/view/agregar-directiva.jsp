<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
    
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../resources/css/styles.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="fondo2" style="background-image: url('https://transforma.fusalmo.org/wp-content/uploads/Futbol-patio-virtual.gif');" >

<div class="arr2">

	<h1>Directiva</h1>

	<hr/>

	 <form action="add" method="post">
	 
	 	 <input type="hidden" id="idDirectiva" name ="idDirectiva" value="${directiva.idDirectiva}"/>
 	 <br></br> 
	 <center>
	 
	 <h2>Nombre</h2>	
	 <input type="text" id="nombre" name ="nombre" value="${directiva.nombre}"/>
	 <br></br> 
	
	<h2>apellido</h2> 	
	 <input type="text" id="apellido" name ="apellido" value="${directiva.apellido}"/>
	 <br></br> 
	 
	  <h2>cargo</h2>	
	 <input type="text" id="cargo" name ="cargo" value="${directiva.cargo}"/>
	 <br></br> 
	 
	 <h2>Correo</h2>	
	 <input type="text" id="correo" name ="correo" value="${directiva.correo}"/>
	 <br></br> 
	 
	 <h2>Telefono </h2>	
	 <input type="text" id="telefono" name ="telefono" value="${directiva.telefono}"/>
	 <br></br> 
	 
	 <h2>direccion</h2>	
	 <input type="text" id="direccion" name ="direccion" value="${directiva.direccion}"/>
	 <br></br> 
	 
	<h2>Formativa</h2>  
	<select id="idFormativa" name="idFormativa">
	
	
	
	<c:forEach var="item"  items="${formativas}">
	<option value="${item.idFormativa}" ${directiva.formativa.idFormativa == item.idFormativa ? 'selected':''}> ${item.nombre}</option>
	
	</c:forEach>
	
	</select>
	 <br></br> 
	  <br></br> 
	 
	 <button type="submit" > GUARDAR D</button>
	 <br></br> 
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/directiva/findAll' ; return false;"> CANCELAR</button></center>
	<br></br> 
	  <br></br> 
	  <br></br> 
	 
	 </form>
		</div>
</body>
</html>