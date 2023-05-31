package Ejerciciopractico1pildoras;

import javax.swing.*;


public class Buttons_Sheet extends JPanel {
	
	public Buttons_Sheet(String title,String [] options) {
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), title));
		
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		group=new ButtonGroup();
		
		for(int i=0;i<options.length;i++) {
			
			JRadioButton button=new JRadioButton(options[i]);
			
			button.setActionCommand(options[i]);
			
			add(button);
			
			group.add(button);
			
			button.setSelected(i==0);
		}
		
		
		
	}
	
	public String give_me_selection() {
		
		/*ButtonModel mybutton=group.getSelection();
		
		String s=mybutton.getActionCommand();
		
		return s;*/
		
		return group.getSelection().getActionCommand();
	}
	private ButtonGroup group;
}
