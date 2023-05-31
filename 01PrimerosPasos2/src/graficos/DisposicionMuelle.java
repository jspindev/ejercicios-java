package graficos;

import javax.swing.*;

public class DisposicionMuelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringyFrame myframe=new SpringyFrame();
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class SpringyFrame extends JFrame{
	
	public SpringyFrame() {
		
		setBounds(300,400,1000,350);
		SpringySheet mysheet=new SpringySheet();
		add(mysheet);
		setVisible(true);
	}
	
}
class SpringySheet extends JPanel{
	
	public SpringySheet() {
		
	JButton button1=new JButton("button 1");
	JButton button2=new JButton("button 2");	
	JButton button3=new JButton("button 3");	
	
	SpringLayout mylayout=new SpringLayout();
	setLayout(mylayout);
	
	add(button1);
	add(button2);
	add(button3);
	
	Spring mydock=Spring.constant(0,10,100);//muelle elastico 
	
	Spring rigid_dock=Spring.constant(80);//muelle rigido
	
	mylayout.putConstraint(SpringLayout.WEST, button1 , mydock , SpringLayout.WEST, this );
	
	mylayout.putConstraint(SpringLayout.WEST, button2 , rigid_dock , SpringLayout.EAST, button1 );
	
	mylayout.putConstraint(SpringLayout.WEST, button3 , rigid_dock , SpringLayout.EAST, button2 );
	
	mylayout.putConstraint(SpringLayout.EAST, this , mydock , SpringLayout.EAST, button3 );
		
	}
}

