package controlador;

import java.sql.*;

public class Conexion {
	
	Connection miConexion=null;
	
	public Conexion() {
		
	}
	
	public Connection dameConexion() {
		
		try {
			
			 miConexion=DriverManager.getConnection("jdbc:mysql://localHost:3306/pruebas","root","");
			 
		}catch(Exception e) {
			
		}
		
		return miConexion;
	}

}
