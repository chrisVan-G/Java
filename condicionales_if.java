
import java.util.*;
public class condicionales_if {

	public static void main(String[] args) {
		// Control de flujo - condicionales y bucles
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad, por favor ");
		int edad = entrada.nextInt();
		
		if(edad >= 0 && edad <= 12) {
			
			System.out.println("El paciente es un niño");
			
		}
		
		else if(edad >= 13 && edad <= 17){
			
			System.out.println("El paciente es un adolescente");
			
		}
		
		else if(edad >= 18 && edad <= 59){
			
			System.out.println("El paciente es un adulto");
			
		}
		
		else if(edad >= 60 && edad <= 100){
			
			System.out.println("El paciente es un adulto mayor");
			
		}
		
		else {
			
			System.out.println("El valor ingresado esta fuera de rango");
			
		}

	}

}
