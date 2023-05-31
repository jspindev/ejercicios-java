<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <!--   <%@ page import="java.util.*, com.pildorasinformaticas.productos.*"%> -->
   
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

	.cabecera{
		font-saize:1.2em;
		font-weight:bold;
		color:#FFFFFF;
		background-color: #08088A;
	}
	
	.filas{
		text-align:center;
		background-color: #5882FA;
	}

	table{
		float:left;
	}
	
	#contenedorBoton{
		margin-left:1000px;
	}
</style>
</head>




<body>
	
	
	<table>
		
		<tr>
			<td class="cabecera">Codigo articulo</td>
			<td class="cabecera"> Seccion</td>
			<td class="cabecera">Nombre Articulo</td>
			<td class="cabecera">Fecha</td>
			<td class="cabecera"> Precio</td>
			<td class="cabecera">Importado</td>
			<td class="cabecera">Pais de origen</td>
			<td class="cabecera">Accion</td>
		</tr>
	
		<c:forEach var = "tempProd" items="${LISTAPRODUCTOS} ">
		
		
			<!-- Link para cada producto con su campo  clave -->
			
			<c:url var="linkTemp" value="ComtroladorProductos">
				<c:param name="instruccion" value="cargar"></c:param>
				<c:param name="CArticulo" value="${TempProd.cArt}"></c:param>
			</c:url>
			<tr>
			
				<td class="filas">${TempProd.cArt}</td> 
				<td class="filas">${TempProd.Seccion}</td> 
				<td class="filas">${TempProd.nArt}</td> 
				<td class="filas">${TempProd.Fecha}</td> 
				<td class="filas">${TempProd.Precio}</td> 
				<td class="filas">${TempProd.Importado}</td> 
				<td class="filas">${TempProd.pOrigen}</td> 
				<td class="filas"><a href="${linkTemp}">actualizar</a></td> 
				
				
			
				
			</tr>
		</c:forEach>
		
	</table>
	
	<div id="contenedorBoton"> 
	
		<input type="button" value="Insertar Registro" onclick="window.location.href='inserta_producto.jsp'"/>
		
	</div>



</body>
</html>