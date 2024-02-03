
import javax.swing.*;
public class Bucles_doWhile {

	public static void main(String[] args) {
		// Evalua la condición después de ejecutar el código que hay en su interior
		
		String genero = "";
		
		do{
			
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
					
		} while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false); //IgnoreCase - ignora mayúsculas y minúsculas
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cms"));
		int pesoIdeal = 0;
		
		if(genero.equalsIgnoreCase("H")) {
			
			pesoIdeal = altura - 110;
			
		}
		
		else if (genero.equalsIgnoreCase("M")) {
			
			pesoIdeal = altura - 120;
			
		}
		
		System.out.println("Tu peso ideal es " + pesoIdeal + " kg");

	}

}
