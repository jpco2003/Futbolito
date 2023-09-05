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

	 <form action="add" method="post">
	 
	 	 <input type="hidden" id="idFormativa" name ="idFormativa" value="${formativa.idFormativa}"/>
 	 <br></br> 
	 
	 
	 Nombre	
	 <input type="text" id="nombre" name ="nombre" value="${formativa.nombre}"/>
	 <br></br> 
	
	 Direccion	
	 <input type="text" id="direccion" name ="direccion" value="${formativa.direccion}"/>
	 <br></br> 
	 
	 Correo	
	 <input type="text" id="correo" name ="correo" value="${formativa.correo}"/>
	 <br></br> 
	 
	 Telefono	
	 <input type="text" id="telefono" name ="telefono" value="${formativa.telefono}"/>
	 <br></br> 
	 
	 
	 <button type="submit"  > GUARDAR F</button>
	 <br></br> 
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/formativa/findAll' ; return false;"> CANCELAR</button>
	 
	 
	 </form>
		
</body>
</html>