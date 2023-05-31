import javax.swing.*;
public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String [] paises=new String[8];
		
		/*paises[0]="España";
		paises[1]="México";
		paises[2]="Colonbia";
		paises[3]="Perú";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";*/
		
		/*for(int i=0; i <paises.length;i++){
		
			System.out.println("PAís "+ (i+1) +" "+ paises[i]);
			
	
	}*/
		//String [] paises={"España","México","Colonbia", "Perú","Chile","Argentina","Ecuador","Venezuela" };
		
	for(int i=0; i<8;i++){
		paises[i]=JOptionPane.showInputDialog("Introduce pais " +(i+1));
		
	}
	for(String elemento:paises){  
			
			System.out.println("pais: " + elemento);
		}
	}
}
