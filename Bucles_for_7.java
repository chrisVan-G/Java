
import javax.swing.*;
public class Bucles_for_7 {

	public static void main(String[] args) {
		// Desarrolla un programa que permita mostrar el factorial de un número definido previamente.
		
		int resultado = 1;
		int factorial = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el número a evaluar "));
		
		for(int i = factorial; i > 0; i--) // Factorial 5!= 1 x 2 x 3 x 4 x 5 = 120
		{
			resultado = resultado * i;
		}
		
		System.out.println("* El factorial de " + factorial + " es " + resultado);
		
	}

}
