
public class Clase_Math {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------------------------------------------");
		double raiz = Math.sqrt(9); //Math.sqrt(n): Raíz cuadrada de un número
		System.out.println("* La raíz cuadrada del número evaluado es: " + raiz);
		
		double numero_1 = 5.89; //Math.round(decimal): redondeo de un número
		int resultado_raiz = (int)Math.round(numero_1); //Refundición: convierte un tipo de dato a otro
		System.out.println("* El resultado del número al redondearlo es: " + resultado_raiz);
		
		double base = 5, exponente = 3; //Math.pow(base, exponente): Potencia de un número, base y exponentes son double
		int resultado_potencia = (int)Math.pow(base, exponente);
		System.out.println("* El resultado de elevar el número "+ base + " al exponente " + exponente + " es: " + resultado_potencia);
		
		System.out.println("* El valor de PI es " + Math.PI);//Math.PI: constante de clase con el número PI
		System.out.println("* El número aleatorio de 1 a 10 es: " + Math.round(Math.random()*10));
		System.out.print("------------------------------------------------------------------------------------------");
	}
	
}
