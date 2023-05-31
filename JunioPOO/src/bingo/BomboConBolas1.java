package bingo;

import java.util.LinkedList;

public class BomboConBolas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	LinkedList<integer> listaBolas=new LinkedList<integer>();
	
	
//---------Bombo con bolas(constructor) inicio-------------------------------------------------------------------	
	public BomboConBolas1() {
		
		for (int i=1;i<51;i++) {
			
			listaBolas.add(integer(i));
		}
	}

	private integer integer( int j) {
		// TODO Auto-generated method stub
		integer i=new integer(j);
		return i;
	}
//-------------Bombo con bolas fina-------------------------------------------------------------------------------------

//------------Quedan bolas inicio----------------------------------------------------------------
	public int quedanBolas() {
	//	listaBolas.size(); para devolver el numero de volas que hay
		int j;
		integer h;
		h=listaBolas.getFirst();
		
		j= listaBolas.inversa2(h);
		
		
		return j;
	}
	
	 public int inversa2(integer o) {
			int i;
			i=inversa2(o);
			return i;
		}
	
//------------Qudean bolas final ------------------------------------------------------------
	
//-------------Obtener Bola inicio---------------------------------------------------------------	
	public int obtenerBola() {
		
		// borrrar el try y el exceptions 
		int j;
		
		j=(int)Math.random()*50+1;
		
		integer a=new integer(j);
		
		if(listaBolas.contains(a))
			listaBolas.remove(a);
		
		if(listaBolas.isEmpty()) { 
			try{return 0;}catch(Exception e) {
				System.out.println("Ya no quedan bolas");
			}
			
		}
		
		return j;
		
	 }
	
//-----------Obtener Bolas final----------------------------------------------------------------------------

//-------toString inicio----------------------------------------------------
	public String toString() {
		return listaBolas.toString();
	}
	
//--------toString final------------------------------------------------
}



class integer{
	private int i;
	private integer j;
	integer(int i) {
		this.i=i;
	}
	
	 int inversa(integer j) {
		
		 i=j.i;
		 return i;
		 
	 }
	 
	
	 /*public int inversa2(integer o) {
			int i;
			i=inversa2(o);
			return i;
		}*/
}