package escribiendo;

import java.io.*;

public class Escribir_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escribiendo accede_es=new Escribiendo();
		
		accede_es.escribir();
		
	}
	

}

 
class Escribiendo{
	
	public void escribir() {
		
		String frase="Esto es una prueba de escritura2";
		
		try {
			
			FileWriter escritura= new FileWriter("C:/Users/JAVIER/Desktop/texto_nuevo.txt",true);
			
			for(int i=0;i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}