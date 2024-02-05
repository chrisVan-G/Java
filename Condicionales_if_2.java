
public class Condicionales_if_2 {

	public static void main(String[] args) {
		/* Desarrollar un algoritmo que genere un número aleatorio de 1 a 100
		 * (Math.random) y por medio de una condicional determinar sí el número
		 * es menor a 50 o mayor.
		 */
		
		int aleatorio = (int)(Math.random()*100);
		
		if (aleatorio < 50) {
			System.out.println("* El numero " + aleatorio + " es menor a 50");
		}
		
		else if (aleatorio == 50) {
			
			System.out.println("* El numero " + aleatorio + " es igual a 50");	
		}
		
		else {
			
			System.out.println("* El numero " + aleatorio + " es mayor a 50");
		}
		
	}

}
