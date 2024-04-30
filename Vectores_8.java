
public class Vectores_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Desarrollar un programa que por medio de un vector de tipo float
		 * permita almacenar el peso de 5 personas para posteriormente:
		 * - Determinar el promedio del peso de las 5 personas.
		 * - Determinar cuántas personas superar el promedio del peso.
		 * - Determinar cuántas personas son inferiores al promedio del peso.
		 */

		float []pesos = {83.4f, 92.8f, 45.3f, 59.2f, 71.7f};
		float prom = 0.0f;
		float promedio = 0.0f;
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < pesos.length; i++) {
			
			prom = prom + pesos[i];
			
		}
		
		promedio = prom / 5;
		
		for (int j = 0; j < pesos.length; j++) {
			
			if(pesos[j] > promedio) {
				
				max++;
				
			}
			else {
				
				min++;
				
			}
		}
		
		System.out.println("* El promedio es " + promedio);
		System.out.println("* Esta(n) por encima del promedio " + max);
		System.out.println("* Esta(n) por debajo del promedio " + min);
		
	}

}
