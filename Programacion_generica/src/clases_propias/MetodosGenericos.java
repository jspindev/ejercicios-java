package clases_propias;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombres[]= {"Jose","Maria","Pepe"};
		
		String elementos=MisMatrices.<String>getElementos(nombres);
		
		System.out.println(elementos);
		
		System.out.println(MisMatrices.getMenor(nombres));
		
		
		
		/*Empleado listaEmpleados[]= {
				new Empleado("Ana",45,2500),
				new Empleado("Ana",45,2500),
				new Empleado("Ana",45,2500),
				new Empleado("Ana",45,2500),
				new Empleado("Ana",45,2500),
				
		};
		
		System.out.println(MisMatrices.getElementos(listaEmpleados));*/
		
		
	}

}




class MisMatrices{
	
	public static <T> String getElementos(T[] a) {
		
		return "El array tiene " + a.length + " elementos";
	}
	
	public static <T extends Comparable> T getMenor(T[] a) {
		
		if(a==null ||  a.length==0) {
			
			return null;
		}
		
		
		T elementoMenor=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(elementoMenor.compareTo(a[i])>0){
				elementoMenor=a[i];
			}
		}
		
		return elementoMenor;
		
		
	}
	
	
	
}