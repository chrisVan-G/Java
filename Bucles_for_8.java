
import javax.swing.JOptionPane;
public class Bucles_for_8 {

	public static void main(String[] args) {
		// Desarrollar un programa que determine los divisores de un número definido previamente.
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número a evaluar, por favor "));
				
		for(int i = 1; i <= numero; i++)
		{
			if(numero % i == 0)
			{
				System.out.print(i + " ");
			}
		
		}	
		
	}

}
