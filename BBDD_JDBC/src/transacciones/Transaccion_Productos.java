package transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Transaccion_Productos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Connection miConexion=null;
		
		try{					
				
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");	
			
			miConexion.setAutoCommit(false);
			
			Statement miStatement =miConexion.createStatement();
			
		    String instruccionSql_1="DELETE FOM PRODUCTOS WHERE PAISDEORIGEN='ITALIA' ";
			    
		    
			    
		    String instruccionSql_2="DELETTE FROM PRODUCTOS WHERE PRECIO> 300";
		    
		    String instruccionSql_3="UPDATE PRODUCTOS SET PRECIO=PRECIO*1.15";
		    
		    boolean ejecutar=ejecutar_transaccion();
		    
		    if(ejecutar) {
		    	
		    	miStatement.executeUpdate(instruccionSql_1);
				    
				miStatement.executeUpdate(instruccionSql_2);
				    
				miStatement.executeUpdate(instruccionSql_3);
				
				miConexion.commit();
				
				System.out.println("Se ejecuto la transaccion correctamente");
		    }else {
		    	
		    	System.out.println("No se realizo cambio alguno en BBDD");
		    	
		    }
	
		
		}catch(Exception e) {
			
			try {
				miConexion.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Algo salio mal y no se realizo cambio alguno BBD");
		}
		
	}
	
	static boolean ejecutar_transaccion() {
		
		String ejecucion=JOptionPane.showInputDialog("¿Ejecutamos transacción?");
		
		if(ejecucion.equals("Si")) return true;
		
		else return false;
		

		
	}

}
