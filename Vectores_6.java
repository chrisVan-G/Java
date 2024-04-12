
public class Vectores_6 {

	public static void main(String[] args) {
		// Matrices bidimensionales (un array dentro de otro), puede haber arrays multidimensionales
		//Array bidimensional no es igual a tabla
		
		int[][] matriz = new int[4][5];
		
		matriz[0][0] = 14;
		matriz[0][1] = 24;
		matriz[0][2] = 7;
		matriz[0][3] = 66;
		matriz[0][4] = 81;
		
		matriz[1][0] = 2;
		matriz[1][1] = 56;
		matriz[1][2] = 21;
		matriz[1][3] = 33;
		matriz[1][4] = 12;
		
		matriz[2][0] = 8;
		matriz[2][1] = 4;
		matriz[2][2] = 16;
		matriz[2][3] = 81;
		matriz[2][4] = 99;
		
		matriz[3][0] = 17;
		matriz[3][1] = 30;
		matriz[3][2] = 101;
		matriz[3][3] = 11;
		matriz[3][4] = 1;
		
		//System.out.println("* Valor almacenado en la posocion 2|3 => " + matriz[2][3]);
		
		for(int i = 0; i < 4; i++) {
			
			System.out.println();
			for(int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		
	}

}
