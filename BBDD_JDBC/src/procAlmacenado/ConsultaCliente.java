package procAlmacenado;

import java.sql.*;

public class ConsultaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			 Connection miConexion=DriverManager.getConnection("jdbc:mysql://localHost:3306/pruebas","root","");
			
			 CallableStatement miSentencia=miConexion.prepareCall("{call MUESTRA_CLIENTES}");
			 
			 ResultSet rs=miSentencia.executeQuery();
			 
			 while(rs.next()) {
				 
				 System.out.println(rs.getString(1) + " " + rs.getString(2) +" " + rs.getString(3));
			 }
			 
		}catch(Exception e){
			
		}
	}

}
