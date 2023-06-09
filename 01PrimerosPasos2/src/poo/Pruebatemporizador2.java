package poo;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class Pruebatemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj=new Reloj(3000,true);
		
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar ");
		
		System.exit(0);
	}

}

class Reloj{
	
	public Reloj(int intervalo, boolean sonido){
		this.intervalo=intervalo;
		this.sonido=sonido;
			
	}
	
	public void enMarcha(){
		
		ActionListener oyente=new DamelaHora2();
		Timer mitemporizador= new Timer(intervalo,oyente);
		mitemporizador.start();
		
	}
	
	private int intervalo;
	
	private boolean sonido;
	
	private class DamelaHora2 implements ActionListener{
		
		public void actionPerformed(ActionEvent evento){
			Date ahora=new Date();
			
			System.out.println("Te pongo la hora cada 3 sg:"+ahora);
			
			if(sonido){
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	
}