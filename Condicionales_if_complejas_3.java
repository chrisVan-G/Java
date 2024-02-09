
import javax.swing.JOptionPane;
public class Condicionales_if_complejas_3 {

	public static void main(String[] args) {
		// Desarrollar un programa que, por medio de 3 números enteros, determinar cuál es el mayor.
		
		int numero_1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el primer número"));
		int numero_2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el segundo número"));
		int numero_3 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el tercer número"));
		int mayor = numero_1;
		
		/*if(numero_1 > numero_2 && numero_1 > numero_3)
		{
			System.out.println("* El " + numero_1 + " es el mayor");
		}
		else if(numero_2 > numero_1 && numero_2 > numero_3)
		{
			System.out.println("* El " + numero_2 + " es el mayor");
		}
		else
		{
			System.out.println("* El " + numero_3 + " es el mayor");
		}
		*/
		
		if(numero_2 > mayor)
		{
			mayor = numero_2;
		}
		if(numero_3 > mayor)
		{
			mayor = numero_3;
		}
		
		System.out.println("* El numero " + mayor + " es el mayor");
		
	}

}
