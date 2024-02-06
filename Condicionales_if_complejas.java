
import javax.swing.*;
public class Condicionales_if_complejas {

	public static void main(String[] args) {
		/* Desarrollar un programa que permita por medio de la edad de una
		 * persona, determinar la categoría en la que pertenece a raíz de la
		 * siguiente tabla:
		 * 
		 * Rango de edad - Categoría
		 * 	0 - 5 Infante
		 *	6 - 10 Niño
		 *	11 - 15 Pre adolescente
		 *	16 - 18 Adolescente
		 *	19 - 25 Pre adulto
		 *	26 - 40 Adulto
		 *	41 - 55 Pre anciano
		 *	56+ Anciano
		 *
		 * Recuerda tener presente: condicionales anidadas, tabla de verdades, tabla de operadores lógicos.
		 *
		 */
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la edad a clasificar "));
		
		if(edad >= 0 && edad <= 18) {
			
			if(edad >= 0 && edad <= 5) {
				
				System.out.println("* Es un infante");				
			}
			else if(edad >= 6 && edad <= 10) {
				
				System.out.println("* Es un nino");
			}
			else if(edad >= 11 && edad <= 15) {
				
				System.out.println("* Es un pre adolescente");
			}
			
			else if(edad >= 16 && edad <= 18) {
				
				System.out.println("* Es un adolescente");
			}
			
		}
		else if(edad >= 19 && edad <= 40) {
			if(edad >= 19 && edad <= 25) {
				
				System.out.println("* Es un pre adulto");
			}
			else if(edad >= 26 && edad <= 40) {
				
				System.out.println("* Es un adulto");
			}
			
		}
		else if(edad >= 41 && edad <= 110) {
			
			if(edad >= 41 && edad <= 55) {
				
				System.out.println("* Es un pre anciano");
			}
			
			else if(edad >= 56) {
				
				System.out.println("* Es un anciano");
			}
		}
		
		else {
			
			System.out.println("* La edad ingresada esta fuera de rango");
		}

	}

}
