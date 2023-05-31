package def;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCalculadora mimarco=new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
		
	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora(){
		
		setTitle("Calculadora");
		
		setBounds(500,300,450,300);
		
		LaminaCalculadora milamina=new LaminaCalculadora();
		
		add(milamina);
		
		//pack();
		
	}
	
}

class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora(){
		
		principio=true;
		
		setLayout(new BorderLayout());
		
		 pantalla=new JButton("0");
		
		pantalla.setEnabled(false);
		
		add(pantalla,BorderLayout.NORTH);
		
		milamina2=new JPanel();
		
		milamina2.setLayout(new GridLayout(4,4));
		
		ActionListener insertar=new InsertaNumero();
		
		ActionListener orden=new AccionOrden();
		
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		ponerBoton("/",orden);
		
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		ponerBoton("*",orden);
		
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		ponerBoton("-",orden);
		
		ponerBoton("0",insertar);
		ponerBoton(".",insertar);
		ponerBoton("=",orden);
		ponerBoton("+",orden);
		
		add(milamina2,BorderLayout.CENTER);
		
		ultimaOperacion="=";
		
		/*JButton boton1=new JButton("1");
		
		milamina2.add(boton1);
		
		JButton boton2=new JButton("2");
		
		milamina2.add(boton2);
		
		JButton boton3=new JButton("3");
		
		milamina2.add(boton3);
		
		JButton boton4=new JButton("4");
		
		milamina2.add(boton4);
		
		JButton boton5=new JButton("5");
		
		milamina2.add(boton5);
		
		JButton boton6=new JButton("6");
		
		milamina2.add(boton6);
		
		JButton boton7=new JButton("7");
		
		milamina2.add(boton7);
		
		JButton boton8=new JButton("8");
		
		milamina2.add(boton8);
		
		JButton boton9=new JButton("9");
		
		milamina2.add(boton9);
		
		JButton botonigual=new JButton("=");
		
		milamina2.add(botonigual);
		
		JButton botonpor=new JButton("*");
		
		milamina2.add(botonpor);
		
		JButton botonmas=new JButton("+");
		
		milamina2.add(botonmas);
		
		JButton botonres=new JButton("-");
		
		milamina2.add(botonres);
		
		JButton botondiv=new JButton("/");
		
		milamina2.add(botondiv);
		
		JButton botondeg=new JButton(".");
		
		milamina2.add(botondeg);
		
		JButton botonbla=new JButton(" ");
		
		milamina2.add(botonbla);*/
		
		
		
		add(milamina2,BorderLayout.CENTER);
		

	}
	
	private void ponerBoton(String rotulo,ActionListener oyente){
		
		JButton boton= new JButton(rotulo);
		
		boton.addActionListener(oyente);
		
		milamina2.add(boton);
	}
	
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String entrada=e.getActionCommand();
			
			if(principio){
				
				pantalla.setText("");
				
				principio=false;
			}
			
			pantalla.setText(pantalla.getText() + entrada);
			
			
			
		}
		
		
	}
	
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String operacion=e.getActionCommand();
			
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaOperacion=operacion;
			
			principio=true;
			
			
		}
		
		public void calcular(double x){
			
			if(ultimaOperacion.equals("+")){
				
				resultado+=x;
				
				System.out.println(resultado);
				
			}
			else if(ultimaOperacion.equals("-")){
				
				resultado-=x;
			}
			else if(ultimaOperacion.equals("*")){
				
				resultado*=x;
			}
			else if(ultimaOperacion.equals("/")){
				
				resultado/=x;
			}
			else if(ultimaOperacion.equals("=")){
				
				resultado=x;
			}
			
			pantalla.setText(" "+resultado);
			
		}
		
	}
	
	private JPanel milamina2;
	
	private JButton pantalla;
	
	private boolean principio;
	
	private double resultado;
	
	private String ultimaOperacion;
	
}
