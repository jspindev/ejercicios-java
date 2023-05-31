package tresenraya;

//Source File: TresEnRaya

/*import Tablero;
import Turno;
import Jugador;*/

public class TresEnRaya {
	// Efectos Crea objetos y lanza una partida
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugador m_Jugador_1=new Jugador("A");
		Jugador m_Jugador_2=new Jugador("B");
		Turno m_Turno = new Turno(m_Jugador_1,m_Jugador_2);
		Tablero m_Tablero=new Tablero(m_Turno);
		
		try {
			m_Tablero.JugarPartida();
		} catch(Exception e){
			System.out.println("Ha ocurrido un error inesperado");
		}
	}

}
