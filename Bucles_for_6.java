
public class Bucles_for_6 {

	public static void main(String[] args) {
		// Ciclo dentro de un ciclo
		
		for(int i = 0; i < 2; i++)
		{
			System.out.println("* Ciclo 1 ");
			for(int j = 0; j < 2; j++)
			{
				System.out.println("* Ciclo 2 "); //Para cada ejecución del ciclo (1) El (2) se repite las veces que el (1) tiene expresadas
			}
			System.out.println();
		}

	}

}
