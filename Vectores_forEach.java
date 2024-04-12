
import javax.swing.*;
public class Vectores_forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//forEach = por cada
		
		String[] paises = new String[8];
		
		/*paises[0] = "Colombia";
		paises[1] = "Panama";
		paises[2] = "Canada";
		paises[3] = "Brasil";
		paises[4] = "Inglaterra";
		paises[5] = "Nicaragua";
		paises[6] = "Belgica";
		paises[7] = "Noruega";*/
		
		/*for (int i = 0; i < paises.length; i++) {
			
			System.out.println("Pais " + (i+1) + " " +  paises[i]);
			
		}*/
		
		for(int i = 0; i < 8; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce tu pais" + " " + (i+1));
		}
		
		for(String elemento:paises) {
			System.out.println(elemento);
		}
				
	}

}
