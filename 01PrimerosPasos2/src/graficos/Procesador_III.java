package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;


import javax.swing.*;

public class Procesador_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessorMenu_III myframe=new ProcessorMenu_III();
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class ProcessorMenu_III extends JFrame{
	
	public ProcessorMenu_III(){
		
		setBounds(500,300,550,400);
		
		ProcessorSheet_III mysheet=new ProcessorSheet_III();
		
		add(mysheet);
		
		setVisible(true);
		
	}
}
class ProcessorSheet_III extends JPanel{
	
	public ProcessorSheet_III(){
		
		setLayout(new BorderLayout());
		
		JPanel sheetmenu=new JPanel();
		
		JMenuBar mybar=new JMenuBar();
//----------------------------------------------------------------------------------
		 font=new JMenu("Font");
		
		 style=new JMenu("Style");
		
		size=new JMenu("Size");
		
		configure_menu("Arial","font","Arial",9,10);
		
		configure_menu("Courier","font","Courier ",9,10);
		
		configure_menu("Verdana","font","Verdana",9,10);
		
//------------------------------------------------------------------------------------------------
		configure_menu("bold_font","style"," ",Font.BOLD,1);
		
		configure_menu("italics","style"," ",Font.ITALIC,1);
		
//-------------------------------------------------------------------------------------------------------
		configure_menu("12","size"," ",9,12);
		configure_menu("16","size"," ",9,16);
		configure_menu("20","size"," ",9,20);
		configure_menu("24","size"," ",9,24);
		
		
		
		mybar.add(font);
		
		mybar.add(style);
		
		mybar.add(size);
		
		sheetmenu.add(mybar);
		
		add(sheetmenu, BorderLayout.NORTH);
		
		 myarea=new JTextPane();
		
		add(myarea,BorderLayout.CENTER);
		
	}

	public void configure_menu(String rotulo,String menu,String type_letters,int style_I,int siz){
		
		JMenuItem elem_menu=new JMenuItem(rotulo);
		
		if(menu=="font"){
			font.add(elem_menu);
		}else if(menu=="style"){
			style.add(elem_menu);
		}else if(menu=="size"){
			size.add(elem_menu);
		}
		
		elem_menu.addActionListener(new Manage_Event(rotulo,type_letters,style_I,siz));
	}
	
	private class Manage_Event implements ActionListener{
		String type_text,menu;
		
		int style_letters, size_letters;
		
		Manage_Event(String elemnt, String text2,int style2 ,int siz_letters){
			
			type_text=text2;
			
			style_letters=style2;
			
			size_letters=siz_letters;
			
			menu=elemnt;
	
		}
		
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			letters=myarea.getFont();
			
			if(menu=="arial" || menu=="Courier" || menu=="Verdana"){
				
				style_letters=letters.getStyle();
				
				size_letters=letters.getSize();
				
			}else if(menu=="italics"||menu=="bold_font"){
				
				if (letters.getStyle()==1 || letters.getStyle()==2){
				
				style_letters=3;
				
				}
				type_text=letters.getFontName();
				
				size_letters=letters.getSize();
			}else if(menu=="12"|| menu=="16"||menu=="20"||menu=="24"){
				
				style_letters=letters.getStyle();
				
				type_text=letters.getFontName();
			}
			
			myarea.setFont(new Font("type_text",style_letters,size_letters));
			
			System.out.println("Type "+type_text+" Style "+style_letters+" Size "+size_letters);
		}
	}

	
	JTextPane myarea;	
	JMenu font, style ,size;
	Font letters;
}