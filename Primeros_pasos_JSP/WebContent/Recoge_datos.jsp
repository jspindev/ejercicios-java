<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="java.sql.*" %>

<%

	String nombre=request.getParameter("nombre");

	String apellido=request.getParameter("apellido");

	String usuario=request.getParameter("usuario");

	String contra=request.getParameter("contra");

	String pais=request.getParameter("pais");

	String tecno=request.getParameter("tecnologias");
	
	Class.forName("com.mysql.jdbc.Driver");
	
	try{
	java.sql.Connection miConexion=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectos_jsp","root","");
	
	java.sql.Statement miStatement=miConexion.createStatement();
	
	String instruccionSql="INSERT INTO USUARIOS(Nombre,Apellido, Usuario, Contraseña, Pais, Tecnologia) VALUES ('" + nombre + "','"+ apellido +"','"+usuario+"','"+contra+"','"+ pais +"','"+ tecno +"',)";
	
	miStatement.executeUpdate(instruccionSql);
	
	out.println("Registrado con exito");
	}catch(Exception e){
		
		out.println("Ha habido un error ");
	}

%>


</body>
</html>