
import javax.swing.*;
public class Bucles_while {

	public static void main(String[] args) {
		//Bucles Indeterminados - no sabes cuantas veces se va a repetir la instrucción
		//Son de este tipo el While(mientras) y do while
		
		String contrasena = "123456789asd";
		String pass = "";
		
		while (contrasena.equals(pass)==false) { //equals() compara 2 cadenas de texto
			
			pass = JOptionPane.showInputDialog("Por favor introduce la contraseña");
			
			if (contrasena.equals(pass)==false) {
				
				System.out.println("Contraseña incorrecta");
				
			}
			
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");

	}

}
