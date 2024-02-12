
import javax.swing.JOptionPane;
public class Condicionales_switchCase_3 {

	public static void main(String[] args) {
		// Omisión de la declaración Break
		
		int diaNum = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el número correspondiente al día de la semana a evaluar"));
		String diaLab;
		
		switch(diaNum)
		{
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			diaLab = "dia laborable";
			break;
		case 6:
		case 7:
			diaLab = "fin de semana";
			break;
			
			default: diaLab = "tipo de dia invalido";
		}
		
		System.out.println("* El dia " + diaNum + " es " + diaLab);

	}

}
