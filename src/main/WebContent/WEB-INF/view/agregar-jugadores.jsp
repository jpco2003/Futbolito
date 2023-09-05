<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Jugadores</h1>

	<hr/>

	 <form action="add" method="post">
	 
	 	 <input type="hidden" id="idJugadores" name ="idJugadores" value="${jugadores.idJugadores}"/>
 	 <br></br> 
	 
	 
	 Nombre	
	 <input type="text" id="nombre" name ="nombre" value="${jugadores.nombre}"/>
	 <br></br> 
	
	 apellido	
	 <input type="text" id="apellido" name ="apellido" value="${jugadores.apellido}"/>
	 <br></br> 
	 
	  dorsal	
	 <input type="text" id="dorsal" name ="dorsal" value="${jugadores.dorsal}"/>
	 <br></br> 
	 
	 edad	
	 <input type="text" id="edad" name ="edad" value="${jugadores.edad}"/>
	 <br></br> 
	 
	 nacionalidad	
	 <input type="text" id="nacionalidad" name ="nacionalidad" value="${jugadores.nacionalidad}"/>
	 <br></br> 
	 
	 posicion	
	 <input type="text" id="posicion" name ="posicion" value="${jugadores.posicion}"/>
	 <br></br> 
	 
	 
	 <button type="submit"  > GUARDAR D</button>
	 <br></br> 
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/jugadores/findAll' ; return false;"> CANCELAR</button>
	 
	 
	 </form>
		
</body>
</html>