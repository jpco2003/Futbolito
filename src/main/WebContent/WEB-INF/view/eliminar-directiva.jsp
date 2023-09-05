<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Directiva</h1>
	
	<hr/>
	
	<form action="del" method="get"> 
	
	<input type="hidden" id="idDirectiva" name="idDirectiva" value="${directiva.idDirectiva}">
	
	<strong> ¿Desea eliminar la directiva?</strong>
	
	 <br></br> 
	 
	<button type="submit"> ELIMINAR D</button>
	
	 <br></br>
	  
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/directiva/findAll' ; return false;"> CANCELAR</button>
	
	</form>
	
</body>
</html>