<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 style="text-aling:center">Insertar Registros </h1>
	
	<form name="form1" method="get" action="ControladorProductos">
	<input type="hidden" name="instruccion" value="insertarBBDD">
	
		<table width="50%" border="0">
		
			<tr>
				<td width="27%">Codigo Articulo</td>
				<td width="73%"><label for="CArt"></label>
				<input type="text" name="CArt" id="CArt"></td>
			</tr>
			<tr>
				<td>Seccion</td>
				<td><label for="seccion"></label>
				<input type="text" name="seccion" id="seccion"></td>
			</tr>
		
			<tr>
				<td>Nombre Articulos</td>
				<td><label for="NArt"></label>
				<input type="text" name="NArt" id="NArt"></td>
			</tr>
			<tr>
				<td>Fecha</td>
				<td><label for="fecha"></label>
				<input type="text" name="fecha" id="fecha"></td>
			</tr>
			<tr>
				<td>Precio</td>
				<td><label for="precio"></label>
				<input type="text" name="precio" id="precio"></td>
			</tr>
			<tr>
				<td>Importado</td>
				<td><label for="importado"></label>
				<input type="text" name="importado" id="importado"></td>
			</tr>
			<tr>
				<td>Pais de Origen</td>
				<td><label for="pOrig"></label>
				<input type="text" name="pOrig" id="pOrig"></td>
			</tr>
			<tr>
				<td><input type="submit" name="envio" id="envio" value="Enviar" ></td>
				<td><input type="reset" name="borrar" id="borrar" value="Restablecer"></td> 
			</tr>
		
		</table>
	
	
	</form>

</body>
</html>