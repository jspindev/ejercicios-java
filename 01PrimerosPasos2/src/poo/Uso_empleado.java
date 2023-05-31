package poo;

import java.util.*;

public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1=new Empleado("Paco Gomez",85000,1990,12,17);

		Empleado empleado2=new Empleado("Ana Lopez",95000,1995,06,02);
		
		Empleado empleado3=new Empleado("maria Martin",105000,2002,03,15);
		
		empleado1.subeSueldo(5);
		
		empleado2.subeSueldo(5);
		
		empleado3.subeSueldo(5);
		
		System.out.println("nombre: "+ empleado1.dameNombre() +" Sueldo: "+ empleado1.dameSueldo()+
				"fecha de alta: "+ empleado1.dameFechaContrato());
		
		System.out.println("nombre: "+ empleado2.dameNombre() +" Sueldo: "+ empleado2.dameSueldo()+
				" fecha de alta: "+ empleado2.dameFechaContrato());
		
		
		System.out.println("nombre: "+ empleado3.dameNombre() +" Sueldo: "+ empleado3.dameSueldo()+
				" fecha de alta: "+ empleado3.dameFechaContrato());*/
		
		
		Jefatura jefe_RRHH=new Jefatura("Juan",5500,2006,9,25);
		
		jefe_RRHH.estabelceIntensivo(2570);
		
		
		
		Empleado[] misEmpleados= new Empleado[6];
		
		misEmpleados[0]=new Empleado("Paco Gómez",85000,1990,12,17);
		
		misEmpleados[1]=new Empleado("Ana lopezz",95000,1995,06,02);
		
		misEmpleados[2]=new Empleado("María Martín",105000,2002,03,15);
		
		misEmpleados[3]=new Empleado("Antonio Fernández",47500,2009,11,9);
		
		misEmpleados[4]= jefe_RRHH;  //polimorfismo principio de sustitucion
		
		misEmpleados[5]= new Jefatura("María",95000,1999,5,26);
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];

		jefa_Finanzas.estabelceIntensivo(55000);
		
		

		/*Empleado director_comercial=new Jefatura("Sandra",85000,2012,05,05);
		
		Comparable ejemplo=new Empleado("Elisabeth",95000,2011,06,07);
		
		if(director_comercial instanceof Empleado){
			System.out.println("Es de tipo Jefatura");
			}
		if(ejemplo instanceof Comparable){
			
			System.out.println("Implementa la interfaz comparable");
		}
		
		
		for(int i=0;i<3;i++){
			misEmpleados[i].subeSueldo(5);
			
		}*/
		
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones a los empoleados"));
		
		System.out.println("El jefe "+ jefa_Finanzas.dameNombre() +" tiene un bonus de: "+ 
				jefa_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre()+"tiene un bonus de:" + misEmpleados[3].establece_bonus(200));
		
		for(Empleado e:misEmpleados){
			e.subeSueldo(5);
			
		}
		
		
		/*for(int i=0;i<3;i++){
			System.out.println("Nombre: "+ misEmpleados[i].dameNombre()+ " Sueldo: "+misEmpleados[i].dameSueldo()+
					" Fecha de alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		Arrays.sort(misEmpleados);
		
		
		for(Empleado e:misEmpleados){// for mejoprado todos los segundos 
			System.out.println("Nombre: "+ e.dameNombre()+
					" Sueldo: "+e.dameSueldo()
					+" Fecha de alta: " + e.dameFechaContrato());
			
		}
		
		
		
	}

}



class Empleado implements Comparable, Trabajadores {
	
	public Empleado(String nom, double sue, int agno,int mes, int dia){
		
		nombre=nom;
		
		sueldo=sue;
	
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);

		altaContrato=calendario.getTime();
		
		++IdSiguiente;
		
		Id=IdSiguiente;
		 
	} 
	
	
	public double establece_bonus(double gratificacion){
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	
	public Empleado(String nom){
		
		this(nom,30000,2000,01,01);
		
		
	}
	
	public String dameNombre(){//GETER
		
		return nombre;
	}
	
	public final double dameSueldo(){//GETER
		
		return sueldo;
	}
	
	public Date dameFechaContrato(){//GETER
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje){//SETER
		
		double aumento=sueldo * porcentaje/100;
		
		sueldo+=aumento;
	}
	
	public int compareTo(Object miObjeto){
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo){
			return -1;
		} 
		if (this.sueldo>otroEmpleado.sueldo){
			
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
	
	  
}


 class Jefatura extends Empleado /*implements Jefes*/{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia){
		super(nom, sue, agno, mes, dia);
	}
	
	public String tomar_decisiones(String decision){
		
		return "Un miembro de la direccion ha tomado la decisión de: "+decision;
	}
	
	public double establece_bonus(double gratificacion){
		double prima=2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	public void estabelceIntensivo(double b){
		
		incentivo=b;
	}
	
	public double dameSueldo2(){
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
		
	}
	
	
	private double incentivo;
	
	
	
}

