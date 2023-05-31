package clases_propias;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	Empleado listaEmpleados[]=new Empleado[3];
			
			listaEmpleados[0]=new Empleado("ana",45,2500);
			
			listaEmpleados[1]=new Empleado("Antonio",55,2000);
			
			listaEmpleados[2]=new Empleado("Maria", 25,2600);*/
		
		ArrayList <Empleado> listaEmpleados=new ArrayList<Empleado>();
		
		listaEmpleados.ensureCapacity(15);
		
		listaEmpleados.add(new Empleado("ana",45,2500));
		
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		
		listaEmpleados.add(new Empleado("Maria", 25,2600));
		
		listaEmpleados.add(new Empleado("ana",45,2500));
		
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		
		listaEmpleados.add(new Empleado("Maria", 25,2600));
		
		listaEmpleados.add(new Empleado("ana",45,2500));
		
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		
		listaEmpleados.add(new Empleado("Maria", 25,2600));
		
		listaEmpleados.add(new Empleado("ana",45,2500));
		
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		
		listaEmpleados.add(new Empleado("Maria", 25,2600));
		
		listaEmpleados.add(new Empleado("ana",45,2500));
		
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		
		listaEmpleados.add(new Empleado("Maria", 25,2600));
		
		listaEmpleados.set(1, new Empleado("Olga" ,22,2200));
		
		System.out.println(listaEmpleados.get(4).dameDatos());
		
		//listaEmpleados.trimToSize();
			
			/*for(Empleado e:listaEmpleados) {
				
				System.out.println(e.dameDatos());
			}*/
		
		Iterator<Empleado> mi_iterador=listaEmpleados.iterator();
		
		while(mi_iterador.hasNext()) {
			
			System.out.println(mi_iterador.next().dameDatos());
			
		}
			
			/*for(int i=0; i<listaEmpleados.size();i++) {
				
				Empleado e=listaEmpleados.get(i);
				
				System.out.println(e.dameDatos());
			}*/
		
		/*Empleado arrayEmpleados[]=new Empleado[listaEmpleados.size()];
		
		listaEmpleados.toArray(arrayEmpleados);
		
		for(int i=0;i<arrayEmpleados.length;i++ ) {
			System.out.println(arrayEmpleados[i].dameDatos());
		}*/
	}

}

class Empleado{
	
		public Empleado(String nombre,int edad,double salario) {
			
			this.nombre=nombre;
			
			this.edad=edad;
			
			this.salario=salario;
			
		}
		
		public String dameDatos() {
			
			return "El empleado se llama "+ nombre + ".  tiene "+ edad + " años." + " Y un salario de " + salario;
		
		}
		
		private String nombre;
		
		private int edad;
		
		private double salario;
	
}
