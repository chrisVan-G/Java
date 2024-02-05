
import javax.swing.*;

public class Entrada_JOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreUsuario = JOptionPane.showInputDialog("Bienvenido, Por favor introduce tu nombre ");
		String edad = JOptionPane.showInputDialog("Introduce tu edad por favor ");
		int edad_usuario = Integer.parseInt(edad); //parseInt() convierte a entero lo que hay almacenado en el string edad
		System.out.println("Hola " + nombreUsuario + ", el año que viene tendrás " + (edad_usuario+1) + " años.");		
		
	}

}
