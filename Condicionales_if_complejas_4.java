
import javax.swing.*;
public class Condicionales_if_complejas_4 {

	public static void main(String[] args) {
		
		/* Un postulante a un empleo, realiza un test de capacitación, se obtuvo
		 * la siguiente información: cantidad total de preguntas que se le
		 * realizaron y la cantidad de preguntas que contestó correctamente. Desarrolle un programa que informe el nivel según el porcentaje de
		 * respuestas correctas que ha obtenido, y sabiendo que:
		 * 
		 * 1. Nivel máximo: Porcentaje >= 90%.
		 * 2. Nivel medio: Porcentaje >= 75% y <90%.
		 * 3. Nivel regular: Porcentaje >= 50% y <75%.
		 * 4. Fuera de nivel: Porcentaje < 50%.
		 */
		
		double preguntas = 50;
		double resultado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número de respuestas correctas"));
		
		double porcentaje = (resultado * 100) / preguntas;
		
		if(porcentaje >= 90 && porcentaje <= 100)
		{
			System.out.println("* Felicitaciones, estas en el nivel maximo");
		}
		else if(porcentaje >= 75 && porcentaje < 90)
		{
			System.out.println("* Estas en el nivel medio");
		}
		else if(porcentaje >= 50 && porcentaje < 75)
		{			
			System.out.println("* Estas en el nivel regular");
		}
		else if(porcentaje < 50 && porcentaje >= 0)
		{
			System.out.println("* Estas fuera de nivel");
		}
		else
		{
			System.out.println("* El valor ingresado no es correcto, por favor validar e intentar de nuevo");
		}
		
	}

}
