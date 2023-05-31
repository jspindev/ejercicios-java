package tresenraya;

import java.math.*;

//Source file:Casilla.java
public class Casilla {
	
	private Ficha m_Ficha;
	private  int fila;
	private  int columna;

	//Efectos:Construye una casilla que conoce sus coordenadas en el tablero 
	
	Casilla(int fila,int columna){
		
		this.fila=fila;
		this.columna=columna;
	}
	
	// Retorna true si la casilla esta vacia
	
	public boolean EstaVacia() {
		return(m_Ficha == null);
	}
	
	//Efectos:poner ficha en una casiilla
	
	public void PonerFicha(Ficha ficha) {
		m_Ficha=ficha;
	}
	
	// Efectos:obtiene la ficha que esta en la casilla
	
	public Ficha ObtenerFicha() {
		return m_Ficha;
	}
	
	// Efectos:Mira si dos casillas son adyacentes
	
	public boolean Adyacentes(Casilla casilla) {
		return((Math.abs(casilla.fila - fila)< 2)&& (Math.abs(casilla.columna -columna)<2));
	}
}
