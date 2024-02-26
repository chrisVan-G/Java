
import java.util.*;
public class Bucles_while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int)(Math.random()*100); //Math.random() genera numeros aleatorios
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0; 
		
		while(numero != aleatorio) {//Se compone de una condición que tiene que tomar un valor booleano
			
			intentos++;
			
			System.out.println("Introduce un numero por favor ");
			
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				
				System.out.println("* Mas bajo");
				
			}
				
			else if (aleatorio > numero) {
					
					System.out.println("* Mas alto ");
					
				}
				
			}
			
			System.out.println("Correcto, lo has conseguido en " + intentos + " intentos");
		
	}

}
