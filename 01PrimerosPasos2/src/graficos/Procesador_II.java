package graficos;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;

public class Procesador_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessorMenu_II myframe=new ProcessorMenu_II();
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class ProcessorMenu_II extends JFrame{
	
	public ProcessorMenu_II(){
		
		setBounds(500,300,550,400);
		
		ProcessorSheet_II mysheet=new ProcessorSheet_II();
		
		add(mysheet);
		
		setVisible(true);
		
	}
}
class ProcessorSheet_II extends JPanel{
	
	public ProcessorSheet_II(){
		setLayout(new BorderLayout());
		
		JPanel sheetmenu=new JPanel();
		
		JMenuBar mybar=new JMenuBar();
//----------------------------------------------------------------------------------
		JMenu font=new JMenu("Font");
		
		JMenu style=new JMenu("Style");
		
		JMenu size=new JMenu("Size");
//-----------------------------------------------------------------------------------ç
		
		JMenuItem arial=new JMenuItem("Arial");
		
		JMenuItem courier=new JMenuItem("Courier");
		
		JMenuItem verdana=new JMenuItem("Verdana");
		
		//manage_menus type_word=new manage_menus();
		//courier.addActionListener(type_word);
		//courier.addActionListener(new manage_menus());
		
		courier.addActionListener(new  ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				myarea.setFont(new Font("Courier", Font.PLAIN,12));
			}
			
		});
		
		arial.addActionListener(new  ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				myarea.setFont(new Font("arial", Font.PLAIN,12));
			}
			
		});
		
		verdana.addActionListener(new  ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				myarea.setFont(new Font("verdana", Font.PLAIN,12));
			}
			
		});
		
		
		
		font.add(arial);
		
		font.add(courier);
		
		font.add(verdana);
	
//--------------------------------------------------------------------------------------------

		
		JMenuItem bold_font=new JMenuItem("Bold Font");
		
		JMenuItem italics=new JMenuItem("Italics");
		
		style.add(bold_font);
		
		style.add(italics);
		
		
//----------------------------------------------------------------------------------------------------
		
		JMenuItem size_12=new JMenuItem("12");
		
		JMenuItem size_16=new JMenuItem("16");
		
		JMenuItem size_20=new JMenuItem("20");
		
		JMenuItem size_24=new JMenuItem("24");
		
		size.add(size_12);
		
		size.add(size_16);
		
		size.add(size_20);
		
		size.add(size_24);
		
//------------------------------------------------------------------------------------------
		mybar.add(font);
		
		mybar.add(style);
		
		mybar.add(size);
		
		sheetmenu.add(mybar);
		
		add(sheetmenu, BorderLayout.NORTH);
		
		 myarea=new JTextPane();
		
		add(myarea,BorderLayout.CENTER);
		
	}
	
	/*private class manage_menus implements  ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			myarea.setFont(new Font("Courier", Font.PLAIN,12));
		}
	
	}*/
	
	JTextPane myarea;	
}