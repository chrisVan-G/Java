
import java.util.*;
public class Bucles_doWhile_2 {

	public static void main(String[] args) {
		// Pedir números por pantalla hasta que alguno sea mayor a 500
		//Tomado de: https://www.programarya.com/Cursos/Java/Ciclos/Ciclo-do-while
		
		Scanner s = new Scanner(System.in); 
		
		int numero;
		
		do 
		{
			System.out.println("Por favor ingresa un numero");
			numero = s.nextInt();
		}
		
		while(numero <= 500);
		
		// Este bucle permite ejecutar el código al menos una vez
		
	}

}
