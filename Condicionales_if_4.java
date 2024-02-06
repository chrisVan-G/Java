
import javax.swing.JOptionPane;
public class Condicionales_if_4 {

	public static void main(String[] args) {
		/* Dado un número entero, determinar por medio de un condicional si es 
		 * negativo o no (Menor a cero).
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el número a evaluar "));
		
		if(numero < 0) {
			
			System.out.println("* El numero " + numero + " es negativo");
		}
		else {
			
			System.out.println("* El numero " + numero + " es positivo");
		}
		

	}

}
