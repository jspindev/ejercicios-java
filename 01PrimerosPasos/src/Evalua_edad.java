import java.util.*;
public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduce tu edad por favor");
		
		int edad=entrada.nextInt();
		
		if(edad>=18){
			System.out.println("eres mayor de edad");
		} else{
			System.out.println("eres menor de ead ");
		}

	}

}
