
import java.util.*;

public class entrada_Consola {

	public static void main(String[] args) {
		
		// Entrada de información en la consola
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bienvenido, Por favor introduce tu nombre ");
		String nombreUsuario = entrada.nextLine();
		System.out.println("Por favor introduce tu edad ");
		int edad = entrada.nextInt();
		System.out.println("Hola " + nombreUsuario + " el año que viene tendrás " + (edad+1) + " años"); 
		//edad+1 va entre () ya que si se pone por fuera lo confunde con el operador de concatenar
		
	}

}
