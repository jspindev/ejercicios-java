package controlador;

import java.awt.event.*;
import java.sql.*;

import modelo.*;
import vista.*;

public class ControladorBotonEjecuta  implements ActionListener{

	public ControladorBotonEjecuta(Marco_Aplicacion2 elmarco) {
		
		this.elmarco=elmarco;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String seleccionSeccion=(String)elmarco.secciones.getSelectedItem();
		
		String seleccionPais=(String)elmarco.paises.getSelectedItem();
		
		/*elmarco.resultado.append(obj.filtraBBDD(seleccionSeccion,seleccionPais));
		
		elmarco.resultado.append("\n");*/
		
		resultadoConsulta=obj.filtraBBDD(seleccionSeccion, seleccionPais);
		
		try {
			
			elmarco.resultado.setText("");
			
			while(resultadoConsulta.next()) {
				
				elmarco.resultado.append(resultadoConsulta.getString(1));
				
				elmarco.resultado.append(", ");
				
				elmarco.resultado.append(resultadoConsulta.getString(2));
				
				elmarco.resultado.append(", ");
				
				elmarco.resultado.append(resultadoConsulta.getString(3));
				
				elmarco.resultado.append(", ");
				
				elmarco.resultado.append(resultadoConsulta.getString(4));
				
				elmarco.resultado.append("\n");
				
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	private Marco_Aplicacion2 elmarco;
	
	EjecutaConsulta obj=new EjecutaConsulta();
	
	private ResultSet resultadoConsulta;
}
