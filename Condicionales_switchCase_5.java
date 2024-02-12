import javax.swing.JOptionPane;

public class Condicionales_switchCase_5 {

	public static void main(String[] args) {
		// Switch case con String 
		
		String animal = JOptionPane.showInputDialog("Ingresa el animal a evaluar por favor");
		
		switch(animal)
		{
		
		case "Perro":
			System.out.println("El perro ladra");
			break;
		case "Gato":
			System.out.println("El gato maulla");
			break;
		case "Abeja":
			System.out.println("El abeja Zumba");
			break;
		case "Gallo":
			System.out.println("El gallo cacarea");
			break;
		case "Oveja":
			System.out.println("La oveja bala");
			break;
		case "Buho":
			System.out.println("El buho ulula");
			break;
		default:
			System.out.println("Error");
		}

	}

}
