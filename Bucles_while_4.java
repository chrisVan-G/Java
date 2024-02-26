
import javax.swing.JOptionPane;
public class Bucles_while_4 {

	public static void main(String[] args) {
		// Desarrollar un programa que, dada una palabra, descomponer todos sus caracteres.

		String palabra = JOptionPane.showInputDialog("Por favor ingresa tu nombre");
		System.out.println("* Tu nombre " + palabra + " tiene " + palabra.length() +  " caracteres");
		int i = 0; 
		while(i < palabra.length()) // Length() devuelve el número de caracteres del String, vector y otras estructuras de datos.
		{
			System.out.println(" - " + palabra.charAt(i) + " en la posicion: " + i); // charAt() devuelve el carácter de una posición del String.
			i++;
		}
		
	}

}
