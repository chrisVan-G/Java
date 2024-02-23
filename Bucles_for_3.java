
public class Bucles_for_3 {

	public static void main(String[] args) {
		// Ciclos for(para), necesita valor inicial, una condición y un valor final
		
		// Desarrollar un programa que muestre los números pares entre 0 – 20 de forma ascendente.
		
		for(int i = 0; i <= 20; System.out.print(i + " "), i+=2); System.out.println("* Ascendente");
		for(int i = 20; i >= 0; System.out.print(i + " "), i-=2); System.out.println("* Descendente");
		
		/*
		for(int i = 0; i <= 20; i++) // Este programa utiliza más lineas de código, lo que no es eficiente
		{
			if(i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}
		*/
		
	}

}
