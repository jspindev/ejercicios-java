


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;

public class Recursos_JAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRecursos mimarco=new MarcoRecursos();
		
		mimarco.setVisible(true);
	}

}


class MarcoRecursos extends JFrame{
	
	public MarcoRecursos() {
		
		setTitle("Prueba de Recursos");
		
		setBounds(300,300,300,300);
		
		add(new LaminaRecursos());
	}
	
}

class LaminaRecursos extends JPanel{
	
	public LaminaRecursos() {
		
		setLayout(new BorderLayout());
		
		zonaTexto=new JTextArea();
		
		add(new JScrollPane(zonaTexto),BorderLayout.CENTER);
		// no esta la imagen por eso me da error 
		URL ruta_boton=LaminaRecursos.class.getResource("Verde.gif");
		
		JButton boton_acerca_de=new JButton("Dale",new ImageIcon(ruta_boton));
		
		boton_acerca_de.addActionListener(new Accion_Boton());
		
		add(boton_acerca_de,BorderLayout.SOUTH);
	}
	
	private class Accion_Boton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println("El boton Funciona");;
		}
		
	}
	
	private JTextArea zonaTexto;
	
	
}