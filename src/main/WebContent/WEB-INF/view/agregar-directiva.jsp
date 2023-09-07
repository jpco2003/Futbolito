<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
    
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Directiva</h1>

	<hr/>

	 <form action="add" method="post">
	 
	 	 <input type="hidden" id="idDirectiva" name ="idDirectiva" value="${directiva.idDirectiva}"/>
 	 <br></br> 
	 
	 
	 Nombre	
	 <input type="text" id="nombre" name ="nombre" value="${directiva.nombre}"/>
	 <br></br> 
	
	 apellido	
	 <input type="text" id="apellido" name ="apellido" value="${directiva.apellido}"/>
	 <br></br> 
	 
	  cargo	
	 <input type="text" id="cargo" name ="cargo" value="${directiva.cargo}"/>
	 <br></br> 
	 
	 Correo	
	 <input type="text" id="correo" name ="correo" value="${directiva.correo}"/>
	 <br></br> 
	 
	 Telefono	
	 <input type="text" id="telefono" name ="telefono" value="${directiva.telefono}"/>
	 <br></br> 
	 
	 direccion	
	 <input type="text" id="direccion" name ="direccion" value="${directiva.direccion}"/>
	 <br></br> 
	 
	 Formativa 
	<select id="idFormativa" name="idFormativa">
	
	<c:forEach var="item"  items="${formativas}">
	<option value="${item.idFormativa}" ${directiva.formativa.idFormativa == item.idFormativa ? 'selected':''}> ${item.nombre}</option>
	
	</c:forEach>
	
	</select>
	 <br></br> 
	 
	 <button type="submit"  > GUARDAR D</button>
	 <br></br> 
	 <button type="button" onclick="window.location.href='/Futbol-Proyecto/directiva/findAll' ; return false;"> CANCELAR</button>
	 
	 
	 </form>
		
</body>
</html>