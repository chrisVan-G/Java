
import java.util.*;
import javax.swing.JOptionPane;

public class condicionales_switchCase_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor elige la operacion aritmetica que deseas ejecutar: \n1: Suma \n2: Resta \n3: Multiplicacion \n4: Division");
		int operacion = entrada.nextInt();

		switch(operacion) {
		
		case 1:
			
			int numero_1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el primer valor numerico "));
			int numero_2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el segundo valor numerico "));
			
			System.out.println("El resultado de la operacion Suma para => " + numero_1 + " + " + numero_2 + " = " + (numero_1 + numero_2));
			
			break;
			
		case 2:
			
			int numero_3 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el primer valor numerico "));
			int numero_4 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el segundo valor numerico "));
			
			System.out.println("El resultado de la operacion Resta para => " + numero_3 + " - " + numero_4 + " = " + (numero_3 - numero_4));
			
			break;
		
		case 3:
			
			int numero_5 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el primer valor numerico "));
			int numero_6 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el segundo valor numerico "));
			
			System.out.println("El resultado de la operacion Multiplicacion para => " + numero_5 + " * " + numero_6 + " = " + (numero_5 * numero_6));
			
			break;
			
		case 4:
			
			double numero_7 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el primer valor numerico "));
			double numero_8 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el segundo valor numerico "));
			
			System.out.print("El resultado de la operacion Division para => " + numero_7 + " / " + numero_8 + " = ");
			System.out.printf("%1.2f", numero_7 / numero_8);
			
			break;
		
		default:
			
			System.out.println("El parametro ingresado no es correcto");
		
		}
		
	}

}
