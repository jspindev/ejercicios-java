package tresenraya;

//import Jugador;

// Source file:Turno.java

public class Turno {

	private Jugador m_Jugador[]=new Jugador[2];
	private int turno=0;
	
	// Retorna a que jugador le toca jugar
	
	public Jugador QuienToca() {
		return m_Jugador[turno%2];
	}
	
	//Efectos cambia el turno
	
	public void Siguiente() {
		turno++;
	}
	
	//Efectos se construte, almacenando los jugadores e indica su turno
	public Turno(Jugador jugador_1,Jugador jugador_2) {
		m_Jugador[0]=jugador_1;
		m_Jugador[1]=jugador_2;
	}
}
