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

	 <form action="add"method="post">
	 
	 	 <input type="hidden" id="idFormativa" name ="idFormativa" value="${formativas.idFormativa}"/>
 	 <br></br> 
	 
	 
	 Nombre	
	 <input type="text" id="nombre" name ="nombre" value="${formativas.nombre}"/>
	 <br></br> 
	
	 Direccion	
	 <input type="text" id="direccion" name ="direccion" value="${formativas.direccion}"/>
	 <br></br> 
	 
	 Correo	
	 <input type="text" id="correo" name ="correo" value="${formativas.correo}"/>
	 <br></br> 
	 
	 Telefono	
	 <input type="text" id="telefono" name ="telefono" value="${formativas.telefono}"/>
	 <br></br> 
	 
	 
	 <button type="submit"  > GUARDAR F</button>
	 <br></br> 
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/formativa/findAll' ; return false;"> CANCELAR</button>
	 
	 
	 </form>
		
</body>
</html>