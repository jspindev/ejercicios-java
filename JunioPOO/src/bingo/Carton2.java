package bingo;

public class Carton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Tabla[][]=new int[5][5];
		
		for(int i=0;i<Tabla.length;i++) {
			for(int j=0;j<Tabla[i].length;j++) {
				
				Tabla[i][j]=(int)(Math.random()*15+15+1);
			}
		}
		
		System.out.println("");
		
		System.out.println("\tB"+"\tI"+"\tN"+"\tG"+"\tO");
		
		for(int i=0;i<Tabla.length;i++) {
			for(int j=0;j<Tabla.length;j++) {
				System.out.print("\t"+Tabla[i][j]);
			}
			System.out.println(" ");
		}
	}

}
