package aplicacionFinal;

import javax.swing.*;
import javax.swing.filechooser.*;

public class Tirar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco mimarco=new Marco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFileChooser chooser=new JFileChooser();
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg" , "gif");
		
		chooser.setFileFilter(filter);
		
		int returnVal=chooser.showOpenDialog(mimarco);
		
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			
			System.out.println("You chose to open this file: " + chooser.getSelectedFile().getAbsolutePath());
			
		}
		
	}

}


class Marco extends JFrame{
	
	public Marco() {
		
		setBounds(300,300,300,300);
		
		setVisible(true);
	}
	
}