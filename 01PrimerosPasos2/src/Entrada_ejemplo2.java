import javax.swing.*;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre por favor ");
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad ");
		
		int edad_usuario=Integer.parseInt(edad);
		
		System.out.println("Hola "+ Nombre_usuario + "El año que viene temdras  " + (edad_usuario+1) + " años");
	}

}
