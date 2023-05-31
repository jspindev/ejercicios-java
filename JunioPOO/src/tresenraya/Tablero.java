package tresenraya;

/*import Turno;
import Jugador;
import Casilla;*/
import java.io.*;

// Source file Tablero.java
public class Tablero {
	private final int LADO =3;
	private Casilla m_Casilla[]=new Casilla[LADO * LADO];
	private Turno m_Turno;
	
	//efectos constrtute el tablero y prepara el turno
	
	Tablero(Turno turno) {
		m_Turno = turno;
		for(int fila =0; fila<LADO;fila++)
		for(int columna=0;columna<LADO;columna++){
			m_Casilla[fila*LADO+columna]=new Casilla(fila,columna);
		}
	}
	
	// efectos devuelve la casilla correspondiente a unas coordenadas
	
	public Casilla ObtenerCasilla(int fila,int columna) {
		return m_Casilla[fila*LADO+columna];
	}
	
	//Efectos pregunta unas coordenadas por pantalla
	
	private Casilla PreguntaCasilla() throws Exception{
		System.out.print("Introduzca coordenada de fila: ");
		BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
		int fila=Integer.parseInt(data.readLine());
		
		System.out.print("Introduzca corrdenada de columna: ");
		int columna=Integer.parseInt(data.readLine());
		
		return ObtenerCasilla(fila,columna);
	}
	
	
	//efectos inicia y juega la partida controlando el turno
	
	public void JugarPartida() throws Exception{
		//ponemos las primeras 5 casillas
		for(int cont_pon=0;cont_pon<5;cont_pon++) {
			PonerFicha();
			m_Turno.Siguiente();
		}
		System.out.print("Ha ganado el jugador ");
		System.out.println(HaGanado().Nombre());
	}
	
	//Efectos pone inicialmente las fichas en el tablero preguntando a los jugadores 
	
	public void PonerFicha() throws Exception{
		System.out.print("Jugador ");
		System.out.print(m_Turno.QuienToca().Nombre());
		System.out.println("Introduzca casilla para poner ficha");
		
		Casilla casilla=null;
		do
			casilla=PreguntaCasilla();
		while((casilla==null)|| (!casilla.EstaVacia()));
		casilla.PonerFicha(m_Turno.QuienToca().ObtenerFicha());
	}
	
	// efectosd mueve una ficha desde una casilla hasta otra 
	
	public void MoverFicha() throws Exception{
		System.out.print("Jugador ");
		System.out.print(m_Turno.QuienToca().Nombre());
		System.out.println("Introduzca ficha a mover");
		
		// que la casilla origen tenga una ficha del jugador que toca 
		
		Casilla casilla_origen=null;
		do
			casilla_origen=PreguntaCasilla();
		while((casilla_origen==null)||(casilla_origen.EstaVacia()||(m_Turno.QuienToca() !=casilla_origen.ObtenerFicha().TipoFicha())));
		
		System.out.print("Jugador ");
		System.out.print(m_Turno.QuienToca().Nombre());
		System.out.println("Introduzca ficha a destino");
		
		//que casilla destino este vacia
		Casilla casilla_destino=null;
		do
			casilla_destino=PreguntaCasilla();
		while((casilla_destino==null)||(!casilla_destino.EstaVacia())||(m_Turno.QuienToca() != casilla_origen.ObtenerFicha().TipoFicha())||(!casilla_origen.Adyacentes(casilla_destino)));

		
		casilla_destino.PonerFicha(casilla_origen.ObtenerFicha());
		casilla_origen.PonerFicha(null);
	}
	
	
	// efectos comprueba si hay tres fichas en linea del mismo jugador
	//retorna devuelve el jugador ganador o en otro caso null
	
	public Jugador HaGanado() {
		//comprobacion de las filas 
		
		for(int fila=0;fila<LADO;fila++) {
			boolean tres_en_raya=true;
			
			Jugador pieza=null;
			
			if(ObtenerCasilla(fila,0).ObtenerFicha().TipoFicha() != null) {
				pieza=ObtenerCasilla(fila,0).ObtenerFicha().TipoFicha();
				for(int columna=1;columna<LADO;columna++) {
					if((ObtenerCasilla(fila,columna).ObtenerFicha()==null)||(pieza != ObtenerCasilla(fila,columna).ObtenerFicha().TipoFicha()))
						tres_en_raya=false;
				}
			}
			if((pieza != null)&&(tres_en_raya))
				return pieza;
		}
		
		//Comprobacion de las columnas
		
		for(int columna=0;columna<LADO;columna++){
			boolean tres_en_raya=true;
			
			Jugador pieza=null;
			
			if(ObtenerCasilla(0,columna).ObtenerFicha() !=null) {
				pieza = ObtenerCasilla(0,columna).ObtenerFicha().TipoFicha();
				for(int fila=1; fila<LADO;fila++) {
					if((ObtenerCasilla(fila,columna).ObtenerFicha()==null)||(pieza != ObtenerCasilla(fila,columna).ObtenerFicha().TipoFicha()))
						tres_en_raya= false;
				}
				if((pieza !=null)&&(tres_en_raya))
					return pieza;
			}
		}
		
		//Comprobacion de una diagonal
		
		boolean tres_en_raya=true;
		
		Jugador pieza=null;
		
		if(ObtenerCasilla(0,0).ObtenerFicha() !=null) {
			pieza = ObtenerCasilla(0,0).ObtenerFicha().TipoFicha();
			
			for(int pos=1; pos<LADO;pos++){
				if((ObtenerCasilla(pos,pos).ObtenerFicha() ==null)||(pieza!=ObtenerCasilla(pos,pos).ObtenerFicha().TipoFicha()))
					tres_en_raya=false;
			}
			if((pieza != null)&&(tres_en_raya))
				return pieza;
		}	
		
		//Comprobacion de la otra diagonal
		
		tres_en_raya = true;
		pieza=null;
		
		if(ObtenerCasilla(LADO-1,0).ObtenerFicha() != null) {
			pieza=ObtenerCasilla(LADO-1,0).ObtenerFicha().TipoFicha();
			for(int pos=1;pos<LADO;pos++){
				if((ObtenerCasilla(pos,pos).ObtenerFicha()==null)||(pieza != ObtenerCasilla(pos,pos).ObtenerFicha().TipoFicha()))
					tres_en_raya=false;
			}
			if((pieza != null)&&(tres_en_raya))
				return pieza;
		}
		
		return pieza;
	}
}
