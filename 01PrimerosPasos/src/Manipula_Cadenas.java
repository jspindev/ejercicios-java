
public class Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="Javier";
				System.out.println("Mi nombre es " + nombre);
				
				System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
				
				System.out.println("La primer a letra del nombre es "+ nombre +" es la " + nombre.charAt(0));
				
				 int ultima_letra;
				 
				 ultima_letra=nombre.length();
				 
				 System.out.println("La ultima detra del "+ nombre+" es " + nombre.charAt(ultima_letra-1));/*
				 el menos uno es por que el lent cuenta las posiciones y la primera posicion es la 0*/

				 
	}

}
