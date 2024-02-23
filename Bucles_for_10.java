import javax.swing.JOptionPane;

public class Bucles_for_10 {

	public static void main(String[] args) {
		/* Desarrollar un programa que realice la sumatoria de todas las
		 * iteraciones de un ciclo desde 0 hasta un número entero definido
		 * previamente, al resultado de la suma realizar las siguientes
		 * operaciones.
		 * - Raíz cuadrada.
		 * - Generar un número aleatorio entre 1 y la sumatoria de las iteraciones.
		 * - Determinar los divisores.
		 * - Hallar la factorial.
		 * - Definir si es un número perfecto.
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número a evaluar, por favor "));
		
		int suma = 0;
		
		for(int i = 0; i <= numero; i++)
		{
			suma = suma + i;
		}
		
		System.out.println("* Raiz cuadrada " + Math.sqrt(suma));
		System.out.println("* El numero aleatorio entre 1 y " + numero + " es: " + Math.round(Math.random() * numero));
		System.out.println("* Divisores");
		for(int i = 1; i <= numero; i++)
		{
			if(numero % i == 0)
			{
				System.out.print(i +" ");
			}
		}
		
	}

}
