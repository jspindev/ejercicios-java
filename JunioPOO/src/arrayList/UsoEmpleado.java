package arrayList;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleado listaEmpleados[]=new Empleado[3];
		
		listaEmpleados[0]=new Empleado ("Ana",45,2500);
		
		listaEmpleados[1]=new Empleado("Antonio",55,2000);
		
		listaEmpleados[2]=new Empleado("Maria",25,2600);*/
		
		
		ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		//listaEmpleados.ensureCapacity(11);// creas un arraylist con 11 elementos pero aun asi sigue siendo dinamica 
		
		listaEmpleados.add(new Empleado("Ana",45,2500));
		
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		
		listaEmpleados.add(new Empleado("Maria",25,2600));
		
		listaEmpleados.add(new Empleado("Jose",35,2200));
		
		
		
		//listaEmpleados.set(1, new Empleado("Olga",22,2200));// se pone en la posicion que le paso pirmero pero machaca si tiene algo eeh
		
		//System.out.println(listaEmpleados.get(3).dameDatos());
		
		//listaEmpleados.trimToSize();//optimiza si dejas huecos en blanco 
		
		//System.out.println(listaEmpleados.size());
		
		/*for (Empleado e: listaEmpleados){  // este es un for each
			
			System.out.println(e.dameDatos());
		}*/
		
		for(int i=0; i<listaEmpleados.size(); i++) {  // for convencional
			
			Empleado e=listaEmpleados.get(i);
			
			System.out.println(e.dameDatos());
		}
		
		Empleado arrayEmpleados[]=new Empleado[listaEmpleados.size()];//pasando un arraylist a un array normal
		
		listaEmpleados.toArray(arrayEmpleados);
		
		for (int i=0; i<arrayEmpleados.length;i++) {
			 
			System.out.println(arrayEmpleados[i].dameDatos());
		}
	}
}

class Empleado{
	
	
	public Empleado(String nombre,int edad,double salario) {
		
		this.nombre=nombre;
		
		this.edad=edad;
		
		this.salario=salario;
	}
	
	
	
	public String dameDatos() {
		return "El empleado se llama " + nombre + ". Tiene "+edad+ " años." + " Y un salario de " + salario;
	}
	
	private String nombre;
	private int edad;
	private double salario;
}
