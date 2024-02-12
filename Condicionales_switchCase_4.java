
import javax.swing.JOptionPane;
public class Condicionales_switchCase_4 {

	public static void main(String[] args) {
		// Switch case anidados
		
		int promedio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el promedio obtenido"));
		int parcial = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota del parcial"));
		
		switch(promedio)
		{
		
		case 1:
		case 2:
		case 3: System.out.println("Perdiste la materia");
			break;
		case 4:
		case 5: System.out.println("Ganaste la materia");
			
			switch(parcial)
			{
			
			case 1:
			case 2:
			case 3: System.out.println("Pero perdiste el parcial");
				break;
			case 4:
			case 5: System.out.println("y tambien el parcial");
				break;				
				
			}
			break;
			default: System.out.println("Error");
		}

	}

}
