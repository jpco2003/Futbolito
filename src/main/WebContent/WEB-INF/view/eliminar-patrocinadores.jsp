<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Patrocinadores</h1>
	
	<hr/>
	
	<form action="del" method="get"> 
	
	<input type="hidden" id="idPatrocinadores" name="idPatrocinadores" value="${patrocinadores.idPatrocinadores}">
	
	<strong> ¿Desea eliminar el patrocinador?</strong>
	
	 <br></br> 
	 
	<button type="submit"> ELIMINAR P</button>
	
	 <br></br>
	  
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/patrocinadores/findAll' ; return false;"> CANCELAR</button>
	
	</form>
	
</body>
</html>