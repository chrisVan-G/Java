
import javax.swing.JOptionPane;
public class Bucles_for_9 {

	public static void main(String[] args) {
		// Desarrollar un programa que permita definir si un número entero ya establecido es un número perfecto o no.

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número a evaluar, por favor "));
		
		int suma = 0;
		
		for(int i = 1; i < numero; i++) // Ejemplos de numeros perfectos 6 = 1 + 2 + 3
		{								// 28 = 1 + 2 + 4 + 7 + 14	
		if(numero % i == 0)				// 496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248
			{							// 8128 = 1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064	
				suma = suma + i;
			}
			
		}
		
		if(numero > 0)
		{
			if(numero == suma)
			{
				System.out.println("* El numero "+ numero + " es perfecto");
			}
			
			else if(numero != suma)
			{
				System.out.println("* El numero "+ numero + " no es perfecto");
			}
		}
		
		else
		{
			System.out.println("* Error");
		}
		
	}

}
