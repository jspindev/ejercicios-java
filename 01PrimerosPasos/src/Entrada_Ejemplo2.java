
import javax.swing.*;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method 

			String nombre_usuario=JOptionPane.showInputDialog("intraduce tu nombre , por favor");
			
			String edad=JOptionPane.showInputDialog("Introduce tu edad , por favor");
			
			int edad_usuario=Integer.parseInt(edad);
			
			System.out.println("Hola "+ nombre_usuario+ ". el año que viene tendras  " + (edad_usuario+1)+" años.");
			
	}

}
