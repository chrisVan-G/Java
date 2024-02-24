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
		int sumaIteraciones = 0;
		
		for(int i = 0; i <= numero; i++)
		{
			sumaIteraciones = sumaIteraciones + i;
		}
		
		System.out.println("* Suma de las iteraciones: " + sumaIteraciones);
		System.out.println("* Raiz cuadrada " + Math.sqrt(sumaIteraciones));
		System.out.println("* El numero aleatorio es: " + Math.round(Math.random() * sumaIteraciones));
		System.out.println("* Divisores");
		
		for(int j = 1; j <= sumaIteraciones; j++)
		{
			if(numero % j == 0)
			{
				System.out.print(j +" ");
			}
		}
		
		System.out.println();
		
		int suma = 0;
		
		for(int x = 1; x < sumaIteraciones; x++)
		{
			if(sumaIteraciones % x == 0)
			{
				suma = suma + x;
			}
		}
		
		if(numero > 0)
		{
			if(suma == sumaIteraciones)
			{
				System.out.println("* El numero "+ sumaIteraciones + " es perfecto");
			}
			
			else if(suma != sumaIteraciones)
			{
				System.out.println("* El numero "+ sumaIteraciones + " no es perfecto");
			}
		}
		
		else
		{
			System.out.println("* Error");
		}

		int factorial = 1;
				
		for (int z = sumaIteraciones; z > 0; z--, sumaIteraciones--)
		{
			factorial = factorial * sumaIteraciones;
		}
		
		System.out.println("* El factorial es "+ factorial);
	}

}
