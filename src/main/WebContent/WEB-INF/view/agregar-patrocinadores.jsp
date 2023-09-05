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

	 <form action="add" method="post">
	 
	 	 <input type="hidden" id="idPatrocinadores" name ="idPatrocinadores" value="${patrocinadores.idPatrocinadores}"/>
 	 <br></br> 
	 
	 
	 Nombre	
	 <input type="text" id="nombre" name ="nombre" value="${patrocinadores.nombre}"/>
	 <br></br> 
	
	 telefono	
	 <input type="text" id="telefono" name ="telefono" value="${patrocinadores.telefono}"/>
	 <br></br> 
	 
	 
	 Correo	
	 <input type="text" id="correo" name ="correo" value="${patrocinadores.correo}"/>
	 <br></br> 
	 
	 pais	
	 <input type="text" id="pais" name ="pais" value="${patrocinadores.pais}"/>
	 <br></br> 
	 
	 
	 
	 
	 <button type="submit"  > GUARDAR D</button>
	 <br></br> 
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/patrocinadores/findAll' ; return false;"> CANCELAR</button>
	 
	 
	 </form>
		
</body>
</html>