
import java.util.*;
import javax.swing.JOptionPane;
public class Condicionales_switchCase_7 {

	public static void main(String[] args) {
		/* Desarrollar una calculadora, la cual, en base a un operador, realice una 
		 * operación con dos números enteros ya definidos y mostrar el resultado,
		 * los operadores a tener en cuenta son los vistos en la tabla de
		 * operadores aritméticos, sí deseas agregar más operadores, siéntete en libertad de hacerlo.*/
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingresa el primer número a evaluar"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingresa el segundo número a evaluar"));
		double resultado = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Por favor elige la operacion a ejecutar: \n1: Suma \n2: Resta \n3: Multiplicacion \n4: Division");
		int operador = s.nextInt();
		
		switch(operador)
		{
		case 1: resultado = num1 + num2; System.out.println("* El resultado de sumar " + num1 + " + " + num2 + " = " + resultado); break;
		case 2: resultado = num1 - num2; System.out.println("* El resultado de restar " + num1 + " - " + num2 + " = " + resultado); break;
		case 3: resultado = num1 * num2; System.out.println("* El resultado de multiplicar " + num1 + " * " + num2 + " = " + resultado); break;
		case 4: resultado = num1 / num2; System.out.println("* El resultado de dividir " + num1 + " / " + num2 + " = " + resultado); break;
		default: System.out.println("* El valor ingresado para el parametro operacion, no es correcto");	
		}
	}

}
