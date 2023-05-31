package excepciones_I;
import java.util.*;


public class Entrada_datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("¿Que deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada=new Scanner(System.in);
		
		int decision=entrada.nextInt();
		
		if(decision==1) {
			try {
				
				pedirDatos();
			
			}catch(InputMismatchException e) {  //IOException  Exception
				
				System.out.println("Asegurate de introducir un numero en la edad.");
			}
		}else {
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();
	}
	
	
	static void pedirDatos() throws InputMismatchException {  //IOException
		//try {
			Scanner entrada=new Scanner(System.in);
		
			System.out.println("Introduce tu nombre, por favor");
		
			String nombre_usuario=entrada.nextLine();
		
			System.out.println("Introduce edad, por favor");
		
			int edad=entrada.nextInt();
		
			System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años. ");
		
			entrada.close();
		/*}catch(InputMismatchException e){ //puedes poner Exception en plan general 
			System.out.println("Asegurate de introducir un numero en la edad.");
		}*/
		
		System.out.println("Hemos terminado");
	}

}
