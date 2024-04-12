
public class Vectores_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] vector = new int[5]; //[5] número de elementos que va a almacenar la matriz
		//int vector[] = new int[5];
		
		vector[0] = 15; //Las matrices tienen posiciones o indices
		vector[1] = 25;
		vector[2] = 8;
		vector[3] = -7;
		vector[4] = 92;*/

		//Declarar e iniciar en la misma linea
		
		int[] vector = {13, 75, 12, -27, 19, 66, 92, 81,55, 114, 11, 500, 17}; //Declaración implicita o simplificada de matriz
		
		System.out.println(vector[3]);
		
		System.out.println("Elementos del vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " | ");
        }
	}

}
