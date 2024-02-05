
import java.util.Scanner;
public class Condicionales_if_3 {

	public static void main(String[] args) {
		/* Dados dos números enteros, determinar cuál es el mayor por medio de
		 * una condicional y realizar una potencia con el número menor como exponente (Math.pow).
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Por favor ingresa el primer numero");
		int numero_1 = s.nextInt();
		System.out.println("Por favor ingresa el segundo numero");
		int numero_2 = s.nextInt();
		System.out.println("--------------------------------");
		if(numero_1 > numero_2) {
			
			System.out.println("* El numero " + numero_1 + " es mayor a " + numero_2);
			System.out.println("* Potencia: " + (Math.pow(numero_1, numero_2)));
		}
		
		else if(numero_1 == numero_2) {
			
			System.out.println("* El numero " + numero_1 + " es igual a " + numero_2);
		}
		
		else {
			
			System.out.println("* El numero " + numero_1 + " es menor a " + numero_2);
			System.out.println("* Potencia: " + (Math.pow(numero_2, numero_1)));
		}
		
		System.out.println("--------------------------------");
	}

}
