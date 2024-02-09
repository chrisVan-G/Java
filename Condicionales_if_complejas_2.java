
import javax.swing.JOptionPane;
public class Condicionales_if_complejas_2 {

	public static void main(String[] args) {
		/* Desarrollar un programa que permita determinar la cantidad de cifras
		 * de un número X teniendo en cuenta que el número únicamente puede
		 * tener 4 cifras. Mostrar un mensaje por defecto si el número supera las 4 cifras.
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el número a evaluar"));	
		
		//int cifras = (int)(Math.log10(numero)+1); // Solo funciona con números positivos
		int cifras = (int)(Math.floor(Math.log10(Math.abs(numero)) + 1)); // Consultar sobre Math.log() y Math.floor()
		
		if (cifras <= 4 && cifras > 0) 
		{
			System.out.println("* El numero evaluado tiene " + cifras + " Cifras");
		}
		
		else 
		{	
			System.out.println("* El valor ingresado no es correcto, ¡intenta de nuevo!...");
		}
		
		/* La explicación desde dentro hacia fuera de la sentencia es:
		 * Lo paso a volar absoluto por si es negativo (abs)
		 * Le aplico el logaritmo en base diez para ver la potencia de 10 (son posiciones de dígitos) (log)
		 * Redondeo para tomar ya un valor "entero" (floor) Redondea al entero menor
		 * Le sumo 1 ya que los numeros menores de 10 su potencia es 0
		 * Imprimo 
		 * tomado de: 
		 * https://es.stackoverflow.com/questions/36106/c%C3%B3mo-obtener-total-d%C3%ADgitos-de-un-numero-en-java
		 * https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=237:clase-math-api-java-funciones-matematicas-trigonometricas-log-etc-redondeo-round-floor-ceil-cu00906c&catid=58&Itemid=180
		 */
		
	}

}
