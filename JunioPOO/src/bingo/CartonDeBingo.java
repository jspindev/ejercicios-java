package bingo;

public class CartonDeBingo {

	public static void main(String[] args ) {
		
		int Tabla[][]=new int[5][5];
		
		for(int i=0;i<Tabla.length;i++) {
			for(int j=0;j<Tabla[i].length;j++) {
				
				if(j==0) Tabla[i][j]=(int)(Math.random()*15+15+1);
				else if(j==1) Tabla[i][j]=(int)(Math.random()*15+15+1);
				else if(j==2) Tabla[i][j]=(int)(Math.random()*15+15+1);
				else if(j==3) Tabla[i][j]=(int)(Math.random()*15+15+1);
				else if(j==4) Tabla[i][j]=(int)(Math.random()*15+15+1);
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
