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

	<h1>Patrocinadores</h1>

	<hr/>

	 <form action="add" method="post">
	 
	 	 <input type="hidden" id="idPatrocinadores" name ="idPatrocinadores" value="${patrocinadores.idPatrocinadores}"/>
 	 <br></br> 
	 
	 <center>
	 <h2>Nombre</h2>	
	 <input type="text" id="nombre" name ="nombre" value="${patrocinadores.nombre}"/>
	 <br></br> 
	
	 <h2>Telefono</h2>	
	 <input type="text" id="telefono" name ="telefono" value="${patrocinadores.telefono}"/>
	 <br></br> 
	 
	 
	 <h2>Correo</h2>	
	 <input type="text" id="correo" name ="correo" value="${patrocinadores.correo}"/>
	 <br></br> 
	 
	 <h2>Pais</h2>	
	 <input type="text" id="pais" name ="pais" value="${patrocinadores.pais}"/>
	 <br></br> 
	 
	  <h2>Directiva</h2> 
	<select id="idDirectiva" name="idDirectiva">
	
	<c:forEach var="item"  items="${directivas}">
	<option value="${item.idDirectiva}" ${patrocinadores.directiva.idDirectiva == item.idDirectiva ? 'selected':''}> ${item.cargo}</option>
	
	</c:forEach>
	
	</select>
	 <br></br> 
	 
	 
	 <button type="submit"  > GUARDAR D</button>
	 <br></br> 
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/patrocinadores/findAll' ; return false;"> CANCELAR</button>
	 <br></br> 
	  <br></br> 
	  <br></br> 
	 
	 </center>
	 </form>
		</div>
</body>
</html>