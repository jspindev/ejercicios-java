package tresenraya;

//import Ficha;

//Source File:Jugador.java
public class Jugador {
	
	private Ficha m_Ficha[] =new Ficha[3];
	private int cont_fichas=0;
	private final int NUM_FICHAS=3;
	private String m_nombre;
	
	// Efectos:Indica un jugador con su nombre y crea sus fichas
	
	Jugador(String nombre){
		
		m_nombre=nombre;
		
		for(int cont = 0; cont<NUM_FICHAS;cont++) {
			m_Ficha[cont]=new Ficha(this);
		}
	}

	//Efecto da una ficha desde ese momento ya no la posee.
	// Retorno una ficha
	
	public Ficha ObtenerFicha() {
		if(cont_fichas<3)
			return m_Ficha[cont_fichas++];
		else
			return null;
	}
	
	//Retorno El nombre del jugador
	
	public String Nombre() {
		return m_nombre;
	}
}
