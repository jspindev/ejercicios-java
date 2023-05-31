package graficos;

import java.awt.BorderLayout;

import javax.swing.*;

public class MarcoEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PopUpFrame myframe=new PopUpFrame();
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class PopUpFrame extends JFrame{
	
	public PopUpFrame(){
		
	setBounds(100,100,300,250);
	
	PopUpSheet mysheet=new PopUpSheet();
	
	add(mysheet);
	
	setVisible(true);
	}
}

class PopUpSheet extends JPanel{
	
	public PopUpSheet(){
		
		setLayout(new BorderLayout());
		
		JPanel menusheet=new JPanel();
		
		JMenuBar mybar=new JMenuBar();
		
		JMenu font=new JMenu("Font");
		
		JMenu style=new JMenu("Style");
		
		JMenu size=new JMenu("Size");
		
		mybar.add(font);
		
		mybar.add(style);
		
		mybar.add(size);
		
		menusheet.add(mybar);
		
		add(menusheet,BorderLayout.NORTH);
		
		JTextPane myarea=new JTextPane();
		
		add(myarea,BorderLayout.CENTER);
		
	//------------------------------------------------------------------------------------------ pop up	
		JPopupMenu popup=new JPopupMenu();
		
		JMenuItem option1=new JMenuItem("Option 1");
		
		JMenuItem option2=new JMenuItem("Option 2");
		
		JMenuItem option3=new JMenuItem("Option 3");
		
		popup.add(option1);
		popup.add(option2);
		popup.add(option3);
		
		myarea.setComponentPopupMenu(popup);
		
	}
}