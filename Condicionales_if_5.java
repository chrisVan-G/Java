
import java.util.*;
public class Condicionales_if_5 {

	public static void main(String[] args) {
		/* Dados dos números enteros, determinar si uno es múltiplo del otro (Por
		 * medio del módulo).
		 */

		Scanner s = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el primer numero ");
		int numeroUno = s.nextInt();
		System.out.println("Por favor ingrese el segundo numero ");
		int numeroDos = s.nextInt();
		
		if(numeroUno % numeroDos == 0) {
			
			System.out.println("El numero " + numeroDos + " es multiplo de " + numeroUno);
			
		}
		
		else {
			
			System.out.println("El numero " + numeroDos + " no es multiplo de " + numeroUno);
			
		}
		
	}

}
