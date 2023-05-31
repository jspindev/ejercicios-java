package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.text.*;
import  javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.text.StyledEditorKit.ItalicAction;
import javax.swing.*;
public class ProcesadorBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Processormenu myframe=new Processormenu();
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Processormenu extends JFrame{
	
	public Processormenu(){
		
		setBounds(500,300,500,400);
		
		ProcessorSheet mysheet =new ProcessorSheet();
		
		add(mysheet);
		
		setVisible(true);
	}
}

class ProcessorSheet extends JPanel{
	public ProcessorSheet(){
		
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
		
		/*JCheckBoxMenuItem bold=new JCheckBoxMenuItem("Bold",new ImageIcon("bin/graficos/copiar.png"));
		
		JCheckBoxMenuItem italic=new JCheckBoxMenuItem("Italic",new ImageIcon("bin/graficos/copiar.png"));
		
		bold.addActionListener(new StyledEditorKit.BoldAction());
		
		italic.addActionListener(new StyledEditorKit.ItalicAction());
		
		style.add(italic);
		style.add(bold);*/
		
	//-------------------------------------------------------------------------------------------------------
		/*configure_menu("12","size"," ",9,12,"");
		configure_menu("16","size"," ",9,16,"");
		configure_menu("20","size"," ",9,20,"");
		configure_menu("24","size"," ",9,24,"");*/
		
		
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
		
		//twenty_four.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		
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
		JToolBar bar=new JToolBar();
													//quito la ruta por que los iconos son muy grande y casi me quedo 
													//si un espacio en el procesador de texto  
		JButton barbold=new JButton(new ImageIcon(/*"bin/graficos/copiar.png"*/));
		
		JButton baritalic=new JButton(new ImageIcon(/*"bin/graficos/copiar.png"*/));
		
		JButton barline=new JButton(new ImageIcon(/*"bin/graficos/copiar.png"*/));
		
		JButton barblue=new JButton(new ImageIcon(/*"bin/graficos/copiar.png"*/));
		
		JButton baryellow=new JButton(new ImageIcon(/*"bin/graficos/copiar.png"*/));
		
		JButton barred=new JButton(new ImageIcon(/*"bin/graficos/copiar.png"*/));
		// a the aligned= aliniado
		JButton a_left=new JButton(new ImageIcon(/*"bin/graficos/copiar.png"*/));
		
		JButton a_right=new JButton(new ImageIcon(/*"bin/graficos/copiar.png"*/));
		
		JButton a_center=new JButton(new ImageIcon(/*"bin/graficos/copiar.png"*/));
		
		JButton a_justified=new JButton(new ImageIcon(/*"bin/graficos/copiar.png"*/));
		
		barbold.addActionListener(new StyledEditorKit.BoldAction());
		
		baritalic.addActionListener(new StyledEditorKit.ItalicAction());
		
		barline.addActionListener(new StyledEditorKit.UnderlineAction());
		
		barblue.addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.BLUE));
		
		baryellow.addActionListener(new StyledEditorKit.ForegroundAction("yellow", Color.YELLOW));
		
		barred.addActionListener(new StyledEditorKit.ForegroundAction("red", Color.RED));
		
		a_left.addActionListener(new StyledEditorKit.AlignmentAction("Left", 0));
		
		a_right.addActionListener(new StyledEditorKit.AlignmentAction("Right", 2));
		
		a_center.addActionListener(new StyledEditorKit.AlignmentAction("Center", 1));
		
		a_justified.addActionListener(new StyledEditorKit.AlignmentAction("Justified", 3));
		
		
		bar.add(baritalic);
		bar.add(barbold);
		bar.add(barline);
		
		bar.add(barblue);
		bar.add(baryellow);
		bar.add(barred);
		
		bar.add(a_left);
		bar.add(a_right);
		bar.add(a_center);
		bar.add(a_justified);
		
		bar.setOrientation(1);
		
		add(bar,BorderLayout.WEST);
	//------------------------------------------POP UP FIN	
			
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
	
}