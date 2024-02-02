
import javax.swing.*;

public class Bucles_for_2 {

	public static void main(String[] args) {
		// Factorial de un numero
		
		int resultado = 1;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el número a evaluar "));
		
		for(int i = numero; i > 0; i--) {
			
			resultado = resultado * i;
			
		}
		
		System.out.println("El factorial de " + numero + " es " + resultado);

	}

}
