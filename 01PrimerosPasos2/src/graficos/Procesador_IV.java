
package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.text.*;
import  javax.swing.text.StyledEditorKit.FontSizeAction;

import javax.swing.*;


public class Procesador_IV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessorMenu_IV myframe=new ProcessorMenu_IV();
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class ProcessorMenu_IV extends JFrame{
	
	public ProcessorMenu_IV(){
		
		setBounds(500,300,550,400);
		
		ProcessorSheet_III mysheet=new ProcessorSheet_III();
		
		add(mysheet);
		
		setVisible(true);
		
	}
}
class ProcessorSheet_IV extends JPanel{
	
	public ProcessorSheet_IV(){
		
		setLayout(new BorderLayout());
		
		JPanel sheetmenu=new JPanel();
		
		JMenuBar mybar=new JMenuBar();
//----------------------------------------------------------------------------------
		 font=new JMenu("Font");
		
		 style=new JMenu("Style");
		
		size=new JMenu("Size");
		
		configure_menu("Arial","font","Arial",9,10,"");
		
		configure_menu("Courier","font","Courier ",9,10,"");
		
		configure_menu("Verdana","font","Verdana",9,10,"");
		
//------------------------------------------------------------------------------------------------
		configure_menu("bold_font","style"," ",Font.BOLD,1,"bin/graficos/copiar.png");
		
		configure_menu("italic_font","style"," ",Font.ITALIC,1,"bin/graficos/copiar.png");// ni puto caSO AL ICONON
		
//-------------------------------------------------------------------------------------------------------
		configure_menu("12","size"," ",9,12,"");
		configure_menu("16","size"," ",9,16,"");
		configure_menu("20","size"," ",9,20,"");
		configure_menu("24","size"," ",9,24,"");
		
		
		
		mybar.add(font);
		
		mybar.add(style);
		
		mybar.add(size);
		
		sheetmenu.add(mybar);
		
		add(sheetmenu, BorderLayout.NORTH);
		
		 myarea=new JTextPane();
		
		add(myarea,BorderLayout.CENTER);
		
	}

	public void configure_menu(String rotulo,String menu,String type_letters,int style_I,int siz, String route_icon ){
		
		JMenuItem elem_menu=new JMenuItem(rotulo,new ImageIcon(route_icon));
		
		if(menu=="font"){
			font.add(elem_menu);
			if(type_letters=="Arial"){
				
			 elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Change_letters", "Arial"));	
			}else if(type_letters=="Courier"){
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Change_letters", "Courier"));
			}else if(type_letters=="Verdana"){
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Change_letters", "Verdana"));
			}
			 
		}else if(menu=="style"){
			
			style.add(elem_menu);
			
			if(style_I==Font.BOLD){
				
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}else if(style_I==Font.ITALIC){
			elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			
		}else if(menu=="size"){
			size.add(elem_menu);
			 elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("Change_size", siz));
		}
		
		
	}
	


	
	JTextPane myarea;	
	JMenu font, style ,size;
	Font letters;
}
