package conectaBD;

import java.sql.*;

public class Conecta_Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try {
				//1.CREAR CONEXION
				
				Connection miConexion=DriverManager.getConnection("jdbc:mysql://localHost:3306/pruebas","root","");
				
				//2. CREAR OBJETO STATEMENT
				
				Statement miStatement=miConexion.createStatement();
				
				//3. EJECUTAR SQL
				
				ResultSet miResultset=miStatement.executeQuery("SELECT * FROM PRODUCTOS");
				
				//4. RECOORER O LEER EL RESULTSER
				
				while(miResultset.next()) {
					
					System.out.println(miResultset.getString("NOMBREARTICULO") + " " + miResultset.getString("CODIGOARTICULO") + "  " + miResultset.getString("PRECIO")
					+" "  +miResultset.getDate("FECHA") );
				}
				
			}catch(Exception e) {
				
				System.out.println("No conecta!");
				
				e.getStackTrace();
			}
			
	}

}
