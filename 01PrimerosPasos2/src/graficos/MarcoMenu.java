package graficos;

import javax.swing.*;
import java.awt.*;

public class MarcoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuFrame mymenu=new MenuFrame();
		mymenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MenuFrame extends JFrame{
	
	public MenuFrame(){
		
		setBounds(500,300,550,400);

		SheetMenu sheet= new SheetMenu();
		
		add(sheet);
		
		setVisible(true);
	}
}

class SheetMenu extends JPanel{
	
	public SheetMenu(){
		
	JMenuBar mybar=new JMenuBar();
	
	JMenu File=new JMenu("File");
	JMenu edition=new JMenu("edition");
	JMenu setting=new JMenu("setting");
	JMenu options=new JMenu("Options");
	
	JMenuItem  save =new JMenuItem("Save");
	JMenuItem save_as=new JMenuItem("Save as");
	
	JMenuItem cut=new JMenuItem("Cut",new ImageIcon("bin/graficos/cortar.png"));
	JMenuItem copy=new JMenuItem("Copy",new ImageIcon("bin/graficos/copiar.png"));
	JMenuItem paste=new JMenuItem("Paste",new ImageIcon("bin/graficos/pegar.png"));
	
	copy.setHorizontalTextPosition(SwingConstants.LEFT);
	
	
	JMenuItem general=new JMenuItem("General");
	
	JMenuItem option1=new JMenuItem("option1");
	JMenuItem option2=new JMenuItem("option2");
	
	options.add(option1);
	options.add(option2);
	
	
	
	File.add(save);
	File.add(save_as);
	
	edition.add(cut);
	edition.add(copy);
	edition.add(paste);
	edition.addSeparator();
	edition.add(options);
	
	setting.add(general);
	
	
	mybar.add(File);
	mybar.add(edition);
	mybar.add(setting);
		
	add(mybar);	
		
	}
}