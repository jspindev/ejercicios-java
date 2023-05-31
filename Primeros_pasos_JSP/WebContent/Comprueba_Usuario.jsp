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

	

	String usuario=request.getParameter("usuario");

	String contra=request.getParameter("contra");

	
	Class.forName("com.mysql.jdbc.Driver");
	
	try{
	Connection miConexion=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectos_jsp","root","");
	
	PreparedStatement  c_preparada=miConexion.prepareStatement("SELECT * FORM USUARIO=? AND CONTRASEÑA=?");
	
	c_preparada.setString(1,usuario);
	
	c_preparada.setString(2,contra);
	
	ResultSet miResultset=c_preparada.executeQuery();
	
	if(miResultset.absolute(1)) out.print("Usuario autorizado");
	
	else out.print("No hay usuario con esos datos");
	
	
	}catch(Exception e){
		
		out.println("Ha habido un error ");
	}

%>


</body>
</html>