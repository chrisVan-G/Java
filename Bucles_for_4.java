
public class Bucles_for_4 {

	public static void main(String[] args) {
		// Desarrollar un programa que permita contar cuántos números entre 1 y 1000 son múltiplos de 7, mostrar el resultado final.

		int contador = 0;
		for(int i = 1; i <= 1000; i++) { if(i % 7 == 0) { contador ++; } }; System.out.println("* Entre 1-1000 hay " + contador + " multiplos de 7");
		
	}

}
