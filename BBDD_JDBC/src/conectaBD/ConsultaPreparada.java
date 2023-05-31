package conectaBD;

import java.sql.*

public class ConsultaPreparada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			// 1. crear conexion
				Connection miConexion=DriverManager.getConnection("jdbc:mysql://localHost:3306/pruebas","root","");
			
			//2.Preparar Consulta
				
				PreparedStatement miSentencia=miConexion.prepareStatement("SELECT NOMBREARTICULO, SECCION , PAISORIGEN FROM PRODUCTOS " + " WHERE SECCION=? AND PAISDEORIGEN=? ");
			
				
			//3: establecer los parametros de consulta
				
				miSentencia.setString(1, "deportes");
				
				miSentencia.setString(2, "USA");
				
			//4 ejecutar y recorrer consulta
				
				ResultSet rs=miSentencia.executeQuery();
				
				while(rs.next()) {
					
					System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
				}
				
				rs.close();
				
				// reutilizacion de consulta sql 
				
				System.out.println("EJECUCION SEGUNDA CONSULTA");
				
				System.out.println(" ");
				
				
				
			// 1. crear conexion
				 miConexion=DriverManager.getConnection("jdbc:mysql://localHost:3306/pruebas","root","");
			
			//2.Preparar Consulta
				
				 miSentencia=miConexion.prepareStatement("SELECT NOMBREARTICULO, SECCION , PAISORIGEN FROM PRODUCTOS " + " WHERE SECCION=? AND PAISDEORIGEN=? ");
			
				
			//3: establecer los parametros de consulta
				
				miSentencia.setString(1, "ROPA");
				
				miSentencia.setString(2, "SPAIN");
				
			//4 ejecutar y recorrer consulta
				
				 rs=miSentencia.executeQuery();
				
				while(rs.next()) {
					
					System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
				}
				
				rs.close();
				
		
		}catch(Exception e) {
			
			e.getStackTrace();
		}
	}

}
