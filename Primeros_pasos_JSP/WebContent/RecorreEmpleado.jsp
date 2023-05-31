<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ talib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <%@ page import="java.util.*,java.sql.*,jsptags.Empleado" %>
    
    <%
    
    	ArrayList<Empleado> datos=new ArrayList<>();
    
    	Class.forName("com.mysql.jdbc.Driver");
    
    	try{
    		
    		Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhosr:3306/proyecto_jsp","root","");
    		
    		Statement miStatement=miConexion.createStatement();
    		
    		String instruccionSql="SELECT * FROM EMPLEADOS";
    		
    		ResultSet rs=miStatement.executeQuery(instruccionSql);
    		
    		while(rs.next()){
    			
    			datos.add(new Empleado(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
    		}
    		
    		rs.close();
    		
    		miConexion.close();
    		
    	}catch(Exception e){
    		out.println("Ha habido un error");
    	}
    
    	pageContext.setAttribute("losEmpleados",datos);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style ></style>
</head>
<body>

	<table border="1">
	
		<tr><td>Nombre</td><td>Apellido</td><td>Puesto</td><td>Salario</td><td>Bonus</td></tr>
		<c.forEach var="EmpTemp" items="${losEmpleados}">
	
			<tr>
	
			<td>${EmpTemp.nombre}</td>  <td>${EmpTemp.apellido}</td>   <td>${EmpTemp.puesto}</td>  
			
			<td>
				<c:if test="${EmpTemp.salario<40000}">  ${EmpTemp.salario+5000}  </c:if>
				
				<c:if test="${EmpTemp.salario>=40000}">${EmpTemp.salario}</c:if>
			</td>
		
			</br> 
			
			<td><c:if test="${EmpTemp.salario<40000}">5000</c:if>
			
				<c:if test="${EmpTemp.salario>=40000}">-----</c:if>
			
			</td>
			
			</tr>
		
		</c.forEach>
	</table>		

</body>
</html>