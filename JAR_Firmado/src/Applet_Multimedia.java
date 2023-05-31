import javax.swing.*;
import java.awt.*;


class Applet_Multimedia extends JApplet{

	public void init() {
		
		
		logo=getImage(getDocumentBase(),"logo.jpg");
		
		
	}
	
	public void paint(Graphics g) {
		
		g.drawImage(logo, 50, 50, this);
	}
	
	
	Image logo;
}
