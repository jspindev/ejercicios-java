package ficheros_directorios;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta=new File("C:"+ File.separator + "Users"+ File.separator+"JAVIER"+ File.separator +"Desktop" + File.separator + "leyendo_creando" + File.separator + "prueba_texto.txt");
		
		ruta.delete();
	}

}
