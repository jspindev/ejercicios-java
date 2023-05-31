<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

	// leyendo datos del formulario
	
	String ciudad_favorita=request.getParameter("ciudad_faavorita");

	//Crear la cookie
	
	Cookie laCookie=new Cookie("agencia_viaje.ciudad_favorita",ciudad_favorita);
	
	// vida de la cookie
	
	laCookie.setMaxAge(356*24*60*60);  // un año según calculo del parametro (en segundos)
	
	// enviar la cookie al usuario
	
	response.addCookie(laCookie);
	
%>

Gracias por enviar tus preferencias

<a href="agencias_viajes.jsp"> Ir a la agencia de viajes</a>

</body>
</html>