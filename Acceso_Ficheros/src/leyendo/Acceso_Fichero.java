package leyendo;

import java.io.*;


public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leer_Fichero accediendo= new Leer_Fichero();
		
		accediendo.lee();
			
	}

}

class Leer_Fichero{
	
	public void lee() {
		
		try {
			
			 entrada = new FileReader("C:/Users/JAVIER/Desktop/ejemplo.txt");
			
			BufferedReader mibuffer=new BufferedReader(entrada);
			
			//int c=0;
			
			String linea="";
			
			while(linea!=null) {
				
				linea=mibuffer.readLine();
				
				if(linea!=null)
				System.out.println(linea);
			}
			
			entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("No se ha encontrado el archivo");
		}
		
		
	}
	
	FileReader entrada;
}
