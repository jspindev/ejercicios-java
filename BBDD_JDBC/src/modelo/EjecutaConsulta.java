package modelo;

import java.sql.*;

public class EjecutaConsulta {
	
	
	public EjecutaConsulta() {
		
		miConexion=new Conexion();
		
	}
	
	public ResultSet filtraBBDD(String seccion, String pais) {
		
		//pruebas="";
		
		Connection conecta=miConexion.dameConexion();
		
		rs=null;
		try {
		if(!seccion.equals("Todos") && pais.equals("Todos") ){
			
			//pruebas="Has escogido una sección";
			
			enviaConsultaSeccion=conecta.prepareStatement(consultaSeccion);
			
			enviaConsultaSeccion.setString(1, seccion);
			
			rs=enviaConsultaSeccion.executeQuery();
			
		}else if(seccion.equals("Todos") && !pais.equals("Todos")) {
			
			//pruebas="Has escogido país";
			
			enviaConsultaPais=conecta.prepareStatement(consultaPais);
			
			enviaConsultaPais.setString(1, pais);
			
			rs=enviaConsultaPais.executeQuery();
		
		}else {
			
			//pruebas="Has escogido ambos";
			
			enviaConsultaTodos=conecta.prepareStatement(consultaTodos);
			
			enviaConsultaTodos.setString(1, seccion);
			
			enviaConsultaTodos.setString(2, pais);
			
			rs=enviaConsultaTodos.executeQuery();
			
			
		}
		
		}catch(Exception e) {}
		
		
		return rs;
		
		
		//return pruebas;
		
	}

	//private String pruebas;
	
	private Conexion miConexion;
	
	private ResultSet rs;
	
	private PreparedStatement enviaConsultaSeccion;
	
	private final String consultaSeccion="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS WHERE SECCION=?";
	
	private PreparedStatement enviaConsultaPais;
	
	private final String consultaPais="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS WHERE PAISDEORIGEN=?";
	
	private PreparedStatement enviaConsultaTodos;
	
	private final String consultaTodos="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS WHERE SECCION=? AND PAISDEORIGEN=?";
	
	
}
