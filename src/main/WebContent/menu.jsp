<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
<style>
  section {
    display: flex;
    width: 1420px;
    height: 630px;
    }
    section img {
    
    width: 0px;
    flex-grow: 1;
    object-fit: cover;
    opacity: .8;
    transition: .5 ease;
    }
    
    section img:hover{
    cursor: crosshair;
    width: 300px;
    opacity: 1;
    filter: contrast(120%);
    
    }
</style>
<section>
<img  onclick="window.location.href='/Futbol-Proyecto/directiva/findAll' ; return false;" src="resources/img/directiva.jpg">
<img onclick="window.location.href='/Futbol-Proyecto/formativa/findAll' ; return false;" src="resources/img/formativa.jpg"> 
<img onclick="window.location.href='/Futbol-Proyecto/jugadores/findAll' ; return false;" src="resources/img/jugadores.jpg">
<img onclick="window.location.href='/Futbol-Proyecto/patrocinadores/findAll' ; return false;" src="resources/img/patrocinadores.jpg">
</section>
</body>
</html>