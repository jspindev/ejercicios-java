package tresenraya;

// Source file:Ficha.java

public class Ficha {
	
	private Jugador propietario;

	// Efectos:Construye una ficha asignandole su propietario
	
	Ficha(Jugador jugador){
		
		propietario = jugador;
	}

	public Jugador TipoFicha() {
		return propietario;
	}
}
