package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPruebaArea mimarco= new MarcoPruebaArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoPruebaArea extends JFrame{
// esta haciendolo sin utilizar la modulacion no es rocomendable es un codigo muy sucio 
	public MarcoPruebaArea(){
		
		setTitle("Probando Área de texto");
		
		setBounds(500,300,500,350);
		
		setLayout(new BorderLayout());
		
		laminaBotones = new JPanel();
		
		botonInsertar= new JButton("Insertar");
		
		botonInsertar.addActionListener(new  ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				areaTexto.append("En un lugar de la mancha cuyo nombre no quiero acordarme");
			}
			
		});
		
		laminaBotones.add(botonInsertar);
		
		botonSaltoLinea=new JButton("salto Línea");
		
		botonSaltoLinea .addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				boolean saltar=!areaTexto.getLineWrap();
				
				areaTexto.setLineWrap(saltar);
				
				/*if(saltar==true){
					
					botonSaltoLinea.setText("Quitar salto");
				}else{
					
					botonSaltoLinea.setText("Salto Línea");
				}*/
				
				botonSaltoLinea.setText(saltar ? "Quitar salto" : "Salto Línea");//operador ternario es como un if 
			}
		});
		
		laminaBotones.add(botonSaltoLinea);
		
		add(laminaBotones, BorderLayout.SOUTH);
		
		areaTexto=new JTextArea(8,20);
		
		laminaConBarras=new JScrollPane(areaTexto);
		
		add(laminaConBarras,BorderLayout.CENTER);
		
	}
	
	private JPanel laminaBotones;
	
	private JButton botonInsertar, botonSaltoLinea;
	
	private JTextArea areaTexto;
	
	private JScrollPane laminaConBarras;
}