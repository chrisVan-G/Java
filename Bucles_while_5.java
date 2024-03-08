
public class Bucles_while_5 {

	public static void main(String[] args) {
		// - Desarrollar un programa que genere números aleatorios entre 1 y 50 y se detenga cuando genere un múltiplo de 10.
		
		boolean m = true; // Esto es una bandera, variable booleana que cambia cuando se cumple cierta característica que se determine en el código
		
		while(m)
		{
			int n = (int)Math.round(Math.random()*50);
			System.out.print(n + " ");
			if(n % 10 == 0) 
			{
				m = false;
			}
		}
		
	}

}
