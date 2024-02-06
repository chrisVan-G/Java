
import javax.swing.JOptionPane;
public class Condicionales_if_6 {

	public static void main(String[] args) {
		/* Por medio de una nota decimal, determinar sí el estudiante aprobó o no
		 * la clase (0 – 6 = Perdió – 7 – 10 = Aprobó).
		 */
		
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la nota final del estudiante"));
		
		if(nota >= 0 && nota <= 6) {
			
			System.out.println("* Reprobo ");
			
		}
		
		else if(nota >= 7 && nota <= 10){
			
			System.out.println("* Aprobo ");
			
		}
		
		else{
			System.out.println("* La nota ingresada no es correcta");
		}

	}

}