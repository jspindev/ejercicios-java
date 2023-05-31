package clases_propias;

public class Pareja <T> {

	
	public Pareja() {
		
		primero=null;
	}
	
	
	public void setPrimero(T nuevoValor) {
		
		primero=nuevoValor;
		
	}
	
	public static void imprimirTrabajador(Pareja<? extends Empleado> p) {
		
		Empleado primero=p.getPriemero();
		
		System.out.println(primero);
	}
	
	public T getPriemero() {
		
		return primero;
	}
	
	private T primero;
	
	

}
