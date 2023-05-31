package metadatos;

import java.sql.*;

public class Info_MetaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mostrarInfo_BBDD();

	}
	
	static void mostrarInfo_BBDD() {
		
		Connection miConexion=null;
		
		try {
			
			
			 miConexion=DriverManager.getConnection("jdbc:mysql://localHost:3306/pruebas","root","");
			
			//Obtencion de metadatos
			 
			 DatabaseMetaData datosBBDD=miConexion.getMetaData();
		
			//Mostramos informacion de la base de datos
			 
			 System.out.println("Gestor de BBDD: " + datosBBDD.getDatabaseProductName());
			 
			 System.out.println("Version del Gestor: " + datosBBDD.getDatabaseProductVersion());
			 
			 System.out.println("Nombre del driver " + datosBBDD.getDriverName());
			 
			 System.out.println("Version del driver: " + datosBBDD.getDriverVersion());
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
			try {
				miConexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	static void mostrarInfo_Tablas() {
		
		Connection miConexion=null;
		
		ResultSet miResulset=null;
		
		try {
			
			
			 miConexion=DriverManager.getConnection("jdbc:mysql://localHost:3306/pruebas","root","");
			
			//Obtencion de metadatos
			 
			 DatabaseMetaData datosBBDD=miConexion.getMetaData();
			 
			 //lista de tablas
			 
			 System.out.println("Lista de tablas");
			 
			 miResulset=datosBBDD.getTables(null, null, null, null);
			 
			 while(miResulset.next()) {
				 
				 System.out.println(miResulset.getString("TABLE_NAME"));
			 }
			 
			 System.out.println(" ");
			 
			 System.out.println("Campos de Productos");
			 
			 miResulset=datosBBDD.getColumns(null, null, "productos", null);
			 
			 while(miResulset.next()) {
				 
				 System.out.println(miResulset.getString("COLUMN_NAME"));
			 }
			 
			 
			 
			 
			 
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
			try {
				miConexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			 
		
	}

	
}
