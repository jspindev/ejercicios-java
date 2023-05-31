package poo;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.Timer;



import java.awt.Toolkit;

public class PurebaTemporizador2_2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj=new Reloj();
		
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar ");
		
		System.exit(0);
	}

}

class Reloj{
	
	
	
	public void enMarcha(int intervalo,final boolean sonido){
		
		 class DamelaHora2 implements ActionListener{
			
			public void actionPerformed(ActionEvent evento){
				
				Date ahora=new Date();
				
				System.out.println("Te pongo la hora cada 3 sg:"+ahora);
				
				if(sonido){
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		ActionListener oyente=new DamelaHora2();
		Timer mitemporizador= new Timer(intervalo,oyente);
		mitemporizador.start();
		
	}
	
	
	
	
	
}
