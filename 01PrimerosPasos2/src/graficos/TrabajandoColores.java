package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConColor mimarco=new MarcoConColor();
		
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor(){
		
		setTitle("prueba de colores");
		
		setSize(400,400);
		
		LaminaConColor milamina = new LaminaConColor();
		
		add(milamina);
		
		milamina.setBackground(SystemColor.window); 
		
	}
	
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;//importante la refundicion
		//dibujo rectangulo
		Rectangle2D rectangulo= new Rectangle2D.Double(100,100,200,150);
		
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		g2.setPaint(Color.BLACK);
		
		g2.draw(rectangulo);
		
		//dibujo elipse
		
		Ellipse2D ellipse=new Ellipse2D.Double();
		
		ellipse.setFrame(rectangulo);
		
		Color micolor=new Color(125,189,200);
		
		g2.setPaint(micolor.brighter());//.darker() para mas oscuro
		
		g2.fill(ellipse);
		

	
		
		
	}
	
}