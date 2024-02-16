
import javax.swing.JOptionPane;
public class Bucles_for {

	public static void main(String[] args) {
		// Determinados - sabes cuantas veces se va a repetir la instrucción 
		// Son de este tipo el for y for - each

		int arroba = 0;
		boolean punto = false;
		
		String email = JOptionPane.showInputDialog("Introduce tu email ");

		for(int i = 0; i < email.length(); i++) { //Valor de inicio; condicional(valor de parada); valor de incremento - decremento
			
			if(email.charAt(i) == '@') {
				
				arroba++;
				
				}
			
			if (email.charAt(i) == '.') {
				
				punto = true;
				
			}
				
		}
		
			if (arroba == 1 && punto == true) {
			
			System.out.println("El email ingresado es correcto ");
		
		}
			
			else {
				
				System.out.println("El email ingresado no es correcto ");
				
			}
		
	}

}
