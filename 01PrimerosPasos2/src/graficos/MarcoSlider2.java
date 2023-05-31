package graficos;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

//it's no working and i don't know
public class MarcoSlider2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame_Sliders myframe=new Frame_Sliders();
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class Frame_Sliders extends JFrame{
	public Frame_Sliders(){
		
		setBounds(550,400,550,350);
		
		Sheet_Sliders mysheet=new Sheet_Sliders();
		
		add(mysheet);
		
		setVisible(true);
	}
}

class Sheet_Sliders extends JPanel{
	
	public Sheet_Sliders(){
		
		setLayout(new BorderLayout());
		
		label=new JLabel("in a place of Spain  whose name I can not remember...");
		
		add(label,BorderLayout.CENTER);
		
		control=new JSlider(8,40,12);
		
		control.setMajorTickSpacing(20);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		control.setFont(new Font("Serif",Font.ITALIC,10));
		
		JPanel SheetSlider=new JPanel();
		
		SheetSlider.add(control);
		
		add(SheetSlider, BorderLayout.NORTH);
		
	}
	
	private JLabel label;
	private JSlider control;
}