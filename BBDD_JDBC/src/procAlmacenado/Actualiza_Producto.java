package procAlmacenado;

import java.sql.*;

import javax.swing.JOptionPane;

public class Actualiza_Producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nPrecio=Integer.parseInt(JOptionPane.showInputDialog("Introduce precio"));
		
		String nArticulo=JOptionPane.showInputDialog("Introduce nombre artículo");
		
		try {
			
			 Connection miConexion=DriverManager.getConnection("jdbc:mysql://localHost:3306/pruebas","root","");
			
			 CallableStatement miSentencia=miConexion.prepareCall("{call ACTUALIZA_PROD(?,?)}");
			 
			 miSentencia.setInt(1, nPrecio);
			 
			 miSentencia.setString(2, nArticulo);
			 
			 miSentencia.execute();
			 
			 System.out.println("Actualizacion OK.");
		
		}catch(Exception e) {
			
			
			
		}
		
	}

}
