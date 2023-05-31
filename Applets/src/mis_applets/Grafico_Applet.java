package mis_applets;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

public class Grafico_Applet extends JApplet {

	public void init(){
		
		
		// almacenamos los parametros que recibimos desde el html
		/*int numero1=Integer.parseInt(getParameter("barra.1"));
		
		int numero2=Integer.parseInt(getParameter("barra.2"));
		
		int numero3=Integer.parseInt(getParameter("barra.3"));
		
		
		LaminaGrafico milamina=new LaminaGrafico(numero1,numero2,numero3); video 135 */
		
		String numero=getParameter("graficos");
		
		int n_graficos=Integer.parseInt(numero);
		
		int arrayGraficos[]=new int [n_graficos];
		
		for(int i=0;i<arrayGraficos.length;i++) {
			
			arrayGraficos[i]=Integer.parseInt(getParameter("barra." + (i+1)));
		}
		
		LaminaGrafico milamina=new LaminaGrafico(arrayGraficos);
		add(milamina);
		
			
		
	}

	

}

/*
 * en el html para pasar los parametros entre las etiquet as del 
 * <applet>  
 *        
 * 		<param name="barra.1" value="75">
 * 		<param name="barra.2" value"25">
 * 		<param name="barra.3" value"55">
 * </applet>
 */

class LaminaGrafico extends JPanel{
	
	
	/*public LaminaGrafico(int a,int b,int c) {
		 
		g1=a;
		g2=b;
		g3=c;
	} video 135*/
	
	public LaminaGrafico(int valores[]) {
		
		valores_graficos=valores;
	}
	
	
	public void paint(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D gr2=(Graphics2D) g;
		
		gr2.rotate( 180/180.0 * Math.PI, 125, 100);
		
		/*Rectangle2D graf1=new Rectangle2D.Double(50,0,50,g1);
		
		Rectangle2D graf2=new Rectangle2D.Double(100,0,50,g2);
		
		Rectangle2D graf3=new Rectangle2D.Double(150,0,50,g3);
		
		gr2.setPaint(Color.RED);
		
		gr2.fill(graf1);
		
		gr2.setPaint(Color.YELLOW);
		
		gr2.fill(graf2);
		
		gr2.setPaint(Color.GREEN);
		
		gr2.fill(graf3); video 135 */
		
		int  pos_x=0;
		
		for(int i=0;i<valores_graficos.length;i++) {
			Rectangle2D graf=new Rectangle2D.Double(pos_x,0,25,valores_graficos[i]);
			
			int color_rojo=(int)Math.round(Math.random()*200);
			int color_verde=(int)Math.round(Math.random()*200);
			int color_azul=(int)Math.round(Math.random()*200);
			
			Color color_barra=new Color(color_rojo,color_verde,color_azul);
			gr2.setPaint(color_barra);
			gr2.fill(graf);
			pos_x+=25;
		}
		
	}	
	
	//private int g1,g2,g3;
	
	private int [] valores_graficos;
	
}
