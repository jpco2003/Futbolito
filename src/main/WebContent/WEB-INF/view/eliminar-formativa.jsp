<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Formativa</h1>
	
	<hr/>
	
	<form action="del" method="get"> 
	
	<input type="hidden" id="idFormativa" name="idFormativa" value="${formativa.idFormativa}">
	
	<strong> ¿Desea eliminar la formativa?</strong>
	
	 <br></br> 
	 
	<button type="submit"> ELIMINAR F</button>
	
	 <br></br>
	  
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/formativa/findAll' ; return false;"> CANCELAR</button>
	
	</form>
	
</body>
</html>