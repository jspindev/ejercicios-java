package conectaBD;

import java.sql.*;

public class ModificaBBDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//1.CREAR CONEXION
			
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localHost:3306/pruebas","root","");
			
			//2. CREAR OBJETO STATEMENT
			
			Statement miStatement=miConexion.createStatement();
			
			//3. EJECUTAR SQL
			/* insertando un producto a la tabla
			//	String instruccionSql="INSERT INTO PRODUCTOS(CODIGOARTICULO,NOMBREARTICULO,PRECIO) VALUES('AR77' , 'PANTALON' , 25035)";*/
			
			
			/*actualiza articulo cambiar el syso y ya esta 
			String instruccionSql="UPDATE PRODUCTOS SET PRECIO=PRECIO*2 WHERE CODIGOARTICULO='AR77'";*/
			
			
			//borrar articulo de la tabla de la base de datos
			
				String instruccionSql="DELETE PRODUCTOS WHERE CODIGOARTICULO='AR77'";
			
				miStatement.executeUpdate(instruccionSql);
				
				System.out.println("Datos insertados correctamente");
			
			//4. RECOORER O LEER EL RESULTSER
			
			
			
		}catch(Exception e) {
			
			System.out.println("No conecta!");
			
			e.getStackTrace();
		}
	}

}
