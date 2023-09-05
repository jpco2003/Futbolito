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
	
	<form action="del" method="get"> 
	
	<input type="hidden" id="idJugadores" name="idJugadores" value="${jugadores.idJugadores}">
	
	<strong> ¿Desea eliminar el jugadore?</strong>
	
	 <br></br> 
	 
	<button type="submit"> ELIMINAR D</button>
	
	 <br></br>
	  
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/jugadores/findAll' ; return false;"> CANCELAR</button>
	
	</form>
	
</body>
</html>