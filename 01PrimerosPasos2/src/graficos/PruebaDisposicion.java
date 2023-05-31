package graficos;

import java.awt.*;

import javax.swing.*;

public class PruebaDisposicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxFrame myframe=new BoxFrame();
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myframe.setVisible(true);
	}

}

class BoxFrame extends JFrame{
	
	public BoxFrame(){
		
		setTitle("Frmae in the box");
		
		setBounds(600,350,200,200);
		
		JLabel label1=new JLabel("Name");
		
		JTextField text1=new JTextField(10);
		
		text1.setMaximumSize(text1.getPreferredSize());
		
		Box boxH1=Box.createHorizontalBox();
		
		boxH1.add(label1);
		
		boxH1.add(Box.createHorizontalStrut(10));
		
		boxH1.add(text1);
		
		JLabel label2=new JLabel("Password");
		
		JTextField text2=new JTextField(10);
		
		text2.setMaximumSize(text2.getPreferredSize());
		
		Box boxH2=Box.createHorizontalBox();
		
		boxH2.add(label2);
		
		boxH1.add(Box.createHorizontalStrut(10));
		
		boxH2.add(text2);
		
		JButton botton1=new JButton("OK");
		
		JButton botton2=new JButton("Cancel");
		
		Box boxH3=Box.createHorizontalBox();
		
		boxH3.add(botton1);
		
		boxH3.add(Box.createGlue());
		
		boxH3.add(botton2);
		
		Box verticalBox=Box.createVerticalBox();
		
		verticalBox.add(boxH1);
		
		verticalBox.add(boxH2);
		
		verticalBox.add(boxH3);
		
		add(verticalBox,BorderLayout.CENTER);
		
	}
	
	
}
