package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.text.*;
import  javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.text.StyledEditorKit.ItalicAction;
import javax.swing.*;

public class Procesador_short_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Processormenu2 myframe=new Processormenu2();
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Processormenu2 extends JFrame{
	
	public Processormenu2(){
		
		setBounds(500,300,550,400);
		
		ProcessorSheet2 mysheet =new ProcessorSheet2();
		
		add(mysheet);
		
		setVisible(true);
	}
}

class ProcessorSheet2 extends JPanel{
	public ProcessorSheet2(){
		
		setLayout(new BorderLayout());
		
		JPanel sheetmenu= new JPanel();
		
		JMenuBar mybar=new JMenuBar();
	//-----------------------------------------------------------------
		
		font=new JMenu("Font");
		
		style= new JMenu("Style");
		
		size=new JMenu("Size");
		
		configure_menu("Arial","font","Arial",9,10,"");
		configure_menu("Courie","font","Courier",9,10,"");
		configure_menu("Verdana","font","Verdana",9,10,"");
	//------------------------------------------------------------------------------	
		
		configure_menu("bold_font","style"," ",Font.BOLD,1,"bin/graficos/copiar.png");
		
		configure_menu("bold_font","style"," ",Font.BOLD,1,"bin/graficos/copiar.png");
		
		
		
	//-------------------------------------------------------------------------------------------------------
		
		
		
		ButtonGroup letter_size=new ButtonGroup();
		
		JRadioButtonMenuItem twelve= new JRadioButtonMenuItem("12");
		
		JRadioButtonMenuItem sixteen= new JRadioButtonMenuItem("16");
		
		JRadioButtonMenuItem twenty= new JRadioButtonMenuItem("20");
		
		JRadioButtonMenuItem twenty_four= new JRadioButtonMenuItem("24");
		
		letter_size.add(twelve);
		letter_size.add(sixteen);
		letter_size.add(twenty);
		letter_size.add(twenty_four);
		
		twelve.addActionListener(new StyledEditorKit.FontSizeAction("Change_size", 12));
		
		sixteen.addActionListener(new StyledEditorKit.FontSizeAction("Change_size", 16));
		
		twenty.addActionListener(new StyledEditorKit.FontSizeAction("Change_size", 20));
		
		twenty_four.addActionListener(new StyledEditorKit.FontSizeAction("Change_size", 24));
		
		
		
		size.add(twelve);
		size.add(sixteen);
		size.add(twenty);
		size.add(twenty_four);
		
		
		
	//--------------------------------------------------------------------------------------------
		
		mybar.add(font);
		
		mybar.add(style);
		
		mybar.add(size);
		
		sheetmenu.add(mybar);
		
		add(sheetmenu,BorderLayout.NORTH);
		
		myarea=new JTextPane();
		
		add(myarea,BorderLayout.CENTER);
	//----------------------POP UP	
		JPopupMenu popup=new JPopupMenu();
		
		JMenuItem boldup=new JMenuItem("BOLD");
		
		JMenuItem italicup=new JMenuItem("ITALIC");
		
		
		boldup.addActionListener(new StyledEditorKit.BoldAction());
		
		italicup.addActionListener(new StyledEditorKit.ItalicAction()); 
		
		popup.add(boldup);
		popup.add(italicup);
		
		
		myarea.setComponentPopupMenu(popup);
//---------------------------------------------------------
	
		bar=new JToolBar();
		
		configure_bar("").addActionListener(new StyledEditorKit.BoldAction());;
		configure_bar("").addActionListener(new StyledEditorKit.ItalicAction());;
		configure_bar("").addActionListener(new StyledEditorKit.UnderlineAction());;
		bar.addSeparator();
		configure_bar("").addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.BLUE));
		configure_bar("").addActionListener(new StyledEditorKit.ForegroundAction("yellow", Color.YELLOW));
		configure_bar("").addActionListener(new StyledEditorKit.ForegroundAction("red", Color.RED));
		bar.addSeparator();
		configure_bar("").addActionListener(new StyledEditorKit.AlignmentAction("Left", 0));
		configure_bar("").addActionListener(new StyledEditorKit.AlignmentAction("Right", 2));
		configure_bar("").addActionListener(new StyledEditorKit.AlignmentAction("Center", 1));
		configure_bar("").addActionListener(new StyledEditorKit.AlignmentAction("Justified", 3));
		
		bar.setOrientation(1);
		add(bar,BorderLayout.WEST);
	//------------------------------------------POP UP FIN	
			
	}
	
	public JButton configure_bar(String route){
		
		JButton botton=new JButton(new ImageIcon(route));
		
		bar.add(botton);
		
		return botton;
	}
	
	public void configure_menu(String rotulo,String menu,String letters_type, int styles, int siz,String route_icon){
		
		JMenuItem elem_menu=new JMenuItem(rotulo, new ImageIcon(route_icon));
		
		if(menu=="font"){
			
			font.add(elem_menu);
			
			if(letters_type=="Arial"){
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("change_letter", "Arial"));
			}else if(letters_type=="Courier"){
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("change_letter", "Courier"));	
				
			}else if(letters_type=="Verdana"){
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("change_letter", "Verdana"));	
				
			}
		}else if(menu=="style"){
		
			style.add(elem_menu);
			
			if(styles==Font.BOLD){
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
				
			}else if(styles==Font.ITALIC){
			
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,InputEvent.CTRL_DOWN_MASK));
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			
		}
		else if(menu=="size"){
			size.add(elem_menu);
			 elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("Change_size", siz));
		}
		
		
	}
	
	JTextPane myarea;	
	JMenu font, style ,size;
	Font letters;
	JButton barbold ,baritalic,barline,barblue,baryellow,barred,a_left,a_right, a_center,a_justified;
	JToolBar bar;
	
}