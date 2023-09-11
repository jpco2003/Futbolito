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
<body class="fondo2" style="background-image: url('https://transforma.fusalmo.org/wp-content/uploads/Futbol-patio-virtual.gif');">
<div class="arr2">
	<h1>Formativa</h1>

	<hr/>

	 <form action="add" method="post">
	 
	 	 <input type="hidden" id="idFormativa" name ="idFormativa" value="${formativa.idFormativa}"/>
 	 <br></br> 
	 
	 	 <center>
	 
	 <h2>Nombre</h2>	
	 <input type="text" id="nombre" name ="nombre" value="${formativa.nombre}"/>
	 <br></br> 
	
	 <h2>Direccion</h2>	
	 <input type="text" id="direccion" name ="direccion" value="${formativa.direccion}"/>
	 <br></br> 
	 
	 <h2>Correo</h2>	
	 <input type="text" id="correo" name ="correo" value="${formativa.correo}"/>
	 <br></br> 
	 
	 <h2>Telefono</h2>	
	 <input type="text" id="telefono" name ="telefono" value="${formativa.telefono}"/>
	 <br></br> 
	 
	 
	 <button type="submit"  > GUARDAR F</button>
	 <br></br> 
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/formativa/findAll' ; return false;"> CANCELAR</button>
	 	 <br></br> 
	  <br></br> 
	  <br></br> 
	 </center>
	 </form>
		</div>
</body>
</html>