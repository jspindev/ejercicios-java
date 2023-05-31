package graficos;

import javax.swing.*;
import java.awt.*;


public class MarcoSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameSpinner mysheet=new FrameSpinner();
		
		mysheet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mysheet.setVisible(true);
	}

}

class FrameSpinner extends JFrame{
	
	public FrameSpinner(){
		
		setBounds(550,350,550,350);
		
		setVisible(true);
		
		add(new SheetSpinner());
		
		
		
	}
	
}


class SheetSpinner extends JPanel{
	
	public SheetSpinner (){
		
	/*	String list[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner control=new JSpinner(new SpinnerListModel(list));*/
		
		JSpinner control=new JSpinner(new SpinnerNumberModel(5,0,10,1){//clase interna anonima no tiene nombre la clase 
			//los metodos dan la vuelta a las flechas 
			public Object getNextValue(){
				
				return super.getPreviousValue();
			}
			
			public Object getPreviousValue(){
				
				return super.getNextValue();
			}
			
		});
		
		Dimension  d=new Dimension(200,20);
		
		control.setPreferredSize(d);
		
		add(control);
		
		
		
	}
	/*private class MyModelJspinner extends SpinnerNumberModel{
		
		public MyModelJspinner(){
			super(5,0,10,1);
			
		}
		
		public Object getNextValue(){
			
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue(){
			
			return super.getNextValue();
		}*/
}