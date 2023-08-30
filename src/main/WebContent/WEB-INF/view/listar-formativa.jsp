<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet" type="text/css" href="../resources/css/styles.css">

<meta charset="ISO-8859-1">
<title>Formativas Softbol</title>
</head>


<body class="fondo">

	<div class="arr">

	<h1>Formativa</h1>
	
	
	 <table>

        <thead>

            <tr>

                <th>IdFormativa</th>
                
	
                <th>Nombre</th>

                <th>Direccion</th>

                <th>Correo</th>

                <th>Telefono</th>

                
            </tr>

        </thead>

        <tbody>

            <c:forEach var="item" items="${formativas}">

                <tr>

                    <td>${item.IdFormativa}</td>

                    <td>${item.Nombre}</td>

                    <td>${item.Direccion}</td>

                    <td>${item.Correo}</td>

                    <td>${item.Telefono}</td>


                </tr>

            </c:forEach>

        </tbody>e

    </table>
    
	<br></br>
	
	
	<center ><a href="${pageContext.request.contextPath}/directiva/findAll" class="btn-xl"> DIRECTIVA </a></center>

	
	<br></br>
	<br></br>
	<br></br>
	
	<center ><a href="${pageContext.request.contextPath}/jugadores/findAll" class="btn-xl"> JUGADORES </a></center>
	
	
	<br></br>
	<br></br>
	<br></br>
	
	<center ><a href="${pageContext.request.contextPath}/patrocinadores/findAll" class="btn-xl"> PATROCINADORES </a></center>
	
	<br></br>
	<br></br>
	
	
	</div>
</body>
</html>
