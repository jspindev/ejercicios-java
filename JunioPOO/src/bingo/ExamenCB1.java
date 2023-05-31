package bingo;

import java.util.HashSet;

public class ExamenCB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(cjto.toString());
	}

	//---variables inicio----------------------------------------------------------

	private int i;
	private int j;
	
	static HashSet<Numero> cjto=new HashSet <Numero>();
	
	//-------------------------Carton bingo inicio -----------------------------------------------------------------------------
	public ExamenCB1( HashSet <Numero>cjto) {
		
		for(int i=0;i<13;i++) {
			cjto.add(Numero2((int)Math.random()*50+1));
		}
	}

	private Numero Numero2(int j) {
		// TODO Auto-generated method stub
		Numero n=new Numero(j);
		
		return n;
	}
	
	//---------Carton Bingo final--------------------------------------------------------------

	//----------tachar inicio-------------------------------------------------------------
	
	public HashSet <Numero> tachar( int num) {
		
		
		Numero num2=new Numero(num);
		if(cjto.contains(num2)) {
			cjto.remove(num2);
		}
		return cjto;
	}
	
	//-----------tachar final--------------------------------------------------------
	
	//-----------Ha ganado inicio------------------------------------------
	
	public Boolean haGanado(HashSet <Numero> cjto) {
	
		return cjto.isEmpty();
	}
	
	//-----------Ha ganado final-------------------------------------------
	
	
	//------------to string inicio-----------------------------------------------------
	
	public String toString() {
		
		for(int i=0;i<13;i++ ) {
			System.out.print(cjto.toString());
		}
		
		return null;
		
	}
	
	//------------to string final---------------------------------------------
}


 class Numero{
	private int i;

	Numero(int i) {
		
		this.i=i;
	}
}