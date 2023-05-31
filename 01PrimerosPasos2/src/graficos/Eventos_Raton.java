package graficos;

import javax.swing.JFrame;
import java.awt.event.*;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRaton mimarco=new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton extends JFrame{
	
	public MarcoRaton(){
		
		setVisible(true);
		
		setBounds(700,300,600,450);
		
		EventosDeRaton EventoRaton=new EventosDeRaton();
		
		//addMouseListener(EventoRaton);
		
		addMouseMotionListener(EventoRaton);
		
	}	
	
}

/*class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("has hecho click");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("acabas de entrar");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("acabas de salir");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("acabas de presionar");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("acabas de levantar");
	}
}*/



/*class EventosDeRaton extends MouseAdapter{
	
	/*public void mouseClicked(MouseEvent e){
		
		//System.out.println("Cordenada X: "+ e.getX() +" Cordenada Y: "+e.getY());	
		
		System.out.println(e.getClickCount());
	}
	
	
	
	public void mousePressed(MouseEvent e){
		
		if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
			
			System.out.println("has pulsado el botón izquierdo");
			
		} else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
			
			System.out.println("has pulsado la rueda");
			
		}else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
			
			System.out.println("has pulsado el botón derecho");
		}
	}
	
}*/



class EventosDeRaton implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo");
	}
	
	
	
	
	
}


