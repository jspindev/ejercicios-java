import javax.swing.*;
public class acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="javier";
		
		
		String pass="";
		
		while (clave.equals(pass)==false){
			
		pass=JOptionPane.showInputDialog("Introduce la contraseņa, por favor.");
		
			if(clave.equals(pass)==false){
				System.out.println("Contraseņa incorrecta");
			}
		
		}
		
		System.out.println("Contraseņa correcta. Acceso permitido.");
	}

}
