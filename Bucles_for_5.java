
public class Bucles_for_5 {

	public static void main(String[] args) {
		// Desarrollar un problema que imprimir las tablas de multiplicar del 1 al 10 con su respectivo resultado.

		for (int i = 1; i <= 10; i++)
		{
			System.out.println("Tabla de multiplicar " + i);
			System.out.println();
			for(int j = 1; j <= 10; j++)
			{
				System.out.println(i + " * " + j + " = " + i*j);
			}
			
			System.out.println();
		}
		
	}

}
