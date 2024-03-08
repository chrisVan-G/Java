
import java.util.Scanner;
public class Bucles_doWhile_3 {

	public static void main(String[] args) {
		// Desarrollar un programa que permita contar cuántos números entre 1 y 1000 son múltiplos de 7, mostrar el resultado final.
		
		int contador = 0;
		int i = 1;
		
		boolean b = true;
		
		do
		{
			if(i % 7 == 0) { contador ++; }
			
			i++;
			
			if(i >= 1000) {
				b = false;
			}
		}
		
		while (b);
		
		System.out.println("* Entre 1-1000 hay " + contador + " multiplos de 7");
	}

}
