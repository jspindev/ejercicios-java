package arraylist;

import java.io.File;

public class UsoArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList2 archivos= new ArrayList2(4);
			
			/*archivos.add("Juan");
			
			archivos.add("Maria");
			
			archivos.add("Ana");
			
			archivos.add("Sandra");
			
			
			String nombrePersona=(String)archivos.get(2);*/
			
			archivos.add(new File("gestion_Pedidos.accdb"));
			
			File nombrePersona=(File)archivos.get(0);
			
			System.out.println(nombrePersona);
			
	}

}
