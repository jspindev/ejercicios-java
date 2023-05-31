import java.util.*;
public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		
		int intentos=0;
		
		do{
				
				intentos++;
			
				System.out.println("Introduce un numero, por favor");
				
				numero=entrada.nextInt();
				
				if(aleatorio<numero){
					System.out.println("Más bajo.");
				}
				else if(aleatorio>numero){
					System.out.println("más alto.");
				}
		}while(numero!=aleatorio);
		System.out.println("Correcto. Lo has conseguido en "+ intentos+ " intentos");
	}

}
