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

	<h1>Jugadores</h1>

	<hr/>

	 <form action="add" method="post">
	 
	 	 <input type="hidden" id="idJugadores" name ="idJugadores" value="${jugadores.idJugadores}"/>
 	 <br></br> 
	 <center>
	 
	 <h2>Nombre</h2>	
	 <input type="text" id="nombre" name ="nombre" value="${jugadores.nombre}"/>
	 <br></br> 
	
	<h2>Apellido</h2> 	
	 <input type="text" id="apellido" name ="apellido" value="${jugadores.apellido}"/>
	 <br></br> 
	 
	  <h2>Dorsal</h2>	
	 <input type="text" id="dorsal" name ="dorsal" value="${jugadores.dorsal}"/>
	 <br></br> 
	 
	 <h2>Edad</h2>	
	 <input type="text" id="edad" name ="edad" value="${jugadores.edad}"/>
	 <br></br> 
	 
	 <h2>Nacionalidad</h2>	
	 <input type="text" id="nacionalidad" name ="nacionalidad" value="${jugadores.nacionalidad}"/>
	 <br></br> 
	 
	 <h2>Posicion</h2>	
	 <input type="text" id="posicion" name ="posicion" value="${jugadores.posicion}"/>
	 <br></br> 
	 
	  <h2>Formativa</h2> 
	<select id="idFormativa" name="idFormativa">
	
	<c:forEach var="item"  items="${formativas}">
	<option value="${item.idFormativa}" ${jugadores.formativa.idFormativa == item.idFormativa ? 'selected':''}> ${item.nombre}</option>
	
	</c:forEach>
	
	</select>
	  <br></br>
	 
	 <button type="submit"  > GUARDAR D</button>
	 <br></br> 
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/jugadores/findAll' ; return false;"> CANCELAR</button>
	 </center>
	  <br></br> 
	  <br></br> 
	  <br></br> 
	 
	 
	 </form>
		</div>
</body>
</html>