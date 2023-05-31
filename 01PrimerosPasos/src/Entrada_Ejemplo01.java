import java.util.*;
public class Entrada_Ejemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre ,porfavor ");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce la edad, por favor ");
		
		int edad=entrada.nextInt();
		
		System.out.println("hola " + nombre_usuario+" El año que viene tendras "+ (edad+1)+ " años");

	}

}
