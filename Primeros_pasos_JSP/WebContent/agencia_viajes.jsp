<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-alinge:center"> Agencia de viajes</h1>

<%

	//valor por defecto
	String ciudad_favorita="Madrid";
	
	//lee la cookie de la peticion del navegador
	
	Cookie[] lasCookies=request.getCookies();
	
	// buscar las preferencias .la ciudad favorita
	
	if(lasCookies!=null){
		
		for(Cookie cookie_temporal : lasCookies){
			
			if("agenvia_viajes.ciudad_favorita".equals(cookie_temporal.getName())){
				
				ciudad_favorita=cookie_temporal.getValue();
				
				break;
			}
		}
	}

%>

<h3>Vuelos a <%= ciudad_favorita %></h3>

<p> Esto es un texto de ejemplo</p>
<p> Esto es un texto de ejemplo</p>
<p> Esto es un texto de ejemplo</p>


<h3>Hoteles en  <%= ciudad_favorita %></h3>

<p> Esto es un texto de ejemplo</p>
<p> Esto es un texto de ejemplo</p>
<p> Esto es un texto de ejemplo</p>

<h3>Descuentos en restaurantes de <%= ciudad_favorita %></h3>

<p> Esto es un texto de ejemplo</p>
<p> Esto es un texto de ejemplo</p>
<p> Esto es un texto de ejemplo</p>


</body>
</html>