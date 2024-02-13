
import javax.swing.JOptionPane;
public class Condicionales_switchCase_6 {

	public static void main(String[] args) {
		/* Desarrolla un programa donde por medio del tipo de un motor,
		 * determinar qué tipo de fluido puede trasportar éste según las siguientes
		 * condiciones:
		 * - Si el tipo de motor es 0, mostrar un mensaje por consola indicando “No hay establecido un valor definido para el tipo”.
		 * - Si el tipo de motor es 1, mostrar un mensaje por consola indicando “Agua”.
		 * - Si el tipo de motor es 2, mostrar un mensaje por consola indicando “Gasolina”.
		 * - Si el tipo de motor es 3, mostrar un mensaje por consola indicando “Hormigón”.
		 * - Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido” */
		
		int tipoMotor = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el tipo de motor a evaluar"));
		switch(tipoMotor)
		{
		case 0: System.out.println("* No hay establecido un valor definido para el tipo"); break;
		case 1: System.out.println("* Agua"); break;
		case 2: System.out.println("* Gasolina"); break;
		case 3: System.out.println("* Hormigon"); break;
		default: System.out.println("* No existe un valor valido");
		}
	
	}
	
}
