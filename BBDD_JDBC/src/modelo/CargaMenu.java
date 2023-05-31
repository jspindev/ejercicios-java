package modelo;

import java.sql.*;


public class CargaMenu {

	public CargaMenu() {
		
		miConexion=new Conexion();
		
		
		
	}
	
	
	/*public String ejecutaConsulta() {
		
		Productos miProducto=null;
		
		Connection accesoBBDD=miConexion.dameConexion();
		
		try {
			
			Statement secciones=accesoBBDD.createStatement();
			
			rs=secciones.executeQuery("SELECT DISTINCTROW SECCION FROM PRODUCTOS");
			
			miProducto=new Productos();
			
			miProducto.setSeccion(rs.getString(1));
			
			rs.close();
			
			
		}catch(Exception e) {
			
		}
		
		return miProducto.getSeccion();
	}*/
	
	public String ejecutaConsultas() {
		
		Productos miProducto=null;
		
		Connection accesoBBDD=miConexion.dameConexion();
		
		try {
			
			Statement secciones=accesoBBDD.createStatement();
			
			Statement paises=accesoBBDD.createStatement();
			
			 rs=secciones.executeQuery("SELECT DISTINCTROW SECCION FROM PRODUCTOS");

			 rs2=paises.executeQuery("SELECT DISTINCTROW SECCION FROM PRODUCTOS");
			 
			 miProducto=new Productos();
			 
			 miProducto.setSeccion(rs.getString(1));
			 
			 miProducto.setpOrigen(rs2.getString(1));
			 
			 rs.close();
			 rs2.close();
			 
			 accesoBBDD.close();
			 
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return miProducto.getSeccion();
		
	}
	
	
	public Conexion miConexion;
	
	public ResultSet rs , rs2;
	

}
