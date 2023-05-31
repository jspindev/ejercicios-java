package Ejerciciopractico1pildoras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.Date;

public class Dialogs_Frame extends JFrame{

	public Dialogs_Frame() {
		
		setTitle("Test of dialogs");
		
		setBounds(500,300,600,450);
		
		JPanel grid_sheet=new JPanel();
		
		grid_sheet.setLayout(new GridLayout(2,3));
		
		
	
		String first[]= {"Message","Confirm","Option","Entry"};
	
		type_sheet=new Buttons_Sheet("Type",first);
		
		message_type_sheet=new Buttons_Sheet("Type of Message", new String[] {
				"ERROR_MESSAGE",
				"INFORMATION_MASSAGE",
				"WARRING_MESSAGE",
				"QUESTION_MESAGE",
				"PLAIN_MESSAGE",
		});
		
		message_sheet=new Buttons_Sheet("Message", new String[] {
				"String",
				"Icon",
				"Componets",
				"Others",
				"Objects[]",
		});
		
		options_type_sheet=new Buttons_Sheet("Confirm", new String[] {
				"DEAFAULT_OPTION",
				"YES_NO_OPTION",
				"YES_NO_CANCEL_OPTION",
				"OK_CANCEL-OPTION",
		});
		
		options_sheet=new Buttons_Sheet("Options", new String[] {
				"String[]",
				"Icon[]",
				"Objects[]",
		
				
		});
		
		entry_sheet=new Buttons_Sheet("Entry", new String[] {
				"Text field",
				"Combo",
		
				
		});
		
		setLayout(new BorderLayout());
		
		grid_sheet.add(type_sheet);
		grid_sheet.add(message_type_sheet);
		grid_sheet.add(message_sheet);
		grid_sheet.add(options_type_sheet);
		grid_sheet.add(options_sheet);
		grid_sheet.add(entry_sheet);
		
		//we build the bottom sheet
		
		JPanel show_sheet=new JPanel();
		
		JButton show_button=new JButton("Show");
		
		show_button.addActionListener(new ShowAcction());
		
		show_sheet.add(show_button);
		
		add(show_sheet,BorderLayout.SOUTH);
		
		add(grid_sheet,BorderLayout.CENTER);
		
	
	}
	
	//-------------------------------- proporciona el mensaje---------------
	
	public Object give_me_message() {
		
		String s=message_sheet.give_me_selection();
		
		if(s.equals("String")) {
			
			return MessageString;
			
		}else if(s.equals("Icon")) {
			
			return MessageIcon;
			
		}else if(s.equals("Component")) {
			
			return MessageComponent;
			
		}else if(s.equals("Others")) {
			
			return MessageObject;
		}else if(s.equals("Object[]")) {
			
			return new Object[] {
				MessageString,
				MessageIcon,
				MessageComponent,
				MessageObject
			};
		}else {
				return null;
		}
			
			
	}
	//----------------------------------devuelve tipo icono -----------------
	
	public int give_me_type(Buttons_Sheet sheet) {
		
		String s=sheet.give_me_selection();
		
		if(s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")) {
			return 0;
		}else if(s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")) {
			return 1;
		}else if(s.equals("WARING_MESSAGE") || s.equals("OK_CANCEL_OPTION")) {
			return 2;
		}else if(s.equals("QUESTION_MESSAGE")) {
			return 3;
		}else if(s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")) {
			return -1;
		}else {
			return 5;
		}
		
	}
	
	//-------------------give options to options sheet-------------------
	
	public Object[] give_me_options(Buttons_Sheet sheet) {
		
		String s=sheet.give_me_selection();
		
		if(s.equals("String[]")) {
			return new String[] {"Yellow","Blue","Red"};
		}else if(s.equals("Icon[]")) {
			return new Object[] { new ImageIcon("azul.png"),new ImageIcon("azul.png"),new ImageIcon("azul.png") };
		}else if(s.equals("Object[]")){ return new Object[] {MessageString,MessageIcon,MessageComponent,MessageObject};
		}else{
			return null;
		}
	}
		
	//----------------------------------------------------------------
	
	public class ShowAcction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(type_sheet.give_me_selection());
		
			if(type_sheet.give_me_selection().equals("Message")) {
				JOptionPane.showMessageDialog(Dialogs_Frame.this, give_me_message(), "Title", give_me_type(message_type_sheet));
			}else if(type_sheet.give_me_selection().equals("Confirm")) {
				JOptionPane.showConfirmDialog(Dialogs_Frame.this, give_me_message(),"Title",give_me_type(options_type_sheet),give_me_type(message_type_sheet));
			}else if(type_sheet.give_me_selection().equals("Entry")) {
				
				if(entry_sheet.give_me_selection().equals("Text field")) {
				JOptionPane.showInputDialog(Dialogs_Frame.this, give_me_message(), "Title", give_me_type(message_type_sheet));
				}else {
					
					JOptionPane.showInputDialog(Dialogs_Frame.this, give_me_message(), "Title", give_me_type(message_type_sheet),null,new String[] {"Yellow","Blue","Red"},"Blue");
				}
				
				
			}else if(type_sheet.give_me_selection().equals("Option")) {
				JOptionPane.showOptionDialog(Dialogs_Frame.this, give_me_message(), "Title", 1, give_me_type(message_type_sheet), null, give_me_options(options_sheet), null);
			}
		
		}

	}
	
	
	
	
	private Buttons_Sheet type_sheet,message_type_sheet,message_sheet,options_type_sheet,options_sheet,entry_sheet;

	private String MessageString="Message";
	
	private Icon MessageIcon=new ImageIcon();
	
	private Object MessageObject=new Date();
	
	private Component MessageComponent=new Example_Sheet();
	
}



class Example_Sheet extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangle= new Rectangle2D.Double(0,0,getWidth(),getHeight());
		
		g2.setPaint(Color.YELLOW);
		
		g2.fill(rectangle);
	}
}


