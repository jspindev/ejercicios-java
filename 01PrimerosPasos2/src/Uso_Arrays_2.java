import javax.swing.*;
public class Uso_Arrays_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String[] paises=new String[8];
		
		paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";*/
		
		/*for(int i=0; i<paises.length;i++){
			
			System.out.println("País "+ (i+1)+" "+paises[i]);
		}*/
		
		
		/*String[] paises={"España","mexico","colombia","peru";"chile";"argentina";"ecuador";"venezuela"}*/
				
		
		String [] paises=new String[8];
		
		for(int i=0; i<8;i++){
			
			paises[i]=JOptionPane.showInputDialog("Introduce país "+ (i+1) );
		}
		
		for(String elemento:paises){
			
			System.out.println("Pais: "+ elemento);
		}
	}

}
