package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoAccion marco=new MarcoAccion();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
	}

}

class MarcoAccion extends JFrame{
	
	
	private static final long serialVersionUID = 1L;

	public MarcoAccion(){
		 setTitle("Prueba Acciones");
		 
		 setBounds(600,350,600,300);
		 
		 PanelAccion lamina=new PanelAccion();
		
		add(lamina);
	}
}

class PanelAccion extends JPanel{
		
	
	private static final long serialVersionUID = 1L;


	public PanelAccion(){
		
		AccionColor accionAmarillo=new  AccionColor("Amarillo",new ImageIcon("src/graficos/azul.png"),Color.yellow );
		
		AccionColor accionAzul=new  AccionColor("Azul",new ImageIcon("src/graficos/azul.png"),Color.blue );
		
		AccionColor accionRojo=new  AccionColor("Rojo",new ImageIcon("src/graficos/azul.png"),Color.red );
		
		/*ImageIcon imgIcon1 = new ImageIcon("src/graficos/bola_amarilla.jpg");
		Image imgEscalada1 = imgIcon1.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH);
		Icon iconoEscalado1 = new ImageIcon(imgEscalada1); 
		
		
		ImageIcon imgIcon2 = new ImageIcon("src/graficos/bola_azul.jpg");
		Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH); 
		Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
		
		
		ImageIcon imgIcon3 = new ImageIcon("src/graficos/bola_roja.jpg"); 
		Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH);
		Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
		
		
		 AccionColor accionAmarillo=new AccionColor("Amarillo",iconoEscalado1 , Color.YELLOW);
		 AccionColor accionAzul=new AccionColor("Azul",iconoEscalado2, Color.BLUE);
		 AccionColor accionRojo=new AccionColor("Rojo", iconoEscalado3, Color.RED);
		 
		 add(new JButton(accionAmarillo));
		 add(new JButton(accionAzul));
		 add(new JButton(accionRojo)); */
		
		
		
		
		JButton botonAmarillo= new JButton(accionAmarillo);
		
		add(botonAmarillo);
		
		add(new JButton(accionAzul));
		
		add(new JButton(accionRojo));
		
		
		
		/*JButton botonAmarillo=new JButton("Amarillo");
		
		JButton botonAzul=new JButton("Azul");
		
		JButton botonRojo=new JButton("Rojo");
		
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);*/
		
		
		//multiples eventos practicas dos 
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		
		
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl S"), "fondo_azul");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl D"), "fondo_rojo");
		
		
		ActionMap mapaAccion=getActionMap();
		
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);
		
		// fin de multiples eventos
		
	}
	
	
	private class AccionColor extends AbstractAction{
		
	
		private static final long serialVersionUID = 1L;

		public AccionColor(String nombre,Icon icono,Color  color_boton){
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color "+nombre);
			
			putValue("Color_de_fondo",color_boton);
		}
		
		public void actionPerformed(ActionEvent e){
			
			Color c=(Color)getValue("color de fondo ");
			
			setBackground(c);
			
			System.out.println("Nombre"+getValue(Action.NAME)+"descripcion" + getValue(Action.SHORT_DESCRIPTION));
			
			 
		}
		
	}
	
}

