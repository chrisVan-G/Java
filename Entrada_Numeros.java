
import javax.swing.*;

public class Entrada_Numeros {

	public static void main(String[] args) {
		
		String numero_1 = JOptionPane.showInputDialog("Por favor introduce un número ");
		double numero_2 = Double.parseDouble(numero_1);
		System.out.print("La raiz cuadrada de " + numero_2 + " es ");
		System.out.printf("%1.2f", Math.sqrt(numero_2));

	}
	
}
