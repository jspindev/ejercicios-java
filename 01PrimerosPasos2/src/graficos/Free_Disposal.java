package graficos;

import javax.swing.*;
import java .awt.*;

public class Free_Disposal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreeFrame myframe=new FreeFrame();
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class FreeFrame extends JFrame{
	
	public FreeFrame() {
		
		setBounds(450,350,600,400);
		
		FreeSheet mysheet= new FreeSheet();
		
		add(mysheet);
		
		setVisible(true);
	}
	
}

class FreeSheet  extends JPanel{
	
	public FreeSheet() {
		
		setLayout(new InColumns()); /*aplicamos nuestra disposicion*/
		
		/*JButton button1=new JButton("boton 1");
		JButton button2=new JButton("boton 2");
		
		
		button1.setBounds(470, 300, 120, 25);
		button2.setBounds(200, 100, 120, 25);
		
		add(button1);
		add(button2);*/
		
		JLabel name=new JLabel("Name: ");
		JLabel surname=new JLabel("Surname: ");
		JLabel age= new JLabel("Age:");
		JLabel number= new JLabel("Number:");
		
		JTextField b_name=new JTextField();
		JTextField b_surname=new JTextField();
		JTextField b_age=new JTextField();
		JTextField b_number=new JTextField();
		/*name.setBounds(20,20,80,10);
		b_name.setBounds(100,17,100,20);
		surname.setBounds(20,57 ,80,15);
		b_surname.setBounds(100,55,100,20);*/
		
		add(name);
		
		add(b_name);
		
		add(surname);
	
		add(b_surname);
		
		add(age);
		 
		add(b_age);
		
		add(number);
		
		add(b_number);
		
	}
	
}




class InColumns implements LayoutManager{

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container mycontainer) {
		// TODO Auto-generated method stub
	
		int d=mycontainer.getWidth();
		x=d/2;
		
		int cont=0;/*contador*/
		
		int n=mycontainer.getComponentCount();
		
		for (int i=0;i<n;i++) {
			
			cont++;
			
			Component c=mycontainer.getComponent(i);
			
			c.setBounds(x-100, y, 100, 20);
			
			x+=100;
			
		   if(cont%2==0) {/*sabemos que es par por el resto del numero x entre dos */
			   
			   x=d/2;
			   y+=40;
		   }
		}
		
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	
	
	private int x;
	
	private int y=20;
	
}





