
import java.util.*;
import javax.swing.*;

public class Condicionales_switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo"); // \n Salto de linea
		
		int figura = entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado ")); /*ParseInt para refundir ya que showInputDialog
			recibe datos de tipo string y debo almacenarlo en una variable de tipo entero*/
			
			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
			
			break;
			
		case 2:
			
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base "));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura "));
			
			System.out.println("El area del rectangulo es: " + base*altura);
			
			break;
			
		case 3:
			
			int base_t = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base "));
			int altura_t = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura "));
			
			System.out.println("El area del triangulo es: " + (base_t*altura_t/2));
			
			break;
			
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio "));
			
			System.out.print("El area del circulo es: ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio,2)));
			
			break;
			
			default:
				
				System.out.println("La opcion ingresada no es correcta ");
				
		}

	}

}
